package com.panda.pattern.factory;

/**
 * @Author: PanDa
 * @CreateDate: 2019/3/22 10:10
 * @Version: 1.0
 */
public class BananaOrchard implements IOrchard {
    @Override
    public void fruit() {
        System.out.println("种植香蕉的果园");
    }
}
