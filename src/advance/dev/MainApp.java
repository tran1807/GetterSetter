package advance.dev;

import java.util.Scanner;

public class MainApp {
	static void input(Student[] students) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i < students.length; i++) {
			System.out.println("Sinh vien thu: " + i);
			students[i] = new Student(); 
	
			System.out.println("name:");
			students[i].getName();
			students[i].name = sc.next();
	
			System.out.println("age:");
			students[i].getAge();
			students[i].age = sc.nextInt();
	
			System.out.println("dia chi:");
			students[i].getDc();
			students[i].dc = sc.next();
	
			System.out.println("So dien thoai:");
			students[i].getSdt();
			students[i].sdt = sc.nextInt();
	
			System.out.println("Diem trung binh:");
			students[i].getDtb();
			students[i].dtb = sc.nextDouble();
		}
	}
	static void print(Student[] std) {
		for(int i = 1; i < std.length; i++) {
			System.out.println(std[i].getName() + " " + std[i].getAge() + " " + std[i].getDc() + " " + std[i].getSdt() + " " + std[i].getDtb());	
		}
	}
	static void sapXep(Student[] students ) {
		Student preMax = students[0];
		for (int i = 0; i < students.length; i++) {
			if(preMax.getDtb() > students[i].getDtb()) {
				preMax = students[i];
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[10];
		input(students);
		print(students);
		sapXep(students);
	}
	
	}