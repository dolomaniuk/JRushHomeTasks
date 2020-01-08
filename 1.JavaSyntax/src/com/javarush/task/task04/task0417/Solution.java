package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buff.readLine());
        int b = Integer.parseInt(buff.readLine());
        int c = Integer.parseInt(buff.readLine());

        if(a == b && b == c) System.out.printf("%d %d %d", a,b,c);
        else if(a == b) System.out.printf("%d %d", a, b);
        else if(b == c) System.out.printf("%d %d", b, c);
        else if(a == c) System.out.printf("%d %d", a, c);
    }
}