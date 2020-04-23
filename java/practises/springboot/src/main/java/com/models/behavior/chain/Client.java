package com.models.behavior.chain;

/**
 * @author : cuiyingnan
 * @date : 2019/6/12 17:09
 * @desc : 责任链模式，设计太经典了，有空的时候好好研究研究项目中哪里可以使用此设计模式。
 * 注意的地方几点：
 *  1，执行顺序
 *  2，当fitler处理时，需要将request、response赋值，并进行后续的数据调用和数据返回。
 */
public class Client {
    public static void main(String[] args) {

        FilterChain chain = new FilterChain();
        //此处注意：下面增加filter的执行顺序与代码增加先后有关，经分析程序总是从后往前执行。
        chain.addFilter(new AnalysisFilter());
        chain.addFilter(new SQLFilter());

        Request request = new Request();
        request.setParam(",哈。。我#看下最,后的最.,,,,,#后是什么东西");
        Response response = new Response();
        chain.doFilter(request, response, chain);

        System.out.println("这里是经处理完后，最后的结果：" + response);
    }

}
