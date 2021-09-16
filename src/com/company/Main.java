package com.company;

import java.util.*;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        cats.sort(Cat::byBreed);
        Collections.sort(cats, Comparator.comparing(Cat::getAge));
        cats.sort(Cat::byName);
        cats.removeIf(Cat::byColor);
        cats.removeIf(Cat::byLength);


        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов

        // используйте лямбда-выражения и ссылки на методы

        //cats.sort(?);

        //Printer.print(cats);


    }

}