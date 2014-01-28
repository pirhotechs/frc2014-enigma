package com.pirhotechs.frc2014enigma;

import com.pirhotechs.frc2014enigma.commands.AutonomousCommand;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import com.pirhotechs.frc2014enigma.commands.CommandBase;
import com.pirhotechs.frc2014enigma.commands.CompressorMonitor;
import com.pirhotechs.frc2014enigma.commands.CompressorStart;
import com.pirhotechs.frc2014enigma.commands.DriveWithJoysticks;
import edu.wpi.first.wpilibj.Watchdog;

public class FRC2014Enigma extends IterativeRobot {

    Command autonomousCommand;
    Command DriveRobot;
    Command startCompressor;
    Command monitorCompressor;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        Watchdog.getInstance().setEnabled(RobotMap.safety);
        // instantiate the command used for the autonomous period
        autonomousCommand = new AutonomousCommand();
        DriveRobot = new DriveWithJoysticks();
        startCompressor = new CompressorStart();
        monitorCompressor = new CompressorMonitor();
        
        
        // Initialize all subsystems
        CommandBase.init();
        if(RobotMap.autoStartCompressor) {
            startCompressor.start();
        }
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if(RobotMap.autoStartCompressor) {
            startCompressor.start();
        }
        autonomousCommand.start();

        DriveRobot.cancel();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if(RobotMap.autoStartCompressor) { //only use for testing diagnostics
            startCompressor.start();
        }
        DriveRobot.start();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        monitorCompressor.start();
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}