package com.jbjohn.overlay;

/**
 * Maven overlay
 */
class Overlay {

    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println(arg);
        }

        Overlay overlay = new Overlay();
        overlay.process();
    }

    public void process() {
        System.out.println("processing overlay");
    }
}