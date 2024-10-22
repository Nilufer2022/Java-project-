package Lab1_Oct_21_Nilufer;

public class FindingTheSmallestIndexOfTheLargestElement {
    public static void main(String[] args) {

        //Finding the smallest index of the largest element

        int[] myArray3= new int[]{10, 20, 5, 6 , 9, };//I initialized myArray1 as integer and assign some integer values.
        int smallest=myArray3[0];                       // I assumed the smallest number ist the first value of myArray3

        for (int i = 0; i <myArray3.length ; i++) {   // I loop the array as lon as it.'s length
            if(myArray3[i]<smallest){                  // and check here if looping array value larger of my smallest variable
                smallest=myArray3[i];                   // if it is smallest update the small variable.
            }

        }
        System.out.println("Smallest number of the myArray3: "+smallest);  // then, printed the smallest number



    }
}
