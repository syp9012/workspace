package db2;

import java.util.Date;

//이 클래스는 사원정보를 transfer하는 클래스이다.
public class Emp2DTO {
	private int empno;
	private String ename;
	private String job;
	private Date hiredate;
	private double sal;
	
	
	public Emp2DTO(int empno, String ename,String job, Date hiredate,double sal) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
	}
	
	public Emp2DTO() {

	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp2DTO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate + ", sal="
				+ sal +  "]";
	}
	
	
	
	
	
	
}
