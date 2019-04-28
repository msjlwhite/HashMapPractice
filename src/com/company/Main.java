/**
 * Date:4/25/2019
 * Author: J White
 */


package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Main {



    public static void main(String[] args) {
        // write your code here

        // creates user and address objects
//        Users user = new Users();
//        Address home = new Address();

        // create user and address objects
        Users user1 = new Users();
        Users user2 = new Users();
        Users user3 = new Users();

        Address home1 = new Address();
        Address home2 = new Address();
        Address home3 = new Address();

        // set the values(properties) for all objects
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
        List<Users> userList = new ArrayList<Users>();

        // added the users to the list/collection
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        // creates a map to add the User Object with
        Map<String, Address> userAddress = new HashMap<>();

        // creates a for each loop to search the userList for each user in the
        // collection/list then sets their address
        for (Users user: userList) {

            if(user.getName().startsWith("S")){

                userAddress.put(user.getName(), home1);

            }else if(user.getName().startsWith("L")){

                userAddress.put(user.getName(), home2);

            }else
                userAddress.put(user.getName(), home3);

        }

//        System.out.println(userAddress.keySet().toString());
//        System.out.println(userAddress.values(key).toArray());
        System.out.println(userAddress.keySet());
        System.out.println(userAddress.hashCode());



    } //end of main method


}
