package com.models.behavior.observer;

/**
 *
 */
public interface ISubject {

    /**
     * @param observer
     */
    void regist(IObserver observer);

    /**
     * @param observer
     */
    void unregist(IObserver observer);

    /**
     *
     */
    void notifyObservers();

}