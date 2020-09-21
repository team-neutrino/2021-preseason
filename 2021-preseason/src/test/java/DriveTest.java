// wpilib hal
import edu.wpi.first.hal.HAL;

// junit
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import frc.robot.Drive;

public class DriveTest
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
    public void SetPowerSetsMotors()
    {
        Drive drive = new Drive();
        drive.setPower(1.0,-1.0);

        assert(drive.getLeftMotor1Power() == -1.0);
        assert(drive.getLeftMotor2Power() == -1.0);
        assert(drive.getRightMotor1Power() == 1.0);
        assert(drive.getRightMotor2Power() == 1.0);

        drive.close();
    }

    @Test
    public void TestDeadzone()
    {
        Drive drive = new Drive();

        drive.setPower( 0.08,-0.08);
        assert(drive.getLeftMotor1Power() == 0.0);
        assert(drive.getLeftMotor2Power() == 0.0);
        assert(drive.getRightMotor1Power() == 0.0);
        assert(drive.getRightMotor2Power() == 0.0);

        drive.setPower( 0.11,-0.11);
        assert(drive.getLeftMotor1Power() == -0.11);
        assert(drive.getLeftMotor2Power() == -0.11);
        assert(drive.getRightMotor1Power() == 0.11);
        assert(drive.getRightMotor2Power() == 0.11);

        drive.close();
    }

}