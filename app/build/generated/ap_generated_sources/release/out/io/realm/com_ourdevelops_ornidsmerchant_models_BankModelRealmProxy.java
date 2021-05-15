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
public class com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy extends com.ourdevelops.ornidsmerchant.models.BankModel
    implements RealmObjectProxy, com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface {

    static final class BankModelColumnInfo extends ColumnInfo {
        long bank_idColKey;
        long bank_nameColKey;
        long bank_logoColKey;
        long bank_accountColKey;

        BankModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("BankModel");
            this.bank_idColKey = addColumnDetails("bank_id", "bank_id", objectSchemaInfo);
            this.bank_nameColKey = addColumnDetails("bank_name", "bank_name", objectSchemaInfo);
            this.bank_logoColKey = addColumnDetails("bank_logo", "bank_logo", objectSchemaInfo);
            this.bank_accountColKey = addColumnDetails("bank_account", "bank_account", objectSchemaInfo);
        }

        BankModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new BankModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final BankModelColumnInfo src = (BankModelColumnInfo) rawSrc;
            final BankModelColumnInfo dst = (BankModelColumnInfo) rawDst;
            dst.bank_idColKey = src.bank_idColKey;
            dst.bank_nameColKey = src.bank_nameColKey;
            dst.bank_logoColKey = src.bank_logoColKey;
            dst.bank_accountColKey = src.bank_accountColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private BankModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ornidsmerchant.models.BankModel> proxyState;

    com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (BankModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ornidsmerchant.models.BankModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$bank_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.bank_idColKey);
    }

    @Override
    public void realmSet$bank_id(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'bank_id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$bank_name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.bank_nameColKey);
    }

    @Override
    public void realmSet$bank_name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.bank_nameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.bank_nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.bank_nameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.bank_nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$bank_logo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.bank_logoColKey);
    }

    @Override
    public void realmSet$bank_logo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.bank_logoColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.bank_logoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.bank_logoColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.bank_logoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$bank_account() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.bank_accountColKey);
    }

    @Override
    public void realmSet$bank_account(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.bank_accountColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.bank_accountColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.bank_accountColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.bank_accountColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("BankModel", 4, 0);
        builder.addPersistedProperty("bank_id", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("bank_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("bank_logo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("bank_account", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BankModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new BankModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "BankModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BankModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ornidsmerchant.models.BankModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ornidsmerchant.models.BankModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.BankModel.class);
            BankModelColumnInfo columnInfo = (BankModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.BankModel.class);
            long pkColumnKey = columnInfo.bank_idColKey;
            long colKey = Table.NO_MATCH;
            if (json.isNull("bank_id")) {
                colKey = table.findFirstNull(pkColumnKey);
            } else {
                colKey = table.findFirstString(pkColumnKey, json.getString("bank_id"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.BankModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("bank_id")) {
                if (json.isNull("bank_id")) {
                    obj = (io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.BankModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.BankModel.class, json.getString("bank_id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'bank_id'.");
            }
        }

        final com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) obj;
        if (json.has("bank_name")) {
            if (json.isNull("bank_name")) {
                objProxy.realmSet$bank_name(null);
            } else {
                objProxy.realmSet$bank_name((String) json.getString("bank_name"));
            }
        }
        if (json.has("bank_logo")) {
            if (json.isNull("bank_logo")) {
                objProxy.realmSet$bank_logo(null);
            } else {
                objProxy.realmSet$bank_logo((String) json.getString("bank_logo"));
            }
        }
        if (json.has("bank_account")) {
            if (json.isNull("bank_account")) {
                objProxy.realmSet$bank_account(null);
            } else {
                objProxy.realmSet$bank_account((String) json.getString("bank_account"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ornidsmerchant.models.BankModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ornidsmerchant.models.BankModel obj = new com.ourdevelops.ornidsmerchant.models.BankModel();
        final com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("bank_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bank_id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$bank_id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("bank_name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bank_name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$bank_name(null);
                }
            } else if (name.equals("bank_logo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bank_logo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$bank_logo(null);
                }
            } else if (name.equals("bank_account")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bank_account((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$bank_account(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'bank_id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.BankModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy obj = new io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ornidsmerchant.models.BankModel copyOrUpdate(Realm realm, BankModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.BankModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ornidsmerchant.models.BankModel) cachedRealmObject;
        }

        com.ourdevelops.ornidsmerchant.models.BankModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.BankModel.class);
            long pkColumnKey = columnInfo.bank_idColKey;
            String value = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_id();
            long colKey = Table.NO_MATCH;
            if (value == null) {
                colKey = table.findFirstNull(pkColumnKey);
            } else {
                colKey = table.findFirstString(pkColumnKey, value);
            }
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ornidsmerchant.models.BankModel copy(Realm realm, BankModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.BankModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ornidsmerchant.models.BankModel) cachedRealmObject;
        }

        com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.BankModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.bank_idColKey, realmObjectSource.realmGet$bank_id());
        builder.addString(columnInfo.bank_nameColKey, realmObjectSource.realmGet$bank_name());
        builder.addString(columnInfo.bank_logoColKey, realmObjectSource.realmGet$bank_logo());
        builder.addString(columnInfo.bank_accountColKey, realmObjectSource.realmGet$bank_account());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ornidsmerchant.models.BankModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.BankModel.class);
        long tableNativePtr = table.getNativePtr();
        BankModelColumnInfo columnInfo = (BankModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.BankModel.class);
        long pkColumnKey = columnInfo.bank_idColKey;
        String primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_id();
        long colKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            colKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            colKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$bank_name = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_name();
        if (realmGet$bank_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bank_nameColKey, colKey, realmGet$bank_name, false);
        }
        String realmGet$bank_logo = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_logo();
        if (realmGet$bank_logo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bank_logoColKey, colKey, realmGet$bank_logo, false);
        }
        String realmGet$bank_account = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_account();
        if (realmGet$bank_account != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bank_accountColKey, colKey, realmGet$bank_account, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.BankModel.class);
        long tableNativePtr = table.getNativePtr();
        BankModelColumnInfo columnInfo = (BankModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.BankModel.class);
        long pkColumnKey = columnInfo.bank_idColKey;
        com.ourdevelops.ornidsmerchant.models.BankModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.BankModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_id();
            long colKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                colKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                colKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$bank_name = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_name();
            if (realmGet$bank_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bank_nameColKey, colKey, realmGet$bank_name, false);
            }
            String realmGet$bank_logo = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_logo();
            if (realmGet$bank_logo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bank_logoColKey, colKey, realmGet$bank_logo, false);
            }
            String realmGet$bank_account = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_account();
            if (realmGet$bank_account != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bank_accountColKey, colKey, realmGet$bank_account, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ornidsmerchant.models.BankModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.BankModel.class);
        long tableNativePtr = table.getNativePtr();
        BankModelColumnInfo columnInfo = (BankModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.BankModel.class);
        long pkColumnKey = columnInfo.bank_idColKey;
        String primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_id();
        long colKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            colKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            colKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$bank_name = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_name();
        if (realmGet$bank_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bank_nameColKey, colKey, realmGet$bank_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bank_nameColKey, colKey, false);
        }
        String realmGet$bank_logo = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_logo();
        if (realmGet$bank_logo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bank_logoColKey, colKey, realmGet$bank_logo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bank_logoColKey, colKey, false);
        }
        String realmGet$bank_account = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_account();
        if (realmGet$bank_account != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bank_accountColKey, colKey, realmGet$bank_account, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bank_accountColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.BankModel.class);
        long tableNativePtr = table.getNativePtr();
        BankModelColumnInfo columnInfo = (BankModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.BankModel.class);
        long pkColumnKey = columnInfo.bank_idColKey;
        com.ourdevelops.ornidsmerchant.models.BankModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.BankModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_id();
            long colKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                colKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                colKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$bank_name = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_name();
            if (realmGet$bank_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bank_nameColKey, colKey, realmGet$bank_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bank_nameColKey, colKey, false);
            }
            String realmGet$bank_logo = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_logo();
            if (realmGet$bank_logo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bank_logoColKey, colKey, realmGet$bank_logo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bank_logoColKey, colKey, false);
            }
            String realmGet$bank_account = ((com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) object).realmGet$bank_account();
            if (realmGet$bank_account != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bank_accountColKey, colKey, realmGet$bank_account, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bank_accountColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ornidsmerchant.models.BankModel createDetachedCopy(com.ourdevelops.ornidsmerchant.models.BankModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ornidsmerchant.models.BankModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ornidsmerchant.models.BankModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ornidsmerchant.models.BankModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ornidsmerchant.models.BankModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface realmSource = (com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$bank_id(realmSource.realmGet$bank_id());
        unmanagedCopy.realmSet$bank_name(realmSource.realmGet$bank_name());
        unmanagedCopy.realmSet$bank_logo(realmSource.realmGet$bank_logo());
        unmanagedCopy.realmSet$bank_account(realmSource.realmGet$bank_account());

        return unmanagedObject;
    }

    static com.ourdevelops.ornidsmerchant.models.BankModel update(Realm realm, BankModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.BankModel realmObject, com.ourdevelops.ornidsmerchant.models.BankModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) realmObject;
        com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_BankModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.BankModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.bank_idColKey, realmObjectSource.realmGet$bank_id());
        builder.addString(columnInfo.bank_nameColKey, realmObjectSource.realmGet$bank_name());
        builder.addString(columnInfo.bank_logoColKey, realmObjectSource.realmGet$bank_logo());
        builder.addString(columnInfo.bank_accountColKey, realmObjectSource.realmGet$bank_account());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("BankModel = proxy[");
        stringBuilder.append("{bank_id:");
        stringBuilder.append(realmGet$bank_id() != null ? realmGet$bank_id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{bank_name:");
        stringBuilder.append(realmGet$bank_name() != null ? realmGet$bank_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{bank_logo:");
        stringBuilder.append(realmGet$bank_logo() != null ? realmGet$bank_logo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{bank_account:");
        stringBuilder.append(realmGet$bank_account() != null ? realmGet$bank_account() : "null");
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
        com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy aBankModel = (com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aBankModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBankModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aBankModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
