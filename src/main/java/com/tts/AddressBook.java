package com.tts;
import java.util.*;

//
//public class AddressBook extends Entry {
//    private String fName;
//    private String lName;
//    private String email;
//    private String phoneNum;
//
//
//
//
//    Scanner sc = new Scanner(System.in);
//
//    int entryInput;
//    AddressBook example = new AddressBook();
//    List<String> values = new ArrayList<>();
//
//
//
//    public void myAddressClass() {
//
//
//        do {
//
//            if (entryInput == 1) {
//                System.out.println("\"Please enter your first, last name, phone number and email. Press enter after each input.\"");
//                fName = sc.nextLine();
//                lName = sc.nextLine();
//                email = sc.nextLine();
//                phoneNum = sc.nextLine();
//                example.addEntry(fName, lName, email, phoneNum);
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
//    }
//
//    private void Entry(String fName, String lName, String email, String phoneNum) {
//    }
//
//
//}


public class AddressBook extends Entry {
    private String fName;
    private String lName;
    private String email;
    private String phoneNum;
    Scanner sc = new Scanner(System.in);
    int entryInput;
    AddressBook values = new AddressBook();
    //    List<String> values = new ArrayList<>();
    public void myAddressClass() {
        do {
            if (entryInput == 1) {
                System.out.println("\"Please enter your first, last name, phone number and email. Press enter after each input.\"");
                fName = sc.nextLine();
                lName = sc.nextLine();
                email = sc.nextLine();
                phoneNum = sc.nextLine();
                values.addEntry(fName, lName, email, phoneNum);
            } else if (entryInput == 2) {
            } else if (entryInput == 3) {
            } else if (entryInput == 4) {
            } else if (entryInput == 5) {
            } else {
                System.out.println("Invalid entry!!");
            }
        }
        while (entryInput != 6);
        System.out.println("Good Bye!");
    }
}