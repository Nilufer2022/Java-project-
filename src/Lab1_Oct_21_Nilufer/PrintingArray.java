package Lab1_Oct_21_Nilufer;

// Printing arrays
public class PrintingArray {
    public static void main(String[] args) {

        int[] myArray = new int[]{3, 5, 7};
        String[] myStringArray = new String[]{"pink", "yellow", "blue"};

        // Printing the array elements
        System.out.println(myArray[0]);
        System.out.println(myStringArray[2]);

        //Printing the array element with for loops.
        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }

        for(int i=0; i<myStringArray.length; i++){
            System.out.println(myStringArray[i]);
        }

    }

    }

