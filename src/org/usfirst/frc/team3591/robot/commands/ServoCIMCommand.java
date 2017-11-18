package org.usfirst.frc.team3591.robot.commands;

import org.usfirst.frc.team3591.robot.OI;
import org.usfirst.frc.team3591.robot.Robot;
import org.usfirst.frc.team3591.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ServoCIMCommand extends Command {
	
	
    public ServoCIMCommand() {

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
      	//These is for getting the value and setting the speed number for the subsystem.
    	Robot.servoSubsystem.setMotorSpeed((OI.getSpeed(RobotMap.JOYSTICK_1, "Y") + 1) /2);
    	Robot.cimSubsystem.setMotorSpeed(OI.getSpeed(RobotMap.JOYSTICK_1, "Z") * .2);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//this is for once the robot ends to not keep doing things.
    	Robot.servoSubsystem.setMotorSpeed(0);
    	Robot.cimSubsystem.setMotorSpeed(0);
    }

    protected void interrupted() {
    	//This is for the robot not to do anything once it is started. 
    	Robot.servoSubsystem.setMotorSpeed(0);
    	Robot.cimSubsystem.setMotorSpeed(0);
    }
}
