/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartcred.dal;

/**
 *
 * @author AndreLGSilva
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class ModuloConexao {
    public static Connection conector(){
        java.sql.Connection conn = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://192.168.1.114/dbsmartcred";
        String user = "AndreLGSilva";
        String password = "Missoes@3";
        
        try {
            Class.forName(driver); //Executa o arquivo do driver
            conn = DriverManager.getConnection(url, user, password); 
            return conn; //Retorno
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sem conexão ao banco de dados! Por favor entre em contato com o Administrador do Sistema! Erro: " + e);
            return null;
        }
    }    
}
