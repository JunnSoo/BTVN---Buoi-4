package baitap;
import java.util.Scanner;

public class Function {
	static Scanner scanner = new Scanner(System.in);
	public static void timSoLonNhat(double so1, double so2, double so3) {
		double max = Math.max(so1, so2);
		if (so3 > max) {
			max = so3;
		}
		System.out.println("Số lớn nhất là: "+ max);
	}
	
	public static void kiemTraChanLe() {
		double socankiemtra;
		do {
			System.out.println("nhap vao số cần kiểm tra");
			socankiemtra = scanner.nextDouble();
			if (socankiemtra % 2 ==0){
	            System.out.println("Đây là số chẵn");
	            break;
	        }else if(socankiemtra % 2 ==1){
	            System.out.println("Đây là số lẻ");
	            break;
	        }else {
	            System.out.println("khong hop le, hãy nhập số nguyên ");
	        }
		} while (true);
	}
	
	public static void tinhTongBaSo(double a,double b,double c) {
		double tong = a+b+c;
		System.out.println("Tổng 3 số là: "+ tong);
	}
	
	public static double tong(double a,double b) {
		return a+b;
	}
	
	public static double hieu(double a,double b) {
		return a-b;
	}
	
	public static double tich(double a,double b) {
		return a*b;
	}
	
	public static double thuong(double a,double b) {
		return a/b;
	}
	
	public static void tinhToanDonGian(double a, double b) {
		double bientam;
		do {
			System.out.println("Nhấn "+"1.cộng "+"2.Trừ "+"3.Nhân "+"4.Chia "+"0. Để thoát ra menu");
			bientam = scanner.nextDouble();
			double temp = 0;
			if (bientam == 1){
				temp = tong(a,b);
				System.out.println("Tổng : "+temp);  
	        }
			else if(bientam == 2){
	        	temp = hieu(a,b);
				System.out.println("Hiệu : "+temp);
	        }
			else if(bientam == 3){
		        temp = tich(a,b);
				System.out.println("Tích : "+temp);
	        }
			else if(bientam == 4){
		        temp = thuong(a,b);
				System.out.println("Thương : "+temp);
			}
			else {
	            System.out.println("khong hop le, hãy nhập 1 tới 4, nhập 0 để thoát ");
	        }
		}while (bientam != 0);
	}
	
}
