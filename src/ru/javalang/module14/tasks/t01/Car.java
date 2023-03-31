package ru.javalang.module14.tasks.t01;

import java.util.Set;
import java.util.TreeSet;

public class Car {
    public static void main(String[] args) {
        Set<String> set = new TreeSet();
        set.add("VAZ");
        set.add("GAZ");
        set.add("AZLK");
        set.stream().sorted();
        System.out.println(set);
        for (Object element : set)
            System.out.println(element.toString());
    }
}
