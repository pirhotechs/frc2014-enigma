package com.pirhotechs.frc2014enigma;

import com.pirhotechs.frc2014enigma.commands.CompressorStart;
import com.pirhotechs.frc2014enigma.commands.CompressorStop;
import com.pirhotechs.frc2014enigma.commands.LowerForwardLift;
import com.pirhotechs.frc2014enigma.commands.RaiseForwardLift;
import com.pirhotechs.frc2014enigma.commands.closeGrabber;
import com.pirhotechs.frc2014enigma.commands.openGrabber;
import com.pirhotechs.frc2014enigma.commands.backSlowLauncher;
import com.pirhotechs.frc2014enigma.commands.forwardSlowLauncher;
import com.pirhotechs.frc2014enigma.commands.startLauncher;
import com.pirhotechs.frc2014enigma.commands.stopLauncher;
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
    Button ltBtn12 = new JoystickButton(leftJoy, 12);
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
    Button rtBtn12 = new JoystickButton(rightJoy, 12);
    Trigger rtTrigger = new Trigger() {
        public boolean get() {
            return rightJoy.getTrigger();
        }
    };
    Trigger launchSafety = new Trigger() {
        public boolean get() {
            return leftJoy.getRawButton(2) && ltTrigger.get();
        }
    };

    public double getLeftJoyX() {
        double tempSpeed;
        if (Math.abs(leftJoy.getX()) > RobotMap.sensitivity) {
            tempSpeed = leftJoy.getX();
        } else {
            tempSpeed = 0;
        }
        return tempSpeed;
    }

    public double getLeftJoyY() {
        double tempSpeed;
        if (Math.abs(leftJoy.getY()) > RobotMap.sensitivity) {
            tempSpeed = leftJoy.getY();
        } else {
            tempSpeed = 0;
        }
        return tempSpeed;
    }

    public double getRightJoyX() {
        double tempSpeed;
        if (Math.abs(rightJoy.getX()) > RobotMap.sensitivity) {
            tempSpeed = rightJoy.getX();
        } else {
            tempSpeed = 0;
        }
        return tempSpeed;
    }

    public double getRightJoyY() {
        double tempSpeed;
        if (Math.abs(rightJoy.getY()) > RobotMap.sensitivity) {
            tempSpeed = rightJoy.getY();
        } else {
            tempSpeed = 0;
        }
        return tempSpeed;
    }

    public OI() {
        launchSafety.whileActive(new startLauncher());
        launchSafety.whenInactive(new stopLauncher());
        ltBtn11.whenPressed(new backSlowLauncher());
        ltBtn11.whenReleased(new stopLauncher());
        ltBtn12.whenPressed(new forwardSlowLauncher());
        ltBtn12.whenReleased(new stopLauncher());
        ltBtn6.whenPressed(new openGrabber());
        ltBtn4.whenPressed(new closeGrabber());
        ltBtn5.whenPressed(new RaiseForwardLift());
        ltBtn3.whenPressed(new LowerForwardLift());
        rtTrigger.whenActive(new backSlowLauncher());
        rtTrigger.whenInactive(new stopLauncher());
        rtBtn4.whenPressed(new closeGrabber());
        rtBtn5.whenPressed(new openGrabber());
        rtBtn2.whenPressed(new LowerForwardLift());
        rtBtn3.whenPressed(new RaiseForwardLift());
        rtBtn8.whenPressed(new CompressorStart());
        rtBtn9.whenPressed(new CompressorStop());
    }
}
