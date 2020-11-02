package  frc.robot;

import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.XboxController;

public class Intake {
  private DutyCycleEncoder intakeArmPosition;
  private PWMSparkMax intakeArmMotor;
  private PWMSparkMax intakeSpinMotor;
  private XboxController X;


  public Intake() {
      intakeArmMotor = new PWMSparkMax (4);
      intakeSpinMotor = new PWMSparkMax(5);
      X = new XboxController(6);
      intakeArmPosition = new DutyCycleEncoder(7);
  }
  public void doIntake() {
      double setPoint;
      double position;
      double error;
      double kP = 1/90;
    if (X.getXButtonPressed()) {
     intakeSpinMotor.setSpeed(0.5);
     setPoint = 0.0;
    } else {
        intakeSpinMotor.setSpeed(0);
        setPoint = 90.0;
    }
    position = intakeArmPosition.get();
    error = setPoint - position;
    if (Math.abs(error) < 0.01) error = 0;
    intakeArmMotor.setSpeed(error * kP);
  }
}
//test 
