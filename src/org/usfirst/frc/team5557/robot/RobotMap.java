package org.usfirst.frc.team5557.robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * Also contains some constants that were using 
 *     ie. wheel size, voltage constants
 * 
 */

public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	
/*	
 * 
	PS4 CONTROLLER BUTTONS

	1:	SQUARE
	
	2:	X
	
	3:	CIRCLE
	
	4:	TRIANGLE
	
	5:	L1
	
	6:	R1
	
	7:	L2
	
	8:	R2
	
*/	
	
	// Motor Controllers are mapped here
	
		//	DRIVE TRAIN

	public static final int LEFT_REAR_MOTOR = 3; //Encoder on this one, counts down when driving forward
	public static final int LEFT_FRONT_MOTOR = 4; 
	public static final int RIGHT_FRONT_MOTOR = 2;//Encoder on this one, counts up when driving forward
	public static final int RIGHT_REAR_MOTOR = 1; 
			
		//	ARM MOTORS
	
	public static final int RAISE_ARM_MOTOR_LEFT = 6;
	public static final int RAISE_ARM_MOTOR_RIGHT = 8;
			
		// INTAKE MOTORS

	public static final int INTAKE_MOTOR_LEFT = 7;
			
		//	LINEAR ACUTATOR
			
	public static final int LINEAR_ACTUATOR = 9;

		// NOT USED 
			
	public static final int  NOT_USED = 5;			
	
	
	// Driver input devices are mapped here
		
		// REMOTE CONTROLLER PORTS
	
	public static int JOYSTICK_DRIVE_ONE = 0;
	public static int JOYSTICK_DRIVE_TWO = 1;
		
		// BUTTONS AND SWITCHES
		
	public static int CAMERA_SWITCH = 11;
	public static final int INTAKE_LIMIT_SWITCH = 0;
	public static final int ARM_FULL_HEIGHT_SWITCH = 1;
	public static final int INTAKE_BUTTON = 2; // X
	public static final int EXPELL_BUTTON = 3; //Circle
	public static final int LOWER_ARM_BUTTON = 4;
	public static int EMERGENCY_STOP_BUTTON = 10;
	public static final int SWAP_CONTROLLER_BUTTON = 10; //start		
	public static final int EXTEND_LINEAR_ACTUATOR_BUTTON = 5;
	public static final int RETRACT_LINEAR_ACTUATOR_BUTTON = 6;
			
		// Constants for encoders connected to Talon SRX
		
	public static final float PEAK_OUTPUT_VOLTAGE = 10f;
	public static final float NOMINAL_OUTPUT_VOLTAGE = 0f;
	public static final int ENCODER_CODES_PER_REV = 40;
	public static final FeedbackDevice TALON_FEEDBACK_DEVICE = FeedbackDevice.QuadEncoder;
	public static final int ENCODER_PROFILE = 0;
	public static final double PID_FEEDFORWARD = 0;
	public static final double PID_PROPORTIONAL = 0.1;
	public static final double PID_INTEGRAL = 0;
	public static final double PID_DERIVATIVE = 0;
	public static final double CLOSED_LOOP_RAMP_RATE = 0;
	public static final double INTEGRAL_ZONE = 0;
	public static final double TICKS_PER_ROTATION = 4096;
	public static final double WHEEL_SIZE = 15.24; //wheel size in cm
	public static final double WHEEL_CIRC = 95.76; //wheel circumference in cm
	public static final double ROBOT_DIAMETER = 61; //Robot Diameter in cm
	
	/**
	 * Which PID slot to pull gains from. Starting 2018, you can choose from
	 * 0,1,2 or 3. Only the first two (0,1) are visible in web-based
	 * configuration.
	 */
	public static final int kSlotIdx = 0;
	/**
	 * Talon SRX/ Victor SPX will supported multiple (cascaded) PID loops. For
	 * now we just want the primary one.
	 */
	public static final int kPIDLoopIdx = 0;
	/**
	 * set to zero to skip waiting for confirmation, set to nonzero to wait and
	 * report to DS if action fails.
	 */
	public static final int kTimeoutMs = 10;
	/** 
	 * Base trajectory period to add to each individual trajectory point's
	 * unique duration. This can be set to any value within [0,255]ms.
	 */
	public static final int kBaseTrajPeriodMs = 0;
	/**
	 * Motor deadband, set to 1%.
	 */
	public static final double kNeutralDeadband = 0.01;
	
	// Ultrasonic
	public static final int ULTRA_ANALOG = 0;
	public static final float MAXBOTIX_VOLTAGE_CONSTANT_MM = 1024f;
	
}
