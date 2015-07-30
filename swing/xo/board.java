/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author akshaya
 */
public class board implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton();
    JButton [][] buttonList = new JButton [3][3];
    int width = 100;
    int turn = 0;
    
    public void start(){
        frame.setVisible(true);
        frame.setSize(303,403);
        frame.setLayout(null);
 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                buttonList[i][j] = new JButton();
                buttonList[i][j].setBounds(width*i, width*j, width, width);
                buttonList[i][j].addActionListener(this);
                turn++;
                
                frame.add(buttonList[i][j]);
            }
        }
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked ..");
        ((JButton)e.getSource()).setText(""+turn%2);
        turn++;
        checkWon();
    }
    
    public void checkWon(){
     //code to check if won   
    }
}

