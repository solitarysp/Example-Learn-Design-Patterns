package com.lethanh98.singleton;

public class ConvertUntilCach2 {
    // tạo 1 class truy cập toàn cầu
    private static ConvertUntilCach2 convertUntil2;

    //tạo contractor là private để k cho tạo thêm object từ bên ngoài
    private ConvertUntilCach2() {
    }

    //lấy về thể hiện duy nhất getInstance và nếu chưa có thể hiện thì sẽ tạo mới và phải đồng bộ để khi đó chỉ có 1 thread đc truy cập
    public static ConvertUntilCach2 getInstance() {
        if (convertUntil2 == null) {
            synchronized (ConvertUntilCach2.class) {
                if (convertUntil2 == null) {
                    convertUntil2 = new ConvertUntilCach2();
                }
            }
        }
        return convertUntil2;
    }

    //cách method để sử dụng
    public Integer convertStringToNumber(String strNumber) {
        return Integer.valueOf(strNumber);
    }
}
