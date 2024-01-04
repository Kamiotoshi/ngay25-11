package finalejava2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AddressBook {
    private static final Map<String, Contact> addressBook = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    findContact();
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    System.out.println("Exiting Address Book. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

        } while (choice != 4);

        scanner.close();
    }

    private static void addContact() {
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = new Contact(name, phoneNumber);
        addressBook.put(name, contact);

        System.out.println("Contact added successfully.");
    }

    private static void findContact() {
        System.out.print("Enter the name to find: ");
        String nameToFind = scanner.nextLine();

        Contact contact = addressBook.get(nameToFind);

        if (contact != null) {
            System.out.println("Contact found:");
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone Number: " + contact.getPhone());
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void displayContacts() {
        System.out.println("Address Book:");
        System.out.printf("%-15s %-15s\n", "Contact Name", "Phone Number");

        for (Contact contact : addressBook.values()) {
            System.out.printf("%-15s %-15s\n", contact.getName(), contact.getPhone());
        }
    }
}