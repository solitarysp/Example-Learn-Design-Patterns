package com.higgsup.Strategy_pattern.example1_TextFormatter;
//class lower text implements từ text format
public class LowerTextFormatter  implements TextFormatter{
    // ghi đề mehtod từ interface và viết thuật toán để chuyển tát cả chữ thành chữ thường.
    @Override
    public void format(String text) {
        System.out.println("[LowerTextFormatter]: "+text.toLowerCase());
    }
}
