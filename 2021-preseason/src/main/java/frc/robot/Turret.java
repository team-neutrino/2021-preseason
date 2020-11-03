package frc.robot;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.DutyCycleEncoder;

public class Turret
{
    private PWMSparkMax m_turret;
    private DutyCycleEncoder m_Encoder;
    

    public Turret()
    {
        m_turret = new PWMSparkMax( 9 );
        m_Encoder = new DutyCycleEncoder(8);
    }

    public void leftTrigger(double x){
        double position = m_Encoder.get();

        if(position <= -90.0){
            m_turret.setSpeed(0.0);
        }
        else{
            if (x> 0.8){
                m_turret.setSpeed(-1.0);
            }
            else if (x <= 0.8 && x > 0.1){
                m_turret.setSpeed(-0.5);
            }
            else{
                m_turret.setSpeed(0.0);
            }
    }

    }

    public void rightTrigger(double y){
        double position = m_Encoder.get();
        if(position >= 90.0){
            m_turret.setSpeed(0.0);
        }
        else{
            
            if (y> 0.8){
                m_turret.setSpeed(1.0);
            }
            else if (y <= 0.8 && y > 0.1){
                m_turret.setSpeed(0.5);
            }
            else{
                m_turret.setSpeed(0.0);
            }
        }
    }

    public void returnTurret(boolean pressed){
       
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
