package com.company.strategy;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Content1 implements Content {

    @Override
    public JPanel renderContent() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        panel.setBorder(padding);
        panel.setBackground(Color.RED);

        JButton button = new JButton("Giao dịch đặt vé");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);

        panel.add(new JLabel("Tổng số tiền 1 : 10.000đ"));
        panel.add(new JLabel("Tổng số tiền 1 : 10.000đ"));
        panel.add(new JLabel("Tổng số tiền 1 : 10.000đ"));
        panel.add(new JLabel("Tổng số tiền 1 : 10.000đ"));


        button = new JButton("Button3");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);
        return panel;
    }
}
