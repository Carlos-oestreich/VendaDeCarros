/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendadecarros.dao;

import com.mycompany.vendadecarros.database.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Aluno
 */
public class UsuarioDao {
    public boolean checarUsuario(String email, String senha)throws Exception{
        String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
        
        try(Connection conn = DataBase.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, email);
            ps.setString(2, senha);
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
}
