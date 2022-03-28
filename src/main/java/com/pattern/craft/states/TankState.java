package com.pattern.craft.states;

import com.pattern.craft.interfaces.IDriver;

public class TankState extends State {
    private static final int damage = 10;
    private static final boolean canMove = true;

    public TankState(Tank tank, IDriver driver) {
        super(tank,driver);
        super.damage = damage;
        super.canMove = canMove;
    }

    @Override
    boolean toSiegeState() {
        super.tank.changeState(new SiegeState(super.tank,super.driver));
        return true;
    }

    @Override
    boolean toTankState() {
        return false;
    }
}
