package com.mahadi.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Mahadi on 10/25/2017.
 */
@WebFilter(filterName = "springSecurityFilterChain")
public class DelegatingFilterProxy implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println(((HttpServletRequest) req).getRequestURI());
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
