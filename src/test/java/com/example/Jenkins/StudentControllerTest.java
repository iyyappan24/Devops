package com.example.Jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void getDataTest() throws Exception{


        mockMvc.perform(MockMvcRequestBuilders.get("/get"))
                .andExpect(MockMvcResultMatchers.content().string("This is from Jenkins"));
    }


    @Test
    public void getTest() throws Exception{


        mockMvc.perform(MockMvcRequestBuilders.get("/get"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
