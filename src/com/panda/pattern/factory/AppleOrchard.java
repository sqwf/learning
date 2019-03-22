package com.panda.pattern.factory;

/**
 * @Author: PanDa
 * @CreateDate: 2019/3/22 10:11
 * @Version: 1.0
 */
public class AppleOrchard implements IOrchard {
    @Override
    public void fruit() {
        System.out.println("种植苹果的果园");
    }
}
