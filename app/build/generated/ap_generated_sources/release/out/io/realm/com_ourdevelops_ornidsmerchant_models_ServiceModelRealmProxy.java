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
public class com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy extends com.ourdevelops.ornidsmerchant.models.ServiceModel
    implements RealmObjectProxy, com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface {

    static final class ServiceModelColumnInfo extends ColumnInfo {
        long idFiturColKey;
        long serviceColKey;

        ServiceModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ServiceModel");
            this.idFiturColKey = addColumnDetails("idFitur", "idFitur", objectSchemaInfo);
            this.serviceColKey = addColumnDetails("service", "service", objectSchemaInfo);
        }

        ServiceModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ServiceModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ServiceModelColumnInfo src = (ServiceModelColumnInfo) rawSrc;
            final ServiceModelColumnInfo dst = (ServiceModelColumnInfo) rawDst;
            dst.idFiturColKey = src.idFiturColKey;
            dst.serviceColKey = src.serviceColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ServiceModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ornidsmerchant.models.ServiceModel> proxyState;

    com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ServiceModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ornidsmerchant.models.ServiceModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$idFitur() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idFiturColKey);
    }

    @Override
    public void realmSet$idFitur(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'idFitur' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$service() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.serviceColKey);
    }

    @Override
    public void realmSet$service(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.serviceColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.serviceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.serviceColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.serviceColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ServiceModel", 2, 0);
        builder.addPersistedProperty("idFitur", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("service", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ServiceModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ServiceModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ServiceModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ServiceModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ornidsmerchant.models.ServiceModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ornidsmerchant.models.ServiceModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
            ServiceModelColumnInfo columnInfo = (ServiceModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
            long pkColumnKey = columnInfo.idFiturColKey;
            long colKey = Table.NO_MATCH;
            if (!json.isNull("idFitur")) {
                colKey = table.findFirstLong(pkColumnKey, json.getLong("idFitur"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ServiceModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("idFitur")) {
                if (json.isNull("idFitur")) {
                    obj = (io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.ServiceModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.ServiceModel.class, json.getInt("idFitur"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'idFitur'.");
            }
        }

        final com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) obj;
        if (json.has("service")) {
            if (json.isNull("service")) {
                objProxy.realmSet$service(null);
            } else {
                objProxy.realmSet$service((String) json.getString("service"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ornidsmerchant.models.ServiceModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ornidsmerchant.models.ServiceModel obj = new com.ourdevelops.ornidsmerchant.models.ServiceModel();
        final com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("idFitur")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idFitur((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'idFitur' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("service")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$service((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$service(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'idFitur'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ServiceModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy obj = new io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ornidsmerchant.models.ServiceModel copyOrUpdate(Realm realm, ServiceModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.ServiceModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ornidsmerchant.models.ServiceModel) cachedRealmObject;
        }

        com.ourdevelops.ornidsmerchant.models.ServiceModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
            long pkColumnKey = columnInfo.idFiturColKey;
            long colKey = table.findFirstLong(pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur());
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ornidsmerchant.models.ServiceModel copy(Realm realm, ServiceModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.ServiceModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ornidsmerchant.models.ServiceModel) cachedRealmObject;
        }

        com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idFiturColKey, realmObjectSource.realmGet$idFitur());
        builder.addString(columnInfo.serviceColKey, realmObjectSource.realmGet$service());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ornidsmerchant.models.ServiceModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
        long tableNativePtr = table.getNativePtr();
        ServiceModelColumnInfo columnInfo = (ServiceModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
        long pkColumnKey = columnInfo.idFiturColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$service = ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$service();
        if (realmGet$service != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.serviceColKey, colKey, realmGet$service, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
        long tableNativePtr = table.getNativePtr();
        ServiceModelColumnInfo columnInfo = (ServiceModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
        long pkColumnKey = columnInfo.idFiturColKey;
        com.ourdevelops.ornidsmerchant.models.ServiceModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.ServiceModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$service = ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$service();
            if (realmGet$service != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.serviceColKey, colKey, realmGet$service, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ornidsmerchant.models.ServiceModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
        long tableNativePtr = table.getNativePtr();
        ServiceModelColumnInfo columnInfo = (ServiceModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
        long pkColumnKey = columnInfo.idFiturColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur());
        }
        cache.put(object, colKey);
        String realmGet$service = ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$service();
        if (realmGet$service != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.serviceColKey, colKey, realmGet$service, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.serviceColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
        long tableNativePtr = table.getNativePtr();
        ServiceModelColumnInfo columnInfo = (ServiceModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
        long pkColumnKey = columnInfo.idFiturColKey;
        com.ourdevelops.ornidsmerchant.models.ServiceModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.ServiceModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$idFitur());
            }
            cache.put(object, colKey);
            String realmGet$service = ((com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) object).realmGet$service();
            if (realmGet$service != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.serviceColKey, colKey, realmGet$service, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.serviceColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ornidsmerchant.models.ServiceModel createDetachedCopy(com.ourdevelops.ornidsmerchant.models.ServiceModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ornidsmerchant.models.ServiceModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ornidsmerchant.models.ServiceModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ornidsmerchant.models.ServiceModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ornidsmerchant.models.ServiceModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface realmSource = (com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$idFitur(realmSource.realmGet$idFitur());
        unmanagedCopy.realmSet$service(realmSource.realmGet$service());

        return unmanagedObject;
    }

    static com.ourdevelops.ornidsmerchant.models.ServiceModel update(Realm realm, ServiceModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.ServiceModel realmObject, com.ourdevelops.ornidsmerchant.models.ServiceModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) realmObject;
        com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idFiturColKey, realmObjectSource.realmGet$idFitur());
        builder.addString(columnInfo.serviceColKey, realmObjectSource.realmGet$service());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ServiceModel = proxy[");
        stringBuilder.append("{idFitur:");
        stringBuilder.append(realmGet$idFitur());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{service:");
        stringBuilder.append(realmGet$service() != null ? realmGet$service() : "null");
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
        com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy aServiceModel = (com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aServiceModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aServiceModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aServiceModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
