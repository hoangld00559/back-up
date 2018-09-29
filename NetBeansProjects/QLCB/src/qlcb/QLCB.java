/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcb;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author MyPC
 */
class CanBo {
    protected String hvt,dc,gt;
    protected int ns;
    CanBo(){};
}
class CongNhan extends CanBo {
    protected String bac;
    CongNhan(){};
}
class NhanVien extends CanBo {
    protected String congviec;
    NhanVien(){};
}
class KySu extends CanBo {
    protected String nganhdt;
    KySu(){};
}

public class QLCB {

    /**
     * @param args the command line arguments
     */
    static String nhapgt() throws IOException {
        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        return str;
    }
    static boolean ssxau(String s1, String s2){
        if(s1.equalsIgnoreCase(s2)) return false;
        else return true;
    }
    static int nhapnn() throws IOException {
        String nn;
        System.out.print("Nghe nghiep: ");
        do{
            nn = nhapgt();
            if(ssxau(nn,"nv")&&ssxau(nn,"cn")&&ssxau(nn,"ks"))
                System.out.print("Ban chi co the nhap nv/cn/ks: ");
        }while(ssxau(nn,"nv")&&ssxau(nn,"cn")&&ssxau(nn,"ks"));
        if(ssxau(nn,"nv")==false) return 1;
        else if(ssxau(nn,"cn")==false) return 2;
        else if(ssxau(nn,"ks")==false) return 3;
        else return 0;
    }
    
    static void hienthi(CanBo cb){
        System.out.println("Ho va ten: " + cb.hvt);
        System.out.println("Gioi tinh: " + cb.gt);
        System.out.println("Nam sinh: "+ cb.ns);
        System.out.println("Dia chi: " + cb.dc);
    }
    
    static void hienthinv(NhanVien nv){
        hienthi(nv);
        System.out.println("Cong viec: " + nv.congviec);
        System.out.println("---------------------------");
    }
    
    static void hienthicn(CongNhan cn){
        hienthi(cn);
        System.out.println("Bac: " + cn.bac);
        System.out.println("---------------------------");
    }
    
    static void hienthiks(KySu ks){
        hienthi(ks);
        System.out.println("Nganh dao tao: " + ks.nganhdt);
        System.out.println("---------------------------");
    }
    
    static boolean timkiem(CanBo cb, String ht) throws IOException {
        if(cb.hvt.equalsIgnoreCase(ht)) return true;
        else return false;
    }
    public static void main(String[] args) throws IOException{
        int i,scb,scn =0, snv=0,sks=0,nn,ns;
        String hvt,gt,dc;
        System.out.print("So can bo: ");
        scb=Integer.valueOf(nhapgt()).intValue();
        NhanVien[] NV = new NhanVien[scb];
        CongNhan[] CN = new CongNhan[scb];
        KySu[] KS = new KySu[scb];
        System.out.println("Nhap thong tin cho cac CB: ");
        for(i=0; i<scb;i++){
            System.out.print("Ho ten: ");
            hvt=nhapgt();
            System.out.print("Nam sinh: ");
            ns=Integer.valueOf(nhapgt()).intValue();
            System.out.print("Gioi tinh: ");
            gt=nhapgt();
            System.out.print("Dia chi: ");
            dc=nhapgt();
            nn=nhapnn();
            switch(nn){
                case 1:
                    NV[snv] = new NhanVien();
                    NV[snv].hvt = hvt;
                    NV[snv].gt = gt;
                    NV[snv].ns = ns;
                    NV[snv].dc = dc;
                    System.out.print("Cong viec: ");
                    NV[snv].congviec = nhapgt();
                    snv++;
                    break;
                case 2:
                    CN[scn] = new CongNhan();
                    CN[scn].hvt = hvt;
                    CN[scn].gt = gt;
                    CN[scn].ns = ns;
                    CN[scn].dc = dc;
                    System.out.print("Bac: ");
                    CN[scn].bac = nhapgt();
                    scn++;
                    break;
                case 3:
                    KS[sks] = new KySu();
                    KS[sks].hvt = hvt;
                    KS[sks].gt = gt;
                    KS[sks].ns = ns;
                    KS[sks].dc = dc;
                    System.out.print("Nganh dao tao: ");
                    KS[sks].nganhdt = nhapgt();
                    sks++;
                    break;
                default: System.out.println();
            }
        }
        System.out.println("-------HIEN THI---------");
        for(i=0;i<scb;i++){
            if(NV[i]!=null) hienthinv(NV[i]);
            if(CN[i]!=null) hienthicn(CN[i]);
            if(KS[i]!=null) hienthiks(KS[i]);
        }
        String ht;
        System.out.println("--------TIM KIEM---------");
        System.out.print("Moi ban nhap ho ten can tim: ");
        ht = nhapgt();
        for(i=0;i<scb;i++){
            if(NV[i]!=null&&timkiem(NV[i], ht)) hienthinv(NV[i]);
            if(CN[i]!=null&&timkiem(CN[i], ht)) hienthicn(CN[i]);
            if(KS[i]!=null&&timkiem(KS[i], ht)) hienthiks(KS[i]);
        }
    }
    
}
