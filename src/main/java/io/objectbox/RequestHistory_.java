
package io.objectbox;

import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;
import io.objectbox.internal.IdGetter;

import java.util.HashMap;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * Properties for entity "RequestHistory". Can be used for QueryBuilder and for referencing DB names.
 */
public final class RequestHistory_ implements EntityInfo<RequestHistory> {

    // Leading underscores for static constants to avoid naming conflicts with property names

    public static final String __ENTITY_NAME = "RequestHistory";

    public static final int __ENTITY_ID = 1;

    public static final Class<RequestHistory> __ENTITY_CLASS = RequestHistory.class;

    public static final String __DB_NAME = "RequestHistory";

    public static final CursorFactory<RequestHistory> __CURSOR_FACTORY = new RequestHistoryCursor.Factory();

    @Internal
    static final RequestHistoryIdGetter __ID_GETTER = new RequestHistoryIdGetter();

    public final static RequestHistory_ __INSTANCE = new RequestHistory_();

    public final static Property<RequestHistory> id =
        new Property<>(__INSTANCE, 0, 1, long.class, "id", true, "id");

    public final static Property<RequestHistory> method =
        new Property<>(__INSTANCE, 1, 2, String.class, "method");

    public final static Property<RequestHistory> url =
        new Property<>(__INSTANCE, 2, 3, String.class, "url");

    public final static Property<RequestHistory> headers =
        new Property<>(__INSTANCE, 3, 4, String.class, "headers", false, "headers", RequestHistory.MapConverter.class, HashMap.class);

    public final static Property<RequestHistory> queryMaps =
        new Property<>(__INSTANCE, 4, 5, String.class, "queryMaps", false, "queryMaps", RequestHistory.MapConverter.class, HashMap.class);

    public final static Property<RequestHistory> bodyJson =
        new Property<>(__INSTANCE, 5, 6, String.class, "bodyJson");

    public final static Property<RequestHistory> date =
        new Property<>(__INSTANCE, 6, 7, java.util.Date.class, "date");

    @SuppressWarnings("unchecked")
    public final static Property<RequestHistory>[] __ALL_PROPERTIES = new Property[]{
        id,
        method,
        url,
        headers,
        queryMaps,
        bodyJson,
        date
    };

    public final static Property<RequestHistory> __ID_PROPERTY = id;

    @Override
    public String getEntityName() {
        return __ENTITY_NAME;
    }

    @Override
    public int getEntityId() {
        return __ENTITY_ID;
    }

    @Override
    public Class<RequestHistory> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override
    public String getDbName() {
        return __DB_NAME;
    }

    @Override
    public Property<RequestHistory>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override
    public Property<RequestHistory> getIdProperty() {
        return __ID_PROPERTY;
    }

    @Override
    public IdGetter<RequestHistory> getIdGetter() {
        return __ID_GETTER;
    }

    @Override
    public CursorFactory<RequestHistory> getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Internal
    static final class RequestHistoryIdGetter implements IdGetter<RequestHistory> {
        @Override
        public long getId(RequestHistory object) {
            return object.id;
        }
    }

}