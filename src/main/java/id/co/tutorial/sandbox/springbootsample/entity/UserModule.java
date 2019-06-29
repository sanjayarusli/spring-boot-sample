package id.co.tutorial.sandbox.springbootsample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class UserModule {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@ManyToOne
    @JoinColumn(name = "module_id")
	private Module module;
	
	private int orderNo;
	
	@JsonIgnore
	@ManyToOne
    @JoinColumn(name = "user_id")
	private User user;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
