package com.bandiera.javaoop;

import com.bandiera.javaoop.logic.BubbleSort;
import com.bandiera.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();
        System.out.println("[result] - " + sort.sort(Arrays.asList(args)));
    }
}
