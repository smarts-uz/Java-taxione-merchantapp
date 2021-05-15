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
public class com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy extends com.ourdevelops.ornidsmerchant.models.CategoryModel
    implements RealmObjectProxy, com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface {

    static final class CategoryModelColumnInfo extends ColumnInfo {
        long idkategoriColKey;
        long namaColKey;

        CategoryModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("CategoryModel");
            this.idkategoriColKey = addColumnDetails("idkategori", "idkategori", objectSchemaInfo);
            this.namaColKey = addColumnDetails("nama", "nama", objectSchemaInfo);
        }

        CategoryModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CategoryModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CategoryModelColumnInfo src = (CategoryModelColumnInfo) rawSrc;
            final CategoryModelColumnInfo dst = (CategoryModelColumnInfo) rawDst;
            dst.idkategoriColKey = src.idkategoriColKey;
            dst.namaColKey = src.namaColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CategoryModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ornidsmerchant.models.CategoryModel> proxyState;

    com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CategoryModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ornidsmerchant.models.CategoryModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$idkategori() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idkategoriColKey);
    }

    @Override
    public void realmSet$idkategori(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'idkategori' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nama() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namaColKey);
    }

    @Override
    public void realmSet$nama(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.namaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namaColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("CategoryModel", 2, 0);
        builder.addPersistedProperty("idkategori", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("nama", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CategoryModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CategoryModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "CategoryModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CategoryModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ornidsmerchant.models.CategoryModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ornidsmerchant.models.CategoryModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
            CategoryModelColumnInfo columnInfo = (CategoryModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
            long pkColumnKey = columnInfo.idkategoriColKey;
            long colKey = Table.NO_MATCH;
            if (!json.isNull("idkategori")) {
                colKey = table.findFirstLong(pkColumnKey, json.getLong("idkategori"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("idkategori")) {
                if (json.isNull("idkategori")) {
                    obj = (io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.CategoryModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.CategoryModel.class, json.getInt("idkategori"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'idkategori'.");
            }
        }

        final com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) obj;
        if (json.has("nama")) {
            if (json.isNull("nama")) {
                objProxy.realmSet$nama(null);
            } else {
                objProxy.realmSet$nama((String) json.getString("nama"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ornidsmerchant.models.CategoryModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ornidsmerchant.models.CategoryModel obj = new com.ourdevelops.ornidsmerchant.models.CategoryModel();
        final com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("idkategori")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idkategori((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'idkategori' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("nama")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nama((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nama(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'idkategori'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy obj = new io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ornidsmerchant.models.CategoryModel copyOrUpdate(Realm realm, CategoryModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.CategoryModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ornidsmerchant.models.CategoryModel) cachedRealmObject;
        }

        com.ourdevelops.ornidsmerchant.models.CategoryModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
            long pkColumnKey = columnInfo.idkategoriColKey;
            long colKey = table.findFirstLong(pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori());
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ornidsmerchant.models.CategoryModel copy(Realm realm, CategoryModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.CategoryModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ornidsmerchant.models.CategoryModel) cachedRealmObject;
        }

        com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idkategoriColKey, realmObjectSource.realmGet$idkategori());
        builder.addString(columnInfo.namaColKey, realmObjectSource.realmGet$nama());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ornidsmerchant.models.CategoryModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
        long tableNativePtr = table.getNativePtr();
        CategoryModelColumnInfo columnInfo = (CategoryModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
        long pkColumnKey = columnInfo.idkategoriColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$nama = ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$nama();
        if (realmGet$nama != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaColKey, colKey, realmGet$nama, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
        long tableNativePtr = table.getNativePtr();
        CategoryModelColumnInfo columnInfo = (CategoryModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
        long pkColumnKey = columnInfo.idkategoriColKey;
        com.ourdevelops.ornidsmerchant.models.CategoryModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.CategoryModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$nama = ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$nama();
            if (realmGet$nama != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaColKey, colKey, realmGet$nama, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ornidsmerchant.models.CategoryModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
        long tableNativePtr = table.getNativePtr();
        CategoryModelColumnInfo columnInfo = (CategoryModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
        long pkColumnKey = columnInfo.idkategoriColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori());
        }
        cache.put(object, colKey);
        String realmGet$nama = ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$nama();
        if (realmGet$nama != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaColKey, colKey, realmGet$nama, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
        long tableNativePtr = table.getNativePtr();
        CategoryModelColumnInfo columnInfo = (CategoryModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
        long pkColumnKey = columnInfo.idkategoriColKey;
        com.ourdevelops.ornidsmerchant.models.CategoryModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.CategoryModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$idkategori());
            }
            cache.put(object, colKey);
            String realmGet$nama = ((com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) object).realmGet$nama();
            if (realmGet$nama != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaColKey, colKey, realmGet$nama, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ornidsmerchant.models.CategoryModel createDetachedCopy(com.ourdevelops.ornidsmerchant.models.CategoryModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ornidsmerchant.models.CategoryModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ornidsmerchant.models.CategoryModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ornidsmerchant.models.CategoryModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ornidsmerchant.models.CategoryModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface realmSource = (com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$idkategori(realmSource.realmGet$idkategori());
        unmanagedCopy.realmSet$nama(realmSource.realmGet$nama());

        return unmanagedObject;
    }

    static com.ourdevelops.ornidsmerchant.models.CategoryModel update(Realm realm, CategoryModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.CategoryModel realmObject, com.ourdevelops.ornidsmerchant.models.CategoryModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) realmObject;
        com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idkategoriColKey, realmObjectSource.realmGet$idkategori());
        builder.addString(columnInfo.namaColKey, realmObjectSource.realmGet$nama());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CategoryModel = proxy[");
        stringBuilder.append("{idkategori:");
        stringBuilder.append(realmGet$idkategori());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nama:");
        stringBuilder.append(realmGet$nama() != null ? realmGet$nama() : "null");
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
        com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy aCategoryModel = (com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aCategoryModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCategoryModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aCategoryModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
