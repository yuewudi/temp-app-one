package user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import service.prototype.IUserService;

/**
 * UserService测试
 * @author RanJi
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestUserService {
	@Autowired
	private IUserService userService;
	
	@Test
	public void testTransaction(){
		userService.testTransaction();
	}
}
