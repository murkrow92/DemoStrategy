package com.company.strategy;

import javax.swing.*;

public class BaseTemplate extends JFrame {
    private Header header;
    private Content content;
    private Footer footer;

    public BaseTemplate(Header header, Content content, Footer footer) {
        this.header = header;
        this.content = content;
        this.footer = footer;
        this.add(this.header.renderHeader());
        this.add(this.content.renderContent());
        this.add(this.footer.renderFooter());
    }

}
