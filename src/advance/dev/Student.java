package advance.dev;

public class Student {
	 private String name;
	 private int age;
	 private String dc;
	 private int sdt ;
	 private double dtb;
	 
	public Student(String name, int age, String dc, int sdt, double dtb) {
		super();
		this.name = name;
		this.age = age;
		this.dc = dc;
		this.sdt = sdt;
		this.dtb = dtb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDc() {
		return dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public double getDtb() {
		return dtb;
	}

	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	@Override
	public String toString() {
		String toString = null;
		// TODO Auto-generated method stub
		return toString.format("diem trung binh la",dtb);
	}
}

