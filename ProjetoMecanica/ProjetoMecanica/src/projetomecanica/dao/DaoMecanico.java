/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import projetomecanica.bean.Mecanico;
import projetomecanica.util.ConexaoDB;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class DaoMecanico {

    private final Connection c;
    
    public DaoMecanico() throws SQLException, ClassNotFoundException{
        this.c = ConexaoDB.getConexaoMySQL();
    }

    public Mecanico excluir(Mecanico mecEnt) throws SQLException{
        String sql = "delete from mecanicos WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,mecEnt.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return mecEnt;
    }
    
    public Mecanico buscar(Mecanico mecEnt) throws SQLException{
        String sql = "select * from mecanicos WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,mecEnt.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            Mecanico mecSaida = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                mecSaida = new Mecanico(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4));
            // adiciona o usu à lista de usus
            }
            stmt.close();
        return mecSaida;
   }

    public Mecanico inserir(Mecanico mecEnt) throws SQLException{
        String sql = "insert into mecanicos" + " (nome, cpf, ctt)" + " values (?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setString(1,mecEnt.getNome());
        stmt.setString(2,mecEnt.getCpf());
        stmt.setString(3,mecEnt.getCtt());

        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            mecEnt.setId(id);
        }
        stmt.close();
        return mecEnt;
    }

    public Mecanico alterar(Mecanico mecEnt) throws SQLException{
        String sql = "UPDATE mecanicos SET nome = ?, cpf = ?, ctt = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,mecEnt.getNome());
        stmt.setString(2,mecEnt.getCpf());
        stmt.setString(3,mecEnt.getCtt());
        stmt.setInt(4,mecEnt.getId());

        // executa
        stmt.execute();
        stmt.close();
        return mecEnt;
    }

   public List<Mecanico> listar(Mecanico mecEnt) throws SQLException{
        // usus: array armazena a lista de registros

        List<Mecanico> listamecs = new ArrayList<>();
        
        String sql = "select * from mecanicos";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            Mecanico pes = new Mecanico(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4)
            );
            // adiciona o usu à lista de usus
            listamecs.add(pes);
        }
        
        rs.close();
        stmt.close();
        return listamecs;
   
   }
    
}
