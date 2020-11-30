/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxrectangle;

import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author shubh
 */
public class FxRectangle extends Application {
    private double stageHt, stageWd, midX, midY;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("working with FX rectangle");
        
        //create a group, all GUI elements will be added to this group
        //the group is then added to primaryStage
        Group grp = new Group();
        Scene newScene = new Scene(grp, 450, 400, Color.BURLYWOOD);
        Rectangle rect = new Rectangle();
        stageHt = newScene.getHeight();
        stageWd = newScene.getWidth();
        rect.setHeight(200);
        rect.setWidth(400);
        rect.setFill(Color.AQUAMARINE);
        //put rectangle in the centre
        midX = (stageWd - rect.getWidth()) / 2;
        midY = (stageHt - rect.getHeight()) /2;
        rect.setX(midX);         
        rect.setY(midY);
        grp.getChildren().add(rect);
   // Rectangle rect = new Rectangle (100, 40, 100, 100);
    // rect.setArcHeight(50);
    // rect.setArcWidth(50);
 
     FillTransition ft = new FillTransition(Duration.millis(3000), rect, Color.RED, Color.BLUE);
     ft.setCycleCount(4);
     ft.setAutoReverse(true);
 
     ft.play();
        
        primaryStage.setScene(newScene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
