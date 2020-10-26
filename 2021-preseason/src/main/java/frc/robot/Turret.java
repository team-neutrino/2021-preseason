package frc.robot;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.DutyCycleEncoder;

public class Turret
{
    private PWMSparkMax m_turret;
    private XboxController m_Xbox;
    private DutyCycleEncoder m_Encoder;
    

    public Turret()
    {
        m_turret = new PWMSparkMax( 9 );
        m_Xbox = new XboxController(2);
        m_Encoder = new DutyCycleEncoder(8);
    }

    public void leftTrigger(){
        double value = m_Xbox.getTriggerAxis(Hand.kLeft);
        double position = m_Encoder.get();

        if(position <= -90.0){
            m_turret.setSpeed(0.0);
        }
        else{
            if (value> 0.8){
                m_turret.setSpeed(-1.0);
            }
            else if (value <= 0.8 && value > 0.1){
                m_turret.setSpeed(-0.5);
            }
            else{
                m_turret.setSpeed(0.0);
            }
    }

    }

    public void rightTrigger(){
        double value = m_Xbox.getTriggerAxis(Hand.kRight);
        double position = m_Encoder.get();
        if(position >= 90.0){
            m_turret.setSpeed(0.0);
        }
        else{
            
            if (value> 0.8){
                m_turret.setSpeed(1.0);
            }
            else if (value <= 0.8 && value > 0.1){
                m_turret.setSpeed(0.5);
            }
            else{
                m_turret.setSpeed(0.0);
            }
        }
    }

    public void returnTurret(){
        boolean pressed = m_Xbox.getBumper(Hand.kLeft)||m_Xbox.getBumper(Hand.kRight);
        double position = m_Encoder.get();

        if (pressed && position<-0.1){
            m_turret.setSpeed(1.0);
        }
        else if (pressed && position>0.1){
            m_turret.setSpeed(-1.0);
        }
        else{
            m_turret.setSpeed(0.0);
        }
        
    }
    }

    

/* 
Pseudocode:
When pressing left trigger, turret turns counterclockwise until released.
Max in 90 degrees counterclockwise.
When pressing right trigger, turret turns clockwise until released.
Max is 90 degrees clockwise.
Turret position will remain where when released until trigger is pressed.

Additionally, button __ returns turret towards 0 degrees(forward).


Objectives:
Find the angle needed to shoot towards goal(button guy will estimate)
Turn the turret towards angle(using triggers)
*/
