/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirhotechs.frc2014enigma.subsystems;

import com.pirhotechs.frc2014enigma.RobotMap;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Brandyn
 */
public class ForwardLift extends Subsystem {
    Talon grabberTalon;
    double grabberSpeed;
    Solenoid BallLiftUp;
    Solenoid BallLiftDown;
    
    public ForwardLift() {
        grabberSpeed = RobotMap.grabberSpeed;
        grabberTalon = new Talon(RobotMap.forwardLiftTalon);
        BallLiftUp = new Solenoid(RobotMap.forwardLiftUpSolenoid);
        BallLiftDown = new Solenoid(RobotMap.forwardLiftDownSolenoid);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void raiseForwardLift() {
        BallLiftUp.set(true);
        BallLiftDown.set(false);
    }

    public void lowerForwardLift() {
        BallLiftUp.set(false);
        BallLiftDown.set(true);
    }

    public void stopForwardLift() {
        BallLiftUp.set(false);
        BallLiftDown.set(false);
    }
    
    public void openGrabber() {
        grabberTalon.set(-grabberSpeed);
    }

    public void closeGrabber() {
        grabberTalon.set(grabberSpeed);
    }

    public void stopGrabber() {
        grabberTalon.set(0.0);
    }
}
