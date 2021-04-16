/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrolle.banktransferv3.controllers;

import com.rrolle.banktransferv3.models.User;
import com.rrolle.banktransferv3.services.UserService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User controller that acts as the servlet.
 * @author jrice
 */
@WebServlet(
  name = "UserController", 
  urlPatterns = "/user-record")
public class UserController extends HttpServlet {
    
    private UserService userService;
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

        String studentID = request.getParameter("id");
        if (studentID != null) {
            int id = Integer.parseInt(studentID);
            User user = userService.getUser(id);
            if (user != null) {
                request.setAttribute("userRecord", user);
            } else {
                request.setAttribute("userRecord", "");
            }
        }
        
        request.setAttribute("id", "123");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/user-record.jsp");
        dispatcher.forward(request, response);
    }    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
        
        processRequest(request, response);
    }    
}
