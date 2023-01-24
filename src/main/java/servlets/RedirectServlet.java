package servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RedirectServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        System.out.println ("Версия сервлета : " + config.getInitParameter("version"));

        ServletContext servletContext = config.getServletContext();
        System.out.println ("Используемый Http server is : " + servletContext.getServerInfo());

        System.out.println("init() сработал!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("сработал гет");

        resp.sendRedirect("https://www.google.com");

    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("destroy() Сработал!");
    }
}
