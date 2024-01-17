package db;

/*VO(Value Object)
-값 객체
-불변성
-VO의 상태는 생성 시점에 결정되며, 이후로는 변경되지 않는다. 

*DTO(Data Transfer Object)
-데이터 전송 객체
-주로 계층간 데이터 교환을 위해 사용.
-로직을 갖고 있지 않은 순수한 데이터 객체
-Getter와 Setter 메서드만을 가짐.
-데이터의 전송을 위한 객체이므로 변경 가능성

*VO와 DTO의 차이점
1)불변성: VO는 불변성(Immutability) / DTO는 가변성(Mutability)
=>VO의 상태는 생성 시점에 결정되며, 이후로는 변경되지 않는다. 
   DTO는 상태를 변경할 수 있는 setter 메서드를 갖는다.
2)비교 방법: VO는 값에 의한 비교/  DTO는 주소에 의한 비교
=>VO는 내용이 같으면 같은 객체로 취급하지만, 
  DTO는 같은 인스턴스를 참조할 때만 같은 객체로 취급.
3)사용 목적: VO는 값 자체를 표현/ DTO는 계층간 데이터 전송을 위해 사용.
4)메서드: 
 VO는 일반적으로 비즈니스 로직을 포함가능
 DTO는 로직을 갖지 않고, 단순히 데이터를 전달하는 역할만.*/

//필드명주의
public class DepartmentDTO {
	//field
	//부서번호
	private int deptNo;
	private String dName;
	private String loc;
	
	
	
	//constructor
	public DepartmentDTO(int deptNo, String dName, String loc) {
		this.deptNo= deptNo;
		this.dName = dName;
		this.loc = loc;
	}
	public DepartmentDTO() {
		
	}
	
	
	
	//setter & getter
	public String getLoc() {
		return loc;
	}
	
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "DepartmentDTO [deptNo=" + deptNo + ", dName=" + dName + ", loc=" + loc + "]";
	}

	
	
}
