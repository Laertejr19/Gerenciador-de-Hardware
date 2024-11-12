package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import br.com.VIEWS.TelaLogin;
import br.com.VIEWS.TelaUsuarios;
import br.com.VIEWS.TelaPrincipal;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author W10
 */
public class UsuarioDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void criarUsu(UsuarioDTO dto) {
        String sql = "insert into usuario (id_usuario, nome, senha, tipo_user)value(?,?,?,?) ";
        conexao = ConexaoDAO.connector();

        try {
            pst = conexao.prepareStatement(sql);

            pst.setInt(1, dto.getId());
            pst.setString(2, dto.getNome());
            pst.setString(3, dto.getSenha());
            pst.setString(4, dto.getTipo_user());
            
            int go = pst.executeUpdate();
            
            if(go > 0){
            JOptionPane.showMessageDialog(null, "adicionado com sucesso");
        }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void logar(UsuarioDTO dto) {
        String sql = "select * from tb_usuarios where nome_usuario = ? and senha = ?";

        conexao = ConexaoDAO.connector();

        try {

            pst = conexao.prepareStatement(sql);

            pst.setInt(1, dto.getId());
            pst.setString(2, dto.getNome());
            pst.setString(2, dto.getSenha());
            pst.setString(2, dto.getTipo_user());
            rs = pst.executeQuery();

            if (rs.next()) {

            } else {
                JOptionPane.showMessageDialog(null, "nome de usuario e/ ou senha invalidas");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }

    public void search(UsuarioDTO dto) {
        String sql = "select * from usuario where id = ?";

        conexao = ConexaoDAO.connector();

        try {

            pst = conexao.prepareStatement(sql);

            pst.setInt(1, dto.getId());
            rs = pst.executeQuery();

            if (rs.next()) {

                TelaUsuarios.txtNome.setText(rs.getString(2));
                TelaUsuarios.txtUsuario.setText(rs.getString(3));
                TelaUsuarios.txtNome.setText(rs.getString(4));

            } else {

            }

        } catch (Exception e) {

        }
    }

    public void update(UsuarioDTO dto) {
        int res = JOptionPane.showConfirmDialog(null, "tem certeza que quer atualizar o usuario?",
                null, JOptionPane.YES_NO_OPTION);

        if (res == JOptionPane.YES_OPTION) {

            String sql = "update usuario set nome = ?, senha = ?, tipo_user = ? where id_usuario = ?";
            conexao = ConexaoDAO.connector();

            try {
                pst = conexao.prepareStatement(sql);

                pst.setString(1, dto.getNome());
                pst.setString(2, dto.getTipo_user());
                pst.setString(3, dto.getSenha());
                pst.setInt(4, dto.getId());

                int go = pst.executeUpdate();

                if (go > 0) {
                    limpar();
                   
                    JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "erro ao alterar");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public void deletar(UsuarioDTO dto) {
        int res = JOptionPane.showConfirmDialog(null, "tem certeza que quer deletar o usuario?",
                null, JOptionPane.YES_NO_OPTION);

        if (res == JOptionPane.YES_OPTION) {

            String sql = "delete from usuario where id = ?";

            conexao = ConexaoDAO.connector();

            try {
                pst = conexao.prepareStatement(sql);

                pst.setInt(1, dto.getId());

                int go = pst.executeUpdate();

                if (go > 0) {
                    limpar();
                   
                    JOptionPane.showMessageDialog(null, "deletado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "erro ao deletar");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }

    }

    public void limpar() {
        TelaUsuarios.txtNome.setText(null);
       
        TelaUsuarios.txtNome.setText(null);
        TelaUsuarios.txtUsuario.setText(null);
        TelaUsuarios.txtNome.setText(null);
    }
}
