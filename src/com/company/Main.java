package com.company;

import java.io.PrintStream;
import java.util.*;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {

        String [] words = {"Good", "morning", "run", "jump", "box", "book", "big jump", "jump"}; //массив со вссем данными
        String x = "jump";// переменная в которую мы передаём искомую строку
        List<String> coincide = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            if (words[i].contains(x)) {

                coincide.add(words[i]);

            }
        }

        for (int z = 0; z < coincide.size(); z++) {

            out.println(coincide.get(z));

        }
    }
}
