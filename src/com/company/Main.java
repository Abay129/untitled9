package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        cats.sort(Cat::byBreed);
        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов

        // используйте лямбда-выражения и ссылки на методы

        //cats.sort(?);

        //Printer.print(cats);


    }

}