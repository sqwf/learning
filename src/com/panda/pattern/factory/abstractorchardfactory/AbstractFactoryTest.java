package com.panda.pattern.factory.abstractorchardfactory;

/**
 * @Author: PanDa
 * @CreateDate: 2019/3/22 11:19
 * @Version: 1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IOrchatdFactory appleFactory = new AbstractAppleFactory();
        appleFactory.plantBoutique().plant();
        appleFactory.plantOrdinary().plant();

        IOrchatdFactory bananaFactory = new AbstractBananaFactory();
        bananaFactory.plantBoutique().plant();
        bananaFactory.plantOrdinary().plant();
    }
}
