package Model;

import Controller.HelloApplication;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Field {
    final static int Gridend = 600;
    final static int Grid_Rectangle = 20;
    int grid_change = 0;

    public Field(AnchorPane background, HBox cards, AnchorPane menue, AnchorPane cards_background){

        for (int i = 0; i <= Gridend; i = i+20){
            HBox h = new HBox();
            h.setLayoutX(0);
            h.setLayoutY(i);
            h.setPrefHeight(Grid_Rectangle);
            h.setPrefWidth(background.getWidth());

            for (int j = 0; j < 420; j = j+20) {
                Rectangle r = new Rectangle();
                r.setX(j);
                r.setY(h.getLayoutY());
                r.setWidth(Grid_Rectangle);
                r.setHeight(Grid_Rectangle);

                if(grid_change % 2 == 0) {
                    r.setFill(Color.web("#9dba4c"));
                }else {
                    r.setFill(Color.web("#a5c349"));
                }
                grid_change++;
                h.getChildren().add(r);
            }
            background.getChildren().add(h);
        }

        Image i = new Image(String.valueOf(Field.class.getResource("menue.png")));
        ImageView iv = new ImageView(i);
        iv.fitHeightProperty().bind(menue.heightProperty());
        System.out.println(cards.heightProperty());
        iv.fitWidthProperty().bind(menue.widthProperty());
        menue.getChildren().add(iv);

        Image i2 = new Image(String.valueOf(Field.class.getResource("wood.png")));
        ImageView iv2 = new ImageView(i2);
        iv2.fitHeightProperty().bind(cards_background.heightProperty());
        iv2.fitWidthProperty().bind(cards_background.widthProperty());
        cards_background.getChildren().add(iv2);

    }
}
