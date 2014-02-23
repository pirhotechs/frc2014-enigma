package com.pirhotechs.frc2014enigma.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import com.pirhotechs.frc2014enigma.RobotMap;
import com.pirhotechs.frc2014enigma.commands.DriveWithJoysticks;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Brandyn Bayes
 */
public class DriveTrain extends Subsystem {

    RobotDrive drive;
    Talon leftTalon;
    Talon rightTalon;

    // Initialize your subsystem here
    public DriveTrain() {
        leftTalon = new Talon(RobotMap.leftMotor);
        rightTalon = new Talon(RobotMap.rightMotor);
        drive = new RobotDrive(leftTalon, rightTalon);        
        drive.setSafetyEnabled(RobotMap.safety);
    }

    /**
     * Set the default command to drive with joysticks.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoysticks());
    }

    /**
     * Implements the tank drive capability of the drivetrain.
     *
     * @param left The speed for the left side of the drivetrain.
     * @param right The speed for the right side of the drivetrain.
     */
    public void tankDrive(double left, double right) {
        drive.tankDrive(left, right);
    }

    public void arcadeDrive(double move, double rotate) {
        drive.arcadeDrive(move, rotate);
        //System.out.println("Y" + move);
        //System.out.println("X" + rotate);
    }
}