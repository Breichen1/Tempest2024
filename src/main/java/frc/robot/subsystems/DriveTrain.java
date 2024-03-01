// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private MecanumDrive Drive;
  public DriveTrain() {
    Spark frontLeft = new Spark(Constants.driveTrain.frontLeft);
    Spark frontRight = new Spark(Constants.driveTrain.frontRight);
    Spark backLeft = new Spark(Constants.driveTrain.backLeft);
    Spark backRight = new Spark(Constants.driveTrain.backRight);

    Drive = new MecanumDrive(frontLeft, backLeft, frontRight, backRight);
  }

  public void drive(double x, double y, double z){
    Drive.driveCartesian(z, y, x);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
