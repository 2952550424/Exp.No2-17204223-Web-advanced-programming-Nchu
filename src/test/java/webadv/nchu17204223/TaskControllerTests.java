package webadv.nchu17204223;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import webadv.nchu17204223.rest.TaskController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {P6Application.class, TaskController.class})
@AutoConfigureMockMvc
public class TaskControllerTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void test() throws Exception {
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/task/1"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andDo(MockMvcResultHandlers.print())
				.andReturn();
	}
}
