package com.panda.pattern.factory.easyfactory;

import com.panda.pattern.factory.BananaOrchard;
import com.panda.pattern.factory.IOrchard;

public class EasyFactoryTest {
    public static void main(String[] args) {
        OrchardFactory orchardFactory = new OrchardFactory();
        IOrchard orchard = orchardFactory.creat(BananaOrchard.class);
        orchard.fruit();
    }
}
