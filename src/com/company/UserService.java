/**
 * Author: J White
 * Date Created: 4/25/2019
 * Dates Updated : 4/26/2019 - 4/ /2019
 */

package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class UserService {


    public static void main(String[] args) {
	// write your code here

        // create user and address objects
        Users user1 = new Users();
        Users user2 = new Users();
        Users user3 = new Users();

        Address home1 = new Address();
        Address home2 = new Address();
        Address home3 = new Address();

        // set the values (properties) for all objects
        user1.setDateCreated(new Date());
        user1.setHeight(67);
        user1.setName("Lotta B Hinds");

        user2.setDateCreated(new Date());
        user2.setHeight(69);
        user2.setName("Shirley U Jest");

        user3.setDateCreated(new Date());
        user3.setHeight(77);
        user3.setName("Joe King");

        home1.setCity("Kansas City");
        home1.setState("MO");
        home1.setZip(64110);

        home2.setCity("Pine Bluff");
        home2.setState("AR");
        home2.setZip(71601);

        home3.setCity("Brooklet");
        home3.setState("GA");
        home3.setZip(30415);

        // created a collection.list of users
        List <Users> userList = new ArrayList<Users>();

        // added the users to the list/collection
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        // creates a map to add the User Object with
        Map<Users, Address> userInfo = new HashMap<>();

        // creates a for each loop to search the userList for each user in the
        // collection/list then sets their address
        for (Users user: userList) {
//            user.displayUserInfo();

            if(user.getName().startsWith("L")){
                userInfo.put(user, home1);
                user.displayUserInfo();
                home1.displayAddressInfo();

            }else if(user.getName().startsWith("S")){
                userInfo.put(user, home2);
                user.displayUserInfo();
                home2.displayAddressInfo();

            }else
                userInfo.put(user, home3);
//                user.displayUserInfo();
//                home3.displayAddressInfo();

         }//end of forEach Loop
        user3.displayUserInfo();
        home3.displayAddressInfo();

    } //end of main method

}// end of UserService Class
