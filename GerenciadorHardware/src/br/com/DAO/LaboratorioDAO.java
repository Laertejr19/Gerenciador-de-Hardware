/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.DTO.LaboratorioDTO;
import br.com.DTO.UsuarioDTO;
import br.com.VIEWS.CadastroMaquinas;
import br.com.VIEWS.TelaLogin;
import br.com.VIEWS.TelaUsuarios;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author W10
 */
public class LaboratorioDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void criarLab(LaboratorioDTO dto) {
String sql = "insert into laboratorio (id_laboratorio, nome_laboratorio)value(?,?) ";
        conexao = ConexaoDAO.connector();

        try {
            pst = conexao.prepareStatement(sql);

            pst.setInt(1, dto.getIdLab());
            pst.setString(2, dto.getNomeLab());
          
            
            int go = pst.executeUpdate();
            
            if(go > 0){
            JOptionPane.showMessageDialog(null, "adicionado com sucesso");
        }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    

    public void PesqLab(LaboratorioDTO dto) {
String sql = "select * from laboratorio where id = ?";

        conexao = ConexaoDAO.connector();

        try {

            pst = conexao.prepareStatement(sql);

            pst.setInt(1, dto.getIdLab());
            rs = pst.executeQuery();

            if (rs.next()) {

                CadastroMaquinas.txtRamMaq.setText(rs.getString(2));
                CadastroMaquinas.txtProMaq.setText(rs.getString(3));
                CadastroMaquinas.txtLabMaq.setText(rs.getString(4));
                CadastroMaquinas.txtDataMaq.setText(rs.getString(5));
                CadastroMaquinas.txtLocalizaçãoMaq.setText(rs.getString(6));
            } else {

            }

        } catch (Exception e) {

        }
    }
    

 
    public void deletarLab(LaboratorioDTO dto) {
int res = JOptionPane.showConfirmDialog(null, "tem certeza que quer deletar o equipamento?",
                null, JOptionPane.YES_NO_OPTION);

        if (res == JOptionPane.YES_OPTION) {

            String sql = "delete from laboratorio where id = ?";

            conexao = ConexaoDAO.connector();

            try {
                pst = conexao.prepareStatement(sql);

                pst.setInt(1, dto.getIdLab());

                int go = pst.executeUpdate();

                if (go > 0) {
                    
                   
                    JOptionPane.showMessageDialog(null, "deletado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "erro ao deletar");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
    }

    public void limparCampos() {

    } 
}
