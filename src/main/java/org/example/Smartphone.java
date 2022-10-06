package org.example;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Smartphone implements Radio, GPS {
    private String modelName;
    private String manufacturerName;
    private ArrayList<Contact> contactList;


    public Smartphone(String modelName, String manufacturerName, ArrayList<Contact> contactList) {
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.contactList = contactList;
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }


    public Contact getContactById(int id) throws InvalidParameterException {
        if (id < 0 || id > (contactList.size() - 1)) {
            throw new InvalidParameterException("Invalid index, index has to be between 0 and "+
                    (contactList.size() - 1));
        }
        else {
            return contactList.get(id);
        }

    }

    public Contact getContactByName(String name) {
        for(Contact singleContact : contactList) {
            if(singleContact.getName().equals(name)) {
                return singleContact;
            }
        }
        System.out.println("No contact with given name");
        return null;
    }

    public void removeContactByName(String name) {
        for(Contact singleContact : contactList) {
            if(singleContact.getName().equals(name)) {
                contactList.remove(singleContact);
                break;
            }
        }
        System.out.println("No contact with given name");
    }

    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public String getPosition() {
        return "Köln";
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    public String toString() {
        return "Modelname: "+modelName+
                "\nManufacturer: "+manufacturerName+
                "\nContacts:\n"+contactList;
    }
}
