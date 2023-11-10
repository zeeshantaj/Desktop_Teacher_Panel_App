package com.example.desktop_teacher_panel_app;

import java.util.Arrays;

public class FunctionTesting {

    public int[] mystry(int[] array){
        int temp = array[array.length - 1];
        for (int i = 1; i < array.length; i++){
            array[i] = array[i - 1];
        }
        array[0] = temp;
        return array;
    }

    public static void main(String[] args) {
        FunctionTesting functionTesting = new FunctionTesting();

        int[] arrayList = {10,20,30,40,50};
        int[] finalList = functionTesting.mystry(arrayList);
        System.out.println(Arrays.toString(finalList));
    }
}

