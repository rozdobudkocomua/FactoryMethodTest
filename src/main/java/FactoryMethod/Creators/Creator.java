package FactoryMethod.Creators;

import FactoryMethod.Product.AbstractFood;

/**
 * Created by User on 26.02.2017.
 */
interface Creator {
    AbstractFood foodCreator(String name);
}
