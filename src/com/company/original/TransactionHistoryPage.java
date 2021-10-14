package com.company.original;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TransactionHistoryPage extends JFrame {
    public TransactionHistoryPage() {
        JPanel header = this.renderHeader();
        this.add(header);
        JPanel content = this.renderContent();
        this.add(content);
        JPanel footer = this.renderFooter();
        this.add(footer);
    }

    protected JPanel renderHeader() {
        JPanel header = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        header.setBorder(padding);
        header.setBackground(Color.RED);
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));
        header.add(new JLabel("Tổng số tiền 1 : 10.000đ"));
        header.add(new JLabel("Tổng số tiền 2 : 100.000đ"));
        return header;
    }

    protected JPanel renderContent() {
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

    protected JPanel renderFooter() {
        JPanel footer = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        footer.setBorder(padding);
        footer.setBackground(Color.RED);
        footer.setLayout(new BoxLayout(footer, BoxLayout.Y_AXIS));

        JButton button = new JButton("Chia sẻ");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        footer.add(button);

        button = new JButton("Trang chủ");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        footer.add(button);


        return footer;
    }
}
