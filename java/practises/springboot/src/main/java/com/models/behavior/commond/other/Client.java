package com.models.behavior.commond.other;

/**
 * 另外一种实现
 * 这样拆开的目的是什么呢？如果在项目中使用，代码量过多。
 * 看似是将行为与业务代码进行拆分，然后呢？除了在调用上感觉还算友好外，没有感觉其它哪里要更好呢？
 * 稍后一段时间再回头看看 todo
 */
public class Client {
    public static void main(String[] args) {
        TV tv = new TV();

        Commond on = new OnCommon(tv);
        Commond off = new OffCommond(tv);
        Commond change = new ChangeChannelCommond(tv);

        on.execute();
        change.execute();
        off.execute();

    }
}
