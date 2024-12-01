package com.example.webb.controller;


import com.example.webb.model.Account;
import com.example.webb.service.AccountService;
import com.example.webb.service.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AccountController", urlPatterns = "/accounts")
public class AccountController extends HttpServlet {
    private final AccountService accountService = new AccountServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "listAccounts";
        }
        switch (action) {
            case "listAccounts":
                listAccounts(request, response);
                break;

            default:
                listAccounts(request, response);
                break;
        }
    }

    private void listAccounts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        List<Account> accounts = accountService.getAllAccounts();
        request.setAttribute("accounts", accounts);
        request.getRequestDispatcher("/login/listAccounts.jsp").forward(request, response);
    }
}
