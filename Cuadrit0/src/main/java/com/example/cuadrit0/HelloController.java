package com.example.cuadrit0;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.*;
import javafx.scene.control.Label;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import model.Timer;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Canvas canvas1;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        GraphicsContext gc = canvas1.getGraphicsContext2D();
        canvas1.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                int posX=(int)mouseEvent.getX();
                int posY=(int)mouseEvent.getY();

                //obtener Color
                WritableImage snap = gc.getCanvas().snapshot(null,null);
                Color colorSel= snap.getPixelReader().getColor(posX,posY);

                System.out.println(colorSel.getRed()+"|"+colorSel.getGreen()+'|'+colorSel.getBlue());
                System.out.println(posX+"|"+posY);
            }
        });

        gc.setFill(Color.TOMATO);
        gc.setStroke(Color.BLUEVIOLET);
        //gc.fillRect(0,0,canvas1.getWidth(),canvas1.getHeight());
        int radio=5;
        for (int i = 0; i <= 26; i++) {
            //horizontal
            gc.strokeLine(i*20,0,i*20,canvas1.getHeight());
            //vertical
            gc.strokeLine(0,i*20,canvas1.getWidth(),i*20);
            for (int j = 1; j < 26; j++) {
                if(i!=0 && i!=22 && j!=16){
                    gc.fillOval(i*20-radio,j*20-radio,radio*2,radio*2);
                }
            }
        }

        Timer t1 = new Timer();
        t1.setMinutos(1);
        //t1.start();
    }

}