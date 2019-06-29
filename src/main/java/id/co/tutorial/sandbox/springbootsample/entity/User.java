package id.co.tutorial.sandbox.springbootsample.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.REFRESH)
    private List<UserModule> modules;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<UserModule> getModules() {
		return modules;
	}
	public void setModules(List<UserModule> modules) {
		this.modules = modules;
	}
	
    
}
