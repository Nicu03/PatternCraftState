package com.pattern.craft;

import com.pattern.craft.states.SiegeState;
import com.pattern.craft.states.State;
import com.pattern.craft.states.Tank;
import com.pattern.craft.states.TankState;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@FixMethodOrder(MethodSorters.JVM)
public class SiegeStateTests {
    static Tank tank;
    @BeforeClass
    public static void setUp(){
        tank = new Tank();
        tank.toSiegeState();
    }

    @Test
    public void testSiegeStateDamage(){
        assertEquals("Incorrect damage for Siege Tank",20,tank.getDamage());
    }

    @Test
    public void testSiegeStateCanMove(){
        assertFalse("Siege tank CAN move",tank.isCanMove());
    }

    @Test
    public void testSiegeState(){
        State state = tank.getState();
        assertEquals("Incorrect state for Siege tank", SiegeState.class,state.getClass());
    }

    @Test
    public void testToSiegeState(){
        assertFalse("You can select the same state",tank.toSiegeState());
    }

    @Test
    public void testMove(){
        assertEquals("Tank can move","I can't move",tank.move());
    }

    @Test
    public void testStateTransition(){
        tank.toTankState();
        String state = tank.getState().getClass().getName();
        tank.toSiegeState();
        assertEquals("Transition doesn't work", TankState.class.getName(),state);
    }
}
