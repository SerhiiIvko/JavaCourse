package homework;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class HitCountServletFilter implements Filter {
    private int hitCount;

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        // increase counter by one
        hitCount++;

        // Print the counter.
        System.out.println("Site visits count :" + hitCount);
        request.setAttribute("counter", hitCount);
        // pass the request along the filter chain
        chain.doFilter(request, response);
    }

    public void init(FilterConfig fConfig) throws ServletException {
        // Reset hit counter.
        hitCount = 0;
    }
}