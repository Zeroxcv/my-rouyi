package com.ruoyi;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.SimpleFormatter;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
//            r.nextInt();
//            String s1 = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) +  + ".txt";
//            System.out.println(s1);
            System.out.println(r.nextInt(1000));
        }

    }
}
