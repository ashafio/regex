package com.regex;
import java.util.regex.*;
import java.util.Scanner;

public class inputRegex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern patn = Pattern.compile("Bangladesh");
        System.out.println("Enter Matcher ");
        String matc = input.nextLine();
        Matcher mat = patn.matcher(matc);
        boolean b = mat.matches();
        if (b==true)
            System.out.println("Matched!");
        else
            System.out.println("Not matched");


    }


}





