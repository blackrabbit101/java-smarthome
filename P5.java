/*
 * File: P5.java
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
public class P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lights light = null;
        Hub hub = new Hub();
        Controller controller = new Controller(hub, "Controller");

        for (int i = 0; i < 15; i++) {
            controller.hub.addKitchenlight(new Kitchen("KI" + i));
            controller.hub.addOutsidelight(new Outside("OU" + i));
            controller.hub.addbedroomlight(new bedroom("BR" + i));
            controller.hub.addlivinglight(new LivingRoom("LR" + i));

        }
        seperator();
        System.out.print("Test 1: Adding lights to the Hub\n");
        println(hub);

        seperator();
        System.out.print("Test 2: Turn on only Kitchen lights\n");
        controller.turn(true, "kitchen");

        for (int i = 0; i < 5; i++) {
            println(hub.kitchen[i].toString());
        }
        for (int i = 0; i < 5; i++) {
            println(hub.bedroom[i].toString());
        }
        seperator();
        System.out.print("Test 3: Turn on all of the lights\n");
        controller.turnall(true);
        for (int i = 0; i < 3; i++) {
            println(hub.bedroom[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.living[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.outside[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.kitchen[i].toString());
        }
        seperator();
        System.out.print("Test 4: Change all of the lights to blue\n");
        controller.changeColor(lights.ColorType.BLUE);
        for (int i = 0; i < 3; i++) {
            println(hub.bedroom[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.living[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.outside[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.kitchen[i].toString());
        }
        seperator();
        System.out.print("Test 5: Change Outside lights to red keeping the rest the same\n");
        controller.changeColor(lights.ColorType.RED, "outside");
        for (int i = 0; i < 3; i++) {
            println(hub.bedroom[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.living[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.outside[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.kitchen[i].toString());
        }
        seperator();
        System.out.print("Test 6: Change brightness to 7 on bedroom lights\n");

        controller.changeBrightness("bedroom", 7);
        for (int i = 0; i < 3; i++) {
            println(hub.bedroom[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.living[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.outside[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.kitchen[i].toString());
        }

        seperator();
        System.out.print("Test 7:Change brightness of all 0 which also turns them off\n");
        controller.changeBrightnessall(0);
        for (int i = 0; i < 3; i++) {
            println(hub.bedroom[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.living[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.outside[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.kitchen[i].toString());
        }
        seperator();
        System.out.print("Test 8: turn motion detector off becasue we have a party outside tonight\n");
        controller.turnoffmotiondetect();
        for (int i = 0; i < 15; i++) {
            println(hub.outside[i].toString());
        }
        seperator();
        System.out.print("Test 9:Check to see if p5 is late\n");
        controller.p5islate();
        for (int i = 0; i < 3; i++) {
            println(hub.bedroom[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.living[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.outside[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            println(hub.kitchen[i].toString());
        }
    }

    private static void println(Object o) {
        System.out.println(o.toString());
    }

    private static void seperator() {
        System.out.print("----------------------------------------------------------------\n");
    }

}
