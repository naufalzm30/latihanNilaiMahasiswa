/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

/**
 *
 * @author Rizki Adam Kurniawan
 */
class mhs {

    public String nim;
    public String nama;
    private double quiz;
    private double uts;
    private double uas;

    public char ind;
    public String ket;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public void nilaiAkhir(double quiz, double uts, double uas) {
        double hasil;
        hasil = ((0.2 * quiz) + (0.3 * uts) + (0.5 * uas));
        System.out.println("\nNilai Akhir \t= " + hasil);
        if (hasil > 80 && hasil <= 100) {
            ind = 'A';
        } else if (hasil > 68 && hasil <= 80) {
            ind = 'B';
        } else if (hasil > 56 && hasil <= 68) {
            ind = 'C';
        } else if (hasil > 45 && hasil <= 56) {
            ind = 'D';
        } else if (hasil <= 45) {
            ind = 'E';
        }

    }

    public void keterangan(char ind) {
        switch (ind) {
            case 'A':

                System.out.println("\nIndex = " + ind);
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("\nIndex = " + ind);
                System.out.println("Keterangan = Baik");
                break;
            case 'C':
                System.out.println("\nIndex = " + ind);
                System.out.println("Keterangan = Cukup");
                break;
            case 'D':
                System.out.println("\nIndex = " + ind);
                System.out.println("Keterangan = Kurang");
                break;
            case 'E':
                System.out.println("\nIndex = " + ind);
                System.out.println("Keterangan = Sangat Kurang");
                break;
            default:
                System.out.println("\nUNRECOGNIZE");
        }

    }
}

public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mhs r = new mhs();
        r.setQuiz(75);
        r.setUts(45);
        r.setUas(34);

        r.nim = "7.51.15.036.";
        r.nama = "Rizki Adam Kurniawan";

        //output 
        for (int i = 1; i < 5; i++) {
            System.out.println("Nama ke " + i + "\t\t= " + r.nama);
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("NIM ke " + j + "\t\t= " + r.nim + j);
        }

        System.out.println("\nQUIZ \t\t= " + r.getQuiz());
        System.out.println("UTS \t\t= " + r.getUts());
        System.out.println("UAS \t\t= " + r.getUas());

        r.nilaiAkhir(r.getQuiz(), r.getUts(), r.getUas());
        r.keterangan(r.ind);

    }
}
