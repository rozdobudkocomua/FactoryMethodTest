package FactoryMethod.concreteFood;

import FactoryMethod.Product.AbstractFood;

/**
 * Created by User on 26.02.2017.
 */
public class Apple extends AbstractFood {
    public void expand() {
        System.out.println("expand Apple");
    }

    public void cut() {
        System.out.println("cut Apple");

    }

    public void eat() {
        System.out.println("eat Apple");

    }
}
