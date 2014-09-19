package robot.control;

import edu.wpi.first.wpilibj.Joystick;

public class XboxController {
    
    public static final int LEFT_X = 1;
    public static final int LEFT_Y = 2;
    public static final int TRIGGERS = 3;
    public static final int RIGHT_X = 4;
    public static final int RIGHT_Y = 5;
    
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
    
    public double getAxis(int axis) {
        if (axis<1 || axis>5)
            return 0;
        return joystick.getRawAxis(axis);
    }
    
    public boolean getButton(int button) {
        if (button<1 || button>10)
            return false;
        return joystick.getRawButton(button);
    }
}