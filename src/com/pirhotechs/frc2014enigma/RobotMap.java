package com.pirhotechs.frc2014enigma;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    //two motor drive
    public static final int leftMotor = 1;
    public static final int rightMotor = 2;
    
    public static final double grabberSpeed = 0.4;
    public static final int forwardLiftTalon = 3;
    
    public static final double launcherSpeed = 0.7;
    public static final double loadSpeed = 0.3;
    public static final int launcherLeftTalon = 4;
    public static final int launcherRightTalon = 5;
    
    public static final int compressorSwitch = 1;
    public static final int compressorRelay = 1;
    
    public static final int forwardLiftUpSolenoid = 1;
    public static final int forwardLiftDownSolenoid = 2;
    
    public static final int grabberOpenSolenoid = 3;
    public static final int grabberCloseSolenoid = 4;
    
    public static final double sensitivity = 0.15;
    public static final boolean safety = false;
    public static final boolean autoStartCompressor = true;
}
