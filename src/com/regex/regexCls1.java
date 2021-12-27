package com.regex;
import java.util.regex.*;

public class regexCls1 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("desh");
        Matcher mat = pat.matcher("xyzBangladesh");

         boolean b = mat.matches();
        if (b)
            System.out.println("Matched!");
        else
            System.out.println("Not matched");

    while (mat.find()){
        System.out.println(mat.group());
    }

    }

}
