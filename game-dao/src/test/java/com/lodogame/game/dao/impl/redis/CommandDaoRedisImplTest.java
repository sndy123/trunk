/**
 * This class has been generated by Fast Code Eclipse Plugin 
 * For more information please go to http://fast-code.sourceforge.net/
 * @author : jacky
 * Created : 08/16/2013
 */

package com.lodogame.game.dao.impl.redis;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.lodogame.model.Command;

@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
public class CommandDaoRedisImplTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private CommandDaoRedisImpl commandDaoRedisImpl;

	@Test
	public void testAdd() {

		Command command = new Command();
		command.setCommand(20003);
		command.setType(0);
		command.setPriority(10);

		Map<String, String> params = new HashMap<String, String>();
		params.put("level", "INFO");
		// params.put("name", "com.lodogame.ldsg.service.impl.BossServiceImpl");
		params.put("className", "com.lodogame.ldsg.service.impl.BossServiceImpl");

		command.setParams(params);
		commandDaoRedisImpl.add(command);
	}
}
