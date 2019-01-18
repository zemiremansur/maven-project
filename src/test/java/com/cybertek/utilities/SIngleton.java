package com.cybertek.utilities;

public class SIngleton {


    private static String str;

    private SIngleton(){}


    public static String get(){
        if (str== null){
            System.out.println("printing name of our family :");
            str = "zami mawlan meghfur";
        }
        return str;



    }



}
