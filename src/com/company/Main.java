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

        // исправьте код так, что бы на экран выводилось что-то вроде.
        // Я Misty. Я прыгаю!
        // Я Tibbles. Я сплю!
        // Я Ginger. Я кушаю!
        // для решения примените лямбда-выражения,

        // каждый кот должен уметь выполнять что-то своё
        var cats = new ArrayList<ActiveCat>();
        cats.add(new ActiveCat());
        cats.add(new ActiveCat(???));
        cats.add(new ActiveCat(???));
        // добавьте ещё два-три кота, с совершенно другими действиями

        cats.forEach(ActiveCat::doAction);
    }

}