package com.panda.pattern.factory.abstractorchardfactory;

/**
 * @Author: PanDa
 * @CreateDate: 2019/3/22 11:20
 * @Version: 1.0
 */
public class AbstractBananaFactory implements IOrchatdFactory {
    @Override
    public IBoutique plantBoutique() {
        return new BananaBoutique();
    }

    @Override
    public IOrdinary plantOrdinary() {
        return new BnanaOrdinary();
    }
}
