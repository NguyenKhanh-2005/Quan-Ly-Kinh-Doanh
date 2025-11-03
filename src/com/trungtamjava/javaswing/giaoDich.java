package com.trungtamjava.javaswing;

import java.time.LocalDate;

class GiaoDichChiTieu extends giaoDich {
    private String loaiChi; // ăn uống, mua sắm, giải trí, ...

    public GiaoDichChiTieu(String moTa,String loai,String ngay,double soTien,String ghiChu) {
        super(moTa,loai,ngay, soTien, ghiChu);
        this.soTien=tinhSoTienThuc();
        this.loaiChi = loaiChi;
    }

    @Override
    public double tinhSoTienThuc() {
        return -super.soTien; // vì là chi tiêu → trừ tiền
    }

}

class GiaoDichDauTu extends giaoDich {
    private double loiNhuan;
    private double von;// âm nếu lỗ, dương nếu lời

    public GiaoDichDauTu(String moTa,String loai,String ngay,double soTien,String ghiChu, double loiNhuan,double von) {
        super(moTa, loai, ngay, soTien, ghiChu);
        soTien=tinhSoTienThuc();
        this.loiNhuan = loiNhuan;
        this.von = von;
    }

    @Override
    public double tinhSoTienThuc() {
        return   loiNhuan - von;
    }

}


public class giaoDich {
    private String moTa;
    private String loai;
    private LocalDate ngay;
    protected double soTien;
    private String ghiChu;
    public giaoDich(String moTa,String loai,String ngay,double soTien,String ghiChu){
        this.moTa=moTa;
        this.loai=loai;
        this.ngay=LocalDate.parse(ngay);
        this.soTien=soTien;
        this.ghiChu=ghiChu;
    }
    public String toString(){
        return String.format("%s %s %s %f %s",moTa,loai,ngay.toString(),soTien,ghiChu);
    }
    public String getMoTa() {
        return moTa;
    }

    public String getLoai() {
        return loai;
    }

    public LocalDate getNgay() {
        return ngay;
    }

    public double getSoTien() {
        return soTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }
    
    
    
    public double tinhSoTienThuc(){
        return soTien;
    }
}
