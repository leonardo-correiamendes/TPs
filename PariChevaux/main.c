#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*
Author : Correia Mendes Leonardo
*/


/**
 * Structure représentant un cheval.
 */
typedef struct {
  char* nom;     /** Nom du cheval */
  short numero;  /** Numéro du cheval */
  int force;     /** Force de base (1 à 100) */
  int chance;    /** Dé de chance (booléen) */
} cheval_t;

/**
 * Structure représentant un pari de tiercé.
 */
typedef struct {
  int numeros[3];  /** Numéros pariés, dans l'ordre */
  int montant;     /** Montant misé, en € */
} pari_t;

/**
 * Saisie d'un entier au clavier, entre deux bornes
 */
int saisir(char* quoi, int bas, int haut) {
  int succes;
  int valeur;
  printf("%s : ", quoi);
  succes = scanf("%d", &valeur);
  while (!succes || valeur < bas || valeur > haut) {
    printf("Invalide ! Attendu entre %d et %d : ",
      bas, haut);
    for(int c = 0; c!='\n' && c!=EOF; c = getchar());
    succes = scanf("%d", &valeur);
  }
  return valeur;
}

/**
 * Retourne 0 ou 1, au hasard.
 */
int pile_ou_face() {
  return rand() % 2;
}

/**
 * Retourne un entier entre 1 et 100, au hasard.
 */
int d100() {
  return 1 + (rand() % 100);
}

/**
 * Score d'un cheval dans une course, déterminé à
 * l'aide d'un dé à 100 faces.
 * - Cheval chanceux : force + trois lancés de dé.
 * - Cheval ordinaire : force + deux lancés de dé.
 *
 * @param ch pointeur vers le cheval.
 * @return Le score du cheval (entre 4 et 400).
 */
int score_cheval(const cheval_t* ch) {
  int score = ch->force;
  if (ch->chance != 0) {
    score += d100() + d100() + d100();
  } else {
    score += d100() + d100();
  }

  return score;
}

/**
 * Affiche les scores des chevaux d'une course.
 *
 * @param[in] ecurie Les chevaux participants.
 * @param[in] tab_score Le score obtenu par chaque cheval.
 * @param n Le nombre de chevaux (donc de scores).
 */
void afficher_scores(const cheval_t ecurie[],
                     const int tab_score[],
                     int n) {

  printf("Scores : \n");
  for (int i = 0; i < n; i++) {
    printf("%s  %d \n", ecurie[i].nom, tab_score[i]);
  }
}

/**
 * Retourne un nouveau tableau contenant un score
 * pour chaque cheval participant.
 *
 * @param[in] ecurie Les chevaux participants.
 * @param n Le nombre de chevaux participants.
 * @return Un tableau de {n} scores.
 */
int *score_course(const cheval_t ecurie[],
                  int n) {
  int *tab_score = malloc(n * sizeof(int));

  for (int i = 0; i < n; i++) {
    tab_score[i] = score_cheval(&ecurie[i]);
  }

  return tab_score;
}

/**
 * Affiche le tiercé. Par exemple :
 * Tiercé : 5 2 1
 * 
 * @param[in] tierce Un tableau de 3 cases.
 */
void afficher_tierce(const int tierce[]) {
  printf("Tierce : \n");
  for (int i = 0; i < 3;  i++) {
    printf("%d \n", tierce[i]);
  }
  printf("\n");
}

/**
 * Détermine quels sont les numéros des trois
 * premiers chevaux d'une course.
 *
 * @param[in] ecurie Les participants.
 * @param[in] tab_score Leur score respectif.
 * @param[out] tierce Un tableau de 3 cases, pour y mettre le tiercé (case 0 = première place).
 * @param n Le nombre de participants.
 */
