package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        ab.addNewAddressBook();
        ab.addContacts();
        ab.searchByOptions();

    }
}
