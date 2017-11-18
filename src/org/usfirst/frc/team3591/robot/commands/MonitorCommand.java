package org.usfirst.frc.team3591.robot.commands;

import org.usfirst.frc.team3591.robot.OI;
import org.usfirst.frc.team3591.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class MonitorCommand extends Command {

    public MonitorCommand() {
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    //This is used for printing all the information from the motors and sensors to smart dashboard for us to interpret. 
    private static void addData(){

    }
    
    protected void execute() {
    	addData();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }



    protected void interrupted() {
    }
}
