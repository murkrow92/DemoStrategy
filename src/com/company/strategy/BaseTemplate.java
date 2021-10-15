package com.company.strategy;

import javax.swing.*;

public class BaseTemplate extends JFrame {
    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    private Header header;
    private Content content;
    private Footer footer;

    public BaseTemplate() {
        this.header = new Header1();
        this.content = new Content1();
        this.footer = new Footer1();
    }

    public void render() {
        this.add(this.header.renderHeader());
        this.add(this.content.renderContent());
        this.add(this.footer.renderFooter());
    }

}
