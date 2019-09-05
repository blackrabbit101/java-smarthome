/*
 * File: lights.java
 * Author: Alex Norman norman1@uab.edu
 * Assignment:  P5 - EE333 Spring 2019
 * Vers: 1.0.0 03/25/2019 AWN - initial coding
 *
 * Credits:  (if any for sections of code)
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

/**
 *
 * @author Alex Norman norman1@uab.edu
 */
public abstract class lights {

    protected String UID;
    public String ComponentTitle;
    public static int UIDcount;
    ColorType Color = ColorType.WHITE;// all lights will be white by default. 
    public int brightness;
    public boolean state = false; // on or off based on boolean false equals off

    /**
     *
     */
    public enum ColorType {
        RED, ORANGE, YELLOW, GREEN,
        BLUE, INDINGO, VIOLET, WHITE
    }

    /**
     * the constructor only increments the amount of times we use a new light is
     * created      *
     */
    public lights() {

        UIDcount++;
    }

    /**
     *
     * @return
     */
    public String getUID() { // simple functions that get and set title if we needed them 

        return UID;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return ComponentTitle + " UID:" + UID + " ON or OFF " + state + " Brightness " + brightness + " Color " + Color;
    }

    /**
     *
     */
    public void getColor() {
        switch (Color) {
            case WHITE:
                System.out.println("The Light Color is White");
                break;
            case RED:
                System.out.println("The Light Color is RED");
                break;
            case BLUE:
                System.out.println("The Light Color is Blue");
                break;
            case VIOLET:
                System.out.println("The Light Color is Violet");
                break;
            case INDINGO:
                System.out.println("The Light Color is Indingo");
                break;
            case GREEN:
                System.out.println("The Light Color is Green");
                break;
            case YELLOW:
                System.out.println("The Light Color is Yellow");
                break;
            case ORANGE:
                System.out.println("The Light Color is Orange");
                break;
        }

    }

    public void changeBrightness(int change) {
        if (change < 11 & change > 0) {
            brightness = change;
        } else if (change < 0) {
            System.out.print("Enter a Value from 0 to 10");
        } else {
            System.out.print("Enter a Value from 0 to 10");
        }
    }

    public void turnstate() {
        if (state == true) {
            state = false;
        } else {
            state = true;
        }
    }

}
