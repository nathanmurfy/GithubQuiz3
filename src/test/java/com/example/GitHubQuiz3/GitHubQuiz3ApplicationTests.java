package com.example.GitHubQuiz3;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class GitHubQuiz3ApplicationTests {

	@SpringBootTest
	class ApplicationTests {

		@Autowired
		private MockMvc mockMvc;

		@Test
		public void shouldReturnDefaultMessage() throws Exception {
			this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
					.andExpect(content().string(containsString("Hello, Nathan")));
		}

	}
}
