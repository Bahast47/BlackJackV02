import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Scanner newCard = new Scanner(System.in);

        int[] playersHand = new int[4];

        int Index_position = 0;
        int newValue;



        System.out.println("\n" + "Your cards are: ");



        for (int i = 0; i < 2; i++) {

            cards cardsOutPrint = new cards();
            System.out.println(cardsOutPrint);

        }

        System.out.println("\n" + "Dealers cards are: ");

        for (int i = 0; i < 1; i++) {

            cards cardsOutPrint = new cards();

            System.out.println(cardsOutPrint + "\n" + "HIDDEN CARD");

        }

        System.out.println("\n" + "Would you like another card?");

        String input = newCard.nextLine();


        if (input.equals("yes")) {

            System.out.println("Your cards are: ");


            for (int i = 0; i < 3; i++) {

                cards cardsOutPrint = new cards();

                System.out.println(cardsOutPrint);

            }
        }

    }
}
