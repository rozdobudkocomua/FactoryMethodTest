package FactoryMethod.concreteFood;

import FactoryMethod.Product.AbstractFood;

/**
 * Created by User on 26.02.2017.
 */
public class Burger extends AbstractFood{
    public void expand() {
        System.out.println("expand Burger");
            }

    public void cut() {
        System.out.println("cut Burger");
    }

    public void eat() {
        System.out.println("eat Burger");
    }
}
