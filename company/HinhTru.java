package com.company;

public class HinhTru extends HinhTron{
    private int chieuCao;

    public void HinhTru(){};
    public void HinhTru(int chieuCao){
        this.chieuCao = chieuCao;

    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getChieuCao() {
        return chieuCao;
    }
    public double TheTich(){
        return chieuCao*DienTich();
    }
    @Override
    public String toString(){
        return "Thể tích hình trụ là : " + TheTich();
    }

}
