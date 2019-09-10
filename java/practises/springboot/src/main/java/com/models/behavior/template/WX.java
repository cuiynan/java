package com.models.behavior.template;

/**
 *
 */
public class WX extends PayTmplate {


    /**
     *
     */
    @Override
    protected void doOrder() {
        System.out.println("微信-生成订单");
    }

    /**
     *
     */
    @Override
    protected void doPay() {
        System.out.println("微信-发起支付");
    }

    /**
     *
     */
    @Override
    protected void doCheck() {
        System.out.println("微信-检查支付订单");
    }

}