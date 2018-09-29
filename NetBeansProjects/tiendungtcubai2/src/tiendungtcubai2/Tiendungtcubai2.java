/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendungtcubai2;
import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author MyPC
 */
public class Tiendungtcubai2 {
    static boolean nguyento(int gh){
        if(gh < 3){
            return true;
        }
        for (int i = 3; i <= sqrt(gh); i ++){
            if(gh%i == 0){
                return false;
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to do code application logic here
        int arrInt[];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu n=: ");
        n = input.nextInt();
        arrInt = new int[n];
        for (int i = 0; i < n; i ++){
            System.out.println("Nhap a[" + i + "] =");
            arrInt[i] = input.nextInt();
        }
        for (int i = 0; i < n; i ++){
            System.out.print(" a[" + i + "] =" + arrInt[i]+ ";");
        }
        int min = arrInt[0];
        int max = arrInt[0];
        for (int i = 0; i < n; i ++){
            if(arrInt[i]< min){
                min = arrInt[i];
            }
            if(arrInt[i]> max){
                max = arrInt[i];
            }
        }
        
        System.out.println("Gia tri nho nhat: " + min);
        System.out.println("Gia tri lon nhat: " + max);
        
        int dem = 0;
        for(int i = 0; i < n; i ++){
            if(arrInt[i]%2 == 0){
                dem ++;
            }
        }
        System.out.println("So phan tu chan la: "+ dem);
        
        for (int i = 0; i < n; i ++){
            if(nguyento(arrInt[i])){
                System.out.println("Phan tu a[" + i + "] =" + arrInt[i] + "nguyento");
                
            }
        }
        
        Arrays.sort(arrInt);
        for (int i = 0; i < n; i ++){
            System.out.print(" a[" + i + "] =" + arrInt[i] + ";");
        }
        
        
        // tim kiem nhi phan
        int x;
        System.out.println("Nhap x: ");
        x = input.nextInt();
        int vitri = Arrays.binarySearch(arrInt, x);
        System.out.println("Vi tri cua " + x + " trong mang la " + vitri);
        
    }  
}