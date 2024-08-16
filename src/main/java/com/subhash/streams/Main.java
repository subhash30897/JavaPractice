package com.subhash.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(6);
        al.add(20);

        System.out.println("Printing list " + al);
//        List<Integer> ls = al.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()); - [1, 2, 6, 9, 4, 6, 20]
//        List<Integer> ls = al.stream().filter(e -> e % 2 == 0).toList(); // for converting to list
//        System.out.println("After filtering " + ls);
//        Set<Integer> set = al.stream().filter(e -> e  %  2 == 0).collect(Collectors.toSet()); - [2, 4, 20, 6]
//        System.out.println(al);
//        System.out.println(set);
//        List<Integer> ls1 = al.stream().map(e -> e + 2).toList();
//        System.out.println(ls1); - [3, 4, 8, 11, 6, 8, 22]

    }

}
