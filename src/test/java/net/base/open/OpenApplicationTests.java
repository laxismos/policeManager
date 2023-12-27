package net.base.open;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import jakarta.annotation.Resource;
import net.base.open.mapper.OfficerMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
class OpenApplicationTests {

	@Resource
	OfficerMapper officerMapper;

	@Test
	void contextLoads() {
	}

	@Test
	void testMapper(){
		officerMapper.updateOfficer("2312276333", "张三", null, null, null);
	}

}
