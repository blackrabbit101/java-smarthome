/*
 * File: Outside.java
 * Author: Alex Norman norman1@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 03/26/2019 AWN - initial coding
 *
 * Credits:  (if any for sections of code)
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.time.LocalTime;

/**
 *
 * @author Alex Norman norman1@uab.edu
 */
public class Outside extends lights {

    public static int ComponentNumber = 1;
    public static LocalTime currentTime;
    public static boolean motionstate = true; // turn the motion detector on by default. 

    /**
     *
     * @param title this is the title of the light could be just L1- debatable
     * usefulness for this project.
     */
    public Outside(String title) {
        super(); //we call our parent function that handles all of our consturction. 

        UID = "(" + UIDcount + ")";

        ComponentTitle = "Outside light number " + ComponentNumber; // we essentially save the number and title here in our component title when its genrated then increment
        ComponentNumber++; // we add to to the number of components after its generated

    }

    /**
     *
     * @param change we can change every color outside for parties.
     */
    public void changeColor(ColorType change) {

        Color = change;

    }

    /**
     * this will turn the motion detection on or off in case there is a party.
     */
    public void motionswitchoff() {
        motionstate = false;
    }

    public void motionswitchon() {
        motionstate = true;
    }

    /**
     *
     * @param intruder this will true if there is motion outside if its late at
     * night
     * @return will only return if there if something outside
     */
    public String motiondetection(boolean intruder) {
        String statement = "Nothing here";
        currentTime = LocalTime.now();
        if (motionstate == true) {
            if (currentTime.getHour() < 7 && currentTime.getHour() > 20) {
                if (intruder == true) {
                    state = true; //switch the outside light on
                    statement = "Movement Outside";
                }
            }
        }
        return statement;
    }

    @Override
    public String toString() {
        return ComponentTitle + " UID:" + UID + " ON or OFF: " + state + " Brightness: " + brightness + " Color: " + Color + " MotionDetector on or off: " + motionstate;
    }
}
