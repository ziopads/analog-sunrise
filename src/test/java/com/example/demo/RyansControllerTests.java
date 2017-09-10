package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(RyansController.class)
public class RyansControllerTests {

    @Autowired
    MockMvc mvc;

    @Test
    public void testRyansController() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/ryan");

        this.mvc.perform(request)
                .andExpect(content().string("Hello World"))
                .andExpect(status().isOk());
    }
}
