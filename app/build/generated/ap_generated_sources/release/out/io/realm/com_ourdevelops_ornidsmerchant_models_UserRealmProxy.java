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
public class com_ourdevelops_ornidsmerchant_models_UserRealmProxy extends com.ourdevelops.ornidsmerchant.models.User
    implements RealmObjectProxy, com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface {

    static final class UserColumnInfo extends ColumnInfo {
        long idColKey;
        long namamitraColKey;
        long partner_addressColKey;
        long emailColKey;
        long passwordColKey;
        long noTeleponColKey;
        long phoneColKey;
        long countrycodeColKey;
        long merchant_idColKey;
        long walletSaldoColKey;
        long merchant_addressColKey;
        long merchant_latitudeColKey;
        long merchant_longitudeColKey;
        long open_hourColKey;
        long close_hourColKey;
        long merchant_imageColKey;
        long namamerchantColKey;
        long merchant_tokenColKey;
        long merchant_statusColKey;

        UserColumnInfo(OsSchemaInfo schemaInfo) {
            super(19);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("User");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.namamitraColKey = addColumnDetails("namamitra", "namamitra", objectSchemaInfo);
            this.partner_addressColKey = addColumnDetails("partner_address", "partner_address", objectSchemaInfo);
            this.emailColKey = addColumnDetails("email", "email", objectSchemaInfo);
            this.passwordColKey = addColumnDetails("password", "password", objectSchemaInfo);
            this.noTeleponColKey = addColumnDetails("noTelepon", "noTelepon", objectSchemaInfo);
            this.phoneColKey = addColumnDetails("phone", "phone", objectSchemaInfo);
            this.countrycodeColKey = addColumnDetails("countrycode", "countrycode", objectSchemaInfo);
            this.merchant_idColKey = addColumnDetails("merchant_id", "merchant_id", objectSchemaInfo);
            this.walletSaldoColKey = addColumnDetails("walletSaldo", "walletSaldo", objectSchemaInfo);
            this.merchant_addressColKey = addColumnDetails("merchant_address", "merchant_address", objectSchemaInfo);
            this.merchant_latitudeColKey = addColumnDetails("merchant_latitude", "merchant_latitude", objectSchemaInfo);
            this.merchant_longitudeColKey = addColumnDetails("merchant_longitude", "merchant_longitude", objectSchemaInfo);
            this.open_hourColKey = addColumnDetails("open_hour", "open_hour", objectSchemaInfo);
            this.close_hourColKey = addColumnDetails("close_hour", "close_hour", objectSchemaInfo);
            this.merchant_imageColKey = addColumnDetails("merchant_image", "merchant_image", objectSchemaInfo);
            this.namamerchantColKey = addColumnDetails("namamerchant", "namamerchant", objectSchemaInfo);
            this.merchant_tokenColKey = addColumnDetails("merchant_token", "merchant_token", objectSchemaInfo);
            this.merchant_statusColKey = addColumnDetails("merchant_status", "merchant_status", objectSchemaInfo);
        }

        UserColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserColumnInfo src = (UserColumnInfo) rawSrc;
            final UserColumnInfo dst = (UserColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.namamitraColKey = src.namamitraColKey;
            dst.partner_addressColKey = src.partner_addressColKey;
            dst.emailColKey = src.emailColKey;
            dst.passwordColKey = src.passwordColKey;
            dst.noTeleponColKey = src.noTeleponColKey;
            dst.phoneColKey = src.phoneColKey;
            dst.countrycodeColKey = src.countrycodeColKey;
            dst.merchant_idColKey = src.merchant_idColKey;
            dst.walletSaldoColKey = src.walletSaldoColKey;
            dst.merchant_addressColKey = src.merchant_addressColKey;
            dst.merchant_latitudeColKey = src.merchant_latitudeColKey;
            dst.merchant_longitudeColKey = src.merchant_longitudeColKey;
            dst.open_hourColKey = src.open_hourColKey;
            dst.close_hourColKey = src.close_hourColKey;
            dst.merchant_imageColKey = src.merchant_imageColKey;
            dst.namamerchantColKey = src.namamerchantColKey;
            dst.merchant_tokenColKey = src.merchant_tokenColKey;
            dst.merchant_statusColKey = src.merchant_statusColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ornidsmerchant.models.User> proxyState;

    com_ourdevelops_ornidsmerchant_models_UserRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ornidsmerchant.models.User>(this);
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$namamitra() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namamitraColKey);
    }

    @Override
    public void realmSet$namamitra(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namamitraColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.namamitraColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namamitraColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namamitraColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$partner_address() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.partner_addressColKey);
    }

    @Override
    public void realmSet$partner_address(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.partner_addressColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.partner_addressColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.partner_addressColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.partner_addressColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailColKey);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.emailColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.emailColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.emailColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.emailColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$password() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passwordColKey);
    }

    @Override
    public void realmSet$password(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.passwordColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.passwordColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.passwordColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.passwordColKey, value);
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
    public String realmGet$phone() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phoneColKey);
    }

    @Override
    public void realmSet$phone(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phoneColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.phoneColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phoneColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phoneColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$countrycode() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.countrycodeColKey);
    }

    @Override
    public void realmSet$countrycode(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.countrycodeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.countrycodeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.countrycodeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.countrycodeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$merchant_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.merchant_idColKey);
    }

    @Override
    public void realmSet$merchant_id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.merchant_idColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.merchant_idColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.merchant_idColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.merchant_idColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$walletSaldo() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.walletSaldoColKey);
    }

    @Override
    public void realmSet$walletSaldo(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.walletSaldoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.walletSaldoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$merchant_address() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.merchant_addressColKey);
    }

    @Override
    public void realmSet$merchant_address(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.merchant_addressColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.merchant_addressColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.merchant_addressColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.merchant_addressColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$merchant_latitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.merchant_latitudeColKey);
    }

    @Override
    public void realmSet$merchant_latitude(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.merchant_latitudeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.merchant_latitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.merchant_latitudeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.merchant_latitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$merchant_longitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.merchant_longitudeColKey);
    }

    @Override
    public void realmSet$merchant_longitude(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.merchant_longitudeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.merchant_longitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.merchant_longitudeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.merchant_longitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$open_hour() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.open_hourColKey);
    }

    @Override
    public void realmSet$open_hour(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.open_hourColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.open_hourColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.open_hourColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.open_hourColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$close_hour() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.close_hourColKey);
    }

    @Override
    public void realmSet$close_hour(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.close_hourColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.close_hourColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.close_hourColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.close_hourColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$merchant_image() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.merchant_imageColKey);
    }

    @Override
    public void realmSet$merchant_image(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.merchant_imageColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.merchant_imageColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.merchant_imageColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.merchant_imageColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$namamerchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namamerchantColKey);
    }

    @Override
    public void realmSet$namamerchant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namamerchantColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.namamerchantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namamerchantColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namamerchantColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$merchant_token() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.merchant_tokenColKey);
    }

    @Override
    public void realmSet$merchant_token(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.merchant_tokenColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.merchant_tokenColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.merchant_tokenColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.merchant_tokenColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$merchant_status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.merchant_statusColKey);
    }

    @Override
    public void realmSet$merchant_status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.merchant_statusColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.merchant_statusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.merchant_statusColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.merchant_statusColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("User", 19, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namamitra", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("partner_address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("password", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("noTelepon", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("phone", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("countrycode", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("merchant_id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("walletSaldo", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("merchant_address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("merchant_latitude", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("merchant_longitude", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("open_hour", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("close_hour", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("merchant_image", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namamerchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("merchant_token", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("merchant_status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "User";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "User";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ornidsmerchant.models.User createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ornidsmerchant.models.User obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.User.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = Table.NO_MATCH;
            if (json.isNull("id")) {
                colKey = table.findFirstNull(pkColumnKey);
            } else {
                colKey = table.findFirstString(pkColumnKey, json.getString("id"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.User.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy) realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.User.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy) realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.User.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) obj;
        if (json.has("namamitra")) {
            if (json.isNull("namamitra")) {
                objProxy.realmSet$namamitra(null);
            } else {
                objProxy.realmSet$namamitra((String) json.getString("namamitra"));
            }
        }
        if (json.has("partner_address")) {
            if (json.isNull("partner_address")) {
                objProxy.realmSet$partner_address(null);
            } else {
                objProxy.realmSet$partner_address((String) json.getString("partner_address"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("password")) {
            if (json.isNull("password")) {
                objProxy.realmSet$password(null);
            } else {
                objProxy.realmSet$password((String) json.getString("password"));
            }
        }
        if (json.has("noTelepon")) {
            if (json.isNull("noTelepon")) {
                objProxy.realmSet$noTelepon(null);
            } else {
                objProxy.realmSet$noTelepon((String) json.getString("noTelepon"));
            }
        }
        if (json.has("phone")) {
            if (json.isNull("phone")) {
                objProxy.realmSet$phone(null);
            } else {
                objProxy.realmSet$phone((String) json.getString("phone"));
            }
        }
        if (json.has("countrycode")) {
            if (json.isNull("countrycode")) {
                objProxy.realmSet$countrycode(null);
            } else {
                objProxy.realmSet$countrycode((String) json.getString("countrycode"));
            }
        }
        if (json.has("merchant_id")) {
            if (json.isNull("merchant_id")) {
                objProxy.realmSet$merchant_id(null);
            } else {
                objProxy.realmSet$merchant_id((String) json.getString("merchant_id"));
            }
        }
        if (json.has("walletSaldo")) {
            if (json.isNull("walletSaldo")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'walletSaldo' to null.");
            } else {
                objProxy.realmSet$walletSaldo((long) json.getLong("walletSaldo"));
            }
        }
        if (json.has("merchant_address")) {
            if (json.isNull("merchant_address")) {
                objProxy.realmSet$merchant_address(null);
            } else {
                objProxy.realmSet$merchant_address((String) json.getString("merchant_address"));
            }
        }
        if (json.has("merchant_latitude")) {
            if (json.isNull("merchant_latitude")) {
                objProxy.realmSet$merchant_latitude(null);
            } else {
                objProxy.realmSet$merchant_latitude((String) json.getString("merchant_latitude"));
            }
        }
        if (json.has("merchant_longitude")) {
            if (json.isNull("merchant_longitude")) {
                objProxy.realmSet$merchant_longitude(null);
            } else {
                objProxy.realmSet$merchant_longitude((String) json.getString("merchant_longitude"));
            }
        }
        if (json.has("open_hour")) {
            if (json.isNull("open_hour")) {
                objProxy.realmSet$open_hour(null);
            } else {
                objProxy.realmSet$open_hour((String) json.getString("open_hour"));
            }
        }
        if (json.has("close_hour")) {
            if (json.isNull("close_hour")) {
                objProxy.realmSet$close_hour(null);
            } else {
                objProxy.realmSet$close_hour((String) json.getString("close_hour"));
            }
        }
        if (json.has("merchant_image")) {
            if (json.isNull("merchant_image")) {
                objProxy.realmSet$merchant_image(null);
            } else {
                objProxy.realmSet$merchant_image((String) json.getString("merchant_image"));
            }
        }
        if (json.has("namamerchant")) {
            if (json.isNull("namamerchant")) {
                objProxy.realmSet$namamerchant(null);
            } else {
                objProxy.realmSet$namamerchant((String) json.getString("namamerchant"));
            }
        }
        if (json.has("merchant_token")) {
            if (json.isNull("merchant_token")) {
                objProxy.realmSet$merchant_token(null);
            } else {
                objProxy.realmSet$merchant_token((String) json.getString("merchant_token"));
            }
        }
        if (json.has("merchant_status")) {
            if (json.isNull("merchant_status")) {
                objProxy.realmSet$merchant_status(null);
            } else {
                objProxy.realmSet$merchant_status((String) json.getString("merchant_status"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ornidsmerchant.models.User createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ornidsmerchant.models.User obj = new com.ourdevelops.ornidsmerchant.models.User();
        final com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) obj;
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
                jsonHasPrimaryKey = true;
            } else if (name.equals("namamitra")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$namamitra((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$namamitra(null);
                }
            } else if (name.equals("partner_address")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$partner_address((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$partner_address(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("password")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$password((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$password(null);
                }
            } else if (name.equals("noTelepon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$noTelepon((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$noTelepon(null);
                }
            } else if (name.equals("phone")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phone((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phone(null);
                }
            } else if (name.equals("countrycode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$countrycode((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$countrycode(null);
                }
            } else if (name.equals("merchant_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$merchant_id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$merchant_id(null);
                }
            } else if (name.equals("walletSaldo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$walletSaldo((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'walletSaldo' to null.");
                }
            } else if (name.equals("merchant_address")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$merchant_address((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$merchant_address(null);
                }
            } else if (name.equals("merchant_latitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$merchant_latitude((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$merchant_latitude(null);
                }
            } else if (name.equals("merchant_longitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$merchant_longitude((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$merchant_longitude(null);
                }
            } else if (name.equals("open_hour")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$open_hour((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$open_hour(null);
                }
            } else if (name.equals("close_hour")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$close_hour((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$close_hour(null);
                }
            } else if (name.equals("merchant_image")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$merchant_image((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$merchant_image(null);
                }
            } else if (name.equals("namamerchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$namamerchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$namamerchant(null);
                }
            } else if (name.equals("merchant_token")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$merchant_token((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$merchant_token(null);
                }
            } else if (name.equals("merchant_status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$merchant_status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$merchant_status(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ornidsmerchant_models_UserRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.User.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy obj = new io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ornidsmerchant.models.User copyOrUpdate(Realm realm, UserColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.User object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ornidsmerchant.models.User) cachedRealmObject;
        }

        com.ourdevelops.ornidsmerchant.models.User realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.User.class);
            long pkColumnKey = columnInfo.idColKey;
            String value = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$id();
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
                    realmObject = new io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ornidsmerchant.models.User copy(Realm realm, UserColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.User newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ornidsmerchant.models.User) cachedRealmObject;
        }

        com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.namamitraColKey, realmObjectSource.realmGet$namamitra());
        builder.addString(columnInfo.partner_addressColKey, realmObjectSource.realmGet$partner_address());
        builder.addString(columnInfo.emailColKey, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.passwordColKey, realmObjectSource.realmGet$password());
        builder.addString(columnInfo.noTeleponColKey, realmObjectSource.realmGet$noTelepon());
        builder.addString(columnInfo.phoneColKey, realmObjectSource.realmGet$phone());
        builder.addString(columnInfo.countrycodeColKey, realmObjectSource.realmGet$countrycode());
        builder.addString(columnInfo.merchant_idColKey, realmObjectSource.realmGet$merchant_id());
        builder.addInteger(columnInfo.walletSaldoColKey, realmObjectSource.realmGet$walletSaldo());
        builder.addString(columnInfo.merchant_addressColKey, realmObjectSource.realmGet$merchant_address());
        builder.addString(columnInfo.merchant_latitudeColKey, realmObjectSource.realmGet$merchant_latitude());
        builder.addString(columnInfo.merchant_longitudeColKey, realmObjectSource.realmGet$merchant_longitude());
        builder.addString(columnInfo.open_hourColKey, realmObjectSource.realmGet$open_hour());
        builder.addString(columnInfo.close_hourColKey, realmObjectSource.realmGet$close_hour());
        builder.addString(columnInfo.merchant_imageColKey, realmObjectSource.realmGet$merchant_image());
        builder.addString(columnInfo.namamerchantColKey, realmObjectSource.realmGet$namamerchant());
        builder.addString(columnInfo.merchant_tokenColKey, realmObjectSource.realmGet$merchant_token());
        builder.addString(columnInfo.merchant_statusColKey, realmObjectSource.realmGet$merchant_status());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ornidsmerchant.models.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.User.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$id();
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
        String realmGet$namamitra = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$namamitra();
        if (realmGet$namamitra != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namamitraColKey, colKey, realmGet$namamitra, false);
        }
        String realmGet$partner_address = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$partner_address();
        if (realmGet$partner_address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.partner_addressColKey, colKey, realmGet$partner_address, false);
        }
        String realmGet$email = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, colKey, realmGet$email, false);
        }
        String realmGet$password = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, colKey, realmGet$password, false);
        }
        String realmGet$noTelepon = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$noTelepon();
        if (realmGet$noTelepon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
        }
        String realmGet$phone = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneColKey, colKey, realmGet$phone, false);
        }
        String realmGet$countrycode = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$countrycode();
        if (realmGet$countrycode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.countrycodeColKey, colKey, realmGet$countrycode, false);
        }
        String realmGet$merchant_id = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_id();
        if (realmGet$merchant_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_idColKey, colKey, realmGet$merchant_id, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.walletSaldoColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$walletSaldo(), false);
        String realmGet$merchant_address = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_address();
        if (realmGet$merchant_address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_addressColKey, colKey, realmGet$merchant_address, false);
        }
        String realmGet$merchant_latitude = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_latitude();
        if (realmGet$merchant_latitude != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_latitudeColKey, colKey, realmGet$merchant_latitude, false);
        }
        String realmGet$merchant_longitude = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_longitude();
        if (realmGet$merchant_longitude != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_longitudeColKey, colKey, realmGet$merchant_longitude, false);
        }
        String realmGet$open_hour = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$open_hour();
        if (realmGet$open_hour != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.open_hourColKey, colKey, realmGet$open_hour, false);
        }
        String realmGet$close_hour = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$close_hour();
        if (realmGet$close_hour != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.close_hourColKey, colKey, realmGet$close_hour, false);
        }
        String realmGet$merchant_image = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_image();
        if (realmGet$merchant_image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_imageColKey, colKey, realmGet$merchant_image, false);
        }
        String realmGet$namamerchant = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$namamerchant();
        if (realmGet$namamerchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namamerchantColKey, colKey, realmGet$namamerchant, false);
        }
        String realmGet$merchant_token = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_token();
        if (realmGet$merchant_token != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_tokenColKey, colKey, realmGet$merchant_token, false);
        }
        String realmGet$merchant_status = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_status();
        if (realmGet$merchant_status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_statusColKey, colKey, realmGet$merchant_status, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.User.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ornidsmerchant.models.User object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$id();
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
            String realmGet$namamitra = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$namamitra();
            if (realmGet$namamitra != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namamitraColKey, colKey, realmGet$namamitra, false);
            }
            String realmGet$partner_address = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$partner_address();
            if (realmGet$partner_address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.partner_addressColKey, colKey, realmGet$partner_address, false);
            }
            String realmGet$email = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, colKey, realmGet$email, false);
            }
            String realmGet$password = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, colKey, realmGet$password, false);
            }
            String realmGet$noTelepon = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$noTelepon();
            if (realmGet$noTelepon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
            }
            String realmGet$phone = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$phone();
            if (realmGet$phone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneColKey, colKey, realmGet$phone, false);
            }
            String realmGet$countrycode = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$countrycode();
            if (realmGet$countrycode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.countrycodeColKey, colKey, realmGet$countrycode, false);
            }
            String realmGet$merchant_id = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_id();
            if (realmGet$merchant_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_idColKey, colKey, realmGet$merchant_id, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.walletSaldoColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$walletSaldo(), false);
            String realmGet$merchant_address = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_address();
            if (realmGet$merchant_address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_addressColKey, colKey, realmGet$merchant_address, false);
            }
            String realmGet$merchant_latitude = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_latitude();
            if (realmGet$merchant_latitude != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_latitudeColKey, colKey, realmGet$merchant_latitude, false);
            }
            String realmGet$merchant_longitude = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_longitude();
            if (realmGet$merchant_longitude != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_longitudeColKey, colKey, realmGet$merchant_longitude, false);
            }
            String realmGet$open_hour = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$open_hour();
            if (realmGet$open_hour != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.open_hourColKey, colKey, realmGet$open_hour, false);
            }
            String realmGet$close_hour = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$close_hour();
            if (realmGet$close_hour != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.close_hourColKey, colKey, realmGet$close_hour, false);
            }
            String realmGet$merchant_image = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_image();
            if (realmGet$merchant_image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_imageColKey, colKey, realmGet$merchant_image, false);
            }
            String realmGet$namamerchant = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$namamerchant();
            if (realmGet$namamerchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namamerchantColKey, colKey, realmGet$namamerchant, false);
            }
            String realmGet$merchant_token = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_token();
            if (realmGet$merchant_token != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_tokenColKey, colKey, realmGet$merchant_token, false);
            }
            String realmGet$merchant_status = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_status();
            if (realmGet$merchant_status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_statusColKey, colKey, realmGet$merchant_status, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ornidsmerchant.models.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.User.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$id();
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
        String realmGet$namamitra = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$namamitra();
        if (realmGet$namamitra != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namamitraColKey, colKey, realmGet$namamitra, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namamitraColKey, colKey, false);
        }
        String realmGet$partner_address = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$partner_address();
        if (realmGet$partner_address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.partner_addressColKey, colKey, realmGet$partner_address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.partner_addressColKey, colKey, false);
        }
        String realmGet$email = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, colKey, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailColKey, colKey, false);
        }
        String realmGet$password = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, colKey, realmGet$password, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passwordColKey, colKey, false);
        }
        String realmGet$noTelepon = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$noTelepon();
        if (realmGet$noTelepon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.noTeleponColKey, colKey, false);
        }
        String realmGet$phone = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneColKey, colKey, realmGet$phone, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneColKey, colKey, false);
        }
        String realmGet$countrycode = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$countrycode();
        if (realmGet$countrycode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.countrycodeColKey, colKey, realmGet$countrycode, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.countrycodeColKey, colKey, false);
        }
        String realmGet$merchant_id = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_id();
        if (realmGet$merchant_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_idColKey, colKey, realmGet$merchant_id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.merchant_idColKey, colKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.walletSaldoColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$walletSaldo(), false);
        String realmGet$merchant_address = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_address();
        if (realmGet$merchant_address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_addressColKey, colKey, realmGet$merchant_address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.merchant_addressColKey, colKey, false);
        }
        String realmGet$merchant_latitude = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_latitude();
        if (realmGet$merchant_latitude != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_latitudeColKey, colKey, realmGet$merchant_latitude, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.merchant_latitudeColKey, colKey, false);
        }
        String realmGet$merchant_longitude = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_longitude();
        if (realmGet$merchant_longitude != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_longitudeColKey, colKey, realmGet$merchant_longitude, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.merchant_longitudeColKey, colKey, false);
        }
        String realmGet$open_hour = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$open_hour();
        if (realmGet$open_hour != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.open_hourColKey, colKey, realmGet$open_hour, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.open_hourColKey, colKey, false);
        }
        String realmGet$close_hour = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$close_hour();
        if (realmGet$close_hour != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.close_hourColKey, colKey, realmGet$close_hour, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.close_hourColKey, colKey, false);
        }
        String realmGet$merchant_image = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_image();
        if (realmGet$merchant_image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_imageColKey, colKey, realmGet$merchant_image, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.merchant_imageColKey, colKey, false);
        }
        String realmGet$namamerchant = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$namamerchant();
        if (realmGet$namamerchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namamerchantColKey, colKey, realmGet$namamerchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namamerchantColKey, colKey, false);
        }
        String realmGet$merchant_token = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_token();
        if (realmGet$merchant_token != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_tokenColKey, colKey, realmGet$merchant_token, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.merchant_tokenColKey, colKey, false);
        }
        String realmGet$merchant_status = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_status();
        if (realmGet$merchant_status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_statusColKey, colKey, realmGet$merchant_status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.merchant_statusColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.User.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ornidsmerchant.models.User object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$id();
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
            String realmGet$namamitra = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$namamitra();
            if (realmGet$namamitra != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namamitraColKey, colKey, realmGet$namamitra, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namamitraColKey, colKey, false);
            }
            String realmGet$partner_address = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$partner_address();
            if (realmGet$partner_address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.partner_addressColKey, colKey, realmGet$partner_address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.partner_addressColKey, colKey, false);
            }
            String realmGet$email = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, colKey, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailColKey, colKey, false);
            }
            String realmGet$password = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, colKey, realmGet$password, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.passwordColKey, colKey, false);
            }
            String realmGet$noTelepon = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$noTelepon();
            if (realmGet$noTelepon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.noTeleponColKey, colKey, false);
            }
            String realmGet$phone = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$phone();
            if (realmGet$phone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneColKey, colKey, realmGet$phone, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneColKey, colKey, false);
            }
            String realmGet$countrycode = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$countrycode();
            if (realmGet$countrycode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.countrycodeColKey, colKey, realmGet$countrycode, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.countrycodeColKey, colKey, false);
            }
            String realmGet$merchant_id = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_id();
            if (realmGet$merchant_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_idColKey, colKey, realmGet$merchant_id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.merchant_idColKey, colKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.walletSaldoColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$walletSaldo(), false);
            String realmGet$merchant_address = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_address();
            if (realmGet$merchant_address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_addressColKey, colKey, realmGet$merchant_address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.merchant_addressColKey, colKey, false);
            }
            String realmGet$merchant_latitude = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_latitude();
            if (realmGet$merchant_latitude != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_latitudeColKey, colKey, realmGet$merchant_latitude, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.merchant_latitudeColKey, colKey, false);
            }
            String realmGet$merchant_longitude = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_longitude();
            if (realmGet$merchant_longitude != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_longitudeColKey, colKey, realmGet$merchant_longitude, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.merchant_longitudeColKey, colKey, false);
            }
            String realmGet$open_hour = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$open_hour();
            if (realmGet$open_hour != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.open_hourColKey, colKey, realmGet$open_hour, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.open_hourColKey, colKey, false);
            }
            String realmGet$close_hour = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$close_hour();
            if (realmGet$close_hour != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.close_hourColKey, colKey, realmGet$close_hour, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.close_hourColKey, colKey, false);
            }
            String realmGet$merchant_image = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_image();
            if (realmGet$merchant_image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_imageColKey, colKey, realmGet$merchant_image, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.merchant_imageColKey, colKey, false);
            }
            String realmGet$namamerchant = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$namamerchant();
            if (realmGet$namamerchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namamerchantColKey, colKey, realmGet$namamerchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namamerchantColKey, colKey, false);
            }
            String realmGet$merchant_token = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_token();
            if (realmGet$merchant_token != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_tokenColKey, colKey, realmGet$merchant_token, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.merchant_tokenColKey, colKey, false);
            }
            String realmGet$merchant_status = ((com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) object).realmGet$merchant_status();
            if (realmGet$merchant_status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_statusColKey, colKey, realmGet$merchant_status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.merchant_statusColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ornidsmerchant.models.User createDetachedCopy(com.ourdevelops.ornidsmerchant.models.User realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ornidsmerchant.models.User unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ornidsmerchant.models.User();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ornidsmerchant.models.User) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ornidsmerchant.models.User) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface unmanagedCopy = (com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface realmSource = (com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$namamitra(realmSource.realmGet$namamitra());
        unmanagedCopy.realmSet$partner_address(realmSource.realmGet$partner_address());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$password(realmSource.realmGet$password());
        unmanagedCopy.realmSet$noTelepon(realmSource.realmGet$noTelepon());
        unmanagedCopy.realmSet$phone(realmSource.realmGet$phone());
        unmanagedCopy.realmSet$countrycode(realmSource.realmGet$countrycode());
        unmanagedCopy.realmSet$merchant_id(realmSource.realmGet$merchant_id());
        unmanagedCopy.realmSet$walletSaldo(realmSource.realmGet$walletSaldo());
        unmanagedCopy.realmSet$merchant_address(realmSource.realmGet$merchant_address());
        unmanagedCopy.realmSet$merchant_latitude(realmSource.realmGet$merchant_latitude());
        unmanagedCopy.realmSet$merchant_longitude(realmSource.realmGet$merchant_longitude());
        unmanagedCopy.realmSet$open_hour(realmSource.realmGet$open_hour());
        unmanagedCopy.realmSet$close_hour(realmSource.realmGet$close_hour());
        unmanagedCopy.realmSet$merchant_image(realmSource.realmGet$merchant_image());
        unmanagedCopy.realmSet$namamerchant(realmSource.realmGet$namamerchant());
        unmanagedCopy.realmSet$merchant_token(realmSource.realmGet$merchant_token());
        unmanagedCopy.realmSet$merchant_status(realmSource.realmGet$merchant_status());

        return unmanagedObject;
    }

    static com.ourdevelops.ornidsmerchant.models.User update(Realm realm, UserColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.User realmObject, com.ourdevelops.ornidsmerchant.models.User newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface realmObjectTarget = (com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) realmObject;
        com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_UserRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.namamitraColKey, realmObjectSource.realmGet$namamitra());
        builder.addString(columnInfo.partner_addressColKey, realmObjectSource.realmGet$partner_address());
        builder.addString(columnInfo.emailColKey, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.passwordColKey, realmObjectSource.realmGet$password());
        builder.addString(columnInfo.noTeleponColKey, realmObjectSource.realmGet$noTelepon());
        builder.addString(columnInfo.phoneColKey, realmObjectSource.realmGet$phone());
        builder.addString(columnInfo.countrycodeColKey, realmObjectSource.realmGet$countrycode());
        builder.addString(columnInfo.merchant_idColKey, realmObjectSource.realmGet$merchant_id());
        builder.addInteger(columnInfo.walletSaldoColKey, realmObjectSource.realmGet$walletSaldo());
        builder.addString(columnInfo.merchant_addressColKey, realmObjectSource.realmGet$merchant_address());
        builder.addString(columnInfo.merchant_latitudeColKey, realmObjectSource.realmGet$merchant_latitude());
        builder.addString(columnInfo.merchant_longitudeColKey, realmObjectSource.realmGet$merchant_longitude());
        builder.addString(columnInfo.open_hourColKey, realmObjectSource.realmGet$open_hour());
        builder.addString(columnInfo.close_hourColKey, realmObjectSource.realmGet$close_hour());
        builder.addString(columnInfo.merchant_imageColKey, realmObjectSource.realmGet$merchant_image());
        builder.addString(columnInfo.namamerchantColKey, realmObjectSource.realmGet$namamerchant());
        builder.addString(columnInfo.merchant_tokenColKey, realmObjectSource.realmGet$merchant_token());
        builder.addString(columnInfo.merchant_statusColKey, realmObjectSource.realmGet$merchant_status());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("User = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{namamitra:");
        stringBuilder.append(realmGet$namamitra() != null ? realmGet$namamitra() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{partner_address:");
        stringBuilder.append(realmGet$partner_address() != null ? realmGet$partner_address() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email() != null ? realmGet$email() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{password:");
        stringBuilder.append(realmGet$password() != null ? realmGet$password() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{noTelepon:");
        stringBuilder.append(realmGet$noTelepon() != null ? realmGet$noTelepon() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phone:");
        stringBuilder.append(realmGet$phone() != null ? realmGet$phone() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{countrycode:");
        stringBuilder.append(realmGet$countrycode() != null ? realmGet$countrycode() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{merchant_id:");
        stringBuilder.append(realmGet$merchant_id() != null ? realmGet$merchant_id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{walletSaldo:");
        stringBuilder.append(realmGet$walletSaldo());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{merchant_address:");
        stringBuilder.append(realmGet$merchant_address() != null ? realmGet$merchant_address() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{merchant_latitude:");
        stringBuilder.append(realmGet$merchant_latitude() != null ? realmGet$merchant_latitude() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{merchant_longitude:");
        stringBuilder.append(realmGet$merchant_longitude() != null ? realmGet$merchant_longitude() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{open_hour:");
        stringBuilder.append(realmGet$open_hour() != null ? realmGet$open_hour() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{close_hour:");
        stringBuilder.append(realmGet$close_hour() != null ? realmGet$close_hour() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{merchant_image:");
        stringBuilder.append(realmGet$merchant_image() != null ? realmGet$merchant_image() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{namamerchant:");
        stringBuilder.append(realmGet$namamerchant() != null ? realmGet$namamerchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{merchant_token:");
        stringBuilder.append(realmGet$merchant_token() != null ? realmGet$merchant_token() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{merchant_status:");
        stringBuilder.append(realmGet$merchant_status() != null ? realmGet$merchant_status() : "null");
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
        com_ourdevelops_ornidsmerchant_models_UserRealmProxy aUser = (com_ourdevelops_ornidsmerchant_models_UserRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aUser.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUser.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aUser.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
