package com.dogoo.poc.home.rest.internal.odata.v1_0_0;


import com.dogoo.poc.home.constant.SearchField;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.odata.entity.*;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeEntityIndexModel implements EntityModel {

    public HomeEntityIndexModel() {
        entityFieldMap = Stream.of(
                new StringEntityField(
                        SearchField.ADDRESS, locale -> Field.getSortableFieldName(SearchField.ADDRESS_STRING)
                ),
                new IntegerEntityField(
                        SearchField.FLOOR, locale -> Field.getSortableFieldName(SearchField.FLOOR_NUMBER)
                ),
                new DoubleEntityField(
                        SearchField.SQUARE, locale -> Field.getSortableFieldName(SearchField.SQUARE_NUMBER)
                ),
                new IntegerEntityField(
                        SearchField.ROOM, locale -> Field.getSortableFieldName(SearchField.ROOM_NUMBER)
                ),
                new StringEntityField(
                        SearchField.COLOR, locale -> Field.getSortableFieldName(SearchField.COLOR_STRING)
                ),
                new StringEntityField(
                        SearchField.OWNER, locale -> Field.getSortableFieldName(SearchField.OWNER_STRING)
                )
        ).collect(
                Collectors.toMap(EntityField::getName, Function.identity())
        );
    }

    @Override
    public Map<String, EntityField> getEntityFieldsMap() {
        return entityFieldMap;
    }

    private final Map<String, EntityField> entityFieldMap;
}
