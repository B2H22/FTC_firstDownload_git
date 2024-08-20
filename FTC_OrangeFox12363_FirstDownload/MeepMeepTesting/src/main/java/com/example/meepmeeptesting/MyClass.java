package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MyClass {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(500);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(46, 60, Math.toRadians(180), Math.toRadians(180), 14.97)
                .followTrajectorySequence(drive -> drive.trajectorySequenceBuilder(new Pose2d(-35, 70, Math.toRadians(90)))


                                .lineToLinearHeading(new Pose2d(49, 40, Math.toRadians(180)))




//
//                                .lineToLinearHeading(new Pose2d(20, 30, Math.toRadians(270)))
//
//
//
//
//
////                                .lineToLinearHeading(new Pose2d(-35, -50, Math.toRadians(90)))
////                                .lineToLinearHeading(new Pose2d(-32, -40, Math.toRadians(60)))
//
//                                .lineToLinearHeading(new Pose2d(-34, 35, Math.toRadians(180)))
////                                .splineToLinearHeading(new Pose2d(-56, 11.5, Math.toRadians(180)), Math.toRadians(180))
//
//                                .lineToConstantHeading(new Vector2d(30, 11.5))
//                                .splineToLinearHeading(new Pose2d(45, 35, Math.toRadians(180)), Math.toRadians(0))// go to bkboard
//                                .waitSeconds(1)
//                                .lineToConstantHeading(new Vector2d(30, 11.5))
////                                .splineToLinearHeading(new Pose2d(45, 35, Math.toRadians(180)), Math.toRadians(0))// go to bkboard
//                                .waitSeconds(1)
//





                                //
//                                drive.trajectorySequenceBuilder(new Pose2d(-35, -70, Math.toRadians(90)))
                                        //left
//                                      .lineToLinearHeading(new Pose2d(-42, -40, Math.toRadians(120)))

                                        //right
//                                        .lineToLinearHeading(new Pose2d(-35, -50, Math.toRadians(90)))
//                                        .lineToLinearHeading(new Pose2d(-32, -40, Math.toRadians(60)))

                                        //mid
//                                        .lineToLinearHeading(new Pose2d(-40, -30, Math.toRadians(110)))

                .build()
                );

        meepMeep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}