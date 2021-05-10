package com.tts;
import com.tts.AddressBook;


import java.util.*;


//public class Main {
//    public static int entryInput;
//    public static String e;
//
//
//    Scanner sc = new Scanner(System.in);
//
//    private static String fName;
//    private static String lName;
//    private static String email;
//    private static String phoneNum;
//
//    private static ArrayList<String> test = new ArrayList<>();
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1) Add an entry\n" +
//                "2) Remove an entry\n" +
//                "3) Search for a specific entry\n" +
//                "4) Print Address Book\n" +
//                "5) Delete Book\n" +
//                "6) Quit\n" +
//                "Please choose what you'd like to do with the database:\n");
//        entryInput = sc.nextInt();
////        myAddressClass(entryInput);
//        do {
//
//            if (entryInput == 1) {
//                System.out.println("\"Please enter your first, last name, phone number and email. Press enter after each input.\"");
//                fName = sc.nextLine();
//                lName = sc.nextLine();
//                email = sc.nextLine();
//                phoneNum = sc.nextLine();
//                test.add(fName, lName, email, phoneNum);
//
//
//            } else if (entryInput == 2) {
//
//
//            } else if (entryInput == 3) {
//
//            } else if (entryInput == 4) {
//
//            } else if (entryInput == 5) {
//
//            } else {
//                System.out.println("Invalid entry!!");
//            }
//
//        }
//        while (entryInput != 6);
//        System.out.println("Good Bye!");
//
//    }
//
//
//
//}



public class Main extends Entry {
    public static int entryInput;
    private static String fName;
    private static String lName;
    private static String email;
    private static String phoneNum;
    private static ArrayList<String> newBook = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//
        do {
            System.out.println("1) Add an entry\n" +
                    "2) Remove an entry\n" +
                    "3) Search for a specific entry\n" +
                    "4) Print Address Book\n" +
                    "5) Delete Book\n" +
                    "6) Quit\n" +
                    "Please choose what you'd like to do with the database:\n");
            entryInput = sc.nextInt();
            if (entryInput == 1) {
                System.out.println("Enter first name: ");
                fName = sc.next();
                System.out.println("Enter last name: ");
                lName = sc.next();
                System.out.println("Enter email: ");
                email = sc.next();
                System.out.println("Enter phone number: ");
                phoneNum = sc.next();
                System.out.println("Added entry!");

            } else if (entryInput == 2) {
                System.out.println("2");
            } else if (entryInput == 3) {
                System.out.println("3");
            } else if (entryInput == 4) {
                System.out.println("4");
            } else if (entryInput == 5) {
                System.out.println("5");
            } else if(entryInput > 6 | entryInput < 1){
                System.out.println("Invalid");
            }
        }
        while (entryInput != 6);
        System.out.println("Good Bye!");
    }
}