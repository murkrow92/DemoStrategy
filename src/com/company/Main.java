package com.company;

import com.company.original.Template1;
import com.company.original.Template2;
import com.company.original.Template3;
import com.company.original.TransactionHistoryPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) {
//        TransactionHistoryPage page = new TransactionHistoryPage();
//        TransactionHistoryPage page = new Template1();
//        TransactionHistoryPage page = new Template2();
        TransactionHistoryPage page = new Template3();
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
