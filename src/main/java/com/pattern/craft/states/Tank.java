package com.pattern.craft.states;
import com.pattern.craft.drivers.TerranDriver;

public class Tank {
    private State state;

    public Tank() {
        this.state = new TankState(this,new TerranDriver());
    }

    public void changeState(State state) {

        this.state = state;
    }

    public int getDamage() {
        return state.getDamage();
    }

    public boolean isCanMove() {
        return state.isCanMove();
    }

    public State getState() {
        return state;
    }

    public boolean toSiegeState() {
        return state.toSiegeState();
    }

    public boolean toTankState() {
        return state.toTankState();
    }

    public String move(){
        if (state.isCanMove()){
            return "I moved to the new destination";
        }else{
            return "I can't move";
        }
    }

    public String getDriver(){
        return state.getMyDriver();
    }

    public void getInfected() {
        state.Infect();
    }

    public void getRecover(){
        state.Recover();
    }
}
