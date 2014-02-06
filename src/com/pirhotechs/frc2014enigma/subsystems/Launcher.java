/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirhotechs.frc2014enigma.subsystems;

import com.pirhotechs.frc2014enigma.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Brandyn Bayes
 */
public class Launcher extends Subsystem {
    Talon leftTalon;
    Talon rightTalon;
    double launcherSpeed;
    
    public Launcher() {
        leftTalon = new Talon(RobotMap.launcherLeftTalon);
        rightTalon = new Talon(RobotMap.launcherRightTalon);
        launcherSpeed = RobotMap.launcherSpeed;
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void run() {
        leftTalon.set(-launcherSpeed);
        rightTalon.set(launcherSpeed);
    }
    
    public void stop() {
        leftTalon.set(0.0);
        rightTalon.set(0.0);
    }
}
