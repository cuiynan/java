package com.models.create.strategy;

/**
 * 类似代理。
 * 所有业务中的入口。
 */
public class InspirationContext {

    /**
     *
     */
    public Inspiration inspiration;

    /**
     * @param
     */
    public InspirationContext(Inspiration inspiration) {
        this.inspiration = inspiration;
    }

    /**
     * 打开锦囊
     */
    public void open() {
        //必要时，对inspiration进行null 的判断，并抛出异常，让全局异常类捕获。
        inspiration.oepn();
    }

}