package robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import robot.control.XboxController;
import robot.drive.RobotDrive;
import robot.drive.WoodchuckDrive;

/**
 * A test of various control schemes.
 * 
 * @author [name here]
 */
public class ControlSchemeTestRobot extends IterativeRobot {
    
    RobotDrive drive;
    XboxController controller;
    
    public void robotInit() {
        drive = new WoodchuckDrive();
        controller = new XboxController();
    }
    
    public void teleopPeriodic() {
        // Write your drive code here.
    }
}
