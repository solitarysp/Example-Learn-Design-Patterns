package com.higgsup.Strategy_pattern.example1_TextFormatter;

//class texteditor, class sẽ chưa tham chiếu đến TextFormatter interface
public class TextEditor {
    private final TextFormatter textFormatter;
    // chuyền vào một TextFormatter để text sẽ giữ tham chiếu này.
    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    // class chứa publishText sẽ chuyển vào trình định dạng và suất ra định dạng mong muốn
    public void publishText(String text) {
        textFormatter.format(text);
    }
}
