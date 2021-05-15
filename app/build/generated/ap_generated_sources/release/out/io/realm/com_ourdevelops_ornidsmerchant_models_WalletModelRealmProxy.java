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
public class com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy extends com.ourdevelops.ornidsmerchant.models.WalletModel
    implements RealmObjectProxy, com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface {

    static final class WalletModelColumnInfo extends ColumnInfo {
        long idColKey;
        long wallet_amountColKey;
        long dateColKey;
        long typeColKey;
        long namapemilikColKey;
        long bankColKey;
        long statusColKey;

        WalletModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("WalletModel");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.wallet_amountColKey = addColumnDetails("wallet_amount", "wallet_amount", objectSchemaInfo);
            this.dateColKey = addColumnDetails("date", "date", objectSchemaInfo);
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
            this.namapemilikColKey = addColumnDetails("namapemilik", "namapemilik", objectSchemaInfo);
            this.bankColKey = addColumnDetails("bank", "bank", objectSchemaInfo);
            this.statusColKey = addColumnDetails("status", "status", objectSchemaInfo);
        }

        WalletModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new WalletModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final WalletModelColumnInfo src = (WalletModelColumnInfo) rawSrc;
            final WalletModelColumnInfo dst = (WalletModelColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.wallet_amountColKey = src.wallet_amountColKey;
            dst.dateColKey = src.dateColKey;
            dst.typeColKey = src.typeColKey;
            dst.namapemilikColKey = src.namapemilikColKey;
            dst.bankColKey = src.bankColKey;
            dst.statusColKey = src.statusColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private WalletModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ornidsmerchant.models.WalletModel> proxyState;

    com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (WalletModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ornidsmerchant.models.WalletModel>(this);
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
    public String realmGet$wallet_amount() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.wallet_amountColKey);
    }

    @Override
    public void realmSet$wallet_amount(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.wallet_amountColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.wallet_amountColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.wallet_amountColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.wallet_amountColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dateColKey);
    }

    @Override
    public void realmSet$date(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dateColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.dateColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dateColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dateColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.typeColKey);
    }

    @Override
    public void realmSet$type(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.typeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.typeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.typeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.typeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$namapemilik() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namapemilikColKey);
    }

    @Override
    public void realmSet$namapemilik(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namapemilikColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.namapemilikColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namapemilikColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namapemilikColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$bank() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.bankColKey);
    }

    @Override
    public void realmSet$bank(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.bankColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.bankColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.bankColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.bankColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusColKey);
    }

    @Override
    public void realmSet$status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.statusColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.statusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.statusColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.statusColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("WalletModel", 7, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("wallet_amount", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("date", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namapemilik", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("bank", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static WalletModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new WalletModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "WalletModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "WalletModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ornidsmerchant.models.WalletModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ornidsmerchant.models.WalletModel obj = realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.WalletModel.class, true, excludeFields);

        final com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((String) json.getString("id"));
            }
        }
        if (json.has("wallet_amount")) {
            if (json.isNull("wallet_amount")) {
                objProxy.realmSet$wallet_amount(null);
            } else {
                objProxy.realmSet$wallet_amount((String) json.getString("wallet_amount"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                objProxy.realmSet$date(null);
            } else {
                objProxy.realmSet$date((String) json.getString("date"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                objProxy.realmSet$type(null);
            } else {
                objProxy.realmSet$type((String) json.getString("type"));
            }
        }
        if (json.has("namapemilik")) {
            if (json.isNull("namapemilik")) {
                objProxy.realmSet$namapemilik(null);
            } else {
                objProxy.realmSet$namapemilik((String) json.getString("namapemilik"));
            }
        }
        if (json.has("bank")) {
            if (json.isNull("bank")) {
                objProxy.realmSet$bank(null);
            } else {
                objProxy.realmSet$bank((String) json.getString("bank"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                objProxy.realmSet$status(null);
            } else {
                objProxy.realmSet$status((String) json.getString("status"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ornidsmerchant.models.WalletModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.ourdevelops.ornidsmerchant.models.WalletModel obj = new com.ourdevelops.ornidsmerchant.models.WalletModel();
        final com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) obj;
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
            } else if (name.equals("wallet_amount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$wallet_amount((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$wallet_amount(null);
                }
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$date(null);
                }
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$type(null);
                }
            } else if (name.equals("namapemilik")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$namapemilik((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$namapemilik(null);
                }
            } else if (name.equals("bank")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bank((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$bank(null);
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.WalletModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy obj = new io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ornidsmerchant.models.WalletModel copyOrUpdate(Realm realm, WalletModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.WalletModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ornidsmerchant.models.WalletModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ornidsmerchant.models.WalletModel copy(Realm realm, WalletModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.WalletModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ornidsmerchant.models.WalletModel) cachedRealmObject;
        }

        com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.WalletModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.wallet_amountColKey, realmObjectSource.realmGet$wallet_amount());
        builder.addString(columnInfo.dateColKey, realmObjectSource.realmGet$date());
        builder.addString(columnInfo.typeColKey, realmObjectSource.realmGet$type());
        builder.addString(columnInfo.namapemilikColKey, realmObjectSource.realmGet$namapemilik());
        builder.addString(columnInfo.bankColKey, realmObjectSource.realmGet$bank());
        builder.addString(columnInfo.statusColKey, realmObjectSource.realmGet$status());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ornidsmerchant.models.WalletModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.WalletModel.class);
        long tableNativePtr = table.getNativePtr();
        WalletModelColumnInfo columnInfo = (WalletModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.WalletModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$id = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
        }
        String realmGet$wallet_amount = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$wallet_amount();
        if (realmGet$wallet_amount != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.wallet_amountColKey, colKey, realmGet$wallet_amount, false);
        }
        String realmGet$date = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateColKey, colKey, realmGet$date, false);
        }
        String realmGet$type = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, colKey, realmGet$type, false);
        }
        String realmGet$namapemilik = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$namapemilik();
        if (realmGet$namapemilik != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namapemilikColKey, colKey, realmGet$namapemilik, false);
        }
        String realmGet$bank = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$bank();
        if (realmGet$bank != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bankColKey, colKey, realmGet$bank, false);
        }
        String realmGet$status = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, colKey, realmGet$status, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.WalletModel.class);
        long tableNativePtr = table.getNativePtr();
        WalletModelColumnInfo columnInfo = (WalletModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.WalletModel.class);
        com.ourdevelops.ornidsmerchant.models.WalletModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.WalletModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$id = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
            }
            String realmGet$wallet_amount = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$wallet_amount();
            if (realmGet$wallet_amount != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.wallet_amountColKey, colKey, realmGet$wallet_amount, false);
            }
            String realmGet$date = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dateColKey, colKey, realmGet$date, false);
            }
            String realmGet$type = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, colKey, realmGet$type, false);
            }
            String realmGet$namapemilik = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$namapemilik();
            if (realmGet$namapemilik != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namapemilikColKey, colKey, realmGet$namapemilik, false);
            }
            String realmGet$bank = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$bank();
            if (realmGet$bank != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bankColKey, colKey, realmGet$bank, false);
            }
            String realmGet$status = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, colKey, realmGet$status, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ornidsmerchant.models.WalletModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.WalletModel.class);
        long tableNativePtr = table.getNativePtr();
        WalletModelColumnInfo columnInfo = (WalletModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.WalletModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$id = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idColKey, colKey, false);
        }
        String realmGet$wallet_amount = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$wallet_amount();
        if (realmGet$wallet_amount != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.wallet_amountColKey, colKey, realmGet$wallet_amount, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.wallet_amountColKey, colKey, false);
        }
        String realmGet$date = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateColKey, colKey, realmGet$date, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateColKey, colKey, false);
        }
        String realmGet$type = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, colKey, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeColKey, colKey, false);
        }
        String realmGet$namapemilik = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$namapemilik();
        if (realmGet$namapemilik != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namapemilikColKey, colKey, realmGet$namapemilik, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namapemilikColKey, colKey, false);
        }
        String realmGet$bank = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$bank();
        if (realmGet$bank != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bankColKey, colKey, realmGet$bank, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bankColKey, colKey, false);
        }
        String realmGet$status = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, colKey, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.WalletModel.class);
        long tableNativePtr = table.getNativePtr();
        WalletModelColumnInfo columnInfo = (WalletModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.WalletModel.class);
        com.ourdevelops.ornidsmerchant.models.WalletModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.WalletModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$id = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idColKey, colKey, false);
            }
            String realmGet$wallet_amount = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$wallet_amount();
            if (realmGet$wallet_amount != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.wallet_amountColKey, colKey, realmGet$wallet_amount, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.wallet_amountColKey, colKey, false);
            }
            String realmGet$date = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dateColKey, colKey, realmGet$date, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateColKey, colKey, false);
            }
            String realmGet$type = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, colKey, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeColKey, colKey, false);
            }
            String realmGet$namapemilik = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$namapemilik();
            if (realmGet$namapemilik != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namapemilikColKey, colKey, realmGet$namapemilik, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namapemilikColKey, colKey, false);
            }
            String realmGet$bank = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$bank();
            if (realmGet$bank != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bankColKey, colKey, realmGet$bank, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bankColKey, colKey, false);
            }
            String realmGet$status = ((com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, colKey, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ornidsmerchant.models.WalletModel createDetachedCopy(com.ourdevelops.ornidsmerchant.models.WalletModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ornidsmerchant.models.WalletModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ornidsmerchant.models.WalletModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ornidsmerchant.models.WalletModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ornidsmerchant.models.WalletModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface realmSource = (com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$wallet_amount(realmSource.realmGet$wallet_amount());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$namapemilik(realmSource.realmGet$namapemilik());
        unmanagedCopy.realmSet$bank(realmSource.realmGet$bank());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("WalletModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{wallet_amount:");
        stringBuilder.append(realmGet$wallet_amount() != null ? realmGet$wallet_amount() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date() != null ? realmGet$date() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type() != null ? realmGet$type() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{namapemilik:");
        stringBuilder.append(realmGet$namapemilik() != null ? realmGet$namapemilik() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{bank:");
        stringBuilder.append(realmGet$bank() != null ? realmGet$bank() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status() != null ? realmGet$status() : "null");
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
        com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy aWalletModel = (com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aWalletModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aWalletModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aWalletModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
