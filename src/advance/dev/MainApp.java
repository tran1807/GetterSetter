package advance.dev;

import java.util.Scanner;

public class MainApp {
	static final int NUMBER_STUDENT = 10;
	static void input(Student[] students) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < NUMBER_STUDENT; i++) {
			System.out.println("Sinh vien thu: " + i);
			System.out.println("Nhap ten : ");
			String name = sc.next();
			System.out.println("Nhap tuoi : ");
			int age = sc.nextInt();
			System.out.println("Nhap dia chi : ");
			String dc = sc.next();
			System.out.println("Nhap so dien thoai : ");
			int sdt = sc.nextInt();
			System.out.println("Nhap diem trung binh : ");
			float dtb = sc.nextFloat();
			Student Std = new Student(name, age, dc, sdt, dtb);
		}
	}
	static void print(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}
	}
	static void diemTrungBinh(Student[] students) {
	      Student preMax = students[0];
		for (int i = 0; i < students.length; i++) {
			if(preMax.getDtb() < students[i].toString()) {
				preMax=students[i];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student[] students = new Student[NUMBER_STUDENT];
       input(students);
       print(students);
	}

}
