/*
   Ability to create a Contacts in Address
Book with first and last names, address,
city, state, zip, phone number and
email...
- Program is written using IDE like IntelliJ
- Every UC is in a separate Git Branch and then merged with main
- Naming Convention, Indentation, etc Code Hygiene will be checked during
Review
- Git Check In Comments and Version History will be monitored

 */

package com.brigdelabz;  //Package

import java.util.HashMap;  //import HAshmap
import java.util.Scanner;  // import Scanner

public class Address_Book {
    static String name;

    public static void main(String[] args){   // Entry point of program

        System.out.println("Welcome to the ADDRESS BOOK");
        HashMap<String,ContactInfo> addressBook = new HashMap<>();  //Hashmap object creation

        Scanner scanner = new Scanner(System.in); //Make scanner obj
        System.out.println("Enter 1 to create a new contact");
        int choice = scanner.nextInt(); // Input int
        if (choice==1){
            ContactInfo contact = new ContactInfo();
            contact.setContactInfo();
            name = contact.firstName + " " + contact.lastName;
            addressBook.put(name,contact);  // put() method of HashMap is used to insert a mapping into a map
            addressBook.get(name).displayContactInfo(); // used to return the element at a given index
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
        System.out.print("First Name: "+firstName+"\n Last Name: "+lastName+"\n Address: "+address+
                "\n City: "+city+"\n State: "+state+ "\n Zipcode: "+zipcode+"\n PhoneNO: "+phoneNo+"\n Email: "+email);
    }

}
