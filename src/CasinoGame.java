import java.util.Random;
import java.util.Scanner;

public class CasinoGame {

    // Méthode pour démarrer le jeu
    public void startGame() {
        Scanner scanner = new Scanner(System.in);  // Scanner pour les entrées utilisateur
        Random random = new Random();              // Random pour générer des nombres aléatoires

        int userNumber;
        String playAgain;

        // Boucle principale du jeu
        do {
            // Demander à l'utilisateur de choisir un nombre entre 1 et 10
            System.out.print("Choisissez un nombre entre 1 et 10 : ");
            userNumber = scanner.nextInt();

            // Vérifier que le nombre est dans la plage correcte
            if (userNumber < 1 || userNumber > 10) {
                System.out.println("Le nombre doit être compris entre 1 et 10.");
            } else {
                // Générer un nombre aléatoire entre 1 et 10
                int randomNumber = random.nextInt(10) + 1;

                // Afficher le nombre généré
                System.out.println("Le nombre généré est : " + randomNumber);

                // Vérifier si l'utilisateur a gagné ou perdu
                if (userNumber == randomNumber) {
                    System.out.println("Félicitations ! Vous avez gagné !");
                } else {
                    System.out.println("Désolé, vous avez perdu. Essayez encore.");
                }
            }

            // Demander si l'utilisateur veut rejouer
            System.out.print("Voulez-vous rejouer ? (oui/non) : ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("oui"));  // Rejouer si l'utilisateur dit "oui"

        // Fermer le scanner
        scanner.close();
        System.out.println("Merci d'avoir joué !");
    }
}
