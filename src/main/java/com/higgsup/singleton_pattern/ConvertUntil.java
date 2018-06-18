package com.higgsup.singleton_pattern;

public class ConvertUntil {
    // tạo 1 class truy cập toàn cầu
    private static ConvertUntil convertUntil = new ConvertUntil();

    //tạo contractor là private để k cho tạo thêm object từ bên ngoài
    private ConvertUntil() {
    }

    //lấy về thể hiện duy nhất getInstance
    public static ConvertUntil getInstance() {
        return convertUntil;
    }

    //cách method để sử dụng
    public Integer convertStringToNumber(String strNumber) {
        return Integer.valueOf(strNumber);
    }
}
