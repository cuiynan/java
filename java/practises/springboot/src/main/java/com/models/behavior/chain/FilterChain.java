package com.models.behavior.chain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class FilterChain implements Filter {


    /**
     *
     */
    public List<Filter> fitlers = new ArrayList<>();

    /**
     * @param filter
     */
    public void addFilter(Filter filter) {
        fitlers.add(filter);
    }


    int index = 0;

    /**
     * 这里是核心，连续一直在调用其它filter
     */
    @Override
    public void doFilter(Request request, Response resonse, FilterChain chain) {
        if (index == fitlers.size()) {
            return;
        }
        Filter filter = fitlers.get(index);
        index++;
        filter.doFilter(request, resonse, chain);
    }

}