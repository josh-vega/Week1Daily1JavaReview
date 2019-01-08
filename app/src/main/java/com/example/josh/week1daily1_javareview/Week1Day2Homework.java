package com.example.josh.week1daily1_javareview;

import java.util.*;
import java.lang.String;

public class Week1Day2Homework {

    public static void main(String[] args){
        Week1Day2Homework homework = new Week1Day2Homework();
        List<String> list = new ArrayList<String>();
        list.add("cookies");
        list.add("donuts");
        list.add("candy");
        list.add("cookies");
        list.add("chocolate");
        list.add("sprinkles");
        list.add("chocolate");
        list.add("skittles");
        list.add("nougat");
        list.add("donuts");
        homework.findDuplicates(list);
        System.out.println();
        System.out.println(homework.checkPalindrome("dontnod"));
        System.out.println();
        homework.fizzBuzz(20);
        System.out.println();
        System.out.println(homework.checkAnagrams("COAT", "TACO"));
        System.out.println();
        homework.printTables();


    }

    public void findDuplicates(List<String> strings) {
        List<String> duplicates = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        for(int i=0; i<strings.size(); i++) {
            if(list2.contains(strings.get(i))) {
                duplicates.add(strings.get(i));
            }
            list2.add(strings.get(i));
        }

        for(String duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }

    public boolean checkPalindrome(String word) {
        String rev = "";
        word = word.toLowerCase();

        if(word.length()==1) {
            return true;
        }

        for(int i=word.length()-1; i>=0; i--) {
            rev = rev + word.charAt(i);
        }

        if(word.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    public void fizzBuzz(int count) {
        for(int i=1; i<=count; i++) {
            if(i%3==0 && i%5==0) {
                System.out.println("fizzbuzz");
            } else {
                if(i%3==0) {
                    System.out.println("fizz");
                }

                if(i%5==0) {
                    System.out.println("buzz");
                }
            }
        }
    }

    public boolean checkAnagrams(String word1, String word2) {

        if(word1.length() != word2.length()) {
            return false;
        }

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        Arrays.sort(w1);
        Arrays.sort(w2);

        if(Arrays.equals(w1, w2)) {
            return true;
        } else {
            return false;
        }
    }

    public void printTables() {
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            table[i][0] = i + 1;
            table[0][i] = i + 1;
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                table[i][j] = table[i][0] * table[0][j];
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
