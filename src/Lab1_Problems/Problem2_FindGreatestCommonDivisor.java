package Lab1_Problems;

/*
Problem:	Write	a	program	that	prompts	the	user	to
enter	two	posi7ve	integers	and	finds	their	greatest
common	divisor.
        • Solu7on:		Suppose	you	enter	two	integers	4	and	2,
their	greatest	common	divisor	is	2.	Suppose	you	enter
two	integers	16	and	24,	their	greatest	common	divisor
is	8.	So,	how	do	you	find	the	greatest	common	divisor?
Let	the	two	input	integers	be	n1	and	n2.	You	know
number	1	is	a	common	divisor,	but	it	may	not	be	the
greatest	commons	divisor.	So	you	can	check	whether	k
        (for	k	=	2,	3,	4,	and	so	on)	is	a	common	divisor	for	n1
        and	n2,	un7l	k	is	greater	than	n1	or	n2.
*/


import java.util.Scanner;

public class Problem2_FindGreatestCommonDivisor {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the first number: ");
            int num1 = input.nextInt();
            System.out.println("Please enter the second number: ");
            int num2 = input.nextInt();
            if (num1<=0 || num2<=0){
                System.out.println("Please enter valid number");
            } //warns user if entered 0 or smaller number.
            int smallest;
            if(num1<num2){      //Finding the smallest number
              smallest=num1;
            }else smallest=num2;

            for(int k=smallest; k>=1; k--){         //for looping starting from smallest entered number till 1

                if (num1 %k==0 && num2 %k==0){      //the k variable will start from smallest entered number till 1 and when divide with both number, k will be greatest common division.
                    System.out.println("The greatest divider : " + k);
                   System.exit(0);
                }else System.out.println("The greatest divider is: 1"); //if first condition not happens, mutual divider will be 1
              System.exit(0);

            }

    }
}
