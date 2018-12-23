package homework;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class HitCountServletFilter implements Filter {
    private int hitCount;

    public void init(FilterConfig fConfig) {
        hitCount = 0;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        hitCount++;
        request.setAttribute("counter", hitCount);
        chain.doFilter(request, response);
    }

    public void destroy() {
        //do something
    }
}