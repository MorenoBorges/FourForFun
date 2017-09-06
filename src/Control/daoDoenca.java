package Control;
import java.sql.*;
import Model.doenca;
import View.Ver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class daoDoenca {
     private Connection connection;
     
    //definindo metodos
    public daoDoenca(){
        this.connection = new Conexao().getConnection();
    }
    public void Incluir(doenca d)
    {
        String sql ="INSERT INTO doenca (nome, estacao) VALUES (?,?);";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, d.getNome());
            stmt.setString(2, d.getEstacao());
            stmt.execute();   
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void Consultar(doenca d){
        Ver ver = new Ver();
        String sql = "select * from doenca where estacao = ?";
		try (PreparedStatement statement = connection.prepareStatement(sql)){
                        statement.setString(1, d.getEstacao());
			ResultSet result = statement.executeQuery();
                        while(result.next()){
                            DefaultTableModel tabela = tabela = (DefaultTableModel) ver.jTable1.getModel();
                            int i = tabela.getRowCount()+1;
                            Object dados[] = {result.getString("nome"), result.getString("estacao")};
                            tabela.addRow(dados);
                        }
			
		}catch(SQLException e){
			e.printStackTrace();
		}
    }
}
    

