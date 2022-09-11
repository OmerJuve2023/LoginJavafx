package dao;

import data.Mysql;
import javafx.scene.control.Label;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DaoLogin {

    public int  validarLogin(String txtUser, String txtPass, Label Message) {
        Mysql mysql = new Mysql();
        Connection connection = mysql.getConnection();
        String sql = "select * from user_account where username = '" + txtUser +
                "' and password ='" + txtPass + "' ";
        try {
            Statement preparedStatement = connection.createStatement();
            ResultSet query = preparedStatement.executeQuery(sql);
            if (query.next()) {
                return 1;
            } else {
                Message.setText("Usuario o Contraseña incorrecta");
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return 0;
    }

    public int registroUser(String nombre,String apellido,String usuario,String contraseña){
        Mysql conne = new Mysql();
        Connection connection = conne.getConnection();
        String sql="insert into user_account values(?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst= connection.prepareStatement(sql);
            pst.setInt(1,0);
            pst.setString(2,nombre);
            pst.setString(3,apellido);
            pst.setString(4,usuario);
            pst.setString(5,contraseña);
            pst.executeUpdate();
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return 0;
    }
}
