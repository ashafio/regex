package com.regex;
import java.util.regex.*;

public class regex {

    public static void main(String[] args) {
        Pattern pat = Pattern.compile(".s");
        Matcher mat = pat.matcher("as");
        boolean b1 = mat.matches();

        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        boolean b3 = Pattern.matches(".s","as");

        System.out.println(b1+ " "+b2+" "+b3);
    }


}
