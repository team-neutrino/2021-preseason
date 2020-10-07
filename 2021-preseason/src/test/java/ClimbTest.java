// wpilib hal
import edu.wpi.first.hal.HAL;

// junit
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import frc.robot.Climb;

public class ClimbTest
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
    public void ElevatorMove()
    {
        Climb Elevator = new Climb();
        Elevator.elevatorUp();
        assert(Elevator.getelevatormotor() == 0.5);

        Elevator.elevatorDown();
        assert(Elevator.getelevatormotor() == - 0.5 );

        Elevator.elevatorStop();
        assert(Elevator.getelevatormotor() == 0.0);
        Elevator.close();
    }
   

}