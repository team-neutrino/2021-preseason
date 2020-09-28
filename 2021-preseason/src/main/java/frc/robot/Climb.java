package frc.robot;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.revrobotics.CANSparkMax;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Climb
{
    //coded in presentation
    private TalonSRX m_climb_elevator;
    
    //coded in presentation
    private CANSparkMax m_climb_winch;

    public Climb()
    {
        //coded in presentation
        m_climb_elevator = new TalonSRX(2);

        //coded in presentation 
        m_climb_winch = new CANSparkMax(3, MotorType.kBrushless);

    }

    //coded during demonstration
    public void elevatorUp()
    {
     m_climb_elevator.set(ControlMode.PercentOutput, 0.5);
    }

    public void elevatorDown()
    {
     m_climb_elevator.set(ControlMode.PercentOutput, -0.5);
    }

    public void elevatorStop()
    {
        m_climb_elevator.set(ControlMode.PercentOutput, 0);
    }

    public void winchStop()
    {
        m_climb_winch.set(0);
    }

    //coded during presentation
    public void winchClimb()
    {
        m_climb_winch.set(0.5);
    }

    public void winchReverse()
    {
        m_climb_winch.set(-0.5);
    }
}