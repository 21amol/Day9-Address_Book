package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        int choice;
        AddressBook ab = new AddressBook();
        do {

            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to Address Book Program");
            System.out.println("Kindly Enter choice \n 1. Add new Contact \n 2. Edit Contact details \n 3. Show Contact details");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    ab.addContacts();
                    break;

                case 2:
                    ab.editContacts();
                    break;

                case 3:
                    ab.showContacts();
                    break;
            }
        }while (choice != 3);
    }
}
