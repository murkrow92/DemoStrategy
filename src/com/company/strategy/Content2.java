package com.company.strategy;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Content2 implements Content {

    @Override
    public JPanel renderContent() {
        JPanel content = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        content.setBorder(padding);
        content.setBackground(Color.PINK);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        JButton button = new JButton("Đánh giá");
        content.add(new JLabel("Dịch vụ: Gửi tiền"));
        content.add(new JLabel("Dịch vụ: Gửi tiền"));
        content.add(new JLabel("Dịch vụ: Gửi tiền"));

        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        content.add(button);
        return content;
    }
}
