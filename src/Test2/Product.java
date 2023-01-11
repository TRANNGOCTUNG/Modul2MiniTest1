package Test2;

import java.util.Scanner;

public class Product {
    private String maSp;
    private String tenSp;
    private double dongia;
    private int soluong;
    private float giamgia;

    public Product(){
        this.maSp ="";

        this.tenSp = "";
        this.dongia = 0;
        this.soluong = 0;
        this.giamgia = 0;

    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getGiaSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(float giamgia) {
        this.giamgia = giamgia;
    }

    public Product(String maSp, String tenSp, double dongia, int soluong, float giamgia) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.dongia = dongia;
        this.soluong = soluong;
        this.giamgia = giamgia;
    }
    public double getTienChuaKhuyenMai(){
        return this.dongia * soluong;
    }
    public double getTienSauKhuyenMai(){
        return getTienChuaKhuyenMai() * (1-giamgia / 100);
    }
    public void input(Scanner scanner) {
        System.out.println("Nhap ma san pham: ");
        this.maSp = scanner.nextLine();
        System.out.println("Nhap ten san pham: ");
        this.tenSp = scanner.nextLine();
        System.out.println("Nhap don gia: ");
        this.dongia = scanner.nextDouble();
        System.out.println("Nhap so luong: ");
        this.soluong = scanner.nextInt();
        System.out.println("Nhap giam gia: ");
        this.giamgia = scanner.nextFloat();
        scanner.nextLine();
    }
    @Override
    public String toString(){
        return "Product{" +
                "maSp='" + maSp + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", donGia=" + dongia +
                ", soLuong=" + soluong +
                ", giamGia=" + giamgia +
                '}';
        //    public static void main(String[] args) {
//        Product[] products = new Product[5];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < products.length; i++) {
//            System.out.println("Nhap thong tin san pham thu " + (i + 1));
//            products[i] = new Product(");
//            products[i].input(scanner);
//        }
//    }
    }
}