void etablir_tierce(const cheval_t ecurie[],
                    const int tab_score[],
                    int tierce[],
                    int n) {
  
  int premier = 0;
  int deuxieme = 0;
  int troisieme = 0;

  int iPremier = 0;
  int iDeux = 0;
  int iTrois = 0;

  for(int i = 0; i < n; i++){
    if(tab_score[i] > iPremier){
      troisieme = deuxieme;
      iTrois = iDeux;
      deuxieme = premier;
      iDeux = iPremier;
      premier = i;
      iPremier = tab_score[i];
    } else if (tab_score[i] > iDeux){
      troisieme = deuxieme;
      iTrois = iDeux;
      deuxieme = i;
      iDeux = tab_score[i];
    } else {
      troisieme = i;
      iTrois = tab_score[i];
    }
  }

  for(int i = 0; i < n; i++){
    if(i == premier){
      tierce[0] = ecurie[i].numero;
    } 
    if(i == deuxieme){
      tierce[1] = ecurie[i].numero;
    }
    if(i == troisieme){
      tierce[2] = ecurie[i].numero;
    }
  }
}

/**
 * Donne le gain d'un pari quand on le confronte au
 * tiercé gagnant. Les gains sont :
 * - mise x 30 si 3 dans l'ordre
 * - mise x 15 si 2 premiers dans l'ordre
 * - mise x 3 si premier seulement
 * - zéro sinon
 *
 * @param[in] Le pari.
 * @param[in] Le tiercé gagnant.
 */
int gain_pari(const pari_t *pari,
              const int tierce[]) {
  
  int gain = 0;
  
  if ((pari->numeros[0] == tierce[0]) && (pari->numeros[1] == tierce[1]) && (pari->numeros[2] == tierce[2])) {
    gain = pari->montant * 30;
  } else if ((pari->numeros[0] == tierce[0]) && (pari->numeros[1] == tierce[1])) {
    gain = pari->montant * 15;
  } else if (pari->numeros[0] == tierce[0]) {
    gain = pari->montant * 3;
  }
  
  return gain;
}

/**
 * Affiche la liste des chevaux et leur numéro.
 */
void afficher_ecurie(const cheval_t ecurie[], int n) {
  for (int i = 0; i < n; i++) {
    printf("%d : %10s\n",
      ecurie[i].numero, ecurie[i].nom);
  }
}

#define N 5

int main(void) {
  /* Pour rendre le programme pseudo-aléatoire. */
  srand(time(NULL));

  /* Le nom des chevaux (char* en C = String en java) */
  char* noms[N] = {
   "Alice",
   "Bob",
   "Charles",
   "Denver",
   "Elsa",
  };

  // Debut
  printf("On entraîne les chevaux...\n");

  // Ecurie
  cheval_t ecurie[N];
  for (int i = 0; i < N; i++) {
    ecurie[i].nom = noms[i];
    ecurie[i].numero = i + 1;
    ecurie[i].force = d100();
    ecurie[i].chance = pile_ou_face();
  }
  printf("\n");

  // Solde
  int fortune = 100;
  int montant_min = 2;

  // Debut jeu
  while(fortune >= montant_min) {

    /* Pari */
    printf("La course va bientôt partir !\n");
    printf("Au départ :\n");
    afficher_ecurie(ecurie, N);
    printf("Vous avez %d €\n", fortune);

    // Debut pari
    pari_t pari;
    pari.numeros[0] = saisir("Premier  ", 1, N);
    pari.numeros[1] = saisir("Deuxième ", 1, N);
    pari.numeros[2] = saisir("Troisième", 1, N);
    pari.montant = saisir("Montant",
      montant_min, fortune);
    fortune -= pari.montant;
    printf("\n");

    /* Course */
    printf("La course démarre !\n");

    // Score
    printf("\n");
    int *tab_score = score_course(ecurie, N);
    afficher_scores(ecurie, tab_score, N);
    printf("\n");
    
    // Fin course
    printf("La course est termine.\n");
    printf("\n");

    // Tierce
    int tierce[3] = {
     0, 0, 0
    };
    
    etablir_tierce(ecurie, tab_score, tierce, N);
    free(tab_score);
    afficher_tierce(tierce);

    /* Paiement */
    int gain = gain_pari(&pari, tierce);
    if (gain > 0) {
      printf("Vous avez... gagne %d € !!! \n", gain);
      fortune += gain;
    } else {
      printf("Vous avez... perdu \n");
    }
    
  }

  // Fin jeu
  printf("À bientôt.\n");
  printf("Revenez avec de l'argent !\n");
  return 0;
}
