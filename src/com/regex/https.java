package com.regex;
import java.util.regex.*;
import java.util.Scanner;
public class https {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String p = "Welcome to https://lus.ac.bd Leading University";

//        Pattern pat = Pattern.compile("http://.*?");
        //Pattern pat = Pattern.compile("[http]&&[https]&&[^a-z]&&[^A-Z]");
//        Pattern pat = Pattern.compile("https?.*?");

        //Pattern pat = Pattern.compile("https?:\\/\\/[\\w.*]");

        //Pattern pat = Pattern.compile("https?:\\/\\/\\.*");
        //Pattern pat = Pattern.compile("h.+?[d]");
        Pattern pat = Pattern.compile("https?.*?");

        Matcher mat = pat.matcher(p);

            p = mat.replaceAll(" ");
            System.out.println("P = " + p);


//        while (mat.find())
//        {
//            String test = mat.replaceAll(" ");
//            System.out.println(test);
//        }

    }


}
