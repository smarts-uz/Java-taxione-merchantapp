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
public class com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy extends com.ourdevelops.ornidsmerchant.models.ItemOrderModel
    implements RealmObjectProxy, com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface {

    static final class ItemOrderModelColumnInfo extends ColumnInfo {
        long item_nameColKey;
        long item_amountColKey;
        long noteColKey;
        long totalhargaColKey;

        ItemOrderModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ItemOrderModel");
            this.item_nameColKey = addColumnDetails("item_name", "item_name", objectSchemaInfo);
            this.item_amountColKey = addColumnDetails("item_amount", "item_amount", objectSchemaInfo);
            this.noteColKey = addColumnDetails("note", "note", objectSchemaInfo);
            this.totalhargaColKey = addColumnDetails("totalharga", "totalharga", objectSchemaInfo);
        }

        ItemOrderModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ItemOrderModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ItemOrderModelColumnInfo src = (ItemOrderModelColumnInfo) rawSrc;
            final ItemOrderModelColumnInfo dst = (ItemOrderModelColumnInfo) rawDst;
            dst.item_nameColKey = src.item_nameColKey;
            dst.item_amountColKey = src.item_amountColKey;
            dst.noteColKey = src.noteColKey;
            dst.totalhargaColKey = src.totalhargaColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ItemOrderModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ornidsmerchant.models.ItemOrderModel> proxyState;

    com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ItemOrderModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ornidsmerchant.models.ItemOrderModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
    public String realmGet$item_amount() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.item_amountColKey);
    }

    @Override
    public void realmSet$item_amount(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.item_amountColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.item_amountColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.item_amountColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.item_amountColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$note() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.noteColKey);
    }

    @Override
    public void realmSet$note(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.noteColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.noteColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.noteColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.noteColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$totalharga() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.totalhargaColKey);
    }

    @Override
    public void realmSet$totalharga(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.totalhargaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.totalhargaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.totalhargaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.totalhargaColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ItemOrderModel", 4, 0);
        builder.addPersistedProperty("item_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("item_amount", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("note", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("totalharga", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ItemOrderModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ItemOrderModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ItemOrderModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ItemOrderModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ornidsmerchant.models.ItemOrderModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ornidsmerchant.models.ItemOrderModel obj = realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class, true, excludeFields);

        final com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) obj;
        if (json.has("item_name")) {
            if (json.isNull("item_name")) {
                objProxy.realmSet$item_name(null);
            } else {
                objProxy.realmSet$item_name((String) json.getString("item_name"));
            }
        }
        if (json.has("item_amount")) {
            if (json.isNull("item_amount")) {
                objProxy.realmSet$item_amount(null);
            } else {
                objProxy.realmSet$item_amount((String) json.getString("item_amount"));
            }
        }
        if (json.has("note")) {
            if (json.isNull("note")) {
                objProxy.realmSet$note(null);
            } else {
                objProxy.realmSet$note((String) json.getString("note"));
            }
        }
        if (json.has("totalharga")) {
            if (json.isNull("totalharga")) {
                objProxy.realmSet$totalharga(null);
            } else {
                objProxy.realmSet$totalharga((String) json.getString("totalharga"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ornidsmerchant.models.ItemOrderModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.ourdevelops.ornidsmerchant.models.ItemOrderModel obj = new com.ourdevelops.ornidsmerchant.models.ItemOrderModel();
        final com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("item_name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$item_name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$item_name(null);
                }
            } else if (name.equals("item_amount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$item_amount((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$item_amount(null);
                }
            } else if (name.equals("note")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$note((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$note(null);
                }
            } else if (name.equals("totalharga")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$totalharga((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$totalharga(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy obj = new io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ornidsmerchant.models.ItemOrderModel copyOrUpdate(Realm realm, ItemOrderModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.ItemOrderModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ornidsmerchant.models.ItemOrderModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ornidsmerchant.models.ItemOrderModel copy(Realm realm, ItemOrderModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.ItemOrderModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ornidsmerchant.models.ItemOrderModel) cachedRealmObject;
        }

        com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.item_nameColKey, realmObjectSource.realmGet$item_name());
        builder.addString(columnInfo.item_amountColKey, realmObjectSource.realmGet$item_amount());
        builder.addString(columnInfo.noteColKey, realmObjectSource.realmGet$note());
        builder.addString(columnInfo.totalhargaColKey, realmObjectSource.realmGet$totalharga());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ornidsmerchant.models.ItemOrderModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemOrderModelColumnInfo columnInfo = (ItemOrderModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$item_name = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$item_name();
        if (realmGet$item_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_nameColKey, colKey, realmGet$item_name, false);
        }
        String realmGet$item_amount = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$item_amount();
        if (realmGet$item_amount != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_amountColKey, colKey, realmGet$item_amount, false);
        }
        String realmGet$note = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$note();
        if (realmGet$note != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noteColKey, colKey, realmGet$note, false);
        }
        String realmGet$totalharga = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$totalharga();
        if (realmGet$totalharga != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.totalhargaColKey, colKey, realmGet$totalharga, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemOrderModelColumnInfo columnInfo = (ItemOrderModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class);
        com.ourdevelops.ornidsmerchant.models.ItemOrderModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.ItemOrderModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$item_name = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$item_name();
            if (realmGet$item_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_nameColKey, colKey, realmGet$item_name, false);
            }
            String realmGet$item_amount = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$item_amount();
            if (realmGet$item_amount != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_amountColKey, colKey, realmGet$item_amount, false);
            }
            String realmGet$note = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$note();
            if (realmGet$note != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noteColKey, colKey, realmGet$note, false);
            }
            String realmGet$totalharga = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$totalharga();
            if (realmGet$totalharga != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.totalhargaColKey, colKey, realmGet$totalharga, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ornidsmerchant.models.ItemOrderModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemOrderModelColumnInfo columnInfo = (ItemOrderModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$item_name = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$item_name();
        if (realmGet$item_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_nameColKey, colKey, realmGet$item_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.item_nameColKey, colKey, false);
        }
        String realmGet$item_amount = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$item_amount();
        if (realmGet$item_amount != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.item_amountColKey, colKey, realmGet$item_amount, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.item_amountColKey, colKey, false);
        }
        String realmGet$note = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$note();
        if (realmGet$note != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noteColKey, colKey, realmGet$note, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.noteColKey, colKey, false);
        }
        String realmGet$totalharga = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$totalharga();
        if (realmGet$totalharga != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.totalhargaColKey, colKey, realmGet$totalharga, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.totalhargaColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemOrderModelColumnInfo columnInfo = (ItemOrderModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class);
        com.ourdevelops.ornidsmerchant.models.ItemOrderModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.ItemOrderModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$item_name = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$item_name();
            if (realmGet$item_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_nameColKey, colKey, realmGet$item_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.item_nameColKey, colKey, false);
            }
            String realmGet$item_amount = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$item_amount();
            if (realmGet$item_amount != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.item_amountColKey, colKey, realmGet$item_amount, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.item_amountColKey, colKey, false);
            }
            String realmGet$note = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$note();
            if (realmGet$note != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noteColKey, colKey, realmGet$note, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.noteColKey, colKey, false);
            }
            String realmGet$totalharga = ((com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) object).realmGet$totalharga();
            if (realmGet$totalharga != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.totalhargaColKey, colKey, realmGet$totalharga, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.totalhargaColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ornidsmerchant.models.ItemOrderModel createDetachedCopy(com.ourdevelops.ornidsmerchant.models.ItemOrderModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ornidsmerchant.models.ItemOrderModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ornidsmerchant.models.ItemOrderModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ornidsmerchant.models.ItemOrderModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ornidsmerchant.models.ItemOrderModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface realmSource = (com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$item_name(realmSource.realmGet$item_name());
        unmanagedCopy.realmSet$item_amount(realmSource.realmGet$item_amount());
        unmanagedCopy.realmSet$note(realmSource.realmGet$note());
        unmanagedCopy.realmSet$totalharga(realmSource.realmGet$totalharga());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ItemOrderModel = proxy[");
        stringBuilder.append("{item_name:");
        stringBuilder.append(realmGet$item_name() != null ? realmGet$item_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{item_amount:");
        stringBuilder.append(realmGet$item_amount() != null ? realmGet$item_amount() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{note:");
        stringBuilder.append(realmGet$note() != null ? realmGet$note() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{totalharga:");
        stringBuilder.append(realmGet$totalharga() != null ? realmGet$totalharga() : "null");
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
        com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy aItemOrderModel = (com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aItemOrderModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aItemOrderModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aItemOrderModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
