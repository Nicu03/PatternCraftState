package com.pattern.craft.states;


import com.pattern.craft.drivers.TerranDriver;
import com.pattern.craft.drivers.ZergDriver;
import com.pattern.craft.interfaces.IDriver;

public abstract class State {
    protected Tank tank;
    protected int damage;
    protected boolean canMove;
    protected IDriver driver;

    public State(Tank tank, IDriver driver) {
        this.tank = tank;
        this.driver = driver;
    }

    public void Infect(){
        driver = new ZergDriver();
    }

    public void Recover(){
        driver = new TerranDriver();
    }

    public String getMyDriver(){
        return driver.myDriver();
    }

    public int getDamage() {
        return damage;
    }

    public boolean canMove() {
        return canMove;
    }

    abstract boolean toSiegeState();

    abstract boolean toTankState();

}
