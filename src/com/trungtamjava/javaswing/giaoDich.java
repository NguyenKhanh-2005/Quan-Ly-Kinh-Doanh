package com.trungtamjava.javaswing;

import java.time.LocalDate;

public class giaoDich {
    String moTa;
    String loai;
    LocalDate ngay;
    double soTien;
    public giaoDich(String moTa,String loai,String ngay,double soTien){
        this.moTa=moTa;
        this.loai=loai;
        this.ngay=LocalDate.parse(ngay);
        this.soTien=soTien;
    }
}
