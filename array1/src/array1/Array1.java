/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author ica
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai [] = new int[3];
        nilai [0] = 70;
        nilai [1] = 80;
        nilai [2] = 65;
        double ratarata = 0.0;
        for(int i=0; i<nilai.length; i++) ratarata+=nilai [i];
        ratarata/= nilai.length;
        System.out.println("Nilai rata-rata = "+ ratarata);
    }
    
}
