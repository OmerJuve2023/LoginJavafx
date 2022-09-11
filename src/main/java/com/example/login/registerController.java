package com.example.login;

import cargaIma.Imagenes;
import dao.DaoLogin;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class registerController implements Initializable {
    @FXML
    private ImageView registro;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtUsuario;
    @FXML
    private TextField txtContraseña;
    @FXML
    private TextField txtContraseña2;
    @FXML
    private Button btnCancelar;
    @FXML
    private Label lblPass;
    @FXML
    private Label lblregister;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Imagenes imagenes = new Imagenes();
        imagenes.imagenRegister(registro);

    }

    public void CloseButton() {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
        Platform.exit();
    }

    public void setRegistro() {
        lblregister.setText("Registro de Usuario exitoso");
    }

    public void setTxtUsuario() {
        DaoLogin daoLogin = new DaoLogin();
        if (!(txtContraseña.getText().equals("") || txtContraseña2.equals(""))) {

            if (txtContraseña.getText().equals(txtContraseña2.getText())) {
                if (daoLogin.registroUser(txtNombre.getText(), txtApellido.getText(), txtUsuario.getText(),
                        txtContraseña.getText()) == 1) {
                    setRegistro();
                }
            } else {
                lblPass.setText("las contraseñas no coinciden");
            }
        } else {
            lblregister.setText("llenar los campos que faltan");
        }
    }

}
