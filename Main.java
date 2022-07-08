package com.edjata;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Comparison Operators

        int x = 1;
        int y = 1;

        System.out.println(x == y);

        System.out.println(x != y);

        System.out.println(x > y);

        System.out.println(x >= y);

        System.out.println(x < y);

        System.out.println(x <= y);

        //logical operators

        int temperature = 22;
        //logical && operator both must be true to get true
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        int temperature2 = 12;
        //logical && operator one false makes it false
        boolean isWarm2 = temperature2 > 20 && temperature2 < 30;
        System.out.println(isWarm2);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        //|| or operator if one is true all is true:: if false in first part it will continue to evaluate statement to see if next statement is true
        boolean isEligible = (hasHighIncome || hasGoodCredit) != hasCriminalRecord;
        System.out.println("Customer Eligible: " + isEligible);

        //if statement
        int temp1 = 32;

        if (temp1 > 30) {
            //braces only required for multiple statements
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water!");
        } else if (temp1 > 20)
            //{} not required for single statements
            System.out.println("It's a nice day");
        else
            //{} not required for single statements
            System.out.println("It's cold!");

        //Simplifying if statements
        int income2 = 120_000;
        //set here so it is visible outside the code block{} to the whole program
        boolean hasHighIncome2 = false;

        if (income2 > 100_000)
            hasHighIncome2 = true;
        System.out.println(hasHighIncome2);

        //BETTER WAY TO WRITE THE ABOVE SIMPLIFIED IF STATEMENT
        int income3 = 120_000;

        //MOST PROFESSIONAL WAY TO IMPLEMENT SCENARIO
        //if boolean expression evaluates to true, this boolean variable is true otherwise it will be false
        boolean hasHighIncome3 = (income3 > 100_000);
        System.out.println("You got high income: " + hasHighIncome3);

        //Ternary Operator
        int income4 = 120_000;

        String className4;
        if (income4 > 100_000)
            className4 = "First";
        else
            className4 = "Econemy";
        System.out.println("Your income is " + className4 + " class");

        //Professional way to write above code
        int income5 = 120_000;

        //Set an initial value to the variable
        String className5 = "Economy";
        if (income5 > 100_000)
            className5 = "First";
        System.out.println("Your income is " + className5 + " class");

        //Professional way with Ternary Operator to write above code
        int income6 = 120_000;

        //Ternary Operator usage: Condition - (TO TEST) ? TRUE-(IF) : FALSE-(ELSE) Conditional statements
        String className6 = income6 > 100_000 ? "First" : "Economy";
        System.out.println("Your income is " + className6 + " class");

        //Switch Statements:: to evaluate different parts of the code
        String role = "admin";
        if (role == "admin")
            System.out.println("You are the Admin.");
        else if (role == "moderator")
            System.out.println("You are the Moderator.");
        else
            System.out.println("You are guest.");

        //More Professional - Switch Statement of above
        String role2 = "admin";

        switch (role2) {
            case "admin":
                System.out.println("You are the Admin.");
                break;

            case "moderator":
                System.out.println("You are the Moderator.");
                break;

            default:
                System.out.println("You are guest.");
        }

        //More Professional - Switch Statement of above
        int role3 = 1;

        switch (role3) {
            case 1:
                System.out.println("You are the Admin.");
                break;
            case 2:
                System.out.println("You are the Moderator.");
                break;
            default:
                System.out.println("You are guest.");
        }

        //For Loop
        for (int i = 5; i > 0; i--) {
            System.out.println(i + ".) Hello World!");
        }

        //while loops
        int i = 0;
        while (i > 5) {
            System.out.print(i + ".) Hello New World!");
            i--;
        }

        //while loop compare unser in
        //System.out.println("Enter Text: ");
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.print(input + "\n");
        }

        //do-while loop compare unser in
        System.out.println("Enter 1 Text Here: ");
        Scanner scanner1 = new Scanner(System.in);
        String input1 = "";
        do {
            System.out.println("Input: ");
            input1 = scanner1.next().toLowerCase();
            System.out.println(input1);
        } while (!input1.equals("quit"));

        //USING BREAK STATEMENT - while loop compare unser in
        System.out.println("Enter 2 Text Here: ");
        Scanner scanner2 = new Scanner(System.in);
        String input2 = "";
        while (!input2.equals("quit")) {
            System.out.print("Input: ");
            input2 = scanner2.next().toLowerCase();
            if (input2.equals("quit"))
                break;
            System.out.print(input2 + "\n");
        }

        //USING THE CONTINUE AND BREAK STATEMENTS - while loop compare unser in
        System.out.println("Enter 3 Text Here: ");
        Scanner scanner3 = new Scanner(System.in);
        String input3 = "";
        while (!input3.equals("quit")) {
            System.out.print("Input: ");
            input3 = scanner3.next().toLowerCase();
            if (input3.equals("pass"))
                continue;
            if (input3.equals("quit"))
                break;
            System.out.print(input3 + "\n");
        }

        //True condition - while loop compare unser in
        System.out.println("Enter 3 Text Here: ");
        Scanner scanner4 = new Scanner(System.in);
        String input4 = "";
        while (true) {
            System.out.print("Input: ");
            input4 = scanner4.next().toLowerCase();
            if (input4.equals("pass"))
                continue;
            if (input4.equals("quit"))
                break;
            System.out.print(input4 + "\n");
        }

        //iterate over arrays or collections
        String[] fruits1 ={"Apple", "Mango", "Orang"};

        //fori loop
        for (int j = fruits1.length; j > 0; j--) {
            System.out.println(fruits1[j]);
        }

        //for-each
        for (String fruits : fruits1) {
            System.out.println(fruits);
        }

    }
}
