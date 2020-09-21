package  frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMSparkMax;

public class Drive
{
    private Joystick rJoy;
    private Joystick lJoy;
    private PWMSparkMax rMotor1;
    private PWMSparkMax rMotor2;
    private PWMSparkMax lMotor1;
    private PWMSparkMax lMotor2;
    
    public Drive()
    {
        rJoy = new Joystick(0);
        lJoy = new Joystick(1);
        rMotor1 = new PWMSparkMax(0);
        lMotor1 = new PWMSparkMax(1);
        rMotor2 = new PWMSparkMax(2);
        lMotor2 = new PWMSparkMax(3);
    }

    public void setPower ( double rPower, double lPower )
    {
        rMotor1.set( rPower );
        rMotor2.set( rPower );
        lMotor1.set( lPower );
        lMotor2.set( lPower );
    }

    public void updatePower()
    {
        setPower( rJoy.getY(), lJoy.getY() );
    }

    public double getLeftMotor1Power()
    {
        return lMotor1.get();
    }
    public double getLeftMotor2Power()
    {
        return lMotor2.get();
    }
    public double getRightMotor1Power()
    {
        return rMotor1.get();
    }
    public double getRightMotor2Power()
    {
        return rMotor2.get();
    }
}