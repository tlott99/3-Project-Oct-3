package com.travis;
import java.util.Arrays;
public class Main {

    public static int smallestNum(int[] numArr,int k){
        Arrays.sort(numArr);
        return numArr[k-1];
    }
    public static void main(String[] args) {
        int[] numArr = new int[]{0,0,2,3,4,5,2,1,1,2,2,3,0,0,0,0,3,4,2,1};
        int k = 4;
        System.out.println(smallestNum(numArr, k));
        for(int i = 0; i <numArr.length; i ++){
            Arrays.sort(numArr);
            System.out.println(numArr[i]);
        }

    }

}
