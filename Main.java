package com.edjata;
/*
* Empress Djata
* June 2, 2020
* This is a Mortgage Calculator
*/

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //variables calculate total mortgage and monthly rate
        double mortgageOfLoan, monthlyRateCal;
        //Constructors
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;
        final byte ONE = 1;
        int pLoanPrinciple = 0;
        float rLoanRate =  0;

        //User input loan principle

            do {
                System.out.print("Loan Principle ($1K - $1M): ");
                Scanner scanLP = new Scanner(System.in);
                pLoanPrinciple = scanLP.nextInt();
                if (!(pLoanPrinciple >= 1000) || !(pLoanPrinciple <=1_000_000)){
                        System.out.println("Enter a number between 1,000 and 1,000,000.");
                }
            }while (!(pLoanPrinciple >= 1000) || !(pLoanPrinciple <=1_000_000));

            //MOSH Solution
        //Scanner scanLP = new Scanner(System.in);
        //while(true){
        //System.out.print("Loan Principle ($1K - $1M): ");
        //int pLoanPrinciple = scanLP.nextInt();
        //if (pLoanPrinciple >= 1000 && pLoanPrinciple <=1_000_000)
        //break;
        //System.out.println("Enter a number between 1,000 and 1,000,000.");
        // }


        //User input rate of loan decimal
        do{
            System.out.print("Annual Interest Rate: ");
            Scanner scanAIR = new Scanner(System.in);
            rLoanRate = scanAIR.nextFloat();
            if (!(rLoanRate > 0 )|| !(rLoanRate <= 30)){
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            }
        }while (!(rLoanRate > 0 )|| !(rLoanRate <= 30));


        //User input loan period
        System.out.print("Period (Years): ");
        Scanner years = new Scanner(System.in);
        byte loanPeriod = years.nextByte();

        //Calculate monthly interest rate
        float cMonthlyRate = rLoanRate/PERCENT/MONTH_IN_YEAR;

        //Calculate number of months for loan period
        int nNumberOfPayments = loanPeriod * MONTH_IN_YEAR;
        //Monthly rate + 1 formula
        monthlyRateCal = (ONE + cMonthlyRate) ;
        //pow formula
        double powRate = Math.pow(monthlyRateCal, nNumberOfPayments);
        //mortgage of loan
        mortgageOfLoan = ((pLoanPrinciple *(cMonthlyRate * (powRate)))/(powRate - ONE));
        //formatted in US $
        NumberFormat mortgageFormat = NumberFormat.getCurrencyInstance();
        String monthlyMortgage = mortgageFormat.format(mortgageOfLoan);
        //Output to user
        System.out.println("Your mortgage on a " + loanPeriod + " year loan: " + monthlyMortgage);

    }
}
