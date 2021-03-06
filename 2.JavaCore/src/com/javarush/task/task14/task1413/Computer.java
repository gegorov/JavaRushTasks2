package com.javarush.task.task14.task1413;

/**
 * Created by gennadi on 24.05.17.
 */
public class Computer {

    private Monitor monitor;

    private Mouse mouse;

    private Keyboard keyboard;

    public Computer(Keyboard keyboard, Mouse mouse,  Monitor monitor) {
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }


    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
}
