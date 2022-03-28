package com.pattern.craft;

import com.pattern.craft.states.State;
import com.pattern.craft.states.Tank;
import com.pattern.craft.states.TankState;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.JVM)
public class TankStateTests {
    static Tank tank;
    @BeforeClass
    public static void setUp(){
        tank = new Tank();
    }

    @Test
    public void testTankStateDamage(){
        assertEquals("Incorrect damage for Normal Tank",10,tank.getDamage());
    }

    @Test
    public void testTankStateCanMove(){
        assertTrue("Normal tank can't move",tank.canMove());
    }

    @Test
    public void testTankState(){
        State state = tank.getState();
        assertEquals("Incorrect state for Normal Tank", TankState.class,state.getClass());
    }

    @Test
    public void testToTankState(){
        assertFalse("You can select the same state",tank.toTankState());
    }

    @Test
    public void testMove(){
        assertEquals("Tank can't move","I moved to the new destination",tank.move());
    }
}
