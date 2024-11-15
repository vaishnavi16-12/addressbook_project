package com.bridgelabz.addressbookproject;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressMain {
    public static void main(String[] args) {
        System.out.println("Welcome to this Project");

        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (true) {
            System.out.println("Address Book Menu : ");
            System.out.println("1.Add Contact");
            System.out.println("2.Display All  Contact");
            System.out.println("3.Edit :");
            System.out.println("4.Delete :");
            System.out.println("5.Exit :");

            System.out.println("Enter Choise :");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:

                System.out.println("Enter First Name:");
                String first_Name = sc.nextLine();

                System.out.println("Enter Last Name:");
                String last_Name = sc.nextLine();

                System.out.println("Enter Address:");
                String address = sc.nextLine();

                System.out.println("Enter City:");
                String city = sc.nextLine();

                System.out.println("Enter State:");
                String state = sc.nextLine();

                System.out.println("Enter Zip:");
                String zip = sc.nextLine();

                System.out.println("Enter Phone_Number:");
                String phone_Number = sc.nextLine();

                System.out.println("Enter Email:");
                String email = sc.nextLine();

                Contact contact = new Contact(first_Name, last_Name, address, city, state, zip, phone_Number, email);
                addressBook.addContact(contact);
                break;

                case 2:

                System.out.println("All Contact: ");
                addressBook.display();
                break;


                case 3:
                    System.out.println("Enter the first name to search contact for edit");
                    String edit_first_name=sc.nextLine();

                    boolean is_edited= addressBook.edit_contact(edit_first_name);
                    if(is_edited)
                        System.out.println("contact updated");
                    else
                        System.out.println("contact not found");

                    break;


                case 4:
                    addressBook.DeleteContact();
                    break;

                    case 5:

                    System.out.println("exiting the program");
                    sc.close();
                    return;


                    default:
                    System.out.println("invalid choise.please select a valid option");
                    break;
            }
        }
        }
    }
