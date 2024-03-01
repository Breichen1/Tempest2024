package frc.robot;

import edu.wpi.first.math.Matrix;
import edu.wpi.first.math.VecBuilder;
import edu.wpi.first.math.numbers.N1;
import edu.wpi.first.math.numbers.N3;

public final class Constants {
    public static final double stickDeadband = 0.1;
    public static final double armDeadband = 0.1;

    public static final class articulation {

        //articulator can IDs
        public static final int armLeft = 12;
        public static final int armRight = 13;

        public static final int intake = 9;
        public static final int pickup1 = 4;  //pwm channel
        public static final int pickup2 = 5;  //pwm channel
        
        public static final int shooter1 = 10; //bottom
        public static final int shooter2 = 11; //top

        //Arm limits
        public static final int fwdLimit = 2000;
        public static final int revLimit = -5;

        //Arm PID Constants
        public static final double armP = 0.03;
        public static final double armI = 0.00;
        public static final double armD = 0.00;
        public static final double armK = 0.0;

        //arm FeedForward Constants
        public static final double armFF = 0.00;
        
        //Shooter PID Constants
        public static final double shooterP = 0.0;
        public static final double shooterI = 0.0;
        public static final double shooterD = 0.0;
        public static final double shooterK = 0.0;

        //arm converstion math
        public static final double gearRatio = (5*5*5);
        //60/14 sprocket ratio
        public static final double ChainRatio = 8.91;

        //Arm controller polling rate
        public static final double ScalingRatio = 1.5;
        

    }

    public static final class driveTrain {
        public static final int frontLeft = 1;
        public static final int frontRight = 0;
        public static final int backLeft = 9;
        public static final int backRight = 8;
    }

    
}
