package com.dogoo.poc.home.rest.internal.mockdata;

import com.dogoo.poc.home.rest.dto.v1_0_0.Home;
import com.dogoo.poc.home.rest.dto.v1_0_0.HomeReq;

public class HomeMockDataUtil {

    public static HomeReq buildHomeReq(String address, int floor,
                                       float square, int room,
                                       String color, String owner) {
        HomeReq home = new HomeReq();

        home.setAddress(address);
        home.setFloor(floor);
        home.setSquare(square);
        home.setRoom(room);
        home.setColor(color);
        home.setOwner(owner);

        return home;
    }
}
