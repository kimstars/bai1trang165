package com.company;

public class HinhTron {
    private int banKinh;
    public HinhTron(){};
    public HinhTron(int banKinh){
        this.banKinh = banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    public int getBanKinh() {
        return banKinh;
    }
    public double DienTich(){
        return this.banKinh*3.14*this.banKinh;
    }
    @Override
    public String toString(){
        return "ban kinh hinh tron : "+ banKinh;
    }
}
