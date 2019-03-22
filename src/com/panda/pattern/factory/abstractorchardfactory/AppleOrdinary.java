package com.panda.pattern.factory.abstractorchardfactory;

/**
 * @Author: PanDa
 * @CreateDate: 2019/3/22 11:15
 * @Version: 1.0
 */
public class AppleOrdinary implements IOrdinary {
    @Override
    public void plant() {
        System.out.println("种植普通苹果");
    }
}
