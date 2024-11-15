package com.bridgelabz.addressbookproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }
//Add Cobtact in addressbook

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added: " + contact);

    }

    public void display() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    // method to find a contact by first name
    public Contact find_contact_by_first_name(String first_name){
        for(Contact contact:contacts){

            if(contact.getFirst_name().equalsIgnoreCase(first_name)){
                return contact;
            }
        }
        return null;
    }

    // method to edit contact return by find_cntact_by_first_name

    public boolean edit_contact(String first_name){
        Contact contact = find_contact_by_first_name(first_name);
        if(contact != null){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Editing contact for " + first_name);

            System.out.println("Choose detail to edit:");
            System.out.println("1.First name");
            System.out.println("2.Last Name");
            System.out.println("3. Address");
            System.out.println("4. City");
            System.out.println(" 5. State");
            System.out.println("6. ZIP Code");
            System.out.println("7. Phone Number");
            System.out.println("8. Email");
            System.out.println("9. Exit");

            int editChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (editChoice) {
                case 1:
                    System.out.print("Enter new Last Name: ");
                    contact.setLast_name(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Enter new Address: ");
                    contact.setAddress(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Enter new City: ");
                    contact.setCity(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Enter new State: ");
                    contact.setState(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Enter new ZIP Code: ");
                    contact.setZip(scanner.nextLine());
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.print("Enter new Phone Number: ");
                    contact.setPhone_Number(scanner.nextLine());
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.print("Enter new Email: ");
                    contact.setEmail(scanner.nextLine());
                    break;
                case 8:
                    return false; // Exit the method
                default:
                    System.out.println("Invalid choice. No changes made.");
                    break;
            }
            return true;
        } else{
            return false;
        }
    }
//     Delete the Contact

    public void DeleteContact(){
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name of contact to delete: ");
         String First_name= sc.next();
        System.out.println("Enter Last Name of contact to delete: ");
        String last_name = sc.next();


        Contact contact=find_contact_by_first_name(First_name);

        if(contact != null) {
            contacts.remove(contact);
            System.out.println("Contact delete Successfully ");
        }else {
            System.out.println("contact not found`2");

        }

    }



}















