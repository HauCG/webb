package com.example.webb.service;

import com.example.webb.model.Account;
import com.example.webb.connection.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private final DatabaseConnection databaseConnection = new DatabaseConnection();

    @Override
    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM Account_View";

        try (Connection connection = databaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Account account = new Account();
                account.setAccount_Type_Id(rs.getInt("Account_Type_Id"));
                account.setAccount_Id(rs.getInt("Account_Id"));
                account.setAccount_Name(rs.getString("Account_Name"));
                account.setAccount_Password(rs.getString("Account_Password"));
                accounts.add(account);


//                System.out.println("Account ID: " + account.getAccount_Id());
//                System.out.println("Account Name: " + account.getAccount_Name());
//                System.out.println("Account Type: " + account.getAccount_Type_Id());
//                System.out.println("Account Password: " + account.getAccount_Password());
//                System.out.println("-------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
        return accounts;
    }
}