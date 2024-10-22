package Lab1_Problems;
/*Problem:	Write	a	program	that	displays	the	first	50	prime
numbers	in	five	lines,	each	of	which	contains	10	numbers.	An
integer	greater	than	1	is	prime	if	its	only	posi7ve	divisor	is	1	or
itself.	For	example,	2,	3,	5,	and	7	are	prime	numbers,	but	4,	6,
        8,	and	9	are	not.
        • Solu7on:	The	problem	can	be	broken	into	the	following	tasks:
        • For	number	=	2,	3,	4,	5,	6,	...,	test	whether	the	number	is
prime.
• Determine	whether	a	given	number	is	prime.
• Count	the	prime	numbers.
        • Print	each	prime	number,	and	print	10	numbers	per	line.*/


public class Problem3_DisplayingPrimeNumbers {

        public static void main(String[] args) {
            int count = 0; // will count how many prime number we found. initial zero
            int number = 2; // The smallest prime number 2.

            // Keep checking numbers until we find 50 prime numbers
            while (count < 50) {
                if (isPrime(number)) { // Check if the current number is prime
                    System.out.print(number + " "); // Print the prime number
                    count++; // Increase the count

                    // Print a new line after count variable equals 10 and times of 10.
                    if (count % 10 == 0) {
                        System.out.println();
                    }
                }
                number++; // increase number to check next number
            }
        }

        // isPrime method returns true if number is prime.
        public static boolean isPrime(int param1) {
            int count=0;
            for (int i = 1; i <= param1 ; i++) {    //for method counts how many times will be divided without reminder till itself.
                if (param1 % i == 0) {
                    count++;
                }
            }
            if(count==2){   //if count 2 it means it is devided by 1 and itself. so it is prime and will return true.
                return true;
            }else return false; //if count not 2, it means it can be dividable more than 1 and itself, so not prime.

        }
    }

