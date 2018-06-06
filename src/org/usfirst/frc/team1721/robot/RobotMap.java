/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1721.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX; //import to use the VictorSPX

public class RobotMap { //Robotmap main class
	public static int portAddress = 0; //Port CAN address
	public static int starboardAddress = 1; //Starboard CAN address
	public static VictorSPX motorPort, motorStarboard; //Drive motors
	public static VictorSPX utilityMotorOne; //Function motors
}
