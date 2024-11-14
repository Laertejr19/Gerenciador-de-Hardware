package br.com.DAO;

import br.com.DTO.EquipamentoDTO;
import br.com.DTO.UsuarioDTO;
import br.com.VIEWS.TelaLogin;
import br.com.VIEWS.TelaPrincipal;
import br.com.VIEWS.TelaUsuarios;
import br.com.VIEWS.CadastroMaquinas;
import java.sql.*;
import javax.swing.JOptionPane;

public class EquipamentoDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void criarEquip(EquipamentoDTO dto) {
 String sql = "insert into equipamento (id, nome, status)value(?,?,?,?) ";
        conexao = ConexaoDAO.connector();

        try {
            pst = conexao.prepareStatement(sql);

            pst.setInt(1, dto.getIdMaq());
            pst.setString(2, dto.getNome_maquina());
            pst.setString(3, dto.getStatus());
            
            int go = pst.executeUpdate();
            
            if(go > 0){
            JOptionPane.showMessageDialog(null, "adicionado com sucesso");
        }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    

    public void pesqEquip(EquipamentoDTO dto) {
String sql = "select * from equipamento where id = ?";

        conexao = ConexaoDAO.connector();

        try {

            pst = conexao.prepareStatement(sql);

            pst.setInt(1, dto.getIdMaq());
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
    

    public void updateEquip(UsuarioDTO dto) {
int res = JOptionPane.showConfirmDialog(null, "tem certeza que quer atualizar o equipamento?",
                null, JOptionPane.YES_NO_OPTION);

        if (res == JOptionPane.YES_OPTION) {

            String sql = "update equipamento set nome = ?,  = ?,  = ? where id_maquina = ?";
            conexao = ConexaoDAO.connector();

            try {
                pst = conexao.prepareStatement(sql);

                pst.setString(1, dto.getNome());
                pst.setString(2, dto.getTipo_user());
                pst.setString(3, dto.getSenha());
                pst.setInt(4, dto.getId());

                int go = pst.executeUpdate();

                if (go > 0) {
                   
                   
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "erro ao alterar");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public void deletarEquip(EquipamentoDTO dto) {
int res = JOptionPane.showConfirmDialog(null, "tem certeza que quer deletar o equipamento?",
                null, JOptionPane.YES_NO_OPTION);

        if (res == JOptionPane.YES_OPTION) {

            String sql = "delete from equipamento where id = ?";

            conexao = ConexaoDAO.connector();

            try {
                pst = conexao.prepareStatement(sql);

                pst.setInt(1, dto.getIdMaq());

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
