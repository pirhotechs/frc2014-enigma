package com.pirhotechs.frc2014enigma;

import com.pirhotechs.frc2014enigma.commands.CompressorStart;
import com.pirhotechs.frc2014enigma.commands.CompressorStop;
import com.pirhotechs.frc2014enigma.commands.LowerBallLift;
import com.pirhotechs.frc2014enigma.commands.LowerForwardLift;
import com.pirhotechs.frc2014enigma.commands.RaiseBallLift;
import com.pirhotechs.frc2014enigma.commands.RaiseForwardLift;
import com.pirhotechs.frc2014enigma.commands.StopForwardLift;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    Joystick leftJoy = new Joystick(1);
    Joystick rightJoy = new Joystick(2);
    Button ltBtn2 = new JoystickButton(leftJoy, 2);
    Button ltBtn3 = new JoystickButton(leftJoy, 3);
    Button ltBtn4 = new JoystickButton(leftJoy, 4);
    Button ltBtn5 = new JoystickButton(leftJoy, 5);
    Button ltBtn6 = new JoystickButton(leftJoy, 6);
    Button ltBtn7 = new JoystickButton(leftJoy, 7);
    Button ltBtn8 = new JoystickButton(leftJoy, 8);
    Button ltBtn9 = new JoystickButton(leftJoy, 9);
    Button ltBtn10 = new JoystickButton(leftJoy, 10);
    Button ltBtn11 = new JoystickButton(leftJoy, 11);
    Trigger ltTrigger = new Trigger() {
        public boolean get() {
            return leftJoy.getTrigger();
        }
    };
    Button rtBtn2 = new JoystickButton(rightJoy, 2);
    Button rtBtn3 = new JoystickButton(rightJoy, 3);
    Button rtBtn4 = new JoystickButton(rightJoy, 4);
    Button rtBtn5 = new JoystickButton(rightJoy, 5);
    Button rtBtn6 = new JoystickButton(rightJoy, 6);
    Button rtBtn7 = new JoystickButton(rightJoy, 7);
    Button rtBtn8 = new JoystickButton(rightJoy, 8);
    Button rtBtn9 = new JoystickButton(rightJoy, 9);
    Button rtBtn10 = new JoystickButton(rightJoy, 10);
    Button rtBtn11 = new JoystickButton(rightJoy, 11);
    Trigger rtTrigger = new Trigger() {
        public boolean get() {
            return rightJoy.getTrigger();
        }
    };

    public double getLeftJoyX() {
        //SmartDashboard.putDouble("leftJoyX", leftJoy.getX());
        if (Math.abs(leftJoy.getX()) > RobotMap.sensitivity) {
            return leftJoy.getX();
        } else {
            return 0;
        }
    }

    public double getLeftJoyY() {
        //SmartDashboard.putDouble("leftJoyY", leftJoy.getY());
        if (Math.abs(leftJoy.getY()) > RobotMap.sensitivity) {
            return leftJoy.getY();
        } else {
            return 0;
        }
    }

    public double getRightJoyX() {
        if (Math.abs(rightJoy.getX()) > RobotMap.sensitivity) {
            return rightJoy.getX();
        } else {
            return 0;
        }
    }

    public double getRightJoyY() {
        if (Math.abs(rightJoy.getY()) > RobotMap.sensitivity) {
            return rightJoy.getY();
        } else {
            return 0;
        }
    }

    public OI() {
        ltBtn2.whenPressed(new LowerBallLift());
        ltBtn3.whenPressed(new RaiseBallLift());
        ltBtn4.whenPressed(new LowerForwardLift());
        ltBtn4.whenReleased(new StopForwardLift());
        ltBtn5.whenPressed(new RaiseForwardLift());
        ltBtn5.whenReleased(new StopForwardLift());
        ltBtn6.whenPressed(new CompressorStart());
        ltBtn7.whenPressed(new CompressorStop());
    }
}
