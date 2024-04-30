import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number and we'll show its multiplication table: ");
        int numberUser = scanner.nextInt();
        System.out.printf("Multiplication table for the number %d é:%n",numberUser);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d:%n", numberUser, i);
            System.out.println(numberUser * i);
        }
    }
}
