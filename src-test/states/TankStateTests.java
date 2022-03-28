package states;

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
        assertTrue("Normal tank can't move",tank.isCanMove());
    }

    @Test
    public void testTankState(){
        State state = tank.getState();
        assertEquals("Incorrect state for Normal Tank",TankState.class,state.getClass());
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
