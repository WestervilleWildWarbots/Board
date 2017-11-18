package org.usfirst.frc.team3591.robot.subsystems;

import org.usfirst.frc.team3591.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ServoSubsystem extends Subsystem {

	//This sets up the Servo to the name servo.
	Servo servo;
	
	public ServoSubsystem(){
		//This sets up the servo value to the value given in robot map.
		servo = new Servo(RobotMap.SERVO_ID);
	}
	
	public void setMotorSpeed(double speed){
		//This is the math to get the angle set up to the OI and changes from what the speed is. 
		speed = (speed++) * 127 + 1;
		//Sets the angle to the speed variable.  
		servo.setAngle(speed);
	}

    public void initDefaultCommand() {
     
    }
}

