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
    Solenoid grabberOpen;
    Solenoid grabberClose;
    Solenoid BallLiftUp;
    Solenoid BallLiftDown;
    
    public ForwardLift() {
        grabberOpen = new Solenoid(RobotMap.grabberOpenSolenoid);
        grabberClose = new Solenoid(RobotMap.grabberCloseSolenoid);
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
        grabberOpen.set(true);
        grabberClose.set(false);
    }

    public void closeGrabber() {
        grabberOpen.set(false);
        grabberClose.set(true);
    }
    
    public void stopGrabber() {
        grabberOpen.set(false);
        grabberClose.set(false);
    }
}
