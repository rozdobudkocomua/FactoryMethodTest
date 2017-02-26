package FactoryMethod.Creators;

import FactoryMethod.Product.AbstractFood;
import FactoryMethod.concreteFood.Apple;
import FactoryMethod.concreteFood.Burger;
import FactoryMethod.concreteFood.Pizza;

/**
 * Created by User on 26.02.2017.
 */
public class FoodCreator implements Creator {
    public AbstractFood foodCreator(String name) {
        AbstractFood abstractFood = null;
        if (name.toLowerCase().equals("pizza")){
            abstractFood = new Pizza();
        }else if(name.toLowerCase().equals("burger")){
            abstractFood = new Burger();
        }else if (name.toLowerCase().equals("apple")){
            abstractFood = new Apple();
        }
        return abstractFood;
    }
}
