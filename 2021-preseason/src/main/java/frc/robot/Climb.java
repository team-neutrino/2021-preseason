package frc.robot;

import com.revrobotics.CANSparkMax;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Climb
{
    //coded in presentation
    private TalonSRX ClimbElevator;
    
    //coded in presentation
    private CANSparkMax ClimbWinch;

    public Climb()
    {
        //coded in presentation
        ClimbElevator = new TalonSRX(0);

        //coded in presentation 
        ClimbWinch = new CANSparkmax(1, MotorType.kBrushless);

    }

    //coded during demonstration
    public void elevatorUp()
    {
        ClimbElevator.set(ControlMode.PercentOutput, 0.5);
    }

    public void elevatorDown()
    {
        ClimbElevator.set(ControlMode.PercentOutput, -0.5);
    }

    public void elevatorStop()
    {
        Climbelevator.set(0);
    }

    public void winchStop()
    {
        ClimbWinch.set(0);
    }

    //coded during presentation
    public void winchClimb()
    {
        ClimbWinch.set(0.5);
    }

    public void winchReverse()
    {
        ClimbWinch.set(-0.5);
    }
}