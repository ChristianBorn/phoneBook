package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contact friend1 = new Friend("Hans", 456432);
        Contact friend2 = new Friend("Peter", 345621651);
        Contact friend3 = new Friend("Edeltraut", 7457723);
        Contact newFriend = new Friend("Karl-Heinz", 346547);
        ArrayList<Contact> friendList = new ArrayList<>(List.of(friend1, friend2, friend3));


        Smartphone myPhone = new Smartphone("Galaxy 23", "Samsung", friendList);
        System.out.println(myPhone);
        myPhone.addContact(newFriend);
        System.out.println(myPhone);
        System.out.println(myPhone.getContactByName("Hans"));
        myPhone.removeContactByName("Hans");
        System.out.println(myPhone);
        System.out.println(myPhone.getContactById(5));
//        System.out.println(myPhone.startRadio());
//        System.out.println(myPhone.stopRadio());
//        System.out.println(myPhone.getPosition());


    }
}