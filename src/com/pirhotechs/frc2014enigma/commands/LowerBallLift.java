package com.pirhotechs.frc2014enigma.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Brandyn Bayes
 */
public class LowerBallLift extends CommandBase {
    
    public LowerBallLift() {
        requires(balllift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        balllift.lowerBallLift();
        Timer.delay(0.1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
        balllift.stopBallLift();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        balllift.stopBallLift();
    }
}