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
public class com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy extends com.ourdevelops.ornidsmerchant.models.CategoryItemModel
    implements RealmObjectProxy, com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface {

    static final class CategoryItemModelColumnInfo extends ColumnInfo {
        long category_item_idColKey;
        long category_name_itemColKey;
        long category_statusColKey;
        long total_itemColKey;

        CategoryItemModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("CategoryItemModel");
            this.category_item_idColKey = addColumnDetails("category_item_id", "category_item_id", objectSchemaInfo);
            this.category_name_itemColKey = addColumnDetails("category_name_item", "category_name_item", objectSchemaInfo);
            this.category_statusColKey = addColumnDetails("category_status", "category_status", objectSchemaInfo);
            this.total_itemColKey = addColumnDetails("total_item", "total_item", objectSchemaInfo);
        }

        CategoryItemModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CategoryItemModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CategoryItemModelColumnInfo src = (CategoryItemModelColumnInfo) rawSrc;
            final CategoryItemModelColumnInfo dst = (CategoryItemModelColumnInfo) rawDst;
            dst.category_item_idColKey = src.category_item_idColKey;
            dst.category_name_itemColKey = src.category_name_itemColKey;
            dst.category_statusColKey = src.category_statusColKey;
            dst.total_itemColKey = src.total_itemColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CategoryItemModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ornidsmerchant.models.CategoryItemModel> proxyState;

    com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CategoryItemModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ornidsmerchant.models.CategoryItemModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$category_item_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.category_item_idColKey);
    }

    @Override
    public void realmSet$category_item_id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.category_item_idColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.category_item_idColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.category_item_idColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.category_item_idColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$category_name_item() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.category_name_itemColKey);
    }

    @Override
    public void realmSet$category_name_item(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.category_name_itemColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.category_name_itemColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.category_name_itemColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.category_name_itemColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$category_status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.category_statusColKey);
    }

    @Override
    public void realmSet$category_status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.category_statusColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.category_statusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.category_statusColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.category_statusColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$total_item() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.total_itemColKey);
    }

    @Override
    public void realmSet$total_item(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.total_itemColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.total_itemColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.total_itemColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.total_itemColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("CategoryItemModel", 4, 0);
        builder.addPersistedProperty("category_item_id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("category_name_item", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("category_status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("total_item", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CategoryItemModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CategoryItemModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "CategoryItemModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CategoryItemModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ornidsmerchant.models.CategoryItemModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ornidsmerchant.models.CategoryItemModel obj = realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class, true, excludeFields);

        final com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) obj;
        if (json.has("category_item_id")) {
            if (json.isNull("category_item_id")) {
                objProxy.realmSet$category_item_id(null);
            } else {
                objProxy.realmSet$category_item_id((String) json.getString("category_item_id"));
            }
        }
        if (json.has("category_name_item")) {
            if (json.isNull("category_name_item")) {
                objProxy.realmSet$category_name_item(null);
            } else {
                objProxy.realmSet$category_name_item((String) json.getString("category_name_item"));
            }
        }
        if (json.has("category_status")) {
            if (json.isNull("category_status")) {
                objProxy.realmSet$category_status(null);
            } else {
                objProxy.realmSet$category_status((String) json.getString("category_status"));
            }
        }
        if (json.has("total_item")) {
            if (json.isNull("total_item")) {
                objProxy.realmSet$total_item(null);
            } else {
                objProxy.realmSet$total_item((String) json.getString("total_item"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ornidsmerchant.models.CategoryItemModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.ourdevelops.ornidsmerchant.models.CategoryItemModel obj = new com.ourdevelops.ornidsmerchant.models.CategoryItemModel();
        final com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("category_item_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$category_item_id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$category_item_id(null);
                }
            } else if (name.equals("category_name_item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$category_name_item((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$category_name_item(null);
                }
            } else if (name.equals("category_status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$category_status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$category_status(null);
                }
            } else if (name.equals("total_item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$total_item((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$total_item(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy obj = new io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ornidsmerchant.models.CategoryItemModel copyOrUpdate(Realm realm, CategoryItemModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.CategoryItemModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ornidsmerchant.models.CategoryItemModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ornidsmerchant.models.CategoryItemModel copy(Realm realm, CategoryItemModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.CategoryItemModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ornidsmerchant.models.CategoryItemModel) cachedRealmObject;
        }

        com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.category_item_idColKey, realmObjectSource.realmGet$category_item_id());
        builder.addString(columnInfo.category_name_itemColKey, realmObjectSource.realmGet$category_name_item());
        builder.addString(columnInfo.category_statusColKey, realmObjectSource.realmGet$category_status());
        builder.addString(columnInfo.total_itemColKey, realmObjectSource.realmGet$total_item());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ornidsmerchant.models.CategoryItemModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class);
        long tableNativePtr = table.getNativePtr();
        CategoryItemModelColumnInfo columnInfo = (CategoryItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$category_item_id = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$category_item_id();
        if (realmGet$category_item_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.category_item_idColKey, colKey, realmGet$category_item_id, false);
        }
        String realmGet$category_name_item = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$category_name_item();
        if (realmGet$category_name_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.category_name_itemColKey, colKey, realmGet$category_name_item, false);
        }
        String realmGet$category_status = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$category_status();
        if (realmGet$category_status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.category_statusColKey, colKey, realmGet$category_status, false);
        }
        String realmGet$total_item = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$total_item();
        if (realmGet$total_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.total_itemColKey, colKey, realmGet$total_item, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class);
        long tableNativePtr = table.getNativePtr();
        CategoryItemModelColumnInfo columnInfo = (CategoryItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class);
        com.ourdevelops.ornidsmerchant.models.CategoryItemModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.CategoryItemModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$category_item_id = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$category_item_id();
            if (realmGet$category_item_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.category_item_idColKey, colKey, realmGet$category_item_id, false);
            }
            String realmGet$category_name_item = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$category_name_item();
            if (realmGet$category_name_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.category_name_itemColKey, colKey, realmGet$category_name_item, false);
            }
            String realmGet$category_status = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$category_status();
            if (realmGet$category_status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.category_statusColKey, colKey, realmGet$category_status, false);
            }
            String realmGet$total_item = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$total_item();
            if (realmGet$total_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.total_itemColKey, colKey, realmGet$total_item, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ornidsmerchant.models.CategoryItemModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class);
        long tableNativePtr = table.getNativePtr();
        CategoryItemModelColumnInfo columnInfo = (CategoryItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$category_item_id = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$category_item_id();
        if (realmGet$category_item_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.category_item_idColKey, colKey, realmGet$category_item_id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.category_item_idColKey, colKey, false);
        }
        String realmGet$category_name_item = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$category_name_item();
        if (realmGet$category_name_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.category_name_itemColKey, colKey, realmGet$category_name_item, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.category_name_itemColKey, colKey, false);
        }
        String realmGet$category_status = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$category_status();
        if (realmGet$category_status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.category_statusColKey, colKey, realmGet$category_status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.category_statusColKey, colKey, false);
        }
        String realmGet$total_item = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$total_item();
        if (realmGet$total_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.total_itemColKey, colKey, realmGet$total_item, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.total_itemColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class);
        long tableNativePtr = table.getNativePtr();
        CategoryItemModelColumnInfo columnInfo = (CategoryItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class);
        com.ourdevelops.ornidsmerchant.models.CategoryItemModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.CategoryItemModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$category_item_id = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$category_item_id();
            if (realmGet$category_item_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.category_item_idColKey, colKey, realmGet$category_item_id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.category_item_idColKey, colKey, false);
            }
            String realmGet$category_name_item = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$category_name_item();
            if (realmGet$category_name_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.category_name_itemColKey, colKey, realmGet$category_name_item, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.category_name_itemColKey, colKey, false);
            }
            String realmGet$category_status = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$category_status();
            if (realmGet$category_status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.category_statusColKey, colKey, realmGet$category_status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.category_statusColKey, colKey, false);
            }
            String realmGet$total_item = ((com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) object).realmGet$total_item();
            if (realmGet$total_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.total_itemColKey, colKey, realmGet$total_item, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.total_itemColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ornidsmerchant.models.CategoryItemModel createDetachedCopy(com.ourdevelops.ornidsmerchant.models.CategoryItemModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ornidsmerchant.models.CategoryItemModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ornidsmerchant.models.CategoryItemModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ornidsmerchant.models.CategoryItemModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ornidsmerchant.models.CategoryItemModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface realmSource = (com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$category_item_id(realmSource.realmGet$category_item_id());
        unmanagedCopy.realmSet$category_name_item(realmSource.realmGet$category_name_item());
        unmanagedCopy.realmSet$category_status(realmSource.realmGet$category_status());
        unmanagedCopy.realmSet$total_item(realmSource.realmGet$total_item());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CategoryItemModel = proxy[");
        stringBuilder.append("{category_item_id:");
        stringBuilder.append(realmGet$category_item_id() != null ? realmGet$category_item_id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{category_name_item:");
        stringBuilder.append(realmGet$category_name_item() != null ? realmGet$category_name_item() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{category_status:");
        stringBuilder.append(realmGet$category_status() != null ? realmGet$category_status() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{total_item:");
        stringBuilder.append(realmGet$total_item() != null ? realmGet$total_item() : "null");
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
        com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy aCategoryItemModel = (com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aCategoryItemModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCategoryItemModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aCategoryItemModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
