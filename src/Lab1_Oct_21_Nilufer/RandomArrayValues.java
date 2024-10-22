package Lab1_Oct_21_Nilufer;

public class RandomArrayValues {

    public static void main(String[] args) {
        //Initializing arrays with random values

                int randomNumber = (int)(Math.random() * 10);  // 0 to 10 random numbers
                int[] randomArray=new int[]{randomNumber};  //initializing with a random number
                System.out.println("My Random Array: " + randomArray[0]); // printing to screen
            }
        }



