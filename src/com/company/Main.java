package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.WhoIsNext(new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" }, 10));
    }
    public static String WhoIsNext(String[] names, int n) {
        String name = null;
        int i;
        String answer[] = new String[names.length + 1];
        while(i < names.length)
        System.out.println("Answers: " + answer.length);
        System.out.println("Names: " + names.length);
        names = new String[]{};
        answer[(answer.length)+1] = names[0];
        System.out.println(answer.length);
     return name;
    }
}
