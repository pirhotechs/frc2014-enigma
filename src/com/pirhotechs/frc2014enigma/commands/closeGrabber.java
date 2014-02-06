/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirhotechs.frc2014enigma.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Brandyn
 */
public class closeGrabber extends CommandBase {
    
    public closeGrabber() {
        requires(forwardlift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        forwardlift.closeGrabber();
        Timer.delay(0.2);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
        forwardlift.stopGrabber();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
