package com.models.struct.facade;

public class ConcreteFacade implements Facade {


    @Override
    public void buildHourse() {

        Ready ready = new Ready();
        Clean clean = new Clean();
        Build build = new Build();

        ready.doing();
        clean.doing();
        build.doing();

    }
}
