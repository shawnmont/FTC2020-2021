package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous(name = "Move And Park Blue", group = "Linear Opmode")
public class MoveAndParkBlue extends LinearOpMode {
    private AutoOmniDriveTrain autoOmni;
    private SkyStoneIntake intake;
    private static final long INITIAL_WAIT = 1000;

    public void runOpMode() throws InterruptedException {
        this.autoOmni = new AutoOmniDriveTrain(this.hardwareMap, this.telemetry);
        this.autoOmni.initMotors();
        this.intake = new SkyStoneIntake(this.hardwareMap, this.telemetry);
        boolean parked = false;

        waitForStart();

        while (opModeIsActive() ){




            Thread.sleep(INITIAL_WAIT);



            if(!parked) {


                this.autoOmni.crabbingDistance(50);

                this.autoOmni.moveDistance(110);

            }

            Thread.sleep(50);
            parked = true;
        }

    }
}
