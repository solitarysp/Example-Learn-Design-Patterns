package com.higgsup.Strategy_pattern.example1_TextFormatter;
//class to upper text formatter implements text formmat
public class ToUpperTextFormatter implements TextFormatter {
    // ghi đề method từ interface và viết thuật toán chuyển tất cả text nhập vào thành chữ hoa.
    @Override
    public void format(String text) {
        System.out.println("[ToUpperTextFormatter]: "+text.toUpperCase());
    }
}
