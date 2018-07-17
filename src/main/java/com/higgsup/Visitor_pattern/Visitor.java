package com.higgsup.Visitor_pattern;

public interface Visitor {
    public void visit(HtmlElement element);

    public void visit(HtmlParentElement parentElement);
}
