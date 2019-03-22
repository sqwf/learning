package com.panda.pattern.factory.abstractorchardfactory;

public class AbstractAppleFactory implements IOrchatdFactory {
    @Override
    public IBoutique plantBoutique() {
        return new AppleBoutique();
    }

    @Override
    public IOrdinary plantOrdinary() {
        return new AppleOrdinary();
    }
}
