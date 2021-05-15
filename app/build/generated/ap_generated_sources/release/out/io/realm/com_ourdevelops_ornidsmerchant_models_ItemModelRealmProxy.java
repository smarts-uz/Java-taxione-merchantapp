package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy extends com.ourdevelops.ornidsmerchant.models.ItemModel
    implements RealmObjectProxy, com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface {

    static final class ItemModelColumnInfo extends ColumnInfo {
        long item_idColKey;
        long item_nameColKey;
        long item_priceColKey;
        long promo_priceColKey;
        long item_categoryColKey;
        long item_descColKey;
        long item_imageColKey;
        long promo_statusColKey;
        long item_statusColKey;

        ItemModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ItemModel");
            this.item_idColKey = addColumnDetails("item_id", "item_id", objectSchemaInfo);
            this.item_nameColKey = addColumnDetails("item_name", "item_name", objectSchemaInfo);
            this.item_priceColKey = addColumnDetails("item_price", "item_price", objectSchemaInfo);
            this.promo_priceColKey = addColumnDetails("promo_price", "promo_price", objectSchemaInfo);
            this.item_categoryColKey = addColumnDetails("item_category", "item_category", objectSchemaInfo);
            this.item_descColKey = addColumnDetails("item_desc", "item_desc", objectSchemaInfo);
            this.item_imageColKey = addColumnDetails("item_image", "item_image", objectSchemaInfo);
            this.promo_statusColKey = addColumnDetails("promo_status", "promo_status", objectSchemaInfo);
            this.item_statusColKey = addColumnDetails("item_status", "item_status", objectSchemaInfo);
        }

        ItemModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ItemModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ItemModelColumnInfo src = (ItemModelColumnInfo) rawSrc;
            final ItemModelColumnInfo dst = (ItemModelColumnInfo) rawDst;
            dst.item_idColKey = src.item_idColKey;
            dst.item_nameColKey = src.item_nameColKey;
            dst.item_priceColKey = src.item_priceColKey;
            dst.promo_priceColKey = src.promo_priceColKey;
            dst.item_categoryColKey = src.item_categoryColKey;
            dst.item_descColKey = src.item_descColKey;
            dst.item_imageColKey = src.item_imageColKey;
            dst.promo_statusColKey = src.promo_statusColKey;
            dst.item_statusColKey = src.item_statusColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ItemModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ornidsmerchant.models.ItemModel> proxyState;

    com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ItemModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ornidsmerchant.models.ItemModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$item_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.item_idColKey);
    }

    @Override
    public void realmSet$item_id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'item_id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$item_name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.item_nameColKey);
    }

    @Override
    public void realmSet$item_name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.item_nameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.item_nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.item_nameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.item_nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$item_price() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.item_priceColKey);
    }

    @Override
    public void realmSet$item_price(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.item_priceColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.item_priceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.item_priceColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.item_priceColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$promo_price() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.promo_priceColKey);
    }

    @Override
    public void realmSet$promo_price(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.promo_priceColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.promo_priceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.promo_priceColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.promo_priceColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$item_category() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.item_categoryColKey);
    }

    @Override
    public void realmSet$item_category(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.item_categoryColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.item_categoryColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.item_categoryColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.item_categoryColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$item_desc() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.item_descColKey);
    }

    @Override
    public void realmSet$item_desc(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.item_descColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.item_descColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.item_descColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.item_descColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$item_image() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.item_imageColKey);
    }

    @Override
    public void realmSet$item_image(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.item_imageColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.item_imageColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.item_imageColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.item_imageColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$promo_status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.promo_statusColKey);
    }

    @Override
    public void realmSet$promo_status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.promo_statusColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.promo_statusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.promo_statusColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.promo_statusColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$item_status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.item_statusColKey);
    }

    @Override
    public void realmSet$item_status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.item_statusColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.item_statusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.item_statusColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.item_statusColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ItemModel", 9, 0);
        builder.addPersistedProperty("item_id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("item_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("item_price", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("promo_price", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("item_category", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("item_desc", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("item_image", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("promo_status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("item_status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ItemModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ItemModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ItemModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ItemModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ornidsmerchant.models.ItemModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ornidsmerchant.models.ItemModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
            ItemModelColumnInfo columnInfo = (ItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
            long pkColumnKey = columnInfo.item_idColKey;
            long colKey = Table.NO_MATCH;
            if (!json.isNull("item_id")) {
                colKey = table.findFirstLong(pkColumnKey, json.getLong("item_id"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("item_id")) {
                if (json.isNull("item_id")) {
                    obj = (io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.ItemModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.ItemModel.class, json.getInt("item_id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'item_id'.");
            }
        }

        final com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) obj;
        if (json.has("item_name")) {
            if (json.isNull("item_name")) {
                objProxy.realmSet$item_name(null);
            } else {
                objProxy.realmSet$item_name((String) json.getString("item_name"));
            }
        }
        if (json.has("item_price")) {
            if (json.isNull("item_price")) {
                objProxy.realmSet$item_price(null);
            } else {
                objProxy.realmSet$item_price((String) json.getString("item_price"));
            }
        }
        if (json.has("promo_price")) {
            if (json.isNull("promo_price")) {
                objProxy.realmSet$promo_price(null);
            } else {
                objProxy.realmSet$promo_price((String) json.getString("promo_price"));
            }
        }
        if (json.has("item_category")) {
            if (json.isNull("item_category")) {
                objProxy.realmSet$item_category(null);
            } else {
                objProxy.realmSet$item_category((String) json.getString("item_category"));
            }
        }
        if (json.has("item_desc")) {
            if (json.isNull("item_desc")) {
                objProxy.realmSet$item_desc(null);
            } else {
                objProxy.realmSet$item_desc((String) json.getString("item_desc"));
            }
        }
        if (json.has("item_image")) {
            if (json.isNull("item_image")) {
                objProxy.realmSet$item_image(null);
            } else {
                objProxy.realmSet$item_image((String) json.getString("item_image"));
            }
        }
        if (json.has("promo_status")) {
            if (json.isNull("promo_status")) {
                objProxy.realmSet$promo_status(null);
            } else {
                objProxy.realmSet$promo_status((String) json.getString("promo_status"));
            }
        }
        if (json.has("item_status")) {
            if (json.isNull("item_status")) {
                objProxy.realmSet$item_status(null);
            } else {
                objProxy.realmSet$item_status((String) json.getString("item_status"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ornidsmerchant.models.ItemModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ornidsmerchant.models.ItemModel obj = new com.ourdevelops.ornidsmerchant.models.ItemModel();
        final com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("item_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$item_id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'item_id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("item_name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$item_name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$item_name(null);
                }
            } else if (name.equals("item_price")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$item_price((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$item_price(null);
                }
            } else if (name.equals("promo_price")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$promo_price((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$promo_price(null);
                }
            } else if (name.equals("item_category")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$item_category((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$item_category(null);
                }
            } else if (name.equals("item_desc")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$item_desc((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$item_desc(null);
                }
            } else if (name.equals("item_image")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$item_image((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$item_image(null);
                }
            } else if (name.equals("promo_status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$promo_status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$promo_status(null);
                }
            } else if (name.equals("item_status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$item_status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$item_status(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'item_id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy obj = new io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ornidsmerchant.models.ItemModel copyOrUpdate(Realm realm, ItemModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.ItemModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ornidsmerchant.models.ItemModel) cachedRealmObject;
        }

        com.ourdevelops.ornidsmerchant.models.ItemModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
            long pkColumnKey = columnInfo.item_idColKey;
            long colKey = table.findFirstLong(pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id());
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ornidsmerchant.models.ItemModel copy(Realm realm, ItemModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.ItemModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ornidsmerchant.models.ItemModel) cachedRealmObject;
        }

        com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.item_idColKey, realmObjectSource.realmGet$item_id());
        builder.addString(columnInfo.item_nameColKey, realmObjectSource.realmGet$item_name());
        builder.addString(columnInfo.item_priceColKey, realmObjectSource.realmGet$item_price());
        builder.addString(columnInfo.promo_priceColKey, realmObjectSource.realmGet$promo_price());
        builder.addString(columnInfo.item_categoryColKey, realmObjectSource.realmGet$item_category());
        builder.addString(columnInfo.item_descColKey, realmObjectSource.realmGet$item_desc());
        builder.addString(columnInfo.item_imageColKey, realmObjectSource.realmGet$item_image());
        builder.addString(columnInfo.promo_statusColKey, realmObjectSource.realmGet$promo_status());
        builder.addString(columnInfo.item_statusColKey, realmObjectSource.realmGet$item_status());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ornidsmerchant.models.ItemModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemModelColumnInfo columnInfo = (ItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
        long pkColumnKey = columnInfo.item_idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$item_name = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_name();
        if (realmGet$item_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_nameColKey, colKey, realmGet$item_name, false);
        }
        String realmGet$item_price = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_price();
        if (realmGet$item_price != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_priceColKey, colKey, realmGet$item_price, false);
        }
        String realmGet$promo_price = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$promo_price();
        if (realmGet$promo_price != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.promo_priceColKey, colKey, realmGet$promo_price, false);
        }
        String realmGet$item_category = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_category();
        if (realmGet$item_category != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_categoryColKey, colKey, realmGet$item_category, false);
        }
        String realmGet$item_desc = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_desc();
        if (realmGet$item_desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_descColKey, colKey, realmGet$item_desc, false);
        }
        String realmGet$item_image = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_image();
        if (realmGet$item_image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_imageColKey, colKey, realmGet$item_image, false);
        }
        String realmGet$promo_status = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$promo_status();
        if (realmGet$promo_status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.promo_statusColKey, colKey, realmGet$promo_status, false);
        }
        String realmGet$item_status = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_status();
        if (realmGet$item_status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_statusColKey, colKey, realmGet$item_status, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemModelColumnInfo columnInfo = (ItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
        long pkColumnKey = columnInfo.item_idColKey;
        com.ourdevelops.ornidsmerchant.models.ItemModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.ItemModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$item_name = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_name();
            if (realmGet$item_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_nameColKey, colKey, realmGet$item_name, false);
            }
            String realmGet$item_price = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_price();
            if (realmGet$item_price != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_priceColKey, colKey, realmGet$item_price, false);
            }
            String realmGet$promo_price = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$promo_price();
            if (realmGet$promo_price != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.promo_priceColKey, colKey, realmGet$promo_price, false);
            }
            String realmGet$item_category = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_category();
            if (realmGet$item_category != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_categoryColKey, colKey, realmGet$item_category, false);
            }
            String realmGet$item_desc = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_desc();
            if (realmGet$item_desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_descColKey, colKey, realmGet$item_desc, false);
            }
            String realmGet$item_image = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_image();
            if (realmGet$item_image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_imageColKey, colKey, realmGet$item_image, false);
            }
            String realmGet$promo_status = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$promo_status();
            if (realmGet$promo_status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.promo_statusColKey, colKey, realmGet$promo_status, false);
            }
            String realmGet$item_status = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_status();
            if (realmGet$item_status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_statusColKey, colKey, realmGet$item_status, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ornidsmerchant.models.ItemModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemModelColumnInfo columnInfo = (ItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
        long pkColumnKey = columnInfo.item_idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id());
        }
        cache.put(object, colKey);
        String realmGet$item_name = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_name();
        if (realmGet$item_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_nameColKey, colKey, realmGet$item_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.item_nameColKey, colKey, false);
        }
        String realmGet$item_price = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_price();
        if (realmGet$item_price != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_priceColKey, colKey, realmGet$item_price, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.item_priceColKey, colKey, false);
        }
        String realmGet$promo_price = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$promo_price();
        if (realmGet$promo_price != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.promo_priceColKey, colKey, realmGet$promo_price, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.promo_priceColKey, colKey, false);
        }
        String realmGet$item_category = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_category();
        if (realmGet$item_category != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_categoryColKey, colKey, realmGet$item_category, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.item_categoryColKey, colKey, false);
        }
        String realmGet$item_desc = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_desc();
        if (realmGet$item_desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_descColKey, colKey, realmGet$item_desc, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.item_descColKey, colKey, false);
        }
        String realmGet$item_image = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_image();
        if (realmGet$item_image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_imageColKey, colKey, realmGet$item_image, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.item_imageColKey, colKey, false);
        }
        String realmGet$promo_status = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$promo_status();
        if (realmGet$promo_status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.promo_statusColKey, colKey, realmGet$promo_status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.promo_statusColKey, colKey, false);
        }
        String realmGet$item_status = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_status();
        if (realmGet$item_status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_statusColKey, colKey, realmGet$item_status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.item_statusColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemModelColumnInfo columnInfo = (ItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
        long pkColumnKey = columnInfo.item_idColKey;
        com.ourdevelops.ornidsmerchant.models.ItemModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.ItemModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_id());
            }
            cache.put(object, colKey);
            String realmGet$item_name = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_name();
            if (realmGet$item_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_nameColKey, colKey, realmGet$item_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.item_nameColKey, colKey, false);
            }
            String realmGet$item_price = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_price();
            if (realmGet$item_price != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_priceColKey, colKey, realmGet$item_price, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.item_priceColKey, colKey, false);
            }
            String realmGet$promo_price = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$promo_price();
            if (realmGet$promo_price != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.promo_priceColKey, colKey, realmGet$promo_price, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.promo_priceColKey, colKey, false);
            }
            String realmGet$item_category = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_category();
            if (realmGet$item_category != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_categoryColKey, colKey, realmGet$item_category, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.item_categoryColKey, colKey, false);
            }
            String realmGet$item_desc = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_desc();
            if (realmGet$item_desc != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_descColKey, colKey, realmGet$item_desc, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.item_descColKey, colKey, false);
            }
            String realmGet$item_image = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_image();
            if (realmGet$item_image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_imageColKey, colKey, realmGet$item_image, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.item_imageColKey, colKey, false);
            }
            String realmGet$promo_status = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$promo_status();
            if (realmGet$promo_status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.promo_statusColKey, colKey, realmGet$promo_status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.promo_statusColKey, colKey, false);
            }
            String realmGet$item_status = ((com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) object).realmGet$item_status();
            if (realmGet$item_status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_statusColKey, colKey, realmGet$item_status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.item_statusColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ornidsmerchant.models.ItemModel createDetachedCopy(com.ourdevelops.ornidsmerchant.models.ItemModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ornidsmerchant.models.ItemModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ornidsmerchant.models.ItemModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ornidsmerchant.models.ItemModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ornidsmerchant.models.ItemModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface realmSource = (com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$item_id(realmSource.realmGet$item_id());
        unmanagedCopy.realmSet$item_name(realmSource.realmGet$item_name());
        unmanagedCopy.realmSet$item_price(realmSource.realmGet$item_price());
        unmanagedCopy.realmSet$promo_price(realmSource.realmGet$promo_price());
        unmanagedCopy.realmSet$item_category(realmSource.realmGet$item_category());
        unmanagedCopy.realmSet$item_desc(realmSource.realmGet$item_desc());
        unmanagedCopy.realmSet$item_image(realmSource.realmGet$item_image());
        unmanagedCopy.realmSet$promo_status(realmSource.realmGet$promo_status());
        unmanagedCopy.realmSet$item_status(realmSource.realmGet$item_status());

        return unmanagedObject;
    }

    static com.ourdevelops.ornidsmerchant.models.ItemModel update(Realm realm, ItemModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.ItemModel realmObject, com.ourdevelops.ornidsmerchant.models.ItemModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) realmObject;
        com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.item_idColKey, realmObjectSource.realmGet$item_id());
        builder.addString(columnInfo.item_nameColKey, realmObjectSource.realmGet$item_name());
        builder.addString(columnInfo.item_priceColKey, realmObjectSource.realmGet$item_price());
        builder.addString(columnInfo.promo_priceColKey, realmObjectSource.realmGet$promo_price());
        builder.addString(columnInfo.item_categoryColKey, realmObjectSource.realmGet$item_category());
        builder.addString(columnInfo.item_descColKey, realmObjectSource.realmGet$item_desc());
        builder.addString(columnInfo.item_imageColKey, realmObjectSource.realmGet$item_image());
        builder.addString(columnInfo.promo_statusColKey, realmObjectSource.realmGet$promo_status());
        builder.addString(columnInfo.item_statusColKey, realmObjectSource.realmGet$item_status());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ItemModel = proxy[");
        stringBuilder.append("{item_id:");
        stringBuilder.append(realmGet$item_id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{item_name:");
        stringBuilder.append(realmGet$item_name() != null ? realmGet$item_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{item_price:");
        stringBuilder.append(realmGet$item_price() != null ? realmGet$item_price() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{promo_price:");
        stringBuilder.append(realmGet$promo_price() != null ? realmGet$promo_price() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{item_category:");
        stringBuilder.append(realmGet$item_category() != null ? realmGet$item_category() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{item_desc:");
        stringBuilder.append(realmGet$item_desc() != null ? realmGet$item_desc() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{item_image:");
        stringBuilder.append(realmGet$item_image() != null ? realmGet$item_image() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{promo_status:");
        stringBuilder.append(realmGet$promo_status() != null ? realmGet$promo_status() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{item_status:");
        stringBuilder.append(realmGet$item_status() != null ? realmGet$item_status() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long colKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (colKey ^ (colKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy aItemModel = (com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aItemModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aItemModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aItemModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
