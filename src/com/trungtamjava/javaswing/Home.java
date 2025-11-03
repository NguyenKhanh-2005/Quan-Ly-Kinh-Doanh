package com.trungtamjava.javaswing;

import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
public class Home extends javax.swing.JFrame {
    private String name;
    ArrayList<giaoDich> dataGiaoDichCaNhan;
    DateTimeFormatter fmt_out=DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public Home(String username) {
        name=username;
        initComponents();
        dataGiaoDichCaNhan=new ArrayList<>();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //  full màn hình
        try(java.sql.Connection conn= DatabaseConnection.getConnection()){
            String sql =String.format("select * from giao_dich\n"
                    + "where userName='%s' and duAn is null",name);
            Statement stt=conn.createStatement();
            java.sql.ResultSet res=stt.executeQuery(sql);
            while(res.next()){
                String ngayTmp=LocalDate.parse(res.getString("ngay"),fmt_out).format(fmt);
                dataGiaoDichCaNhan.add(new giaoDich(res.getString("moTa"),
                        res.getString("loai"),
                        ngayTmp,
                        res.getDouble("soTien"),
                        res.getString("ghiChu")));
//                System.out.print(res.getString("ngay"));
//                System.out.print(res.getString("moTa"));
//                System.out.print(res.getString("loai"));
//                System.out.print(res.getDouble("soTien"));
//                System.out.print(res.getString("ghiChu")); 
            }
        }catch(Exception e){
        System.out.println("wth");}
        this.setLocationRelativeTo(null);
        capNhanBangDGGanday();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonDuAnKinhDoanh = new javax.swing.JButton();
        buttonChiTieuCaNhan = new javax.swing.JButton();
        buttonTongquan = new javax.swing.JButton();
        buttonThongTin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gdGanDayTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        timKiem = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuDangxuat = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonDuAnKinhDoanh.setBackground(new java.awt.Color(153, 255, 255));
        buttonDuAnKinhDoanh.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonDuAnKinhDoanh.setText("Dự án kinh doanh");
        buttonDuAnKinhDoanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDuAnKinhDoanhActionPerformed(evt);
            }
        });

        buttonChiTieuCaNhan.setBackground(new java.awt.Color(153, 255, 255));
        buttonChiTieuCaNhan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonChiTieuCaNhan.setText("Chi tiêu cá nhân");
        buttonChiTieuCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChiTieuCaNhanActionPerformed(evt);
            }
        });

        buttonTongquan.setBackground(new java.awt.Color(153, 255, 255));
        buttonTongquan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonTongquan.setText("Tổng quan");
        buttonTongquan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTongquanActionPerformed(evt);
            }
        });

        buttonThongTin.setBackground(new java.awt.Color(153, 255, 255));
        buttonThongTin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        buttonThongTin.setText("Thông tin cá nhân");
        buttonThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThongTinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonChiTieuCaNhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonTongquan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonDuAnKinhDoanh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonDuAnKinhDoanh, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonChiTieuCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTongquan, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gdGanDayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại", "Mô tả", "Số tiền", "Ngày", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(gdGanDayTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tìm kiếm:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timKiem)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuDangxuat.setText("Đăng xuất");
        menuDangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDangxuatMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuDangxuat);

        jMenu2.setText("Trang chủ");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTongquanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTongquanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTongquanActionPerformed

    private void buttonThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThongTinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonThongTinActionPerformed

    private void menuDangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDangxuatMouseClicked
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Bạn có chắc chắn muốn đăng xuất không?",
            "Xác nhận đăng xuất",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            new MainFrame().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_menuDangxuatMouseClicked

    private void buttonDuAnKinhDoanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDuAnKinhDoanhActionPerformed
        // TODO add your handling code here:
        new PanelDuAnKinhDoanh(this).setVisible(true);
    }//GEN-LAST:event_buttonDuAnKinhDoanhActionPerformed

    private void buttonChiTieuCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChiTieuCaNhanActionPerformed
           new PanelGiaoDichCaNhan(this,name).setVisible(true);
    }//GEN-LAST:event_buttonChiTieuCaNhanActionPerformed
    
    public void capNhanBangDGGanday(){
        try(java.sql.Connection conn=DatabaseConnection.getConnection()){
            java.sql.Statement stt=conn.createStatement();
            String sql=("select * from giao_dich\n"
                    + "order by ngay desc\n"
                    + "limit 50;");
            java.sql.ResultSet res=stt.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) gdGanDayTable.getModel();
            model.setRowCount(0);
            while(res.next()){
                model.addRow(new Object[]{
                    res.getString("loai"),
                    res.getString("moTa"),
                    res.getDate("ngay").toLocalDate().format(fmt),res.getDouble("soTien"),
                    res.getString("ghiChu")});
            }
        }catch(Exception e){System.out.println("wth3");}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonChiTieuCaNhan;
    private javax.swing.JButton buttonDuAnKinhDoanh;
    private javax.swing.JButton buttonThongTin;
    private javax.swing.JButton buttonTongquan;
    private javax.swing.JTable gdGanDayTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuDangxuat;
    private javax.swing.JTextField timKiem;
    // End of variables declaration//GEN-END:variables
}
