package id.co.tutorial.sandbox.springbootsample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Module {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String moduleName;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
    
    
}
