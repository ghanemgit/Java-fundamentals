package com.JavaFundamentals.basiclibrary.lib.src.main.java;

public class Lab02 {


    public int[] roll(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int random = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
            result[i] = random;
        }

        return result;
    }

    public int CalculatingAverages(int[] arr) {
        int sum = 0;
        int avg = 0;

        for (int k : arr) {
            sum += k;
        }
        avg = sum / arr.length;
        return avg;
    }


    public boolean containsDuplicates(int[] arr) {
        boolean Boolean = false;
        int temporary = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            temporary = arr[j];
            for (int i = 0; i < arr.length; i++) {
                if (i != j && arr[i] == temporary) {
                    Boolean = true;
                    break;
                }

            }
        }

        return Boolean;
    }

    public int[] arraysOfArrays(int[][] arr) {

        int sum = 0;
        int minArrayIndex = 0;
        int[] ArrayOfArrayAvg = new int[4];
        for (int i = 0; i < 4; i++) {  //for loop to sum each row(each array)
            for (int j = 0; j < 7; j++) {
                sum += arr[i][j];
            }
            ArrayOfArrayAvg[i] = sum / 7;
            sum = 0;
        }
        //System.out.println(Arrays.toString(ArrayOfArrayAvg)); //just for test
        int min = ArrayOfArrayAvg[0]; //initializing min to start compare process probably
        for (int i = 0; i < ArrayOfArrayAvg.length; i++) {  //for loop to determine the array has min average

            if (min > ArrayOfArrayAvg[i]) {
                min = ArrayOfArrayAvg[i];
                minArrayIndex = i;
            }
        }
        //System.out.println(min);
        int[] minimumArray = new int[7];

        for (int j = 0; j < 7; j++) {     //for loop to copy array has min average to new array
            minimumArray[j] = arr[minArrayIndex][j];
        }

        return minimumArray;

    }
}


//roll method
// paste in main method
//int [] arr = lab02.roll(5);
//        System.out.println(Arrays.toString(arr));


/* Contain duplicates method
    paste this in main method to test
     int [] arr = {1,1,2,3,4};
        boolean b = lab02.containsDuplicates(arr);
        System.out.println(b);
 */


/* Calculate average method
    paste this in main method
    int [] arr = {90,80,50,70,90,95,85,79};
        System.out.println(lab02.CalculatingAverages(arr));
 */

/* 2D arrays temperature example
paste this in main method
int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {80, 54, 70, 53, 59, 57, 70},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] arr = lab02.arraysOfArrays(weeklyMonthTemperatures);
        System.out.println(Arrays.toString(arr));
 */
