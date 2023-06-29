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
import projetomecanica.bean.Conserto;
import projetomecanica.util.ConexaoDB;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class DaoConserto {
    private final Connection c;
    
    public DaoConserto() throws SQLException, ClassNotFoundException{
        this.c = ConexaoDB.getConexaoMySQL();
    }

    public Conserto excluir(Conserto conENt) throws SQLException{
        String sql = "delete from consertos WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,conENt.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return conENt;
    }
    
    public Conserto buscar(Conserto conENt) throws SQLException{
        String sql = "select * from consertos WHERE data_entrada = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setString(1,conENt.getData_entrada());
            // executa
            ResultSet rs = stmt.executeQuery();
            Conserto conSaida = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                conSaida = new Conserto(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getInt(4),
                    rs.getString(5),
                    rs.getString(6));
            // adiciona o usu à lista de usus
            }
            stmt.close();
        return conSaida;
   }

    public Conserto inserir(Conserto conENt) throws SQLException{
        String sql = "insert into consertos" + " (id_cliente, id_mecanico, id_veiculo, data_entrada, data_entrega)" + " values (?,?,?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setInt(1,conENt.getId_cliente());
        stmt.setInt(2,conENt.getId_mecanico());
        stmt.setInt(3,conENt.getId_veiculo());
        stmt.setString(4,conENt.getData_entrada());
        stmt.setString(5,conENt.getData_entrega());


        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            conENt.setId(id);
        }
        stmt.close();
        return conENt;
    }

    public Conserto alterar(Conserto conENt) throws SQLException{
        String sql = "UPDATE consertos SET id_cliente = ?, id_mecanico = ?, id_veiculo = ?, data_entrada = ?, data_entrega = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,conENt.getId_cliente());
        stmt.setInt(2,conENt.getId_mecanico());
        stmt.setInt(3,conENt.getId_veiculo());
        stmt.setString(4,conENt.getData_entrada());
        stmt.setString(5,conENt.getData_entrega());
        stmt.setInt(6,conENt.getId());

        // executa
        stmt.execute();
        stmt.close();
        return conENt;
    }

   public List<Conserto> listar(Conserto conENt) throws SQLException{
        // usus: array armazena a lista de registros

        List<Conserto> listaCons = new ArrayList<>();
        
        String sql = "select * from consertos";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            Conserto cons = new Conserto(
                rs.getInt(1),
                rs.getInt(2),
                rs.getInt(3),
                rs.getInt(4),
                rs.getString(5),
                rs.getString(6)
            );
            // adiciona o usu à lista de usus
            listaCons.add(cons);
        }
        
        rs.close();
        stmt.close();
        return listaCons;
   
   }
}
