/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Asus
 */
public class MyToys {
    // this class include all function applies for all project
    //it'll be static
    // cF: compute Factorial, calculate n!
    //n! bùng nổ value rất nhanh, lưu giá trị bằng long
    //15! là lớn lắm rồi
    public static long cF(int n){
        if (n<0 || n>15){
            throw new IllegalArgumentException("n must be between 0 to 15");
        }
        else if (n==0){
            return 1;
        } 
            long product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
        return product;
    }
}
