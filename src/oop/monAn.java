package oop;

import java.util.Scanner;

public class monAn {
	private String tenMonAn, gioiThieu, nguyenLieuChinh;
	private int giaBan;

	public String getTenMonAn() {
		return tenMonAn;
	}

	public void setTenMonAn(String tenMonAn) {
		this.tenMonAn = tenMonAn;
	}

	public String getGioiThieu() {
		return gioiThieu;
	}

	public void setGioiThieu(String gioiThieu) {
		this.gioiThieu = gioiThieu;
	}

	public String getNguyenLieuChinh() {
		return nguyenLieuChinh;
	}

	public void setNguyenLieuChinhString(String nguyenLieuChinh) {
		this.nguyenLieuChinh = nguyenLieuChinh;
	}

	public int getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}

	private Scanner scanner = new Scanner(System.in);

	public monAn() {
		System.out.println("Nhap ten mon,Gia ban,Gioi thieu,Nguyen lieu chinh");
		tenMonAn=scanner.nextLine();
		giaBan=scanner.nextInt();
		scanner.nextLine();
		gioiThieu=scanner.nextLine();
		nguyenLieuChinh=scanner.nextLine();
	}
	public void inThongTin() {
		System.out.println(tenMonAn + ","+ gioiThieu + " ,duoc lam tu "+ nguyenLieuChinh);
	}
}
