package id.co.tutorial.sandbox.springbootsample.controller.mapper;

import java.util.ArrayList;
import java.util.List;

import id.co.tutorial.sandbox.springbootsample.entity.User;
import id.co.tutorial.sandbox.springbootsample.entity.UserModule;

public class UserModuleWrapper {

	List<ModuleWrapper> modules;
	
	public List<ModuleWrapper> getModules() {
		return modules;
	}

	public void setModules(List<ModuleWrapper> modules) {
		this.modules = modules;
	}

	public UserModuleWrapper(User u) {
		if(u.getModules() != null && !u.getModules().isEmpty()) {
			this.modules = new ArrayList<ModuleWrapper>();
			for(UserModule um : u.getModules()) {
				ModuleWrapper mw = new ModuleWrapper();
				mw.setModuleName(um.getModule().getModuleName());
				mw.setModuleOrder(um.getOrderNo());
				this.modules.add(mw);
			}
		}
	}
}

class ModuleWrapper {
	private String moduleName;
	private int moduleOrder;
	
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getModuleOrder() {
		return moduleOrder;
	}
	public void setModuleOrder(int moduleOrder) {
		this.moduleOrder = moduleOrder;
	}
}
