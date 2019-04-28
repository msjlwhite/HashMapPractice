/**
 * Author: J White
 * Date Created: 4/25/2019
 * Dates Updated : 4/26/2019 - 4/ /2019
 */
package com.company;

public class Address {

    // variables
    String state;
    String city;
    int zip;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void displayAddressInfo()
    {
        System.out.println(getCity() +", " + getState() + ". " + getZip());
        System.out.println(" ");

    }
}
