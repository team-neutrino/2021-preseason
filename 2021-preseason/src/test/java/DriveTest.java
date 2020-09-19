import static org.junit.Assert.assertEquals;
// import static org.mockito.Mockito.*;

// wpilib robot
// import edu.wpi.first.wpilibj2.command.CommandScheduler;

// wpilib hal
import edu.wpi.first.hal.HAL;
import edu.wpi.first.hal.sim.DriverStationSim;
import edu.wpi.first.wpilibj.DriverStation;

// junit
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// robot code
import frc.robot.Drive;

//==============================================================================
// Drive Tests
//==============================================================================
public class DriveTest
{
    public Drive drivetrain;

    //==========================================================================
    @Before
    public void before()
    {
        // init hardware
        HAL.initialize(500, 0);
        DriverStationSim dsSim = new DriverStationSim();
        dsSim.setDsAttached(true);
        dsSim.setAutonomous(false);
        dsSim.setEnabled(true);
        dsSim.setTest(true);
    }

    //==========================================================================
    @After
    public void after()
    {
        // deinit hardware
        DriverStation.getInstance().release();
        HAL.releaseDSMutex();
    }

    //==========================================================================
    // Subsystem Tests
    //==========================================================================

    //==========================================================================
    @Test
    public void MotorSetPower()
    {
        drivetrain = new Drive();

        drivetrain.setPower( 1.0, -1.0 );
        assertEquals( drivetrain.getRMotor1Power(), 1.0, 0.0001);
        assertEquals( drivetrain.getRMotor2Power(), 1.0, 0.0001);
        assertEquals( drivetrain.getLMotor1Power(), -1.0, 0.0001);
        assertEquals( drivetrain.getLMotor2Power(), -1.0, 0.0001);
    }
}
