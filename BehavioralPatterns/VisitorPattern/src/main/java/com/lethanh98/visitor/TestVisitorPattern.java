package com.lethanh98.visitor;

public class TestVisitorPattern {
    public static void main(String[] args) {
        System.out.println("Before visitor......... \\n");
        HtmlTag html = new HtmlParentElement("<html>");
        html.setStartTag("<html>");
        html.setEndTag("</html>");

        HtmlTag body = new HtmlParentElement("<body>");
        body.setStartTag("<body>");
        body.setEndTag("</body>");

        html.addChildTag(body);

        HtmlTag child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testing html tag library");
        body.addChildTag(child1);

        html.generateHtml();
        System.out.println("\n\n\n\n");
        Visitor cssClass = new CssClassVisitor();
        body.accept(cssClass);
        html.generateHtml();

    }
}
