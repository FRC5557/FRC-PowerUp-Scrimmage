package org.usfirst.frc.team5557.robot.commands;

import org.usfirst.frc.team5557.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RaiseArmCommand extends Command{

	@Override
	protected void initialize() {
		//requires(Robot.arm);
	}

	@Override
	protected void execute() {
		Robot.arm.raise(1);
		
	} 
	
	@Override
	protected boolean isFinished() {
		return false;// Robot.arm.getLimSwitchStatus(0);
	}
	
	@Override
	protected void end() {
		Robot.arm.stop();
	}

}
