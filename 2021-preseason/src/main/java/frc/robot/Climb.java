package frc.robot;
import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.revrobotics.CANSparkMax;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.PWMSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Climb
{
    //coded in presentation
    private PWMSparkMax m_climb_elevator;
    
    //coded in presentation
    private PWMSparkMax m_climb_winch;

    public Climb()
    {
        //coded in presentation
        m_climb_elevator = new PWMSparkMax(2);

        //coded in presentation 
        m_climb_winch = new PWMSparkMax(3);

    }

    //coded during demonstration
    public void elevatorUp()
    {
     m_climb_elevator.set(0.5);
    }

    public void elevatorDown()
    {
     m_climb_elevator.set(-0.5);
    }

    public void elevatorStop()
    {
        m_climb_elevator.set(0);
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
    public double getelevatormotor(){

        return m_climb_elevator.get();
    }
    public void close() {
        m_climb_elevator.close();
        m_climb_winch.close();
    }

}