package com.company;

public class BigDiff {

    // public: is an access modifier

    public static void bigDiff(int[] nums) {            // method declaration
        int myList[];
        myList = new int[3];

        myList[0] = 12;
        myList[1] = 24;
        myList[2] = 36;


//        int myList[];
//        myList = new int[5];
//
//        myList[0] = 1;
//        myList[1] = 63;
//        myList[2] = 18;
//        myList[3] = 8;
//        myList[4] = 91;

        int min = nums[0];

        int max = nums[2];


        for (int i = 0; i < nums.length; i++) ;
        {

            int i = 0;
            min = Math.min(min, nums[i]);

            max = Math.max(max, nums[i]);


            System.out.println("the difference between the highest and lowest number is " + (max - min));
        }


//        return num_variable;
    }
}