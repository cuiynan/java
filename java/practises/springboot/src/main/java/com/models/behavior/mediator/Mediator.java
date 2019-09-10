package com.models.behavior.mediator;

/**
 *
 */
public abstract class Mediator {

    Door door;
    Music music;

    public Mediator(Door door, Music music) {
        this.door = door;
        this.music = music;
    }

    /**
     *
     */
    public abstract void music(String state);

    /**
     *
     */
    public abstract void door(String state);

}