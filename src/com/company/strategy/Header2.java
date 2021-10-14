package com.company.strategy;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Header2 implements Header {

    @Override
    public JPanel renderHeader() {
        JPanel header = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        header.setBorder(padding);
        header.setBackground(Color.GREEN);
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));
        header.add(new JLabel("Khuyến mại 1: 1099.000đ"));
        header.add(new JLabel("Khuyến mại 2: 100999.000đ"));
        return header;
    }
}
