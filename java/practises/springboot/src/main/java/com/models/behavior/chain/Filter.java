package com.models.behavior.chain;

/**
 *
 */
public interface Filter {

    /**
     * @param request
     * @param resonse
     * @param chain
     */
    public void doFilter(Request request, Response resonse, FilterChain chain);

}