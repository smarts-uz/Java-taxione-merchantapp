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
public class com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy extends com.ourdevelops.ornidsmerchant.models.CustomerModel
    implements RealmObjectProxy, com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface {

    static final class CustomerModelColumnInfo extends ColumnInfo {
        long idColKey;
        long customer_fullnameColKey;
        long noTeleponColKey;
        long photoColKey;
        long tokenColKey;

        CustomerModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("CustomerModel");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.customer_fullnameColKey = addColumnDetails("customer_fullname", "customer_fullname", objectSchemaInfo);
            this.noTeleponColKey = addColumnDetails("noTelepon", "noTelepon", objectSchemaInfo);
            this.photoColKey = addColumnDetails("photo", "photo", objectSchemaInfo);
            this.tokenColKey = addColumnDetails("token", "token", objectSchemaInfo);
        }

        CustomerModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CustomerModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CustomerModelColumnInfo src = (CustomerModelColumnInfo) rawSrc;
            final CustomerModelColumnInfo dst = (CustomerModelColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.customer_fullnameColKey = src.customer_fullnameColKey;
            dst.noTeleponColKey = src.noTeleponColKey;
            dst.photoColKey = src.photoColKey;
            dst.tokenColKey = src.tokenColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CustomerModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ornidsmerchant.models.CustomerModel> proxyState;

    com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CustomerModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ornidsmerchant.models.CustomerModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.idColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$customer_fullname() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.customer_fullnameColKey);
    }

    @Override
    public void realmSet$customer_fullname(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.customer_fullnameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.customer_fullnameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.customer_fullnameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.customer_fullnameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$noTelepon() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.noTeleponColKey);
    }

    @Override
    public void realmSet$noTelepon(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.noTeleponColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.noTeleponColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.noTeleponColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.noTeleponColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photoColKey);
    }

    @Override
    public void realmSet$photo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photoColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.photoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photoColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$token() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tokenColKey);
    }

    @Override
    public void realmSet$token(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tokenColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.tokenColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tokenColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tokenColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("CustomerModel", 5, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("customer_fullname", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("noTelepon", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("photo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("token", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CustomerModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CustomerModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "CustomerModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CustomerModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ornidsmerchant.models.CustomerModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ornidsmerchant.models.CustomerModel obj = realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.CustomerModel.class, true, excludeFields);

        final com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((String) json.getString("id"));
            }
        }
        if (json.has("customer_fullname")) {
            if (json.isNull("customer_fullname")) {
                objProxy.realmSet$customer_fullname(null);
            } else {
                objProxy.realmSet$customer_fullname((String) json.getString("customer_fullname"));
            }
        }
        if (json.has("noTelepon")) {
            if (json.isNull("noTelepon")) {
                objProxy.realmSet$noTelepon(null);
            } else {
                objProxy.realmSet$noTelepon((String) json.getString("noTelepon"));
            }
        }
        if (json.has("photo")) {
            if (json.isNull("photo")) {
                objProxy.realmSet$photo(null);
            } else {
                objProxy.realmSet$photo((String) json.getString("photo"));
            }
        }
        if (json.has("token")) {
            if (json.isNull("token")) {
                objProxy.realmSet$token(null);
            } else {
                objProxy.realmSet$token((String) json.getString("token"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ornidsmerchant.models.CustomerModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.ourdevelops.ornidsmerchant.models.CustomerModel obj = new com.ourdevelops.ornidsmerchant.models.CustomerModel();
        final com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
            } else if (name.equals("customer_fullname")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$customer_fullname((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$customer_fullname(null);
                }
            } else if (name.equals("noTelepon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$noTelepon((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$noTelepon(null);
                }
            } else if (name.equals("photo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$photo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$photo(null);
                }
            } else if (name.equals("token")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$token((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$token(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CustomerModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy obj = new io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ornidsmerchant.models.CustomerModel copyOrUpdate(Realm realm, CustomerModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.CustomerModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ornidsmerchant.models.CustomerModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ornidsmerchant.models.CustomerModel copy(Realm realm, CustomerModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.CustomerModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ornidsmerchant.models.CustomerModel) cachedRealmObject;
        }

        com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CustomerModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.customer_fullnameColKey, realmObjectSource.realmGet$customer_fullname());
        builder.addString(columnInfo.noTeleponColKey, realmObjectSource.realmGet$noTelepon());
        builder.addString(columnInfo.photoColKey, realmObjectSource.realmGet$photo());
        builder.addString(columnInfo.tokenColKey, realmObjectSource.realmGet$token());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ornidsmerchant.models.CustomerModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CustomerModel.class);
        long tableNativePtr = table.getNativePtr();
        CustomerModelColumnInfo columnInfo = (CustomerModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CustomerModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$id = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
        }
        String realmGet$customer_fullname = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$customer_fullname();
        if (realmGet$customer_fullname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.customer_fullnameColKey, colKey, realmGet$customer_fullname, false);
        }
        String realmGet$noTelepon = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$noTelepon();
        if (realmGet$noTelepon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
        }
        String realmGet$photo = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$photo();
        if (realmGet$photo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoColKey, colKey, realmGet$photo, false);
        }
        String realmGet$token = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenColKey, colKey, realmGet$token, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CustomerModel.class);
        long tableNativePtr = table.getNativePtr();
        CustomerModelColumnInfo columnInfo = (CustomerModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CustomerModel.class);
        com.ourdevelops.ornidsmerchant.models.CustomerModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.CustomerModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$id = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
            }
            String realmGet$customer_fullname = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$customer_fullname();
            if (realmGet$customer_fullname != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.customer_fullnameColKey, colKey, realmGet$customer_fullname, false);
            }
            String realmGet$noTelepon = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$noTelepon();
            if (realmGet$noTelepon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
            }
            String realmGet$photo = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$photo();
            if (realmGet$photo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoColKey, colKey, realmGet$photo, false);
            }
            String realmGet$token = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$token();
            if (realmGet$token != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenColKey, colKey, realmGet$token, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ornidsmerchant.models.CustomerModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CustomerModel.class);
        long tableNativePtr = table.getNativePtr();
        CustomerModelColumnInfo columnInfo = (CustomerModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CustomerModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$id = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idColKey, colKey, false);
        }
        String realmGet$customer_fullname = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$customer_fullname();
        if (realmGet$customer_fullname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.customer_fullnameColKey, colKey, realmGet$customer_fullname, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.customer_fullnameColKey, colKey, false);
        }
        String realmGet$noTelepon = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$noTelepon();
        if (realmGet$noTelepon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.noTeleponColKey, colKey, false);
        }
        String realmGet$photo = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$photo();
        if (realmGet$photo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoColKey, colKey, realmGet$photo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoColKey, colKey, false);
        }
        String realmGet$token = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenColKey, colKey, realmGet$token, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tokenColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CustomerModel.class);
        long tableNativePtr = table.getNativePtr();
        CustomerModelColumnInfo columnInfo = (CustomerModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CustomerModel.class);
        com.ourdevelops.ornidsmerchant.models.CustomerModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.CustomerModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$id = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idColKey, colKey, false);
            }
            String realmGet$customer_fullname = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$customer_fullname();
            if (realmGet$customer_fullname != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.customer_fullnameColKey, colKey, realmGet$customer_fullname, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.customer_fullnameColKey, colKey, false);
            }
            String realmGet$noTelepon = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$noTelepon();
            if (realmGet$noTelepon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.noTeleponColKey, colKey, false);
            }
            String realmGet$photo = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$photo();
            if (realmGet$photo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoColKey, colKey, realmGet$photo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoColKey, colKey, false);
            }
            String realmGet$token = ((com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) object).realmGet$token();
            if (realmGet$token != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenColKey, colKey, realmGet$token, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tokenColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ornidsmerchant.models.CustomerModel createDetachedCopy(com.ourdevelops.ornidsmerchant.models.CustomerModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ornidsmerchant.models.CustomerModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ornidsmerchant.models.CustomerModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ornidsmerchant.models.CustomerModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ornidsmerchant.models.CustomerModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface realmSource = (com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$customer_fullname(realmSource.realmGet$customer_fullname());
        unmanagedCopy.realmSet$noTelepon(realmSource.realmGet$noTelepon());
        unmanagedCopy.realmSet$photo(realmSource.realmGet$photo());
        unmanagedCopy.realmSet$token(realmSource.realmGet$token());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CustomerModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{customer_fullname:");
        stringBuilder.append(realmGet$customer_fullname() != null ? realmGet$customer_fullname() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{noTelepon:");
        stringBuilder.append(realmGet$noTelepon() != null ? realmGet$noTelepon() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo:");
        stringBuilder.append(realmGet$photo() != null ? realmGet$photo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{token:");
        stringBuilder.append(realmGet$token() != null ? realmGet$token() : "null");
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
        com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy aCustomerModel = (com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aCustomerModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCustomerModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aCustomerModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
