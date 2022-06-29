package Controller;

import Model.Field;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import javafx.scene.shape.Rectangle;

public class ControllerGamePlay {

    @FXML
    private AnchorPane background;

    @FXML
    private AnchorPane game;

    @FXML
    private Rectangle tower_enemy_main;

    @FXML
    private Rectangle tower_enemy_right;

    @FXML
    private Rectangle tower_main_left;

    @FXML
    private AnchorPane menue;

    @FXML
    private AnchorPane cards_background;


    @FXML
    private HBox cards_back;

    public void initialize(){
        Field f = new Field(background, cards_back, menue, cards_background);


    }


}
