package com.lambda.例子;

import java.util.Arrays;

public class index {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 9, 4, 6, 5, 6, 7};
        Arrays.sort(arr, (Integer o1, Integer o2) -> o1 - o2);
        System.out.println(Arrays.toString(arr));


    }
}
