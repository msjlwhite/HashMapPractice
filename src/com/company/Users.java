/**
 * Author: J White
 * Date Created: 4/25/2019
 * Dates Updated : 4/26/2019 - 4/27/2019
 */

package com.company;

//
import java.util.Date;

public class Users {

   //variables
   String name;
   int height;
   Date dateCreated = new Date();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void displayUserInfo()
    {
//        System.out.print(getName() + getDateCreated() + getHeight());
        System.out.println("Current Date / Time: " + getDateCreated());
        System.out.println("User Name: " + getName());
//        System.out.println("User Height (in Inches): " + getHeight());
        System.out.println("User Height: " + getHeight() + " in.");
        System.out.print("User Current Location Info: ");

    }

}
