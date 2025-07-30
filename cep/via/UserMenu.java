package cep.via;

import java.io.IOException;
import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner readingUser = new Scanner(System.in);
        System.out.println("Hi! Type the CEP (8 digits, only numbers), and I will tell you the address!");
        String cep = readingUser.nextLine();
        FindingCep findingCep = new FindingCep();
        ArchiveGenerator archiveGenerator = new ArchiveGenerator();

        try {
            Address address = findingCep.FindingAddress(cep);
            System.out.println("Address: \n Street - " + address.logradouro() +
                    "\n Neighborhood - " + address.bairro() +
                    "\n CEP - " + address.cep() +
                    "\n City - " + address.localidade() +
                    "\n State - " + address.uf());

            archiveGenerator.creatingArchive(address);
            System.out.println("The address was saved in the archive address.json.");

        } catch (InvalidFormatException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
