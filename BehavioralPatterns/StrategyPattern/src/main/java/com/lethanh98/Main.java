package com.lethanh98;

/**
 * các format văn bản khác nhau sẽ được tạo ra bởi trình văn bản khác nhau do các trình format khác nhau được sử dụng
 */
public class Main {
    public static void main(String[] args) {

        //toUpper
        //tạo ToUpperTextFormatter class
        ToUpperTextFormatter toUpperTextFormatter = new ToUpperTextFormatter();
        //gán nó vào TextEditor để TextEditor giữ
        TextEditor textEditorForToUpper = new TextEditor(toUpperTextFormatter);
        //dùng TextEditor gọi đến publishText và lấy về format
        textEditorForToUpper.publishText("Lê Văn Thành");

        //Lower
        //tạo LowerTextFormatter class
        LowerTextFormatter lowerTextFormatter = new LowerTextFormatter();
        //gán nó vào TextEditor để TextEditor giữ
        TextEditor textEditorForLowerText = new TextEditor(lowerTextFormatter);
        //dùng TextEditor gọi đến publishText và lấy về format
        textEditorForLowerText.publishText("Lê Văn Thành");
    }
}
