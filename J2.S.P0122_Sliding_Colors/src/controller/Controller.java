package controller;

import java.awt.Color;
import view.GUI;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Minh Thanh
 */

public class Controller {

    private GUI view;
    private int xRed = 150;
    private int xGreen = 150;
    private int xBlue = 150;

    public Controller() {

        view = new GUI();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        
        view.getSldRed().setValue(xRed);
        view.getSldBlue().setValue(xBlue);
        view.getSldGreen().setValue(xGreen);

        xRed = view.getSldRed().getValue();
        xGreen = view.getSldGreen().getValue();
        xBlue = view.getSldBlue().getValue();

        view.getTxtRed().setForeground(Color.RED);
        view.getTxtBlue().setForeground(Color.BLUE);
        view.getTxtGreen().setForeground(Color.GREEN);

        changeColor();

        view.getSldRed().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                xRed = view.getSldRed().getValue();
                changeColor();
            }
        });

        view.getSldGreen().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                xGreen = view.getSldGreen().getValue();
                changeColor();
            }
        });

        view.getSldBlue().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                xBlue = view.getSldBlue().getValue();
                changeColor();
            }
        });
    }

    public void changeColor() {

        view.getTxtRed().setText("R = " + xRed);
        view.getTxtGreen().setText("G = " + xGreen);
        view.getTxtBlue().setText("B = " + xBlue);

        view.getSldRed().setValue(xRed);
        view.getSldGreen().setValue(xGreen);
        view.getSldBlue().setValue(xBlue);

        view.getTxtDisplay().setBackground(new Color(xRed, xGreen, xBlue));
    }

}
