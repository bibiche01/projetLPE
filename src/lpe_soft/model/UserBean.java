package lpe_soft.model;

import java.sql.ResultSet;
import java.sql.Connection ;
import java.sql.SQLException;
import java.sql.Statement;
import lpe_soft.Lpe_Soft;

public class UserBean {
    private Connection connection = null;
    
    public boolean Connexion(String login, String password) throws SQLException {
        Lpe_Soft main= new Lpe_Soft();
        connection=main.getConnection();
        try {
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * FROM utilisateur ");
            while (rs.next()) {
                String firstName = rs.getString("Prenom_User");
                String mdp = rs.getString("Mdp");
                if((firstName == null ? login == null : firstName.equals(login)) && (mdp == null ? password == null : mdp.equals(password))){
                    return true;
                }
            }   
        }
        catch(SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }
}
