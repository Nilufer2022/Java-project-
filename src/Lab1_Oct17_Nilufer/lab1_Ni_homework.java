package Lab1_Oct17_Nilufer;

import java.util.Scanner;

public class lab1_Ni_homework {
    public static void main(String[] args) {
   /*     What is IntelliJ?
• Find it.
• Install It.
• Create a Project called Lab1_<Date>_<name>
• Your program when ran should:
• Print your name:
• Print your programing background and experience
• If your are an experience Java programmer
– Create a menu
– User can choose: 1,2,3 or exit
– 1: your name
– 2: your programing background
– 3: some projects you worked on?
– User can go back to main menu at any point */

        Scanner scan = new Scanner(System.in);// scanner object creations

        String input = "";
        do {             // while "exit" not enter list the options.

            System.out.println("[1] My Name");
            System.out.println("[2] My Programming Background");
            System.out.println("[3] Some Projects I Worked On");
            System.out.println("[Exit] to leave the program");
            System.out.print("Choose an option (1, 2, 3) or 'exit': ");
            input = scan.nextLine().toLowerCase(); // assign entered string values all in lower case to input

            System.out.println(" --------------------------------------------------- \n");


            switch (input) {
                case "1":// when you  enter 1  it will display "Nilufer"
                    System.out.println("Nilufer");
                    break;
                case "2":
                    System.out.println("3 years of web design experience");
                    break;
                case "3":
                    System.out.println("www.amazon.com.");
                    break;
                case "exit":// exit
                    System.exit(0); // halts the program when entered "exit"
                default:
                    System.out.println("Entered incorrectly");

            }

            System.out.println("\n ********************************************** \n");
        } while (input != "exit");// while input not exit, it will loop

    }
}







