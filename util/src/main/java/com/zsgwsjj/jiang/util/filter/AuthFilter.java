package com.zsgwsjj.jiang.util.filter;


import com.zsgwsjj.jiang.util.enums.EnumUserError;
import com.zsgwsjj.jiang.util.other.YaoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author : jiang
 * @time : 2018/4/13 14:45
 */
public class AuthFilter implements Filter {

    private Logger logger = LogManager.getLogger(AuthFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        if (!userName.equals("jiang") || !password.equals("123456")) {
            logger.error("auth not pass!username or password error!!");
            throw new YaoException(EnumUserError.PASSWORD_ERROR);
        }
        logger.info("auth pass!!!");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        //
    }
}
