package org.smart.chapter.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * webdemo2
 *
 * @author todayliao
 * @date 2019/1/17
 **/
@WebServlet("/customer_delete")
public class CustomerDeleteServlet extends HttpServlet {
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: 2019/1/17  
    }
}
