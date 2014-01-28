/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pirhotechs.frc2014enigma.subsystems;

import com.pirhotechs.frc2014enigma.RobotMap;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Brandyn
 */
public class ForwardLift extends Subsystem {
    Talon forwardLiftTalon1;
    Talon forwardLiftTalon2;
    double upspeed;
    double downspeed;
    
    public ForwardLift() {
        forwardLiftTalon1 = new Talon(RobotMap.forwardLiftTalon1);
        forwardLiftTalon2 = new Talon(RobotMap.forwardLiftTalon2);
        upspeed = 0.75;
        downspeed = 0.4;
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void raiseForwardLift() {
        forwardLiftTalon1.set(-upspeed);
        forwardLiftTalon2.set(upspeed);
    }

    public void lowerForwardLift() {
        forwardLiftTalon1.set(downspeed);
        forwardLiftTalon2.set(-downspeed);
    }

    public void stopForwareLift() {
        forwardLiftTalon1.set(0.0);
        forwardLiftTalon2.set(0.0);
    }
}
