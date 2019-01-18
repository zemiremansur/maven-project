package com.cybertek.utilities;

import javax.swing.*;

public class Example {
    public static void main(String[] args) {



        String one = SIngleton.get();
        System.out.println("one : " + one);



        String two = SIngleton.get();

        System.out.println("two : " + two);


        String tree = SIngleton.get();

        System.out.println("tree :"+ tree);



    }
}
