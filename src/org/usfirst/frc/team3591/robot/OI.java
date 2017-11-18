package org.usfirst.frc.team3591.robot;

import org.usfirst.frc.team3591.robot.commands.SolenoidCommand;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */


public class OI {
	//The two lines below create a joystick and a button and name them.
	private static Joystick driveStick = new Joystick(RobotMap.JOYSTICK_1);
	private static Button button12 = new JoystickButton(driveStick, 12);
	
	//This method activates the button that was set up while it is pressed. 
	public OI(){
		button12.whenPressed(new SolenoidCommand());
	}
	
	
	//This Method is for all the info needed for all the parts coming from the joystick.
	public static double getSpeed(int joystickID, String axis){
		//these set up the name for the variable joystick
		Joystick joystick;
		joystick = driveStick;
		
		double speed = 0;
		//This is to get the numbers related to the angle of how much the joystick is moved.
		if(axis.equals("X")){
			speed = joystick.getX();
		}else if(axis.equals("Y")){
			speed = joystick.getY();
		}else if(axis.equals("Z")){
			speed = joystick.getZ();
		}
		//This is so if the joystick is not moved to much the robot dose not do anything
		if(Math.abs(speed) < .05){
			speed = 0;
		}
		//This is to put all the values from the joystick to make sure everything is not at full speed.
		return speed * joystick.getThrottle();
	}
	
}
