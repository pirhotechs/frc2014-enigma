package com.pirhotechs.frc2014enigma.subsystems;

import com.pirhotechs.frc2014enigma.RobotMap;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Brandyn Bayes
 */
public class Pneumatics extends Subsystem {
    Compressor PneumaticsComp;
    
    public Pneumatics(){
        PneumaticsComp = new Compressor(RobotMap.compressorSwitch, RobotMap.compressorRelay);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void startCompressor() {
        PneumaticsComp.start();
    }
    
    public void monitorCompressor() {
        SmartDashboard.putBoolean("Pressure Switch", PneumaticsComp.getPressureSwitchValue());
    }
    
    public void stopCompressor() {
        PneumaticsComp.stop();
    }
}