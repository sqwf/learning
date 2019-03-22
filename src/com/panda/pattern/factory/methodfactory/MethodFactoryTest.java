package com.panda.pattern.factory.methodfactory;

import com.panda.pattern.factory.BananaOrchard;
import com.panda.pattern.factory.IOrchard;

public class MethodFactoryTest {
    public static void main(String[] args) {
        AppleOrchardFactory appleOrchardFactory = new AppleOrchardFactory();
        IOrchard apple = appleOrchardFactory.creat();
        apple.fruit();

        BananaOrchardFactory bananaOrchard = new BananaOrchardFactory();
        IOrchard banana = bananaOrchard.creat();
        banana.fruit();
    }
}
