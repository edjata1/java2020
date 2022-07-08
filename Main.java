package com.edjata;
/*
* Empress Djata
* June 1, 2020
* Java Training
* By Mosh
 */
import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // String literal: with string value
        System.out.println("Hello World!");

        //place in variable
        String name = "empress";
        String message = "   Hello " + name + ", It's 2020" + "!   ";
        System.out.println(message);
        System.out.println("this ends with !!: " + message.endsWith( "!!"));
        System.out.println("this ends with He: " + message.startsWith("He"));
        System.out.println("this is characters " + message.length());
        System.out.println("The index of this character is " + message.indexOf("H"));
        System.out.println(message.charAt(4));
        System.out.println(message.codePointAt(4));
        System.out.println(message.codePointBefore(4));
        System.out.println("Replaced: " + name + " with "+ name.replaceFirst("e", "E"));
        System.out.println("Replace first name with full name: " + name.replace("empress", "Empress S. Djata"));
        System.out.println("Replace: " + message.replace("!", "@$") + " is the new ending");
        System.out.println("to lower case: " + message.toLowerCase());
        System.out.println("to UPPER case: " + message.toUpperCase());
        System.out.println("to trim case: " + message.trim());

        String message2 = "Hi, \"Empress\"";
        System.out.println(message2);
        String message3 = "c:\\Windows\\...";
        System.out.println(message3);
        String message4 = "\tPlease \nEnter";
        System.out.println(message4);

        System.out.println("NONE OF THESE STRING CHANGE AFFECT ORIGINAL STRING: " + message);

        //Arrays
        //old way of writing arrays
        int [] numbersArray = new int[5];
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        System.out.println("This prints the address memory: " + numbersArray);
        System.out.println("To print the array: " + Arrays.toString(numbersArray));

        //new way of writing arrays store list of objects
        //single dimensional array
        int [] numbersArrays2 = {10, 3, 1, 252, 77};
        //arrays have a fix length
        System.out.println("number of items in arrays #2: " + numbersArrays2.length);
        System.out.println("Unsorted Arrays #2 items: " + Arrays.toString(numbersArrays2));
        //this will sort the array
        Arrays.sort(numbersArrays2);
        System.out.println("Sorted Array #2: " + Arrays.toString(numbersArrays2));

        //Multi-Dimensional Array
        //Two Dimensional Array to store matrix
        int[][] twoDimensionalArray = new int[2][3];
        //index of the first row and than first column
        twoDimensionalArray [0][0] = 1;
        //pass object to print
        System.out.println("prints wrong: " +  Arrays.toString(twoDimensionalArray));
        System.out.println("print right with deepToString: " + Arrays.deepToString(twoDimensionalArray));

        //new way
        int[][] twoDimensionalArray2 = {{1, 2, 3},{4, 5, 6}};
        System.out.println("print right with deepToString: " + Arrays.deepToString(twoDimensionalArray2));

        //Three Dimensional Array to store data for a cube
        int[][][] threeDimensionalArray = new int [2][3][5];
        threeDimensionalArray [0][0][0] = 4;
        System.out.println("Three dimensional array: " + Arrays.deepToString(threeDimensionalArray));

        //original age
        int age = 30;
        System.out.println(age);
        //change age value
        age = 35;
        System.out.println(age);
        //initialize multiple variables on same line
        int ages = 40, temperature = 20;
        System.out.println("when age " + ages + " your body temperature feels " + temperature + " hotter.");
        //better to place on multiple lines
        int agesOldPeople = 50;
        int temperatureOldPeople = 30;
        System.out.println("when age " + agesOldPeople + " your body temperature feels " + temperatureOldPeople + " hotter.");

        //assign a variable the value of another variable
        int myAge = 30;
        int herAge = myAge;
        System.out.println("my age is " + myAge + " , but her age is "+ herAge);
        //here myAge increased by 1 leaving her age the origial value of 30
        myAge +=1;
        System.out.println("my age is " + myAge + " , but her age is "+ herAge);
        //herAge increased  by 2 leaving myAge increased by 1
        herAge +=2;
        System.out.println("my age is " + myAge + " , but her age is "+ herAge);

        //IMPORTANT::All the words in blue are reserved keywords can't use them as variable, class or method names

        //primitive types :: there are 8 types
        byte childAge = 10;
        //for lager number can use _ like ,
        int viewsCounter = 123_456_789;
        //large values over 3 million user L suffix at end of #s for long
        long viewerCounter = 3_123_456_789L;
        //float need F suffix at end
        float priceHat = 10.99F;
        //char uses ''
        char bestGrade = 'A';
        //Strings ""
        String worstOutCome = "Failed Class";
        //boolean is set to false by default
        boolean isEligible = true;

        //Reference types :: all others are reference types
        Date now = new Date();
        Human john = new Human();
        long time;

        System.out.println(now.getTime());
        System.out.println(now);
        time = now.getTime();
        System.out.println(time);

        //Memory Management
        //x & y are independent. memory location change of x does not affect y. y is a reference to the original value
        byte x = 1;
        System.out.println("origial value of x: " + x);
        byte y = x;
        x=2;
        System.out.println("reference to x value of y: " + y);
        System.out.println("now changing value of x: " + x +", will not change y's value. independent variables");

        //when we use reference line this behavior is different
        //can pass the initial values for x & y into point1. automatically adds labels for x & y
        Point point1 = new Point(1,1);
        Point point2 = point1;
        System.out.println("Point 1: " + point1);
        System.out.println("point 2 is the address or reference to point 1: " + point2);
        point1.x = 2;
        System.out.println("changing point 1 updates point 2" + point2 + " dependent variables.");

        //Constant: don't want the value to change
        //USE ALL CAPITAL LETTER FOR FINALS
        final float PI = 3.14F;
        System.out.println("use final to creat constants that can't be changed: " + PI);

        //Arithmetic Expressions
        int resultArithmeticAdding = 10 + 3;
        System.out.println("Adding: " + resultArithmeticAdding);
        int resultArithmeticSubtraction = 10 - 3;
        System.out.println("Subtraction: " + resultArithmeticSubtraction);
        int resultArithmeticMultiplication = 10 * 3;
        System.out.println("Multiplication: " + resultArithmeticMultiplication);
        double resultArithmeticDivision = (double) 10 / (double)3;
        System.out.println("Division: " + resultArithmeticDivision);
        int resultArithmeticMod = 10 % 3;
        System.out.println("Mod: " + resultArithmeticMod);

        //increasing and decreasing
        int x12 = 1;
        x12++;//postfix
        System.out.println("Increasing value: " + x12);
        int y12 = 3;
        y12--;//postfix
        System.out.println("Decreasing value: " + y12);
        int z12 = 4;
        --z12;
        System.out.println(z12);
        int n12 = x12++;
        System.out.println(n12);
        System.out.println(x12);
        x12 = x12 + 7;
        System.out.println(x12);
        n12 += 4;
        System.out.println(n12);

        //Casting
        //implicit casting - automatic casting or conversion
        //so byte > short > int > long > float > double
        short xCasting = 1;
        int yCasting = xCasting + 2;
        System.out.println("Casting: " + yCasting);

        double xCasting1 = 1.1;
        double yCasting1 = xCasting1 + 2;//cast 2 to 2.0 and added to 1.1
        System.out.println("Casting: " + yCasting1);

        //explicitly cast results
        //all compatiable types byte > short > int > long > float > double
        double xCasting2 = 1;
        int yCasting2 = (int) xCasting2 + 2;//(int) xCasting2:: casted to 1 and add to 2
        System.out.println("Casting: " + yCasting2);

        //casting Strings
        String xCasting3 = "1";
        int yCasting3 = Integer.parseInt(xCasting3 + 2);
        System.out.println("Casting String to int: " + yCasting3);

        String xCasting4 = "1.1";
        double yCasting4 = Double.parseDouble(xCasting4 + 2);
        System.out.println("Casting String double: " + yCasting4);

        //Math class
        //rounds number
        int resultMath1 = Math.round(2.5F);
        System.out.println(resultMath1);

        //ceil return smallest number
        int resultMath2 = (int) Math.ceil(1.1F);
        System.out.println(resultMath2);

        //floor return smallest number or equal to
        int resultMath3 = (int) Math.floor(1.1F);
        System.out.println(resultMath3);

        //max return greater of two number
        int resultMath4 = (int) Math.max(3,6);
        System.out.println(resultMath4);

        //min return smallest of two number
        int resultMath5 = (int) Math.min(9,25);
        System.out.println(resultMath5);

        //random generating random value between 0 - 1 (decimal point)
        double resultMath6 = Math.random();
        System.out.println(resultMath6);

        //random generating random value between 0 - 100 (decimal point)
        double resultMath7 = Math.random() * 100;
        System.out.println(resultMath7);

        //random generating random value between 0 - 100 (No decimal point)
        int resultMath8 = (int) Math.round(Math.random() * 100);
        System.out.println(resultMath8);

        //explicit casing to int and rounding number
        int resultMath12 = (int) Math.round(Math.random() * 100);
        System.out.println(resultMath12);

        //Pick 3 Generate random numbers between 0 - 9
        int resultMath9 = (int) (Math.random() * 9);
        int resultMath10 = (int) (Math.random() * 9);
        int resultMath11 = (int) (Math.random() * 9);
        System.out.println(resultMath9 + ", " + resultMath10 + ", " + resultMath11);

        //Formatting numbers:: can't create an instance using the new key word because it is an abstract method
        //CAN'T DO:: NumberFormat currency = new NumberFormat(); BUT CAN OVERLOAD IT
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String resultCurrency = currencyFormat.format(1234567.981);
        System.out.println(resultCurrency);

        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        String resultPercent = percentFormat.format(.097);
        System.out.println(resultPercent);

        //method chaining
        String resultPercentMethodChaining = NumberFormat.getPercentInstance().format(.1);
        System.out.println(resultPercentMethodChaining);

        //Reading Input
        System.out.print("Enter your age: ");
        Scanner scannerUser = new Scanner(System.in);
        byte scanUserAge = scannerUser.nextByte();
        System.out.println("You are " + scanUserAge);

        System.out.print("Enter name: ");
        Scanner firstName = new Scanner(System.in);
        String userFirstName = firstName.next();
        System.out.println("You are " + userFirstName);

        System.out.print("Enter words: ");
        Scanner scannerUser2 = new Scanner(System.in);
        String scanUserString = scannerUser2.nextLine().trim();
        System.out.println("At age " + scanUserAge +" You wrote: " + scanUserString);
    }
}
