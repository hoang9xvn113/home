package com.poc.home.internal.odata.v1_0_0;


import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.odata.entity.*;
import com.poc.home.constant.SearchField;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeEntityIndexModel implements EntityModel {

    public HomeEntityIndexModel() {
        entityFieldMap = Stream.of(
                new StringEntityField(
                        SearchField.ADDRESS, locale -> Field.getSortableFieldName(SearchField.ADDRESS)
                ),
                new IntegerEntityField(
                        SearchField.FLOOR, locale -> Field.getSortableFieldName(SearchField.FLOOR)
                ),
                new DoubleEntityField(
                        SearchField.SQUARE, locale -> Field.getSortableFieldName(SearchField.SQUARE)
                ),
                new IntegerEntityField(
                        SearchField.ROOM, locale -> Field.getSortableFieldName(SearchField.ROOM)
                ),
                new StringEntityField(
                        SearchField.COLOR, locale -> Field.getSortableFieldName(SearchField.COLOR)
                ),
                new StringEntityField(
                        SearchField.OWNER, locale -> Field.getSortableFieldName(SearchField.OWNER)
                )
        ).collect(
                Collectors.toMap(EntityField::getName, Function.identity())
        );
    }

    @Override
    public Map<String, EntityField> getEntityFieldsMap() {
        return null;
    }

    private final Map<String, EntityField> entityFieldMap;
}
