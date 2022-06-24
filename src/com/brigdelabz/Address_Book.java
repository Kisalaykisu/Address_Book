/*
   Ability to add a new
Contact to Address Book - Use Console to add person details from
AddressBookMain class
- Use Object Oriented Concepts to manage
relationship between AddressBook and Contact
Person

 */

package com.brigdelabz;  //Package

import java.util.HashMap;  //import HAshmap
import java.util.Scanner;  // import Scanner

public class Address_Book {
    static String name;
    static boolean is_Running=false;  // initial the condition

    public static void main(String[] args){  //entry point of program

        System.out.println("Welcome to the ADDRESS BOOK");
        HashMap<String,ContactInfo> addressBook = new HashMap<>();  // Make Hashmap object

        while (!is_Running) {
            Scanner scanner = new Scanner(System.in);  // Make Scanner obj
            System.out.println("Enter 1 to create a new contact and 2 to exit");
            int choice = scanner.nextInt();  // Input int
            if (choice == 1) {
                ContactInfo contact = new ContactInfo();
                contact.setContactInfo();  // set() is used take a parameter and assign to the new variable
                name = contact.firstName + " " + contact.lastName;  //concat
                addressBook.put(name, contact);  // put() method of HashMap is used to insert a mapping into a map
                addressBook.get(name).displayContactInfo(); // get() used to return the element at a given index
            }else if (choice==2){
                is_Running = true;
            }
        }
    }
}

class ContactInfo{
    String firstName,lastName,address,city,state,zipcode,phoneNo,email;

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setState(String state){
        this.state=state;
    }
    public void setZipcode(String zipcode){
        this.zipcode=zipcode;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo=phoneNo;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public void setContactInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: \n Last Name: \n Address: \n City: \n State: \n Zipcode: \n PhoneNO: \n Email: \n");
        setFirstName(sc.nextLine());
        setLastName(sc.nextLine());
        setAddress(sc.nextLine());
        setCity(sc.nextLine());
        setState(sc.nextLine());
        setZipcode(sc.nextLine());
        setPhoneNo(sc.nextLine());
        setEmail(sc.nextLine());
    }
    public void displayContactInfo(){
        System.out.print(" First Name: "+firstName+"\n Last Name: "+lastName+"\n Address: "+address+
                "\n City: "+city+"\n State: "+state+ "\n Zipcode: "+zipcode+"\n PhoneNO: "+phoneNo+"\n Email: "+email+"\n");
    }
}