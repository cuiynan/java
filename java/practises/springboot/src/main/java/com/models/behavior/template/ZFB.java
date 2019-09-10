package com.models.behavior.template;

/**
 *
 */
public class ZFB extends PayTmplate {

    /**
     *
     */
    @Override
    protected void doOrder() {
        System.out.println("支付宝-生成订单");
    }

    /**
     *
     */
    @Override
    protected void doPay() {
        System.out.println("支付宝-发起支付");
    }

    /**
     *
     */
    @Override
    protected void doCheck() {
        System.out.println("支付宝-检查支付订单");
    }


}