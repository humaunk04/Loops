package com.loops;

public class Loops {
    public static void main(String[] args) {
    myLoop1();
    myLoop2();
    myLoop3();
    myLoop7();
    myLoop4();
    myLoop5();
    myLoop6();


    }
    // Practice using while and do while and for loop print numbers from 1 to 10.//
    public static void myLoop1(){
        int i = 1;
        while (i <= 10){
            System.out.print(i);
            i++;
        }

        int j =1;
        do {
            System.out.print(j);
            j++;
        }
        while ( j<=10);

        for (int k =1; k<=10; k++){
            System.out.print(k);
        }
    }

    // write a program to print number from 1 to 10.//
    public static void myLoop2(){
         for(int k = 1; k<=10; k++){
             System.out.println(k);
         }
    }
    // Write a program to calculate the sum of first 10 natural numbers//
    public static void myLoop3(){
        int num = 10, sum =0;

        for( int i = 1; i <= num; ++i){
            // sum = sum + i;//
            sum += i;

            System.out.println(" Sum of first 10 natural number = " + sum);
        }


    }

    /*Write a method that uses a for loop to display numbers in descending order
     in the step of 5 starting from 100. for example: 100,95,90,85 etc*/

    public static void myLoop7(){
        for ( int i =100; i>=0;i--,i--,i--,i--,i--){
            System.out.println("Descending order = " + i);
        }
    }

    /*Write a method that prints the multiplication table of the user provided number.
    Call your method from the main method. e.g., If the user enters the value
    of 9 should become, the program prints 9 18 27 etc until 90*/

    public static void myLoop4(){
        int num = 9;
        for( int i = 1; i <=10; ++i ){
            System.out.println(num+"x"+i+"="+num*i);
        }


    }

    //Write a method that checks if a number is a Prime number. Call your method from the main method//
    public static void myLoop5(){
        int num = 29;
        boolean isPrime = true;
        for(int i = 2; i<num;++i){
            if (num % i == 0){
              isPrime = false;
              break;

            }
        }
        if(isPrime){
            System.out.println(num + " Is a Prime number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
   //Write a method that accepts two numbers are returns the maximum of Two.//
    public static void myLoop6(){
        int i = 100;
        int j = 50;
        int max = Math.max(i, j );
        System.out.println(max);
    }








}


