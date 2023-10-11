// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivebase extends SubsystemBase {
  /** Creates a new Drivebase. */
  private DifferentialDrive diffDrive;
  private CANSparkMax leftMotor = new CANSparkMax(0, MotorType.kBrushless);
  private CANSparkMax rightMotor = new CANSparkMax(0, MotorType.kBrushless);
 
  public Drivebase() {
    this.diffDrive = new DifferentialDrive(leftMotor, rightMotor);
  }

  public void drive(double fwd, double rot) {
    this.drive(fwd, rot, true);
  }

  public void drive(double fwd, double rot, boolean squaredInputs) {
    this.diffDrive.arcadeDrive(fwd, rot, squaredInputs);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
