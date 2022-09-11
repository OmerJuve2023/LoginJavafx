package com.example.login;

import cargaIma.Imagenes;
import dao.DaoLogin;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button CancelButton;
    @FXML
    private Label loginMessage;
    @FXML
    private ImageView login;
    @FXML
    private ImageView facultad;
    @FXML
    private TextField txtUser;
    @FXML
    private PasswordField txtPass;
    @FXML
    private ImageView user;
    @FXML
    private ImageView password;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Imagenes imagenes=new Imagenes();
        imagenes.imagenPortada(login,facultad,user,password);

    }

    public void setCancelButton() {
        Stage stage = (Stage) CancelButton.getScene().getWindow();
        stage.close();
    }

    public void setLoginButton() {
        DaoLogin daoLogin = new DaoLogin();
        if (daoLogin.validarLogin(txtUser.getText(), txtPass.getText(), loginMessage) == 1) {
            createAccounForm();
        }
    }

    public void createAccounForm() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root, 520, 605));
            stage.show();
            System.out.println("si entra por aca");
        } catch (Exception e) {
            System.out.println("fallo interfaz Account Form");
        }
    }

}