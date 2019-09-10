package com.models.behavior.chain;

/**
 *
 */
public class AnalysisFilter implements Filter {

    /**
     * @param request
     * @param resonse
     * @param chain
     */
    @Override
    public void doFilter(Request request, Response resonse, FilterChain chain) {
        String result = request.getParam().replaceAll("\\#", "");
        request.setParam(result);
        resonse.setResult(result);
        chain.doFilter(request, resonse, chain);
        System.out.println("-----------解密：" + resonse.getResult());
    }
}