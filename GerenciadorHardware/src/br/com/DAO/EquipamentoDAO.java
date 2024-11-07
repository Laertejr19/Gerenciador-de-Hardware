
package br.com.DAO;

import br.com.DTO.EquipamentoDTO;
import br.com.VIEWS.TelaPrincipal;
import java.security.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class EquipamentoDAO {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public int criarELogar(EquipamentoDTO dto) {
        String sql = "insert into tb_usuarios (nome, email, nome_usuario, senha)value(?,?,?,?) ";
        conexao = ConexaoDAO.connector();

        try {

            pst = conexao.prepareStatement(sql);

            pst.setString(1, dto.getNome());
            pst.setString(2, dto.getLaboratorio());
            pst.setString(3, dto.getProcessador());
            pst.setString(4, dto.getRam());

            int go = pst.executeUpdate();

            if (go > 0) {

                JOptionPane.showMessageDialog(null, "adicionado com sucesso, seja bem vindo! ");

                TelaPrincipal pri = new TelaPrincipal();
                pri.setVisible(true);
                return 1;

            } else {
                return 0;
            }

        } catch (Exception e) {

            if (e.getMessage().contains("tb_usuarios.nome_usuario_UNIQUE")) {

                JOptionPane.showMessageDialog(null, "nome de usuario ja em uso");
                return 0;

            } else if (e.getMessage().contains("tb_usuarios.email")) {

                JOptionPane.showMessageDialog(null, "email ja em uso");
                return 0;

            } else {

                JOptionPane.showMessageDialog(null, e.getMessage());
                return 0;
            }

        }
    }
    
}
