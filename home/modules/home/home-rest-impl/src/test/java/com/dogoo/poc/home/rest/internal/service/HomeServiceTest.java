package com.dogoo.poc.home.rest.internal.service;

import com.dogoo.poc.home.model.HomeEntry;
import com.dogoo.poc.home.rest.dto.v1_0_0.Home;
import com.dogoo.poc.home.rest.internal.mapper.HomeMapper;
import com.dogoo.poc.home.service.HomeEntryLocalService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyObject;

@RunWith(MockitoJUnitRunner.class)
public class HomeServiceTest {

    private static long HOME_ID = 101;

    @InjectMocks
    HomeService homeService;

    @Mock
    HomeMapper homeMapper;

    @Mock
    HomeEntryLocalService homeEntryLocalService;

    @Mock
    HomeEntry homeEntry;

    @Test
    public void ensureGetHomeByHomeIdReturnData() throws Exception {
        homeService.getHomeByHomeId(HOME_ID);
    }

    @Test
    public void ensureGetHomeByHomeIdReturnNull() throws Exception {
        when(homeEntryLocalService.getHomeEntry(anyLong())).thenReturn(null);

        Home home = homeService.getHomeByHomeId(HOME_ID);

        Assert.assertEquals(home, null);

        homeService.getHomeByHomeId(HOME_ID);
    }


}
