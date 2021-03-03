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
    public float TheTich(){
        return (float)chieuCao*DienTich();
    }

}
