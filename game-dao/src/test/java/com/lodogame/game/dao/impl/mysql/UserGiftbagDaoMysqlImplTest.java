/**
 * This class has been generated by Fast Code Eclipse Plugin 
 * For more information please go to http://fast-code.sourceforge.net/
 * @author : jacky
 * Created : 08/22/2013
 */

package com.lodogame.game.dao.impl.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import com.lodogame.game.dao.impl.mysql.UserGiftbagDaoMysqlImpl;

@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
public class UserGiftbagDaoMysqlImplTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private UserGiftbagDaoMysqlImpl userGiftbagDaoMysqlImpl;

	private String userId = "b5d3b0daae9d43b3bce7dffe7a758233";

	/**
	 * 
	 * @see com.lodogame.game.dao.impl.mysql.UserGiftbagDaoMysqlImpl#addOrUpdateUserGiftbag(String,int,int)
	 */
	@Test
	public void addOrUpdateUserGiftbag() {
		//this.userGiftbagDaoMysqlImpl.addOrUpdateUserGiftbag(userId, 1, 1);
	}

}
