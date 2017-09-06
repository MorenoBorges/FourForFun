package Control;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexao 
{
    
//metodos de conexão
    
    public Connection getConnection()
    {
    
    try
    {
        String servidor = "jdbc:mysql://localhost:3306/FourForFun";
        String user = "root";
        String senha = "";
        return DriverManager.getConnection(servidor,user,senha);
    
    }
    catch(SQLException err)
    {
    
    throw new RuntimeException(err);
    
    
    }
    
    
    
    }
    
    
    
    
    
    
}
