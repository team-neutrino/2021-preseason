package frc.robot;

import com.revrobotics.CANSparkMax;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Climb
{
    
    private TalonSRX ClimbElevator;
    private CANSparkMax ClimbWinch;

    public Climb()
    {
        ClimbElevator = new TalonSRX(0);
        ClimbWinch = new CANSparkmax(1, MotorType.kBrushless);

    }

    //code this method during demonstration
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

    
    public void winchClimb()
    {
        ClimbWinch.set(0.5);
    }

    public void winchReverse()
    {
        ClimbWinch.set(-0.5);
    }
}