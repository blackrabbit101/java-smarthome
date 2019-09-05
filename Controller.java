/*
 * File: Controller.java
 * Author: Alex Norman norman1@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 04/02/2019 AWN - initial coding
 *
 * Credits:  (if any for sections of code)
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Alex Norman norman1@uab.edu
 */
public class Controller {

    private String title;
    public Hub hub = new Hub();
    public String intruder;
    private final static LocalDate currentdate = LocalDate.now();

    /**
     *
     * @param hub add a hub
     */
    public Controller(Hub hub, String title) {
        this.hub = hub;
        this.title = title;
    }

    /**
     *
     * @param state on or off
     * @param where where we are changing
     */
    public void turn(boolean state, String where) {
        switch (where) {
            case "kitchen":
                hub.turnkitchen(state);
                break;
            case "bedroom":
                hub.turnbedroom(state);
                break;
            case "outside":
                hub.turnoutside(state);
                break;
            case "livingroom":
                hub.turnliving(state);
                break;
        }
    }

    /**
     *
     * @param change change state
     */
    public void turnall(boolean change) {
        hub.turnall(change);
    }

    /**
     *
     * @param where where the brightness is being changed
     * @param change the change
     */
    public void changeBrightness(String where, int change) {
        switch (where) {
            case "kitchen":
                hub.brightnesskitchen(change);
                break;
            case "bedroom":
                hub.brightnessbedroom(change);
                break;
            case "outside":
                hub.brightnessoutside(change);
                break;
            case "livingroom":
                hub.brightnessliving(change);
                break;
        }
    }

    /**
     *
     * @param change the value we are changing to.
     */
    public void changeBrightnessall(int change) {
        hub.brightnessbedroom(change);
        hub.brightnesskitchen(change);
        hub.brightnessliving(change);
        hub.brightnessoutside(change);
    }

    /**
     *
     * @param color change the color is taking
     * @param where where the room we are changing
     */
    public void changeColor(lights.ColorType color, String where) {
        hub.changeColor(color, where);

    }

    /**
     *
     * @param color the new color
     */
    public void changeColor(lights.ColorType color) {
        hub.changeColor(color, "kitchen");
        hub.changeColor(color, "bedroom");
        hub.changeColor(color, "living");
        hub.changeColor(color, "outside");
    }

    /**
     * has no functionality to project
     */
    public void stateoflights() {
        for (int i = 0; i < 15; i++) {
            hub.bedroom[i].toString();
            hub.living[i].toString();
            hub.outside[i].toString();
            hub.kitchen[i].toString();
        }

    }

    /**
     * turns motion detector off
     */
    public void turnoffmotiondetect() {
        for (int i = 0; i < 15; i++) {

            hub.outside[i].motionswitchoff();

        }
    }

    /**
     * models use of date
     */
    public void p5islate() {
        if (currentdate.isAfter(LocalDate.of(2019, Month.APRIL, 6))) {
            changeColor(lights.ColorType.RED);
        } else {
            changeColor(lights.ColorType.GREEN);
        }
    }

}
