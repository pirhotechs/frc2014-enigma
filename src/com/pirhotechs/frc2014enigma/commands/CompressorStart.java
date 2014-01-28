package com.pirhotechs.frc2014enigma.commands;

/**
 *
 * @author Brandyn Bayes
 */
public class CompressorStart extends CommandBase {

    public CompressorStart() {
        requires(pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        //shooter.startCompressor();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        pneumatics.startCompressor();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        pneumatics.stopCompressor();
    }
}