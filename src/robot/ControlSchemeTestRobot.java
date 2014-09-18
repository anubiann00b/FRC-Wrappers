package robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import robot.drive.RobotDrive;
import robot.drive.WoodchuckDrive;

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
