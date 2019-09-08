package com.chaochaogege.LibImpl.common;

public class Utils {
    public boolean AssertIsTrue(boolean r) {
        if (!r) {
            throw new AssertionError("Is not true");
        }
        return true;
    }
}
