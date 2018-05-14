package QLSV;


public class SinhVien {
   private int iD;
   private String maSV;
   private String hoTen;
   private double diemTB;
   
   
   SinhVien(){
    
       
   }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public SinhVien(int iD, String maSV, String hoTen, double diemTB) {
        this.iD = iD;
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
   
   
}
