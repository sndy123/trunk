/**
 * This class has been generated by Fast Code Eclipse Plugin 
 * For more information please go to http://fast-code.sourceforge.net/
 * @author : jacky
 * Created : 06/08/2013
 */

package com.lodogame.game.dao.impl.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
public class UserExtinfoDaoMysqlImplTest extends AbstractTestNGSpringContextTests {

	private String userId = "000000000000000000000000000066";

	@Autowired
	private UserExtinfoDaoMysqlImpl userExtinfoDaoMysqlImpl;

	@BeforeClass
	public void setUpBeforeClass() {
		// TODO add setup code.
	}

	/**
	 * 
	 * @see com.lodogame.game.dao.impl.mysql.UserExtinfoDaoMysqlImpl#get(String)
	 */
	@Test
	public void get() {
		userExtinfoDaoMysqlImpl.get(userId);
	}

}
