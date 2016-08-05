/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author adils
 */
public class ConexaoPostgreSQL {
    
    private static Connection con;
    private String user;
    private String password;
    private String url;

    public ConexaoPostgreSQL() throws SQLException {
        this.user = "postgres";
        this.password = "Ad19sa92co";
        this.url = "jdbc:postgresql://localhost:5432/BUSINESS_MANAGEMENT";
        this.con = DriverManager.getConnection(url, user, password);
    }

    public final Connection getCon() {
        return con;
    }

}
