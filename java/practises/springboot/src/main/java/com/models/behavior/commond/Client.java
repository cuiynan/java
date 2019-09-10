package com.models.behavior.commond;

public class Client {
    public static void main(String[] args) {
        ZhangSan zhangSan = new ZhangSan();
        Lisi lisi = new Lisi();

        TeamLeader teamLeader = new TeamLeader();
        teamLeader.setCommond(lisi);
        teamLeader.action();

        teamLeader.setCommond(zhangSan);
        teamLeader.action();

    }
}
