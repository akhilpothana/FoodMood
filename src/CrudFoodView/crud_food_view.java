/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudFoodView;

import javax.swing.*;

/**
 *
 * @author Akhil
 */
public class crud_food_view {
    
    JPanel panel;
    JTextField field1;
    String food;
    
    public crud_food_view(String fo)
    {
        field1 = new JTextField(fo);
        food = fo;
    }

    /**
     * 
     * @param f - receives the food string and sends to UI
     * @return f
     */
    String sendInfoToUI(String f)
    {
        return f;
    }
}
