package com.fundamentals.labs;

public interface SimpleMultiplicationInterface<multiplyThree> {

    default int multiplyThree(int arg1, int arg2, int arg3) {
        return arg1 * arg2 * arg3;
    }

    public default int methodSomething() {
        return multiplyThree(1, 2, 3);
    }
}
