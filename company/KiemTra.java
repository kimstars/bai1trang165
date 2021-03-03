package com.company;

public class KiemTra {

    public static void main(String[] args) {
	// write your code here
        HinhTru tru = new HinhTru();
        tru.setChieuCao(10);
        tru.setBanKinh(10);
        System.out.println(tru.TheTich());
    }
}
