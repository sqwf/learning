package com.panda.pattern.factory.easyfactory;

import com.panda.pattern.factory.IOrchard;

/**
 * @Author: PanDa
 * @CreateDate: 2019/3/22 10:13
 * @Version: 1.0
 */
public class OrchardFactory {

    public IOrchard creat(Class<? extends IOrchard> clzz) {
        try {
            if (null != clzz) {
                IOrchard orchard = clzz.newInstance();
                return orchard;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
