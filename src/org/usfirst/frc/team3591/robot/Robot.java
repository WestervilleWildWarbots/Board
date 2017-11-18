
package org.usfirst.frc.team3591.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3591.robot.commands.MonitorCommand;
import org.usfirst.frc.team3591.robot.commands.ServoCIMCommand;
import org.usfirst.frc.team3591.robot.commands.WindowCommand;
import org.usfirst.frc.team3591.robot.subsystems.CIMSubsystem;
import org.usfirst.frc.team3591.robot.subsystems.ServoSubsystem;
import org.usfirst.frc.team3591.robot.subsystems.SolenoidSubsystem;
import org.usfirst.frc.team3591.robot.subsystems.WindowSubsystem;

public class Robot extends IterativeRobot {

	//These set up the different command and subSystem classes. 
	public static final WindowSubsystem windowSubsystem = new WindowSubsystem();
	public static final ServoSubsystem servoSubsystem = new ServoSubsystem();
	public static final CIMSubsystem cimSubsystem = new CIMSubsystem();
	public static final SolenoidSubsystem solenoidSubsystem = new SolenoidSubsystem();
	
	public static final ServoCIMCommand servoCIMCommand = new ServoCIMCommand();
	public static final MonitorCommand monitorCommand = new MonitorCommand();
	public static final WindowCommand windowCommand = new WindowCommand();
	
	public static OI oi;

	@Override
	public void robotInit() {
		
		oi = new OI();

	}
	@Override
	public void disabledInit() {
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {

	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		
		//This starts all the Commands that are used the the program.
		servoCIMCommand.start();
		monitorCommand.start();
		windowCommand.start();
		
	}

	
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
