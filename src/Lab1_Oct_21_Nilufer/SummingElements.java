package Lab1_Oct_21_Nilufer;

//Summing all elements of the array
public class SummingElements {
    public static void main(String[] args) {

        int[] sumArray= new int[]{10, 20, 5, 6,9};//I initialized sumArray as integer and assign some integer values.
        int sum=0;                                 //The variable sum initialized with initial value 0

        for (int i = 0; i <sumArray.length ; i++) { //I used here for loop to get each value of the sumArray
            System.out.println(sumArray[i]);        // To check i print each value of the sumArray
            sum=sum+sumArray[i];                    // each value added to sum variable and looped as long as array lenght.

        }
        System.out.println("Sum of the sumArray: "+sum);  // then, printed the sum value



    }
}
