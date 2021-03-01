package com.zoxed;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int [] intArray = new int[7];
        intArray[0]= 20;
        intArray[1]=34;
        intArray[2]=-15;
        intArray[3]=12;
        intArray[4]=54;
        intArray[5]=-79;
        intArray[6]=4;
        //linear time complexity
        int index = -1 ;
        for (int i = 0 ; i < intArray.length; i++){
           //know how to retrieve the index (worst case looping to much)
            if (intArray[i]== 12){
                index = i;
                break;
            }
        }
        System.out.println("index = "+index);
    }
}
