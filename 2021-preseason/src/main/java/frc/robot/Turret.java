package frc.robot;

import edu.wpi.first.wpilibj.PWMSparkMax;

public class Turret
{
    private PWMSparkMax m_turret;

    public Turret()
    {
        m_turret = new PWMSparkMax( 9 );
    }
}