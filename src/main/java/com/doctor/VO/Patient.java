package com.doctor.VO;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString

@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int pId;
//    private List<Patient> pId;
    private String name;
    private int age;
    private String email;
    private String phone;
    private int aId;
    
//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "DOCTOR",
//            joinColumns = {
//                    @JoinColumn(name = "DID")
//            },
//            inverseJoinColumns = {
//                    @JoinColumn(name = "NAME")
//            }
//    )
	

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

//	public List<Patient> getpId() {
//		return pId;
//	}
//
//	public void setpId(List<Patient> pId) {
//		this.pId = pId;
//	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	
    
    
}