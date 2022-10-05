package org.example;

public class BusinnessContact extends Contact{
    String companyName;


    @Override
    public String getName() {
        return companyName;
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
