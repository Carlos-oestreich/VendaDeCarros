/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendadecarros.dao;

import com.mycompany.vendadecarros.database.DataBase;
import com.mycompany.vendadecarros.model.Garagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class GaragemDao {
    
    public void adGaragem(Garagem g) throws Exception {
        String sql = "INSERT INTO garagens (nome, pais, estado, cidade, bairro, rua, numero, cep) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try(Connection conn = DataBase.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, g.getNome());
            ps.setString(2, g.getPais());
            ps.setString(3, g.getEstado());
            ps.setString(4, g.getCidade());
            ps.setString(5, g.getBairro());
            ps.setString(6, g.getRua());
            ps.setString(7, g.getNumero());
            ps.setString(8, g.getCep());
            ps.executeUpdate();
        }
    }
    
    public void atualizaGaragem(Garagem g) throws Exception {
        String sql = "UPDATE garagens SET nome = ?, pais = ?, estado = ?, cidade = ?, bairro = ?, rua = ?, numero = ?, cep = ? WHERE id = ?";
        try (Connection conn = DataBase.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, g.getNome());
            ps.setString(2, g.getPais());
            ps.setString(3, g.getEstado());
            ps.setString(4, g.getCidade());
            ps.setString(5, g.getBairro());
            ps.setString(6, g.getRua());
            ps.setString(7, g.getNumero());
            ps.setString(8, g.getCep());
            ps.setInt(9, g.getId());
            ps.executeUpdate();
        }
    }
    
    public List<Garagem> listarGaragem() throws Exception{
        String sql = "SELECT * FROM garagens ORDER BY id DESC";
        
        List<Garagem> lista = new ArrayList<>();
        try (Connection conn = DataBase.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()){
            while (rs.next()){
                Garagem g = new Garagem(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("pais"),
                rs.getString("estado"),
                rs.getString("cidade"),
                rs.getString("bairro"),
                rs.getString("rua"),
                rs.getString("numero"),
                rs.getString("cep")
                );
                lista.add(g);
            }
        }
        return lista;
    }
            
}
