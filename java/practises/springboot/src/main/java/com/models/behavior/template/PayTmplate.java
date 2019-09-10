package com.models.behavior.template;

import java.util.*;

/**
 *
 */
public abstract class PayTmplate {


    /**
     * 按本模板进行生成订单、支付、验证三个阶段进行实现
     */
    public void pay() {
        this.doOrder();
        this.doPay();
        this.doCheck();
    }

    /**
     *
     */
    protected abstract void doOrder();

    /**
     *
     */
    protected abstract void doPay();

    /**
     *
     */
    protected abstract void doCheck();

}