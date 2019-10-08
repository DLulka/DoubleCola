package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.WhoIsNext(new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" }, 38614));
    }
    public static String WhoIsNext(String[] names, int n) {
        String name = "";
        int length = names.length - 1;
        if (n - 1 <= length){
            name = names[n-1];
        }else{
            while(n > length + 1) {
                n = (n - length) / 2;
            }
            name = names[n-1];
        }
        System.out.println("N es: " + n);
        return name;
    }
    }

