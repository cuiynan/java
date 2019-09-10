package com.models.struct.proxy.dynamic;

/**
 * 银行业务授理人
 */
public class ProxyPerson implements Bank {
    private int money;

    @Override
    public void saveMoney(int money) {
        System.out.printf("您已存入 = %d 元钱", money);
        this.money = money;
    }

    @Override
    public int checkMoney() {
        System.out.printf("您已取出 = %d 元钱", this.money);
        return this.money;
    }
}
