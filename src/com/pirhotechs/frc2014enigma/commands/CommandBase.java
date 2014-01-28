package com.pirhotechs.frc2014enigma.commands;

import com.pirhotechs.frc2014enigma.OI;
import com.pirhotechs.frc2014enigma.subsystems.Camera;
import com.pirhotechs.frc2014enigma.subsystems.DriveTrain;
import com.pirhotechs.frc2014enigma.subsystems.BallLift;
import com.pirhotechs.frc2014enigma.subsystems.ForwardLift;
import com.pirhotechs.frc2014enigma.subsystems.Pneumatics;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use
 * CommandBase.exampleSubsystem
 *
 * @author Brandyn Bayes
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystem
    public static DriveTrain drivetrain = new DriveTrain();
    public static BallLift balllift = new BallLift();
    public static Camera camera = new Camera();
    public static Pneumatics pneumatics = new Pneumatics();
    public static ForwardLift forwardlift = new ForwardLift();
    public static CompressorStart compStart = new CompressorStart();
    public static CompressorStop compStop = new CompressorStop();
    public static LowerBallLift lowerlift = new LowerBallLift();
    public static RaiseBallLift raiselift = new RaiseBallLift();
    public static AutonomousCommand autoCom = new AutonomousCommand();
    public static RaiseForwardLift raiseforwardlift = new RaiseForwardLift();
    public static LowerForwardLift lowerforwardlift = new LowerForwardLift();
    public static StopForwardLift stopforwardlift = new StopForwardLift();

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
        
        SmartDashboard.putData("Start Compressor", compStart);
        SmartDashboard.putData("Stop Compressor", compStop);
        SmartDashboard.putData("Raise BallLift", raiselift);
        SmartDashboard.putData("Lower BallLift", lowerlift);
        SmartDashboard.putData("Auto Command", autoCom);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
