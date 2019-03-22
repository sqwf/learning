package com.panda.pattern.factory.methodfactory;

import com.panda.pattern.factory.BananaOrchard;
import com.panda.pattern.factory.IOrchard;

/**
 * @Author: PanDa
 * @CreateDate: 2019/3/22 10:44
 * @Version: 1.0
 */
public class BananaOrchardFactory implements IMethodOrchardFactory {
    @Override
    public IOrchard creat() {
        return new BananaOrchard();
    }
}
