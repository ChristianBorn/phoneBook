package org.example;

public class Friend extends Contact {
    int telephoneNumber;

    public Friend() {}

    public Friend(String name, int telephoneNumber) {
        // Hier geht super.contactName und this.contactName, was ist der Unterschied?
        super.contactName = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String toString() {
        return "Name: "+super.contactName+"; Telefonnummer: "+telephoneNumber+"\n";
    }

    public String getName() {
        return super.contactName;
    }
}
