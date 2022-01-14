package com.dogoo.poc.home.rest.internal.validator;

import com.dogoo.poc.home.model.HomeEntry;
import com.dogoo.poc.home.rest.dto.v1_0_0.Home;
import com.dogoo.poc.home.rest.dto.v1_0_0.HomeReq;
import com.dogoo.poc.home.service.HomeEntryLocalService;
import com.liferay.portal.vulcan.pagination.Pagination;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import com.dogoo.poc.home.rest.internal.mockdata.HomeMockDataUtil;


@RunWith(MockitoJUnitRunner.class)
public class HomeValidatorTest {

    private static final long HOME_ID = 101;

    private static final String ADDRESS = "Ha Noi";
    private static final int FLOOR = 2;
    private static final float SQUARE = 3;
    private static final int ROOM = 3;
    private static final String COLOR = "Red";
    private static final String OWNER = "Hoang";

    @InjectMocks
    private HomeValidator homeValidator;

    @Mock
    private HomeEntry homeEntry;

    @Mock
    private HomeEntryLocalService homeEntryLocalService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup() {
        when(homeEntryLocalService.fetchHomeEntry(anyLong())).thenReturn(homeEntry);
    }

    @Test
    public void ensureValidatorForSearchHome() {
        Pagination pagination =  Pagination.of(1, 10);

        homeValidator.validatorForSearch(pagination);
    }

    @Test
    public void ensureValidatorForSearchHomeWhenPageSizeLarger250() {
        expectedException.expect(RuntimeException.class);

        Pagination pagination =  Pagination.of(1, 260);

        homeValidator.validatorForSearch(pagination);
    }

    @Test
    public void ensureValidatorForAddHome() {
        HomeReq homeReq = HomeMockDataUtil.buildHomeReq(
                ADDRESS, FLOOR, SQUARE, ROOM, COLOR, OWNER
        );

        homeValidator.validatorForAddHome(homeReq);
    }

    @Test
    public void ensureValidatorForAddHomeWhenMissingRequestField() {
        expectedException.expect(RuntimeException.class);

        HomeReq homeReq = HomeMockDataUtil.buildHomeReq(
                "", FLOOR, SQUARE, ROOM, COLOR, OWNER
        );

        homeValidator.validatorForAddHome(homeReq);
    }

    @Test
    public void ensureValidatorForUpdateHome() {
        HomeReq homeReq = HomeMockDataUtil.buildHomeReq(
                ADDRESS, FLOOR, SQUARE, ROOM, COLOR, OWNER
        );

        homeValidator.validatorForUpdateHome(HOME_ID ,homeReq);
    }

    @Test
    public void ensureValidatorHomeIsExist() {

        homeValidator.validatorHomeIsExists(HOME_ID);
    }

    @Test
    public void ensureValidatorHomeIsExistThrowExceptionIfHomeDoesNotExist() {
        expectedException.expect(RuntimeException.class);
        when(homeEntryLocalService.fetchHomeEntry(anyLong())).thenReturn(null);
        homeValidator.validatorHomeIsExists(HOME_ID);
    }


}
