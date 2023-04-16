package main;

import shapes.HinhChuNhat;
import shapes.HinhTru;
import shapes.HinhVuong;
import shapes.Hinhtron;

public class MainClass {
    public static void main(String[] args){

        //Hinh Tron
        Hinhtron htron = new Hinhtron();
        htron.xuatten();
        htron.nhapBanKinh();
        htron.tinhchuvi();
        htron.tinhdientich();
        htron.inchuvi();
        htron.indientich();

        //Hinh Tru
        HinhTru htru = new HinhTru();
        htru.xuatten();
        htru.nhapchieucao();
        htru.tinhthetich();
        htru.inthetich();

        //Hinh chu nhat
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatten();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();

        //Hinh vuong
        HinhVuong hv = new HinhVuong()
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();
    }

}
