package com.pirhotechs.frc2014enigma.commands;

/**
 *
 * @author Brandyn Bayes
 */
public class CompressorMonitor extends CommandBase {

    public CompressorMonitor() {
        requires(pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        pneumatics.monitorCompressor();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}