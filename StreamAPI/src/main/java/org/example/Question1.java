package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//filter the odd number from list of numbers using streamAPI
public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        List<Integer> newArr = arr.stream().filter(data->data%2!=0).collect(Collectors.toList());
        System.out.println(newArr);

        List<Integer> newArr2 = arr.stream().filter(data->data%2==0).collect(Collectors.toList());
    }

}
