package com.poc.home.rest.internal.mapper;


import com.poc.home.model.HomeEntry;
import com.poc.home.rest.dto.v1_0_0.Home;
import org.osgi.service.component.annotations.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component(
        immediate = true,
        service = com.poc.home.rest.internal.mapper.HomeMapper.class
)
public class HomeMapper {

    public Home mapHomeFromHomeEntry(HomeEntry from) {
        Home to = new Home();

        to.setId(from.getHomeId());
        to.setAddress(from.getAddress());
        to.setFloor(from.getFloor());
        to.setSquare(from.getSquare());
        to.setRoom(from.getRoom());
        to.setColor(from.getColor());
        to.setOwner(from.getOwner());

        return to;
    }

    public List<Home> mapListHomeFromHomeEntries(List<HomeEntry> from) {
        return from.stream()
                .map(this::mapHomeFromHomeEntry)
                .collect(Collectors.toList());
    }
}
