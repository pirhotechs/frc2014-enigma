package com.pirhotechs.frc2014enigma.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Brandyn Bayes
 */
public class AutonomousCommand extends CommandBase {

    public AutonomousCommand() {
        requires(drivetrain);
        requires(launcher);
        requires(forwardlift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //Watchdog.getInstance().feed();
        forwardlift.openGrabber();
        Timer.delay(0.35);
        forwardlift.closeGrabber();
        drivetrain.arcadeDrive(0.75, 0.0);
        Timer.delay(3.25);
        drivetrain.arcadeDrive(0.0, 0.0);
        Timer.delay(1);
        launcher.run();
        Timer.delay(0.25);
        launcher.stop();
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
    }
}