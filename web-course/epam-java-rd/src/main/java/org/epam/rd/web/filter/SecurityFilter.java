package org.epam.rd.web.filter;

import org.epam.rd.config.SecurityConfig;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Set;


public class SecurityFilter implements Filter {

    private SecurityConfig securityConfig = new SecurityConfig();

    public void init(FilterConfig filterConfig) throws ServletException {
        //nothing to init
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String url = httpRequest.getRequestURL().toString();
        if (shouldBeProtected(url)) {
            HttpSession session = httpRequest.getSession();
            if (session == null || session.getAttribute("user") == null) {
                httpResponse.sendRedirect("/welcome.jsp");
            }
        }
        chain.doFilter(request, response);
    }

    public void destroy() {
        //nothing to release
    }

    private boolean shouldBeProtected(String url) {
        Set<String> protectedURLs = securityConfig.getProtectedURLs();
        return protectedURLs.stream().anyMatch(url::endsWith);
    }
}
