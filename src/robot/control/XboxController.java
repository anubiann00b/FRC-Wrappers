package robot.control;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;

public class XboxController {
    
    public static final AxisType LEFT_X = AxisType.kY;
    public static final AxisType LEFT_Y = AxisType.kZ;
    public static final AxisType TRIGGERS = AxisType.kTwist;
    public static final AxisType RIGHT_X = AxisType.kThrottle;
    public static final AxisType RIGHT_Y = AxisType.kNumAxis;
    
    private Joystick joystick;
    
    public XboxController() {
        joystick = new Joystick(1);
    }
    
    public double getAxis(AxisType axis) {
        return joystick.getAxis(axis);
    }
}