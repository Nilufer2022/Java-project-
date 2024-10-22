package Lab1_Oct_21_Nilufer;

public class FindingLargestElement {
    public static void main(String[] args) {

        // Finding the largest element

        int[] myArray2= new int[]{10, 20, 5, 6 , 9, };//I initialized myArray1 as integer and assign some integer values.
        int largest=myArray2[0];                       // I assumed the larges number ist the first value of myArray2

        for (int i = 0; i <myArray2.length ; i++) {   // I loop the array as lon as it.'s length
            if(myArray2[i]>largest){                  // and check here if looping array value larger of my largest variable
             largest=myArray2[i];                   // if it is larges update the larges variable.
            }

        }
        System.out.println("Largest number of the myArray1: "+largest);  // then, printed the largest number




    }
}
