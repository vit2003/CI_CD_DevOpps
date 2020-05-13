/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicddevopps;

import util.MyToys;

/**
 *
 * @author Asus
 */
public class CiCdDevOpps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = "+MyToys.cF(5)); //expected 120 is returned
        System.out.println("6! = "+MyToys.cF(6)); //expected 720 is returned
        System.out.println("0! = "+MyToys.cF(0)); //expected 1 is returned
        System.out.println("-5! = "+MyToys.cF(-5)); //throws an exception
    }
    
}
