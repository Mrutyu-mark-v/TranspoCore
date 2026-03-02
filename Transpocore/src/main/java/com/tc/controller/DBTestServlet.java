package com.tc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import com.tc.dao.DBConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/db-test")
public class DBTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        try (Connection con = DBConnection.getConnection()) {

            if (con != null && !con.isClosed()) {
                out.println("<h2 style='color:green'>✅ DB CONNECTED SUCCESSFULLY</h2>");
            } else {
                out.println("<h2 style='color:red'>❌ DB CONNECTION FAILED</h2>");
            }

        } catch (Exception e) {
            out.println("<h2 style='color:red'>❌ ERROR: " + e.getMessage() + "</h2>");
            e.printStackTrace(out);
        }
    }
}