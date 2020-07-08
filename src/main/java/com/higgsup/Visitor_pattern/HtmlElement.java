package com.higgsup.Visitor_pattern;

import java.util.ArrayList;

public class HtmlElement extends HtmlTag {
    private String tagName;
    private String startTag;
    private String endTag;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String getStartTag() {
        return startTag;
    }

    @Override
    public void setStartTag(String startTag) {
        this.startTag = startTag;
    }

    @Override
    public String getEndTag() {
        return endTag;
    }

    @Override
    public void setEndTag(String endTag) {
        this.endTag = endTag;
    }

    @Override
    public void generateHtml() {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
