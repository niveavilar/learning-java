package cartao;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner readingUser = new Scanner(System.in);
        System.out.println("Welcome to the virtual Bank. What's your limit? ");
        double limite = readingUser.nextInt();
        readingUser.nextLine();
        CreditCard newCard = new CreditCard(limite);

        while (true) {
            System.out.println("What product do you wanna purchase? ");
            String productName = readingUser.nextLine();
            System.out.println("And what's it's price? ");
            double price = readingUser.nextDouble();
            readingUser.nextLine();

            if (!newCard.buy(productName, price)) {
                System.out.println("You don't have enough balance to the purchase.");
                break;
            }

            System.out.println("Purchase completed. Remaining balance: " + newCard.getBalance());
            System.out.println("If you wanna make a new purchase, type 'yes'. If you don't, type 'no'." +
                    "If you wish to verify all of your purchases, type 'verify'.");
            String answer = readingUser.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                break;
            } else if (answer.equalsIgnoreCase("verify")) {
                System.out.println("*** PURCHASES ***");
                System.out.println(newCard.listPurchases());
                System.out.println("Balance: " + newCard.getBalance());
                System.out.println("Limit: " + newCard.getLimit());
                System.out.println("Do you wanna continue purchasing? Type 'yes' if you wanna, and 'no' if you wanna " +
                        "close the app.");
                String secondAnswer = readingUser.nextLine();
                if (secondAnswer.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for using our bank!");
                    break;
                }
            }
        }
    }
}
