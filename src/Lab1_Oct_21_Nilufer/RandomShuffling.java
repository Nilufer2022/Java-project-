package Lab1_Oct_21_Nilufer;

import java.util.Arrays;
import java.util.Random;

public class RandomShuffling {
    public static void main(String[] args) {
    //Random shuffling

                int[] arrayShuffle = { 10, 20, 30, 40, 50, 60, 70 };

                Random ran = new Random();

                for (int i = 0; i < arrayShuffle.length; i++) {
                    int ranIndexToSwap = ran.nextInt(arrayShuffle.length); //selecting random index using ran number
                    int temp = arrayShuffle[ranIndexToSwap]; //used temp array to transfer shuffled values to  array
                    arrayShuffle[ranIndexToSwap] = arrayShuffle[i];
                    arrayShuffle[i] = temp;
                }
                System.out.println(Arrays.toString(arrayShuffle));
            }
            }



