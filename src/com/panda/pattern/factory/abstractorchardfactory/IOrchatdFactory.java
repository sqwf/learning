package com.panda.pattern.factory.abstractorchardfactory;

/**
 * @Author: PanDa
 * @CreateDate: 2019/3/22 11:12
 * @Version: 1.0
 */
public interface IOrchatdFactory {
    IBoutique plantBoutique();

    IOrdinary plantOrdinary();
}
