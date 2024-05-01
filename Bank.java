import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        String menu = """
                Operations
                1- Consult balance
                2- Receive funds
                3- Transfer funds
                4- Close transaction
                Type the desired option:
                """;
        System.out.println("What's the name of the owner of the account?");
        String nameClient = inputUser.nextLine();
        System.out.println("What's the type of your account?");
        String typeAccount = inputUser.nextLine();
        System.out.println("How much money do you want to put in your account? Please insert only numbers");
        double balance = inputUser.nextDouble();
        System.out.println("Great. Your account in being generated. Wait a few moments... \n \n");
        System.out.println("***********************\n" +
                "Data of the client:\n \n" +
                "Name: " + nameClient + "\n" +
                "Type of the account: " + typeAccount + "\n" +
                "Initial balance: R$" + balance + "\n" +
                "*********************** \n" + menu);
        int opcaoMenu = inputUser.nextInt();
        while (opcaoMenu != 4) {
            if (opcaoMenu == 1) {
                System.out.println("Your balance is: R$" + balance + "\n");
            }
            else if (opcaoMenu == 2) {
                System.out.println("How much money would you like do put in your bank account?");
                int mudarValor = inputUser.nextInt();
                balance += mudarValor;
                System.out.println("Updated balance: R$" + balance + "\n");
            }
            else if (opcaoMenu == 3) {
                System.out.println("How much money would you like to take out of your account?");
                int mudarValor = inputUser.nextInt();
                if (balance >= mudarValor) {
                    balance -= mudarValor;
                    System.out.println("Updated balance: R$" + balance);
                }
                else {
                    System.out.println("You don't have enough balance");
                }
            } else {
                System.out.println("Invalid option");
            }
            System.out.println(menu);
            opcaoMenu = inputUser.nextInt();
        }
    }
}
