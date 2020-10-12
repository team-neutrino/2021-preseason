// wpilib hal
import edu.wpi.first.hal.HAL;

// junit
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import frc.robot.Turret;

public class TurretTest
{
    @Before
    public void before()
    {
        HAL.initialize(500, 0);
    }

    @After
    public void after()
    {
        HAL.releaseDSMutex();
    }

    @Test
    public void CreateTurret()
    {
        Turret turret = new Turret();
    }

}