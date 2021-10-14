package com.company.original;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Template3 extends TransactionHistoryPage {

    @Override
    protected JPanel renderHeader() {
        JPanel header = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        header.setBorder(padding);
        header.setBackground(Color.GREEN);
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));
        header.add(new JLabel("Khuyến mại 1: 1099.000đ"));
        header.add(new JLabel("Khuyến mại 2: 100999.000đ"));
        return header;
    }

    @Override
    protected JPanel renderFooter() {
        JPanel footer = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        footer.setBorder(padding);
        footer.setBackground(Color.YELLOW);
        footer.setLayout(new BoxLayout(footer, BoxLayout.Y_AXIS));

        JButton button = new JButton("Trang chủ");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        footer.add(button);

        button = new JButton("Trò chuyện");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        footer.add(button);
        return footer;
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
