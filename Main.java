package baitap;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int luaChon;
		System.out.println("1. Tìm số lớn nhất trong 3 số người dùng nhập ");
		System.out.println("2. Kiểm tra một số là số chẵn hay lẻ ");
		System.out.println("3. Tính tổng 3 số người dùng nhập ");
		System.out.println("4. Chương trình tính toán đơn giản ");
		System.out.println("0. Dừng lại");
		
		do {		
			System.out.println("Hãy nhập lựa chọn từ 0-4");
		
			luaChon = scanner.nextInt();
			switch(luaChon) {
			case 1:
				double so1,so2, so3;
				System.out.println("nhập 3 số ");
				so1 = scanner.nextDouble();
				so2 = scanner.nextDouble();
				so3 = scanner.nextDouble();
				Function.timSoLonNhat(so1, so2, so3);
				break;
				
			case 2:
				Function.kiemTraChanLe();
				break;
			
			case 3:
				double soA,soB,soC;
				System.out.println("nhập vào 3 số để tính tổng");
				soA = scanner.nextDouble();
				soB = scanner.nextDouble();
				soC = scanner.nextDouble();
				Function.tinhTongBaSo(soA,soB,soC);
				break;
				
			case 4:
				double a,b;
				System.out.println("Nhập vào 2 số để tính toán");
				a = scanner.nextDouble();
				b = scanner.nextDouble();
				Function.tinhToanDonGian(a,b);
				break;
				
			case 0:
			        System.out.println("Đã thoát chương trình.");
			        break;
			
			        default:
			        System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập từ 0 đến 4.");
			       
			}
		} while(luaChon != 0);
	}
}
