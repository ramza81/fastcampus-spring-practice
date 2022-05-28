package com.bandiera.springpractice;

import com.bandiera.springpractice.config.Config;
import com.bandiera.springpractice.logic.BubbleSort;
import com.bandiera.springpractice.logic.Sort;
import com.bandiera.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[result] - " + sortService.doSort(Arrays.asList(args)));
    }
}
