package com.regex;
import java.util.regex.*;
import java.util.Scanner;
public class email {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter Pattern: ");
        //String pat = input.nextLine();
        Pattern patn = Pattern.compile("[a-z]{3}_[^0]{1}[0-9]{9}+@lus.ac.bd");
        System.out.println("Enter Matcher ");
        String matc = input.nextLine();
        Matcher mat = patn.matcher(matc);
         boolean b = mat.matches();
        if (b)
            System.out.println("Matched!");
        else
            System.out.println("Not matched");
    }


}
