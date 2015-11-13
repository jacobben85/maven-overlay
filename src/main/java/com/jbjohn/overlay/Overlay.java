package com.jbjohn.overlay;

/**
 * Maven overlay
 */
class Overlay {

    public static void main(String... args) {
        Overlay overlay = new Overlay();
        overlay.process();
    }

    public void process() {
        System.out.println("processing overlay");
    }
}