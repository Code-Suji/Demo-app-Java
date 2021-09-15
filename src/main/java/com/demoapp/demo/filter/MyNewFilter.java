package com.demoapp.demo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
@Component
public class MyNewFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("The New Filter Is Called !!!!!!!!!!!!!!!");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
