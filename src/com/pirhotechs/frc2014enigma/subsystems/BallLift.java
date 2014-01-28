package com.pirhotechs.frc2014enigma.subsystems;

import com.pirhotechs.frc2014enigma.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Brandyn
 */
public class BallLift extends Subsystem {

    Solenoid BallLiftUp;
    Solenoid BallLiftDown;

    public BallLift() {
        BallLiftUp = new Solenoid(RobotMap.ballLiftUpSolenoid);
        BallLiftDown = new Solenoid(RobotMap.ballLiftDownSolenoid);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void raiseBallLift() {
        BallLiftUp.set(true);
        BallLiftDown.set(false);
    }

    public void lowerBallLift() {
        BallLiftUp.set(false);
        BallLiftDown.set(true);
    }

    public void stopBallLift() {
        BallLiftUp.set(false);
        BallLiftDown.set(false);
    }
}