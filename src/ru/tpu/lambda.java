package ru.tpu;/*
 * @author timtims
 * @date 08.05.2021
 */

import java.util.ArrayList;
import java.util.Random;

public class lambda {

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i<10; i++){
            list.add(rnd.nextInt(500)+1);
        }
        list.forEach(l-> System.out.println(l));
        System.out.println("");
         list.stream().
                filter(x -> {
                    return (x < 100 || x > 10);
                } ).
                sorted((l1,l2)-> l2 - l1).
                map(x -> {
                    int res = x*x;
                    res = -res;
                    return  res+1;
                }
                ).
                 forEach(x -> {
                  int y = x+1;
                  System.out.println(y);
                 });
                //forEach(System.out::println);
        //System.out.println(res1);
        list.forEach(l-> System.out.println(l));
    }



}
