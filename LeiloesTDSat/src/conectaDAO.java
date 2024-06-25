
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    public Connection connectDB() {
        Connection conn = null ;
        try {
            // URL do banco de dados, usuário e senha
            String url = "jdbc:mysql://localhost:3306/leiloes?useSSL=false";
            String user = "root";
            String password = "mysql";

            // Conectar ao banco de dados
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            // Exibir mensagem de erro se a conexão falhar
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return conn;
    }
    
}
