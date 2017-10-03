package com.lampstudio;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet  extends HttpServlet {
    public String name;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getNameCinema("khoa");
        System.out.println("HelloServlet.doGet");
        resp.getWriter().println("Hello, World!");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet " + this.getServletName() + " has started.");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet " + this.getServletName() + " has stopped.");
    }

    /**
     * <br>B1 : nhập thông tin tên
     * <br>B2 : nhập thông tin tên
     *<br>{@linkplain #getNamePerson(String)} (String)}
     *<br>{@linkplain #getNamePerson(String)} bao biến
     * @param content {@link #name}
     * @return
     */
    public String getNameCinema(String content){
        //#tag sads
        String a = "ssssss";
        a = a.replace("sss","ppp");
        return getNamePerson(content);
    }

    private String getNamePerson(String content) {
        return "sss";
    }
}
