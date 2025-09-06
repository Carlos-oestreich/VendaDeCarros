/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendadecarros.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aluno
 */
public class DataBase {
    private static final String URL = "jdbc:mysql://localhost:3306/bd_garagens";
    
    private static final String USER = "root";
    
    private static final String PASSWORD = "root";
    
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
