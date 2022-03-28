package com.pattern.craft.drivers;
import com.pattern.craft.interfaces.IDriver;

public class TerranDriver implements IDriver {
    @Override
    public String myDriver() {
        return "Human";
    }
}