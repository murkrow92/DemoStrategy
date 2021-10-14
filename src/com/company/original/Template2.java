package com.company.original;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Template2 extends TransactionHistoryPage {

    @Override
    protected JPanel renderHeader() {
        JPanel header = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        header.setBorder(padding);
        header.setBackground(Color.BLUE);
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));
        header.add(new JLabel("Dịch vụ: Gửi tiền"));
        return header;
    }

    @Override
    protected JPanel renderContent() {
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
