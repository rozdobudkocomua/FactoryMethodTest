package FactoryMethod.concreteFood;

import FactoryMethod.Product.AbstractFood;

/**
 * Created by User on 26.02.2017.
 */
public class Pizza extends AbstractFood {


    public void expand() {
        System.out.println("expand Pizza");
    }

    public void eat() {
        System.out.println("eat pizza");

    }

    public void cut(){
        System.out.println("cut pizza");
    }
}
