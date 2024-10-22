package Lab1_Oct_21_Nilufer;

public class ShiftingElements {
    public static void main(String[] args) {
        //Shifting elements
        int[] newArray=new int[]{1,2,3,4,5};
        int[] shiftedArray=new int[newArray.length];
        int shift=3; //shift by3

        for(int i=0;i<newArray.length;i++){
            shiftedArray[i]=newArray[(i+shift)%newArray.length]; //logic to shift. adding shift to index and modulus by array length.
        }

        for(int i=0;i<shiftedArray.length;i++){                 // printing the shifted array.
            System.out.println("Shifted Array: "+shiftedArray[i] );
            System.out.println("modulus"+(shift+i)%newArray.length);
        }

        }
    }

