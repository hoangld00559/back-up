/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MyPC
 */
public class NhanVien {
    String maNV;
    int soSP;
    
    public NhanVien(){
    }
    public NhanVien(String ma, int sp){
        maNV = ma;
        soSP = sp;
    }
    public String getMaNV(){
        return maNV;
    }
    public void setMaNV(String ma){
        maNV = ma;
    }
    public int getSoSP(){
        return soSP;
    }
    public void setSoSP(int sp){
        soSP = sp;
    }
    
    public boolean coVuotChuan(){
        return (soSP > 500);
    }
    
    public String getTongket(){
        if(soSP > 500){
            return "Vuot";
        }
        return "";
    }
    
    public int getLuong(){
        if(this.coVuotChuan()){
            return 30000*soSP;
        }
        else {
            return 20000*soSP;
        }
    }
    
    
}
