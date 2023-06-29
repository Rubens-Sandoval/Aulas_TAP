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
import projetomecanica.bean.Veiculo;
import projetomecanica.util.ConexaoDB;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class DaoVeiculo {
    private final Connection c;
    
    public DaoVeiculo() throws SQLException, ClassNotFoundException{
        this.c = ConexaoDB.getConexaoMySQL();
    }

    public Veiculo excluir(Veiculo vENt) throws SQLException{
        String sql = "delete from veiculos WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,vENt.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return vENt;
    }
    
    public Veiculo buscar(Veiculo vENt) throws SQLException{
        String sql = "select * from veiculos WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,vENt.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            Veiculo vSaida = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                vSaida = new Veiculo(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5));
            // adiciona o usu à lista de usus
            }
            stmt.close();
        return vSaida;
   }

    public Veiculo inserir(Veiculo vEnt) throws SQLException{
        String sql = "insert into veiculos" + " (id_cliente, modelo, placa, defeito)" + " values (?,?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setInt(1,vEnt.getId_cliente());
        stmt.setString(2,vEnt.getModelo());
        stmt.setString(3,vEnt.getPlaca());
        stmt.setString(4,vEnt.getDefeito());


        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            vEnt.setId(id);
        }
        stmt.close();
        return vEnt;
    }

    public Veiculo alterar(Veiculo vEnt) throws SQLException{
        String sql = "UPDATE veiculos SET id_cliente = ?, modelo = ?, placa = ?, defeito = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,vEnt.getId_cliente());
        stmt.setString(2,vEnt.getModelo());
        stmt.setString(3,vEnt.getPlaca());
        stmt.setString(4,vEnt.getDefeito());
        stmt.setInt(5,vEnt.getId());

        // executa
        stmt.execute();
        stmt.close();
        return vEnt;
    }

   public List<Veiculo> listar(Veiculo vEnt) throws SQLException{
        // usus: array armazena a lista de registros

        List<Veiculo> listav = new ArrayList<>();
        
        String sql = "select * from veiculos";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            Veiculo v = new Veiculo(
                rs.getInt(1),
                rs.getInt(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5)
            );
            // adiciona o usu à lista de usus
            listav.add(v);
        }
        
        rs.close();
        stmt.close();
        return listav;
   
   }
}
