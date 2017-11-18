package org.usfirst.frc.team3591.robot.subsystems;

import org.usfirst.frc.team3591.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class WindowSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public CANTalon windowMotor;
	private static DigitalInput limSwitch1 = new DigitalInput(RobotMap.LIMIT_SWITCH_1);
	private static DigitalInput limSwitch2 = new DigitalInput(RobotMap.LIMIT_SWITCH_2);
	
	public static boolean getLimSwitch1(){
		//This returns the current value of the limit switch on the right.
		return limSwitch1.get();
	}
	
	public static boolean getLimSwitch2(){
		//This returns the current value of the limit switch on the right.
		return limSwitch2.get();
	}
	
	public WindowSubsystem(){
		//this sets the name windowMoter to be a motor on the robot and gives it the value given in robot map.
		windowMotor = new CANTalon(RobotMap.WINDOW_MOTOR_ID);
	}
	
	public void setMotorSpeed(double speed){
		//This gets the speed and makes the motor move. 
		windowMotor.set(speed);
	}
	
    public void initDefaultCommand() {
    }
}

