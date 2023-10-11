// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Drivebase;

public class DefaultDrive extends CommandBase {
  private final Drivebase drivebase;
  private final CommandXboxController xboxController;

  /** Creates a new DefaultDrive. */
  public DefaultDrive(Drivebase drivebase, CommandXboxController xboxController) {
    this.drivebase = drivebase;
    this.xboxController = xboxController;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(this.drivebase);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double forward = this.xboxController.getLeftY();
    double rotation = this.xboxController.getRightX();
    drivebase.drive(forward, rotation);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
