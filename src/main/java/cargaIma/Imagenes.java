package cargaIma;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Imagenes {

    public void imagenPortada(ImageView login, ImageView facultad, ImageView user, ImageView password) {
        File b1 = new File("images/login.png");
        Image image = new Image(b1.toURI().toString());
        login.setImage(image);

        b1 = new File("images/facultad.png");
        image = new Image(b1.toURI().toString());
        facultad.setImage(image);

        b1 = new File("images/user.png");
        image = new Image(b1.toURI().toString());
        user.setImage(image);

        b1 = new File("images/password.png");
        image = new Image(b1.toURI().toString());
        password.setImage(image);
    }

    public void imagenRegister(ImageView registro){
        File b1 = new File("images/registro.png");
        Image ima = new Image(b1.toURI().toString());
        registro.setImage(ima);
    }
}
