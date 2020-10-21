package com.lethanh98.visitor;

public class HtmlElement extends HtmlTag {
    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.tagBody = "";
    }

    @Override
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
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
        System.out.println(startTag+tagBody+endTag);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
