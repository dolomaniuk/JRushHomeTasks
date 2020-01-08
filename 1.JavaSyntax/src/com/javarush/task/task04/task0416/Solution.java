package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        float minutes = Float.parseFloat(buffer.readLine());
        if (minutes >= 5) minutes %= 5; // отбрасываем лишние минуты
        minutes *= 60; // переводим в секунды
        if (minutes >= 0 && minutes < 180) System.out.println("зеленый");
        else if (minutes >= 180 && minutes < 240) System.out.println("желтый");
        else System.out.println("красный");
    }
}