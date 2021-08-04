package com.cognizant.locationcrud.controllers;

import com.cognizant.locationcrud.models.InventoryEntity;
import com.cognizant.locationcrud.models.Location;
import com.cognizant.locationcrud.service.ServiceLayer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = LocationController.class)
class LocationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @MockBean
    private ServiceLayer mockService;

    private LocationController controller;

    private List<Location> mockLocationList1, mockLocationList2;

    @BeforeEach
    void setUp() {
        setupMockLocations();
        setupMockService();
        controller = new LocationController(mockService);
    }

    @Test
    void shouldReturnLocationListWhenValidProductIdIsReceived(){
        Integer intProductId1 = 1;
        Integer intProductId2 = 2;
        Long productIdForTest1 = intProductId1.longValue();
        Long productIdForTest2 = intProductId2.longValue();

        List<Location> expectedOutputFromTest1 = mockLocationList1;
        List<Location> expectedOutputFromTest2 = mockLocationList1;

        List<Location> actualOutputFromTest1 = controller.getLocationByProductId(productIdForTest1);
        List<Location> actualOutputFromTest2 = controller.getLocationByProductId(productIdForTest2);

        assertEquals(expectedOutputFromTest1, actualOutputFromTest1);
        assertEquals(expectedOutputFromTest2, actualOutputFromTest2);
    }

    @Test
    void shouldReturnLocationListAndStatusOkWhenValidHttpRequestIsReceived() throws Exception{
        String testUri1 = "/location/product/1";
        String testUri2 = "/location/product/2";

        String expectedResultFromTest1 = mapper.writeValueAsString(mockLocationList1);
        String expectedResultFromTest2 = mapper.writeValueAsString(mockLocationList2);

        mockMvc.perform(
                get(testUri1)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(expectedResultFromTest1));

        mockMvc.perform(
                get(testUri2)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(expectedResultFromTest2));
    }

    private void setupMockService(){
        Integer intProductId1 = 1;
        Integer intProductId2 = 2;
        Long productId1 = intProductId1.longValue();
        Long productId2 = intProductId2.longValue();

        doReturn(mockLocationList1).when(mockService).getLocationsByProductId(productId1);
        doReturn(mockLocationList2).when(mockService).getLocationsByProductId(productId2);
    }

    private void setupMockLocations(){
        mockLocationList1 = new ArrayList<>();
        mockLocationList2 = new ArrayList<>();
    }
}