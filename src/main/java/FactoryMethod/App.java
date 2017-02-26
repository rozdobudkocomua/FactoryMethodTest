package FactoryMethod;
import FactoryMethod.Creators.FoodCreator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input pizza, apple, burger or exit ");
        String test;
        do {
            test = sc.nextLine();
            if (test.toLowerCase().equals("apple") // заготовки под примеры продуктов
                    || test.toLowerCase().equals("burger")
                    || test.toLowerCase().equals("pizza"))
            {
                FoodCreator fc = new FoodCreator();
                fc.foodCreator(test).expand();
                fc.foodCreator(test).cut();
                fc.foodCreator(test).eat();
            }
        } while (!test.toLowerCase().equals("exit"));
        sc.close();
        System.out.println("Bon appetit");
    }
}
