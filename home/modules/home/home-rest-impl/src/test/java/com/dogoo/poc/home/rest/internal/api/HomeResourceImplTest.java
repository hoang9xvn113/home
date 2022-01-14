package com.dogoo.poc.home.rest.internal.api;

import com.dogoo.poc.home.rest.dto.v1_0_0.Home;
import com.dogoo.poc.home.rest.internal.resource.v1_0_0.HomeResourceImpl;
import com.dogoo.poc.home.rest.internal.service.HomeService;
import com.dogoo.poc.home.rest.internal.validator.HomeValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HomeResourceImplTest {

    private static long HOME_ID = 101;

    @InjectMocks
    private HomeResourceImpl homeResource;

    @Mock
    private HomeService homeService;

    @Mock
    private HomeValidator homeValidator;

    @Test
    public void makeSureCanRemoveTest() throws Exception {
        homeService.deleteHomeByHomeId(HOME_ID);
    }

    @Test
    public void makeSureCanPostTest() throws Exception {
    }
}
