package robot.control;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;

public class XboxController {
    
    public static final AxisType LEFT_X = AxisType.kY;
    public static final AxisType LEFT_Y = AxisType.kZ;
    public static final AxisType TRIGGERS = AxisType.kTwist;
    public static final AxisType RIGHT_X = AxisType.kThrottle;
    public static final AxisType RIGHT_Y = AxisType.kNumAxis;
    
    public static final int A = 1;
    public static final int B = 2;
    public static final int X = 3;
    public static final int Y = 4;
    public static final int LB = 5;
    public static final int RB = 6;
    public static final int BACK = 7;
    public static final int START = 8;
    public static final int L3 = 9;
    public static final int R3 = 10;
    
    private Joystick joystick;
    
    public XboxController() {
        joystick = new Joystick(1);
    }
    
    public double getAxis(AxisType axis) {
        return joystick.getAxis(axis);
    }
    
    public boolean getButton(int button) {
        if (button<1 || button>10)
            return false;
        return joystick.getRawButton(button);
    }
}