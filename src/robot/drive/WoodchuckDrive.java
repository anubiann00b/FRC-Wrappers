package robot.drive;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 * Drive for the Woodchuck robot.
 * 
 * @author Shreyas
 */
public class WoodchuckDrive extends RobotDrive {
    
    private SpeedController motorRight;
    private SpeedController motorLeft;
    
    /**
     * Creates a new drive for the Woodchuck robot.
     * 
     * This robot has two Jaguars, the right on port 2, and the
     * left on port 3. The left motor is also inverted.
     */
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
