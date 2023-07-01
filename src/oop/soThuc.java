package oop;

import java.security.PrivateKey;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class soThuc {
	public double giaTri;
	public boolean laSoDuong;

	public double getSoThuc() {
		return giaTri;
	}

	public void setSoThuc(double soThuc) {
		this.giaTri = giaTri;
	}

	public boolean isLaSoDuong() {
		setLaSoDuong(laSoDuong);
		return laSoDuong;
	}

	private void setLaSoDuong(boolean laSoDuong) {
		this.laSoDuong = laSoDuong;
		if (giaTri>0) {
			laSoDuong=true;
		}
		else {
			laSoDuong=false;
		}
	}
	private Scanner scanner=new Scanner(System.in);
	public soThuc() {
		System.out.println("nhap gia tri");
		giaTri=scanner.nextDouble();
	}
	
}
