package org.usfirst.frc.team5557.robot.commands.autogroups;

import org.usfirst.frc.team5557.robot.commands.DriveForDistanceCommand;

import org.usfirst.frc.team5557.robot.commands.RaiseArmCommand;
import org.usfirst.frc.team5557.robot.commands.TurnForAngleCommand;

import edu.wpi.first.wpilibj.Timer;

import edu.wpi.first.wpilibj.command.CommandGroup;

// This is the main autonomous we used during the competition last year
// all it did was drive straight to cross the auto line

public class AutoLine extends CommandGroup{
	
	
	public AutoLine() {
		
		System.out.println("Stating Right auton");
		
		
		addSequential(new DriveForDistanceCommand(470));// Drive forward for 15.5 feet
	} 
}