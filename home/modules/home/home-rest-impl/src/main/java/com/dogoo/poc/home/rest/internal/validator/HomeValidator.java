package com.dogoo.poc.home.rest.internal.validator;

import com.dogoo.poc.home.model.HomeEntry;
import com.dogoo.poc.home.rest.dto.v1_0_0.Home;
import com.dogoo.poc.home.rest.dto.v1_0_0.HomeReq;
import com.dogoo.poc.home.service.HomeEntryLocalService;
import com.liferay.portal.vulcan.pagination.Pagination;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;

@Component(
        immediate = true,
        service = {com.dogoo.poc.home.rest.internal.validator.HomeValidator.class}
)
public class HomeValidator {

    private static final String HOME_NOT_FOUND = "Not found home";
    private static final String ADDRESS_REQUEST = "Home address is required";
    private static final String FLOOR_REQUEST = "Home floor is required";
    private static final String SQUARE_REQUEST = "Home square is required";
    private static final String ROOM_REQUEST = "Home room is required";
    private static final String COLOR_REQUEST = "Home color is required";
    private static final String OWNER_REQUEST = "Home owner is required";
    private static final String PAGE_SIZE_MAX = "Page size is greater than 250";

    public void validatorForSearch(Pagination pagination) {
        if (pagination.getPageSize() > 250) {
            throw new BadRequestException(PAGE_SIZE_MAX);
        }
    }

    public void validatorForAddHome(HomeReq home) {
        checkRequiredField(home.getAddress(), ADDRESS_REQUEST);
        checkRequiredField(home.getFloor().toString(), FLOOR_REQUEST);
        checkRequiredField(home.getSquare().toString(), SQUARE_REQUEST);
        checkRequiredField(home.getRoom().toString(), ROOM_REQUEST);
        checkRequiredField(home.getColor(), COLOR_REQUEST);
        checkRequiredField(home.getOwner(), OWNER_REQUEST);
    }

    public void validatorForUpdateHome(long homeId, HomeReq home) {

        validatorHomeIsExists(homeId);

        checkRequiredField(home.getAddress(), ADDRESS_REQUEST);
        checkRequiredField(home.getAddress(), ADDRESS_REQUEST);
        checkRequiredField(home.getFloor().toString(), FLOOR_REQUEST);
        checkRequiredField(home.getSquare().toString(), SQUARE_REQUEST);
        checkRequiredField(home.getRoom().toString(), ROOM_REQUEST);
    }

    public void validatorHomeIsExists(long homeId) {
        HomeEntry homeEntry = homeEntryLocalService.fetchHomeEntry(homeId);

        if (homeEntry != null) {
            return;
        }

        throw new NotFoundException(HOME_NOT_FOUND);
    }

    private void checkRequiredField(String value, String errorMsg) {
        if (value == null || value.trim().isEmpty()) {
            throw new BadRequestException(errorMsg);
        }
    }

    @Reference
    HomeEntryLocalService homeEntryLocalService;



}
