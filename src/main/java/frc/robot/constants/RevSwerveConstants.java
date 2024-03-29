package frc.robot.constants;

import edu.wpi.first.math.geometry.Rotation2d;
import frc.lib.util.swerveUtil.RevSwerveModuleConstants;


/**
 * This file comes with command robot projects, and is intended to contain
 * configuration information.
 * I think it would be prudent if this file only contained CanIDs, because it
 * is useful to have all the ids for the whole robot in one place.
 * other configuration goes into subsystem specific configuration files,
 * to make sure this one isn't cluttered.
 */
public final class RevSwerveConstants 
{
    public static final double stickDeadband = 0.1;
    public static final double limelightOffset = 3;
  

    public static final class REV
    {
        public static final int pigeonID = 10;

       
    
    }
    public static final class Swerve {
        /* Module Specific Constants */
    /* Front Left Module - Module 0  - now front right*/
        public static final class Mod1 { 

            public static final int driveMotorID = 2;
            public static final int angleMotorID = 1;
            public static final int canCoderID = 11;
            public static final Rotation2d angleOffset = Rotation2d.fromDegrees(112.5); //Rotation2d.fromDegrees(37.7);
            public static final RevSwerveModuleConstants constants = 
                new RevSwerveModuleConstants(driveMotorID, angleMotorID, canCoderID, angleOffset);
        }
        /* Front Right Module - Module 1 - now back right*/
        public static final class Mod3 { 
            public static final int driveMotorID = 4;
            public static final int angleMotorID = 3;
            public static final int canCoderID = 13;
            public static final Rotation2d angleOffset = Rotation2d.fromDegrees(103.3);
            public static final RevSwerveModuleConstants constants = 
                new RevSwerveModuleConstants(driveMotorID, angleMotorID, canCoderID, angleOffset);
        }
        /* Back Left Module - Module 2  - now front left*/
        public static final class Mod0 { 
            public static final int driveMotorID = 8;
            public static final int angleMotorID = 7;
            public static final int canCoderID = 17;
            public static final Rotation2d angleOffset = Rotation2d.fromDegrees(270);
            public static final RevSwerveModuleConstants constants = 
                new RevSwerveModuleConstants(driveMotorID, angleMotorID, canCoderID, angleOffset);
        }
         /* Back Right Module - Module 3 - now back left*/
        public static final class Mod2 { 
            public static final int driveMotorID = 6;
            public static final int angleMotorID = 5;
            public static final int canCoderID = 15;
            public static final Rotation2d angleOffset = Rotation2d.fromDegrees(309.9);
            public static final RevSwerveModuleConstants constants = 
                new RevSwerveModuleConstants(driveMotorID, angleMotorID, canCoderID, angleOffset);
        }
        
    }

     

    
    
    

   

}