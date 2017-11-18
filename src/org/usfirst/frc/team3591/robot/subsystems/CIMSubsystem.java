package org.usfirst.frc.team3591.robot.subsystems;

import org.usfirst.frc.team3591.robot.RobotMap;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CIMSubsystem extends Subsystem {

	//This sets the CANTalon name to cimTalon;
	CANTalon cimTalon;
	
	public CIMSubsystem(){
		//This sets up the CANTalon and sets the value to the number given in the robot map.
		cimTalon = new CANTalon(RobotMap.CIM_ID);
		//This sets the feed back device to the quad encoder for the CANTalon.  
		cimTalon.setFeedbackDevice(CANTalon.FeedbackDevice.QuadEncoder);
	}
	
	public int getQuadEncoder(){
		//This gets the position of the encoder.
		return cimTalon.getEncPosition();
	}
	
	public void setMotorSpeed(double speed){
		//This is getting the speed and having the motor move at that speed.
		cimTalon.set(speed);
	}

    public void initDefaultCommand() {
    }
}

