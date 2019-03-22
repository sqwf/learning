package com.panda.pattern.factory.abstractorchardfactory;

/**
 * @Author: PanDa
 * @CreateDate: 2019/3/22 11:21
 * @Version: 1.0
 */
public class BananaBoutique implements IBoutique {
    @Override
    public void plant() {
        System.out.println("种植精品香蕉");
    }
}
