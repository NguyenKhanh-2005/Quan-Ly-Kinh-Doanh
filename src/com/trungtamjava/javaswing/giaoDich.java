package com.trungtamjava.javaswing;

import java.time.LocalDate;

public class giaoDich {
    String moTa;
    String loai;
    LocalDate ngay;
    double soTien;
    String ghiChu;
    public giaoDich(String moTa,String loai,String ngay,double soTien,String ghiChu){
        this.moTa=moTa;
        this.loai=loai;
        this.ngay=LocalDate.parse(ngay);
        this.soTien=soTien;
        this.ghiChu=ghiChu;
    }
}
