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
    
    //four motor drive
    public static final boolean enableFourMotorDrive = false; //enable for four motor drive, will default to two motor drive if false
    public static final int leftFrontMotor = 1;
    public static final int leftRearMotor = 2;
    public static final int rightFrontMotor = 3;
    public static final int rightRearMotor = 4;
    
    public static final int forwardLiftTalon1 = 3;
    public static final int forwardLiftTalon2 = 4;
    
    public static final int compressorSwitch = 1;
    public static final int compressorRelay = 2;
    
    public static final int ballLiftUpSolenoid = 1;
    public static final int ballLiftDownSolenoid = 2;
    
    public static final double sensitivity = 0.1;
    public static final boolean safety = false;
    public static final boolean autoStartCompressor = true;
}
