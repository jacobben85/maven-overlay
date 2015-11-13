package com.jbjohn.overlay;

/**
 * Maven overlay
 */
class Overlay {

    public static void main(String[] args) {

        Overlay overlay = new Overlay();

        for (String arg : args) {
            overlay.process(arg);
        }

    }

    public void process(String arg) {
        System.out.println("Argument received : " + arg);
    }
}