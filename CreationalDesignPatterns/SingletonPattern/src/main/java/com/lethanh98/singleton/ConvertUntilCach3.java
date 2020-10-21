package com.lethanh98.singleton;

public class ConvertUntilCach3 {
    // tạo 1 class truy cập toàn cầu
    private static ConvertUntilCach3 convertUntil3;

    //tạo thể hiện khi loading class
    static {
        convertUntil3 = new ConvertUntilCach3();
    }

    //tạo contractor là private để k cho tạo thêm object từ bên ngoài
    private ConvertUntilCach3() {
    }

    //lấy về thể hiện duy nhất getInstance
    public static ConvertUntilCach3 getInstance() {
        return convertUntil3;
    }

    //cách method để sử dụng
    public Integer convertStringToNumber(String strNumber) {
        return Integer.valueOf(strNumber);
    }
}
