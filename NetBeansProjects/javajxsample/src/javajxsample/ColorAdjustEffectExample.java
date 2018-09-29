/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxsample;

import java.awt.Rectangle;
import javafx.application.Application;
import javafx.scene.effect.ColorInput;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class ColorAdjustEffectExample extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        //Creating a rectangle
        Rectangle rectangle = new Rectangle();
        
        //Instantiating the Colorinput class
        ColorInput colorInput = new ColorInput();
        
        //Setting the coorfinates of the color input
        colorInput.setX(50);
        colorInput.setY(140);
        
        //Setting the height of the region of the collor input
        colorInput.setHeight(50);
        colorInput.setWidth(400);
        
        //Setting the color the color input
        colorInput.setPaint(Color.CHOCOLATE);
        
        //Applying coloradjust effect to the Rectangle
    }
    
}
