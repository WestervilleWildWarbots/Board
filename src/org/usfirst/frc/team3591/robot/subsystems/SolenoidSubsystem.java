package org.usfirst.frc.team3591.robot.subsystems;

import org.usfirst.frc.team3591.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SolenoidSubsystem extends Subsystem {

	Solenoid openSolenoid;
	Solenoid closeSolenoid;
	
	
	public SolenoidSubsystem(){
		
		//These set the open value and closed value to the value given in robot map.
		openSolenoid = new Solenoid(5,RobotMap.OPEN_SOLENOID_ID);
		closeSolenoid = new Solenoid(5,RobotMap.CLOSED_SOLENOID_ID);
		
		//This sets the solenoid open or closed for which ever is activated. 
		openSolenoid.set(false);
		closeSolenoid.set(true);
		
	}
	
	public void setSolenoid(boolean open){
		//This sets for when ever the setSolenoid is called and activated sets open to open and closed to not open. 
		openSolenoid.set(open);
		closeSolenoid.set(!open);
	}

    public void initDefaultCommand() {
    }
}

