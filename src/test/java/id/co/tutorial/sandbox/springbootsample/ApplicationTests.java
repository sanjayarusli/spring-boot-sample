package id.co.tutorial.sandbox.springbootsample;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import id.co.tutorial.sandbox.springbootsample.entity.Module;
import id.co.tutorial.sandbox.springbootsample.entity.User;
import id.co.tutorial.sandbox.springbootsample.entity.UserModule;
import id.co.tutorial.sandbox.springbootsample.repository.ModuleRepository;
import id.co.tutorial.sandbox.springbootsample.repository.UserRepository;

@RunWith(SpringRunner.class)
//@SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase
public class ApplicationTests {

	@Autowired
    private TestEntityManager entityManager;
	
	@Autowired
	private ModuleRepository moduleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testUser() {
		Module module = new Module();
		module.setModuleName("template");
		module = this.entityManager.persist(module);
		Long id = module.getId();
		module = this.moduleRepository.findById(id).get();
		assertNotNull(module);
		
		User user = new User();
		user.setUsername("coba");
		UserModule um = new UserModule();
		um.setModule(module);
		um.setOrderNo(1);
		List<UserModule> list = new ArrayList<UserModule>();
		list.add(um);
		user.setModules(list);
		user = this.entityManager.persist(user);
		id = user.getId();
		user = this.userRepository.findById(id).get();
		assertNotNull(user);
		
		
	}

}
