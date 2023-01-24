package servlets.filters;

import java.io.*;
import javax.servlet.*;

public class FilterConnect implements Filter
{
    private FilterConfig config = null;
    private boolean active = false;

    public void init (FilterConfig config) throws ServletException
    {
        this.config = config;
        String act = config.getInitParameter("active");
        if (act != null)
            active = (act.toUpperCase().equals("TRUE"));
    }

    public void doFilter (ServletRequest request, ServletResponse response,
                          FilterChain chain) throws IOException, ServletException
    {
        if (active){
            // Здесь можно вставить код для обработки он выполнется перед кодом самого сервлета
            System.out.println("123");
        }
        chain.doFilter(request, response);
    }

    public void destroy()
    {
        config = null;
    }
}