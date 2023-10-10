/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.banco.crud_pessoas;

import javax.swing.JOptionPane;


public class TestConnection {
    public static void main(String[] args){
        try{
            var factory = new ConnectionFactory();
            var minhaConexao = factory.conectar();
            System.out.println("Conectou!!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não deu certo, coisas ruins acontecem :( \n" + e.getMessage());
            e.printStackTrace();
        }
        
    }
}
