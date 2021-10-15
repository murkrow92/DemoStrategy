package com.company;

import com.company.strategy.*;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainStrategy {

    public static void main(String[] args) {
        BaseTemplate page = new BaseTemplate();
        page.setSize(300, 500);
        page.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                page.dispose();
            }
        });
        page.getContentPane().setLayout(new BoxLayout(page.getContentPane(), BoxLayout.Y_AXIS));
        page.setVisible(true);

        page.setHeader(new Header1());
        page.setContent(new Content2());
        page.setFooter(new Footer3());
        page.render();


    }


}
