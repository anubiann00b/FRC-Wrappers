package robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import robot.drive.RobotDrive;
import robot.drive.WoodchuckDrive;

/**
 * A test of various control schemes.
 * 
 * @author [your name here]
 */
public class ControlSchemeTestRobot extends IterativeRobot {
    
    RobotDrive drive;
    
    public void robotInit() {
        drive = new WoodchuckDrive();
    }
    
    public void teleopPeriodic() {
        
    }
    
    // public void autonomousPeriodic() { }
    // public void testPeriodic() { }
}
