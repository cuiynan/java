package com.models.behavior.chain;

/**
 *
 */
public class SQLFilter implements Filter {

    /**
     * @param request
     * @param resonse
     * @param chain
     */
    @Override
    public void doFilter(Request request, Response resonse, FilterChain chain) {
        System.out.print("SQLFilter--源：" + request.getParam());
        String result = request.getParam().replaceAll("\\,", "");
        resonse.setResult(result);
        request.setParam(result);
        chain.doFilter(request, resonse, chain);
        System.out.println("----处理后:" + resonse.getResult());
    }

}