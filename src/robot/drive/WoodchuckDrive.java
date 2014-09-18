package robot.drive;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

public class WoodchuckDrive extends RobotDrive {
    
    private SpeedController motorRight;
    private SpeedController motorLeft;
    
    public WoodchuckDrive() {
        motorRight = new Talon(2);
        motorLeft = new Talon(3);
    }
    
    public void setRight(double val) {
        motorRight.set(val);
    }
    
    public void setLeft(double val) {
        motorLeft.set(-val);
    }
}
