package org.usfirst.frc.team3591.robot.commands;

import org.usfirst.frc.team3591.robot.Robot;
import org.usfirst.frc.team3591.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class SolenoidCommand extends Command {

	boolean open = false;
	
    public SolenoidCommand() {
    }

    // Called just before this Command runs the first time
    protected void initialize() {    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//This sets the solenoid closed so it dose not open and do something. 
    	RobotMap.open = !RobotMap.open;
    	//Once the button is pressed from the OI then it sets to open and moves the piston. 
    	Robot.solenoidSubsystem.setSolenoid(RobotMap.open);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

  
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    	//This is to not let the solenoid to do anything while the robot is disabled. 
    	Robot.solenoidSubsystem.setSolenoid(false);

    }
}
