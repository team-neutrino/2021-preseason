package frc.robot;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class Turret
{
    private PWMSparkMax m_turret;
    private XboxController m_Xbox;

    public Turret()
    {
        m_turret = new PWMSparkMax( 9 );
        m_Xbox = new XboxController(2);
    }

    public void leftTrigger(){
        double value = m_Xbox.getTriggerAxis(Hand.kLeft);

        
        
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
