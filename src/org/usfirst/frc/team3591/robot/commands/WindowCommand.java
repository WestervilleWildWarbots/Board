package org.usfirst.frc.team3591.robot.commands;

import org.usfirst.frc.team3591.robot.OI;
import org.usfirst.frc.team3591.robot.Robot;
import org.usfirst.frc.team3591.robot.subsystems.WindowSubsystem;

import edu.wpi.first.wpilibj.command.Command;
public class WindowCommand extends Command {
	//This sets up the variable direction;
	double direction;
    public WindowCommand() {
    	//Sets the direction variable value to -.2
    	direction = -.2;
      }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//This sets the direction to -.2 if the left limit switch is pressed
    	if(!WindowSubsystem.getLimSwitch1()){
    		direction = -.2;
    	
    		//This sets the direction to .2 if the right limit switch is pressed
    	} else if(!WindowSubsystem.getLimSwitch2()){
    		direction = .2;
    	}
    	
    	//This sets the current direction and gives it to the window subsystem.
    	Robot.windowSubsystem.setMotorSpeed(direction);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

  
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
