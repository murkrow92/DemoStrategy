package com.company.strategy;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Header1 implements Header {

    @Override
    public JPanel renderHeader() {
        JPanel header = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        header.setBorder(padding);
        header.setBackground(Color.RED);
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));
        header.add(new JLabel("Tổng số tiền 1 : 10.000đ"));
        header.add(new JLabel("Tổng số tiền 2 : 100.000đ"));
        return header;
    }
}
