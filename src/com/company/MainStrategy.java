package com.company;

import com.company.original.Template3;
import com.company.original.TransactionHistoryPage;
import com.company.strategy.*;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainStrategy {

    public static void main(String[] args) {

        Header header = new Header1();
        Content content = new Content1();
        Footer footer = new Footer1();
        JFrame page = new BaseTemplate(header, content, footer);
        page.setSize(300, 500);
        page.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                page.dispose();
            }
        });
        page.getContentPane().setLayout(new BoxLayout(page.getContentPane(), BoxLayout.Y_AXIS));
        page.setVisible(true);

    }


}
