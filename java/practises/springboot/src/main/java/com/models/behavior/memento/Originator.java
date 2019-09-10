package com.models.behavior.memento;

/**
 *
 */
public class Originator {

    /**
     *
     */
    private int state;

    /**
     *
     */
    public void nextQuestion() {
        state++;
        System.out.println("进入下一道题" + state);
    }

    /**
     * @return
     */
    public int getState() {
        return this.state;
    }

    public void clear() {
        this.state = 0;
    }

    public Memento save() {
        return new Memento(this.state);
    }

    public void recover(Memento memento) {
        this.state = memento.getState();
    }
}