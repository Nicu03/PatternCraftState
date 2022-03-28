package drivers;

import interfaces.IDriver;

public class TerranDriver implements IDriver {
    @Override
    public String myDriver() {
        return "Human";
    }
}