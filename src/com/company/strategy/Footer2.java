package com.company.strategy;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Footer2 implements Footer {
    @Override
    public JPanel renderFooter() {
        JPanel footer = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        footer.setBorder(padding);
        footer.setBackground(Color.PINK);
        footer.setLayout(new BoxLayout(footer, BoxLayout.Y_AXIS));

        JButton button = new JButton("Chụp ảnh màn hình");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        footer.add(button);

        button = new JButton("Trò chuyện");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        footer.add(button);
        return footer;
    }
}
