/*
 * File: Hub.java
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

/**
 *
 * @author Alex Norman norman1@uab.edu
 */
public class Hub {

    private final String title = "Hub";
    private static final int SIZE = 15; //depends on the size of he room could arguably be changed
    public Kitchen[] kitchen = new Kitchen[SIZE]; // each group of lights
    public Outside[] outside = new Outside[SIZE];
    public bedroom[] bedroom = new bedroom[SIZE];
    public LivingRoom[] living = new LivingRoom[SIZE];

    private int numberKitchen = 0;
    private int numberOutside = 0;
    private int numberbedroom = 0;
    private int numberliving = 0;

    public Hub() {

    }

    /**
     *
     * @param addition add a bulb
     */
    public void addKitchenlight(Kitchen addition) {
        if (numberKitchen <= SIZE) {
            kitchen[numberKitchen++] = addition;
        }

    }

    /**
     *
     * @param addition add a bulb
     */
    public void addOutsidelight(Outside addition) {
        if (numberOutside <= SIZE) {
            outside[numberOutside++] = addition;
        }

    }

    /**
     *
     * @param addition add a light of bedroom
     */
    public void addbedroomlight(bedroom addition) {
        if (numberbedroom <= SIZE) {
            bedroom[numberbedroom++] = addition;
        }

    }

    /**
     *
     * @param addition add a light
     */
    public void addlivinglight(LivingRoom addition) {
        if (numberliving <= SIZE) {
            living[numberliving++] = addition;
        }

    }

    /**
     *
     * @param change turn living into the state desired
     */
    public void turnliving(boolean change) {
        int loop = 0;
        if (change == true) {// chnage true equals to on

            while (loop != SIZE) {
                living[loop].state = true;
                living[loop].brightness = 10;
                loop++;
            }
        } else {
            while (loop != SIZE) {
                living[loop].state = false;
                living[loop].brightness = 0;
                loop++;
            }
        }
    }

    /**
     *
     * @param change turn lights on outside or off
     */
    public void turnoutside(boolean change) {
        int loop = 0;
        if (change == true) {// chnage true equals to on

            while (loop != SIZE) {
                outside[loop].state = true;
                outside[loop].brightness = 10;
                loop++;
            }
        } else {
            while (loop != SIZE) {
                outside[loop].state = false;
                outside[loop].brightness = 0;
                loop++;
            }
        }
    }

    /**
     *
     * @param change turn lights on in bedroom
     */
    public void turnbedroom(boolean change) {
        int loop = 0;
        if (change == true) {// chnage true equals to on

            while (loop != SIZE) {
                bedroom[loop].state = true;
                bedroom[loop].brightness = 10;
                loop++;
            }
        } else {
            while (loop != SIZE) {
                bedroom[loop].state = false;
                bedroom[loop].brightness = 0;
                loop++;
            }
        }
    }

    /**
     *
     * @param change change kitchen state
     */
    public void turnkitchen(boolean change) {
        int loop = 0;
        if (change == true) {// chnage true equals to on

            while (loop != SIZE) {
                kitchen[loop].state = true;
                kitchen[loop].brightness = 10;
                loop++;
            }
        } else {
            while (loop != SIZE) {
                kitchen[loop].state = false;
                kitchen[loop].brightness = 0;
                loop++;
            }
        }
    }

    /**
     *
     * @param change state we want to change the bulbs too
     */
    public void turnall(boolean change) {
        turnkitchen(change);
        turnbedroom(change);
        turnliving(change);
        turnoutside(change);

    }

    /**
     *
     * @param number brightness desired
     */
    public void brightnessbedroom(int number) {
        int loop = 0;

        if (number <= 10 && number > 0) {
            while (loop != SIZE) {
                bedroom[loop].brightness = number;
                bedroom[loop].state = true;
                loop++;
            }
        } else if (number <= 0) {
            while (loop != SIZE) {
                bedroom[loop].state = false;
                bedroom[loop].brightness = number;
                loop++;
            }

        } else {
            System.out.print("Choose a number (0 through 10) low brightness to bright");
        }
    }

    /**
     *
     * @param number brightness desired
     */
    public void brightnesskitchen(int number) {
        int loop = 0;
        if (number <= 10 && number > 0) {
            while (loop != SIZE) {
                kitchen[loop].brightness = number;
                kitchen[loop].state = true;
                loop++;
            }
        } else if (number <= 0) {
            while (loop != SIZE) {
                kitchen[loop].state = false;
                kitchen[loop].brightness = number;
                loop++;
            }

        } else {
            System.out.print("Choose a number (0 through 10) low brightness to bright");
        }
    }

    /**
     *
     * @param number change we wish to be
     */
    public void brightnessoutside(int number) {
        int loop = 0;
        if (number <= 10 && number > 0) {
            while (loop != SIZE) {
                outside[loop].brightness = number;
                outside[loop].state = true;
                loop++;
            }
        } else if (number <= 0) {
            while (loop != SIZE) {
                outside[loop].brightness = number;
                outside[loop].state = false;
                loop++;
            }

        } else {
            System.out.print("Choose a number (0 through 10) low brightness to bright");
        }
    }

    /**
     *
     * @param number the level of brightness desired
     */
    public void brightnessliving(int number) {
        int loop = 0;
        if (number <= 10 && number > 0) {
            while (loop != SIZE) {
                living[loop].brightness = number;
                living[loop].state = true;
                loop++;
            }
        } else if (number <= 0) {
            while (loop != SIZE) {
                living[loop].state = false;
                living[loop].brightness = number;
                loop++;
            }

        } else {
            System.out.print("Choose a number (0 through 10) low brightness to bright");
        }
    }

    /**
     *
     * @param change what color we are changing the lights too
     * @param room what room we are changing
     */
    public void changeColor(lights.ColorType change, String room) {
        int loop = 0;
        switch (room) {
            case "living":
                while (loop != SIZE) {
                    living[loop].Color = change;
                    loop++;
                }
                break;
            case "bedroom":
                while (loop != SIZE) {
                    bedroom[loop].Color = change;
                    loop++;
                }
                break;
            case "outside":
                while (loop != SIZE) {
                    outside[loop].Color = change;
                    loop++;
                }
                break;
            case "kitchen":
                while (loop != SIZE) {
                    outside[loop].Color = change;
                    loop++;
                }
                break;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return title + " with " + numberKitchen + " Kitchen lights, "
                + numberbedroom + " bedroom lights, "
                + numberliving + " living room lights " + "and "
                + numberOutside + " outside lights.";
    }

}
