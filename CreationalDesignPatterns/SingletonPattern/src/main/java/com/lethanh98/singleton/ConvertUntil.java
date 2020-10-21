package com.lethanh98.singleton;

import java.util.Objects;

public class ConvertUntil {
    // tạo 1 class truy cập toàn cầu
    private static ConvertUntil convertUntil;

    //tạo contractor là private để k cho tạo thêm object từ bên ngoài
    private ConvertUntil() {
    }

    //lấy về thể hiện duy nhất getInstance
    public static ConvertUntil getInstance() {
        if (Objects.isNull(convertUntil)) {
            synchronized (ConvertUntil.class) {
                if (Objects.isNull(convertUntil)) {
                    convertUntil = new ConvertUntil();
                }
            }
        }
        return convertUntil;
    }

    //cách method để sử dụng
    public Integer convertStringToNumber(String strNumber) {
        return Integer.valueOf(strNumber);
    }
}
