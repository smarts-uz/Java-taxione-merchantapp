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
public class com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy extends com.ourdevelops.ornidsmerchant.models.TransModel
    implements RealmObjectProxy, com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface {

    static final class TransModelColumnInfo extends ColumnInfo {
        long idColKey;
        long validation_codeColKey;
        long idPelangganColKey;
        long idDriverColKey;
        long orderFiturColKey;
        long startLatitudeColKey;
        long startLongitudeColKey;
        long endLatitudeColKey;
        long endLongitudeColKey;
        long distanceColKey;
        long priceColKey;
        long waktuOrderColKey;
        long waktuSelesaiColKey;
        long alamatAsalColKey;
        long alamatTujuanColKey;
        long kodePromoColKey;
        long kreditPromoColKey;
        long pakaiWalletColKey;
        long rateColKey;
        long statusColKey;
        long estimasiColKey;
        long namaPengirimColKey;
        long teleponPengirimColKey;
        long namaPenerimaColKey;
        long teleponPenerimaColKey;
        long namaBarangColKey;
        long final_costColKey;
        long total_priceColKey;
        long merchant_nameColKey;

        TransModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(29);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("TransModel");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.validation_codeColKey = addColumnDetails("validation_code", "validation_code", objectSchemaInfo);
            this.idPelangganColKey = addColumnDetails("idPelanggan", "idPelanggan", objectSchemaInfo);
            this.idDriverColKey = addColumnDetails("idDriver", "idDriver", objectSchemaInfo);
            this.orderFiturColKey = addColumnDetails("orderFitur", "orderFitur", objectSchemaInfo);
            this.startLatitudeColKey = addColumnDetails("startLatitude", "startLatitude", objectSchemaInfo);
            this.startLongitudeColKey = addColumnDetails("startLongitude", "startLongitude", objectSchemaInfo);
            this.endLatitudeColKey = addColumnDetails("endLatitude", "endLatitude", objectSchemaInfo);
            this.endLongitudeColKey = addColumnDetails("endLongitude", "endLongitude", objectSchemaInfo);
            this.distanceColKey = addColumnDetails("distance", "distance", objectSchemaInfo);
            this.priceColKey = addColumnDetails("price", "price", objectSchemaInfo);
            this.waktuOrderColKey = addColumnDetails("waktuOrder", "waktuOrder", objectSchemaInfo);
            this.waktuSelesaiColKey = addColumnDetails("waktuSelesai", "waktuSelesai", objectSchemaInfo);
            this.alamatAsalColKey = addColumnDetails("alamatAsal", "alamatAsal", objectSchemaInfo);
            this.alamatTujuanColKey = addColumnDetails("alamatTujuan", "alamatTujuan", objectSchemaInfo);
            this.kodePromoColKey = addColumnDetails("kodePromo", "kodePromo", objectSchemaInfo);
            this.kreditPromoColKey = addColumnDetails("kreditPromo", "kreditPromo", objectSchemaInfo);
            this.pakaiWalletColKey = addColumnDetails("pakaiWallet", "pakaiWallet", objectSchemaInfo);
            this.rateColKey = addColumnDetails("rate", "rate", objectSchemaInfo);
            this.statusColKey = addColumnDetails("status", "status", objectSchemaInfo);
            this.estimasiColKey = addColumnDetails("estimasi", "estimasi", objectSchemaInfo);
            this.namaPengirimColKey = addColumnDetails("namaPengirim", "namaPengirim", objectSchemaInfo);
            this.teleponPengirimColKey = addColumnDetails("teleponPengirim", "teleponPengirim", objectSchemaInfo);
            this.namaPenerimaColKey = addColumnDetails("namaPenerima", "namaPenerima", objectSchemaInfo);
            this.teleponPenerimaColKey = addColumnDetails("teleponPenerima", "teleponPenerima", objectSchemaInfo);
            this.namaBarangColKey = addColumnDetails("namaBarang", "namaBarang", objectSchemaInfo);
            this.final_costColKey = addColumnDetails("final_cost", "final_cost", objectSchemaInfo);
            this.total_priceColKey = addColumnDetails("total_price", "total_price", objectSchemaInfo);
            this.merchant_nameColKey = addColumnDetails("merchant_name", "merchant_name", objectSchemaInfo);
        }

        TransModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TransModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TransModelColumnInfo src = (TransModelColumnInfo) rawSrc;
            final TransModelColumnInfo dst = (TransModelColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.validation_codeColKey = src.validation_codeColKey;
            dst.idPelangganColKey = src.idPelangganColKey;
            dst.idDriverColKey = src.idDriverColKey;
            dst.orderFiturColKey = src.orderFiturColKey;
            dst.startLatitudeColKey = src.startLatitudeColKey;
            dst.startLongitudeColKey = src.startLongitudeColKey;
            dst.endLatitudeColKey = src.endLatitudeColKey;
            dst.endLongitudeColKey = src.endLongitudeColKey;
            dst.distanceColKey = src.distanceColKey;
            dst.priceColKey = src.priceColKey;
            dst.waktuOrderColKey = src.waktuOrderColKey;
            dst.waktuSelesaiColKey = src.waktuSelesaiColKey;
            dst.alamatAsalColKey = src.alamatAsalColKey;
            dst.alamatTujuanColKey = src.alamatTujuanColKey;
            dst.kodePromoColKey = src.kodePromoColKey;
            dst.kreditPromoColKey = src.kreditPromoColKey;
            dst.pakaiWalletColKey = src.pakaiWalletColKey;
            dst.rateColKey = src.rateColKey;
            dst.statusColKey = src.statusColKey;
            dst.estimasiColKey = src.estimasiColKey;
            dst.namaPengirimColKey = src.namaPengirimColKey;
            dst.teleponPengirimColKey = src.teleponPengirimColKey;
            dst.namaPenerimaColKey = src.namaPenerimaColKey;
            dst.teleponPenerimaColKey = src.teleponPenerimaColKey;
            dst.namaBarangColKey = src.namaBarangColKey;
            dst.final_costColKey = src.final_costColKey;
            dst.total_priceColKey = src.total_priceColKey;
            dst.merchant_nameColKey = src.merchant_nameColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private TransModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ornidsmerchant.models.TransModel> proxyState;

    com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TransModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ornidsmerchant.models.TransModel>(this);
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
    public String realmGet$validation_code() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.validation_codeColKey);
    }

    @Override
    public void realmSet$validation_code(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.validation_codeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.validation_codeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.validation_codeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.validation_codeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$idPelanggan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idPelangganColKey);
    }

    @Override
    public void realmSet$idPelanggan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idPelangganColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.idPelangganColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idPelangganColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idPelangganColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$idDriver() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idDriverColKey);
    }

    @Override
    public void realmSet$idDriver(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idDriverColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.idDriverColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idDriverColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idDriverColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$orderFitur() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.orderFiturColKey);
    }

    @Override
    public void realmSet$orderFitur(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.orderFiturColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.orderFiturColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.orderFiturColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.orderFiturColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$startLatitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.startLatitudeColKey);
    }

    @Override
    public void realmSet$startLatitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.startLatitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.startLatitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$startLongitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.startLongitudeColKey);
    }

    @Override
    public void realmSet$startLongitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.startLongitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.startLongitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$endLatitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.endLatitudeColKey);
    }

    @Override
    public void realmSet$endLatitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.endLatitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.endLatitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$endLongitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.endLongitudeColKey);
    }

    @Override
    public void realmSet$endLongitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.endLongitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.endLongitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$distance() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.distanceColKey);
    }

    @Override
    public void realmSet$distance(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.distanceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.distanceColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$price() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.priceColKey);
    }

    @Override
    public void realmSet$price(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.priceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.priceColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$waktuOrder() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.waktuOrderColKey)) {
            return null;
        }
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.waktuOrderColKey);
    }

    @Override
    public void realmSet$waktuOrder(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.waktuOrderColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setDate(columnInfo.waktuOrderColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.waktuOrderColKey);
            return;
        }
        proxyState.getRow$realm().setDate(columnInfo.waktuOrderColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$waktuSelesai() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.waktuSelesaiColKey)) {
            return null;
        }
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.waktuSelesaiColKey);
    }

    @Override
    public void realmSet$waktuSelesai(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.waktuSelesaiColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setDate(columnInfo.waktuSelesaiColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.waktuSelesaiColKey);
            return;
        }
        proxyState.getRow$realm().setDate(columnInfo.waktuSelesaiColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$alamatAsal() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.alamatAsalColKey);
    }

    @Override
    public void realmSet$alamatAsal(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.alamatAsalColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.alamatAsalColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.alamatAsalColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.alamatAsalColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$alamatTujuan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.alamatTujuanColKey);
    }

    @Override
    public void realmSet$alamatTujuan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.alamatTujuanColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.alamatTujuanColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.alamatTujuanColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.alamatTujuanColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kodePromo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kodePromoColKey);
    }

    @Override
    public void realmSet$kodePromo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kodePromoColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.kodePromoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kodePromoColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kodePromoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kreditPromo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kreditPromoColKey);
    }

    @Override
    public void realmSet$kreditPromo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kreditPromoColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.kreditPromoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kreditPromoColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kreditPromoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$pakaiWallet() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.pakaiWalletColKey);
    }

    @Override
    public void realmSet$pakaiWallet(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.pakaiWalletColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.pakaiWalletColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$rate() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.rateColKey);
    }

    @Override
    public void realmSet$rate(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.rateColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.rateColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.rateColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.rateColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.statusColKey);
    }

    @Override
    public void realmSet$status(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.statusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.statusColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$estimasi() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.estimasiColKey);
    }

    @Override
    public void realmSet$estimasi(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.estimasiColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.estimasiColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.estimasiColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.estimasiColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$namaPengirim() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namaPengirimColKey);
    }

    @Override
    public void realmSet$namaPengirim(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namaPengirimColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.namaPengirimColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namaPengirimColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namaPengirimColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$teleponPengirim() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.teleponPengirimColKey);
    }

    @Override
    public void realmSet$teleponPengirim(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.teleponPengirimColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.teleponPengirimColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.teleponPengirimColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.teleponPengirimColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$namaPenerima() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namaPenerimaColKey);
    }

    @Override
    public void realmSet$namaPenerima(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namaPenerimaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.namaPenerimaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namaPenerimaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namaPenerimaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$teleponPenerima() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.teleponPenerimaColKey);
    }

    @Override
    public void realmSet$teleponPenerima(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.teleponPenerimaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.teleponPenerimaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.teleponPenerimaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.teleponPenerimaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$namaBarang() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namaBarangColKey);
    }

    @Override
    public void realmSet$namaBarang(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namaBarangColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.namaBarangColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namaBarangColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namaBarangColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$final_cost() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.final_costColKey);
    }

    @Override
    public void realmSet$final_cost(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.final_costColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.final_costColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.final_costColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.final_costColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$total_price() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.total_priceColKey);
    }

    @Override
    public void realmSet$total_price(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.total_priceColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.total_priceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.total_priceColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.total_priceColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$merchant_name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.merchant_nameColKey);
    }

    @Override
    public void realmSet$merchant_name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.merchant_nameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.merchant_nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.merchant_nameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.merchant_nameColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("TransModel", 29, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("validation_code", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("idPelanggan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("idDriver", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("orderFitur", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("startLatitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("startLongitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("endLatitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("endLongitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("distance", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("price", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("waktuOrder", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("waktuSelesai", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("alamatAsal", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("alamatTujuan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kodePromo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kreditPromo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("pakaiWallet", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rate", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("status", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("estimasi", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namaPengirim", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("teleponPengirim", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namaPenerima", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("teleponPenerima", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namaBarang", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("final_cost", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("total_price", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("merchant_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TransModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new TransModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "TransModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TransModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ornidsmerchant.models.TransModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ornidsmerchant.models.TransModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.TransModel.class);
            TransModelColumnInfo columnInfo = (TransModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.TransModel.class);
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
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.TransModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.TransModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ornidsmerchant.models.TransModel.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) obj;
        if (json.has("validation_code")) {
            if (json.isNull("validation_code")) {
                objProxy.realmSet$validation_code(null);
            } else {
                objProxy.realmSet$validation_code((String) json.getString("validation_code"));
            }
        }
        if (json.has("idPelanggan")) {
            if (json.isNull("idPelanggan")) {
                objProxy.realmSet$idPelanggan(null);
            } else {
                objProxy.realmSet$idPelanggan((String) json.getString("idPelanggan"));
            }
        }
        if (json.has("idDriver")) {
            if (json.isNull("idDriver")) {
                objProxy.realmSet$idDriver(null);
            } else {
                objProxy.realmSet$idDriver((String) json.getString("idDriver"));
            }
        }
        if (json.has("orderFitur")) {
            if (json.isNull("orderFitur")) {
                objProxy.realmSet$orderFitur(null);
            } else {
                objProxy.realmSet$orderFitur((String) json.getString("orderFitur"));
            }
        }
        if (json.has("startLatitude")) {
            if (json.isNull("startLatitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'startLatitude' to null.");
            } else {
                objProxy.realmSet$startLatitude((double) json.getDouble("startLatitude"));
            }
        }
        if (json.has("startLongitude")) {
            if (json.isNull("startLongitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'startLongitude' to null.");
            } else {
                objProxy.realmSet$startLongitude((double) json.getDouble("startLongitude"));
            }
        }
        if (json.has("endLatitude")) {
            if (json.isNull("endLatitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'endLatitude' to null.");
            } else {
                objProxy.realmSet$endLatitude((double) json.getDouble("endLatitude"));
            }
        }
        if (json.has("endLongitude")) {
            if (json.isNull("endLongitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'endLongitude' to null.");
            } else {
                objProxy.realmSet$endLongitude((double) json.getDouble("endLongitude"));
            }
        }
        if (json.has("distance")) {
            if (json.isNull("distance")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'distance' to null.");
            } else {
                objProxy.realmSet$distance((double) json.getDouble("distance"));
            }
        }
        if (json.has("price")) {
            if (json.isNull("price")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'price' to null.");
            } else {
                objProxy.realmSet$price((long) json.getLong("price"));
            }
        }
        if (json.has("waktuOrder")) {
            if (json.isNull("waktuOrder")) {
                objProxy.realmSet$waktuOrder(null);
            } else {
                Object timestamp = json.get("waktuOrder");
                if (timestamp instanceof String) {
                    objProxy.realmSet$waktuOrder(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$waktuOrder(new Date(json.getLong("waktuOrder")));
                }
            }
        }
        if (json.has("waktuSelesai")) {
            if (json.isNull("waktuSelesai")) {
                objProxy.realmSet$waktuSelesai(null);
            } else {
                Object timestamp = json.get("waktuSelesai");
                if (timestamp instanceof String) {
                    objProxy.realmSet$waktuSelesai(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$waktuSelesai(new Date(json.getLong("waktuSelesai")));
                }
            }
        }
        if (json.has("alamatAsal")) {
            if (json.isNull("alamatAsal")) {
                objProxy.realmSet$alamatAsal(null);
            } else {
                objProxy.realmSet$alamatAsal((String) json.getString("alamatAsal"));
            }
        }
        if (json.has("alamatTujuan")) {
            if (json.isNull("alamatTujuan")) {
                objProxy.realmSet$alamatTujuan(null);
            } else {
                objProxy.realmSet$alamatTujuan((String) json.getString("alamatTujuan"));
            }
        }
        if (json.has("kodePromo")) {
            if (json.isNull("kodePromo")) {
                objProxy.realmSet$kodePromo(null);
            } else {
                objProxy.realmSet$kodePromo((String) json.getString("kodePromo"));
            }
        }
        if (json.has("kreditPromo")) {
            if (json.isNull("kreditPromo")) {
                objProxy.realmSet$kreditPromo(null);
            } else {
                objProxy.realmSet$kreditPromo((String) json.getString("kreditPromo"));
            }
        }
        if (json.has("pakaiWallet")) {
            if (json.isNull("pakaiWallet")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'pakaiWallet' to null.");
            } else {
                objProxy.realmSet$pakaiWallet((boolean) json.getBoolean("pakaiWallet"));
            }
        }
        if (json.has("rate")) {
            if (json.isNull("rate")) {
                objProxy.realmSet$rate(null);
            } else {
                objProxy.realmSet$rate((String) json.getString("rate"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
            } else {
                objProxy.realmSet$status((int) json.getInt("status"));
            }
        }
        if (json.has("estimasi")) {
            if (json.isNull("estimasi")) {
                objProxy.realmSet$estimasi(null);
            } else {
                objProxy.realmSet$estimasi((String) json.getString("estimasi"));
            }
        }
        if (json.has("namaPengirim")) {
            if (json.isNull("namaPengirim")) {
                objProxy.realmSet$namaPengirim(null);
            } else {
                objProxy.realmSet$namaPengirim((String) json.getString("namaPengirim"));
            }
        }
        if (json.has("teleponPengirim")) {
            if (json.isNull("teleponPengirim")) {
                objProxy.realmSet$teleponPengirim(null);
            } else {
                objProxy.realmSet$teleponPengirim((String) json.getString("teleponPengirim"));
            }
        }
        if (json.has("namaPenerima")) {
            if (json.isNull("namaPenerima")) {
                objProxy.realmSet$namaPenerima(null);
            } else {
                objProxy.realmSet$namaPenerima((String) json.getString("namaPenerima"));
            }
        }
        if (json.has("teleponPenerima")) {
            if (json.isNull("teleponPenerima")) {
                objProxy.realmSet$teleponPenerima(null);
            } else {
                objProxy.realmSet$teleponPenerima((String) json.getString("teleponPenerima"));
            }
        }
        if (json.has("namaBarang")) {
            if (json.isNull("namaBarang")) {
                objProxy.realmSet$namaBarang(null);
            } else {
                objProxy.realmSet$namaBarang((String) json.getString("namaBarang"));
            }
        }
        if (json.has("final_cost")) {
            if (json.isNull("final_cost")) {
                objProxy.realmSet$final_cost(null);
            } else {
                objProxy.realmSet$final_cost((String) json.getString("final_cost"));
            }
        }
        if (json.has("total_price")) {
            if (json.isNull("total_price")) {
                objProxy.realmSet$total_price(null);
            } else {
                objProxy.realmSet$total_price((String) json.getString("total_price"));
            }
        }
        if (json.has("merchant_name")) {
            if (json.isNull("merchant_name")) {
                objProxy.realmSet$merchant_name(null);
            } else {
                objProxy.realmSet$merchant_name((String) json.getString("merchant_name"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ornidsmerchant.models.TransModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ornidsmerchant.models.TransModel obj = new com.ourdevelops.ornidsmerchant.models.TransModel();
        final com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface objProxy = (com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) obj;
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
            } else if (name.equals("validation_code")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$validation_code((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$validation_code(null);
                }
            } else if (name.equals("idPelanggan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idPelanggan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$idPelanggan(null);
                }
            } else if (name.equals("idDriver")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idDriver((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$idDriver(null);
                }
            } else if (name.equals("orderFitur")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$orderFitur((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$orderFitur(null);
                }
            } else if (name.equals("startLatitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$startLatitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'startLatitude' to null.");
                }
            } else if (name.equals("startLongitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$startLongitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'startLongitude' to null.");
                }
            } else if (name.equals("endLatitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$endLatitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'endLatitude' to null.");
                }
            } else if (name.equals("endLongitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$endLongitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'endLongitude' to null.");
                }
            } else if (name.equals("distance")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$distance((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'distance' to null.");
                }
            } else if (name.equals("price")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$price((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'price' to null.");
                }
            } else if (name.equals("waktuOrder")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$waktuOrder(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$waktuOrder(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$waktuOrder(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("waktuSelesai")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$waktuSelesai(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$waktuSelesai(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$waktuSelesai(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("alamatAsal")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$alamatAsal((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$alamatAsal(null);
                }
            } else if (name.equals("alamatTujuan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$alamatTujuan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$alamatTujuan(null);
                }
            } else if (name.equals("kodePromo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kodePromo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kodePromo(null);
                }
            } else if (name.equals("kreditPromo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kreditPromo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kreditPromo(null);
                }
            } else if (name.equals("pakaiWallet")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pakaiWallet((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'pakaiWallet' to null.");
                }
            } else if (name.equals("rate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rate((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$rate(null);
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
                }
            } else if (name.equals("estimasi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$estimasi((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$estimasi(null);
                }
            } else if (name.equals("namaPengirim")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$namaPengirim((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$namaPengirim(null);
                }
            } else if (name.equals("teleponPengirim")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$teleponPengirim((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$teleponPengirim(null);
                }
            } else if (name.equals("namaPenerima")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$namaPenerima((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$namaPenerima(null);
                }
            } else if (name.equals("teleponPenerima")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$teleponPenerima((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$teleponPenerima(null);
                }
            } else if (name.equals("namaBarang")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$namaBarang((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$namaBarang(null);
                }
            } else if (name.equals("final_cost")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$final_cost((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$final_cost(null);
                }
            } else if (name.equals("total_price")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$total_price((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$total_price(null);
                }
            } else if (name.equals("merchant_name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$merchant_name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$merchant_name(null);
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

    private static com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.TransModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy obj = new io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ornidsmerchant.models.TransModel copyOrUpdate(Realm realm, TransModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.TransModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ornidsmerchant.models.TransModel) cachedRealmObject;
        }

        com.ourdevelops.ornidsmerchant.models.TransModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.TransModel.class);
            long pkColumnKey = columnInfo.idColKey;
            String value = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$id();
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
                    realmObject = new io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ornidsmerchant.models.TransModel copy(Realm realm, TransModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.TransModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ornidsmerchant.models.TransModel) cachedRealmObject;
        }

        com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.TransModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.validation_codeColKey, realmObjectSource.realmGet$validation_code());
        builder.addString(columnInfo.idPelangganColKey, realmObjectSource.realmGet$idPelanggan());
        builder.addString(columnInfo.idDriverColKey, realmObjectSource.realmGet$idDriver());
        builder.addString(columnInfo.orderFiturColKey, realmObjectSource.realmGet$orderFitur());
        builder.addDouble(columnInfo.startLatitudeColKey, realmObjectSource.realmGet$startLatitude());
        builder.addDouble(columnInfo.startLongitudeColKey, realmObjectSource.realmGet$startLongitude());
        builder.addDouble(columnInfo.endLatitudeColKey, realmObjectSource.realmGet$endLatitude());
        builder.addDouble(columnInfo.endLongitudeColKey, realmObjectSource.realmGet$endLongitude());
        builder.addDouble(columnInfo.distanceColKey, realmObjectSource.realmGet$distance());
        builder.addInteger(columnInfo.priceColKey, realmObjectSource.realmGet$price());
        builder.addDate(columnInfo.waktuOrderColKey, realmObjectSource.realmGet$waktuOrder());
        builder.addDate(columnInfo.waktuSelesaiColKey, realmObjectSource.realmGet$waktuSelesai());
        builder.addString(columnInfo.alamatAsalColKey, realmObjectSource.realmGet$alamatAsal());
        builder.addString(columnInfo.alamatTujuanColKey, realmObjectSource.realmGet$alamatTujuan());
        builder.addString(columnInfo.kodePromoColKey, realmObjectSource.realmGet$kodePromo());
        builder.addString(columnInfo.kreditPromoColKey, realmObjectSource.realmGet$kreditPromo());
        builder.addBoolean(columnInfo.pakaiWalletColKey, realmObjectSource.realmGet$pakaiWallet());
        builder.addString(columnInfo.rateColKey, realmObjectSource.realmGet$rate());
        builder.addInteger(columnInfo.statusColKey, realmObjectSource.realmGet$status());
        builder.addString(columnInfo.estimasiColKey, realmObjectSource.realmGet$estimasi());
        builder.addString(columnInfo.namaPengirimColKey, realmObjectSource.realmGet$namaPengirim());
        builder.addString(columnInfo.teleponPengirimColKey, realmObjectSource.realmGet$teleponPengirim());
        builder.addString(columnInfo.namaPenerimaColKey, realmObjectSource.realmGet$namaPenerima());
        builder.addString(columnInfo.teleponPenerimaColKey, realmObjectSource.realmGet$teleponPenerima());
        builder.addString(columnInfo.namaBarangColKey, realmObjectSource.realmGet$namaBarang());
        builder.addString(columnInfo.final_costColKey, realmObjectSource.realmGet$final_cost());
        builder.addString(columnInfo.total_priceColKey, realmObjectSource.realmGet$total_price());
        builder.addString(columnInfo.merchant_nameColKey, realmObjectSource.realmGet$merchant_name());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ornidsmerchant.models.TransModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.TransModel.class);
        long tableNativePtr = table.getNativePtr();
        TransModelColumnInfo columnInfo = (TransModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.TransModel.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$id();
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
        String realmGet$validation_code = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$validation_code();
        if (realmGet$validation_code != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.validation_codeColKey, colKey, realmGet$validation_code, false);
        }
        String realmGet$idPelanggan = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$idPelanggan();
        if (realmGet$idPelanggan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
        }
        String realmGet$idDriver = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$idDriver();
        if (realmGet$idDriver != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
        }
        String realmGet$orderFitur = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$orderFitur();
        if (realmGet$orderFitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$startLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$startLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$endLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$endLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.distanceColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$distance(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.priceColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$price(), false);
        java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$waktuOrder();
        if (realmGet$waktuOrder != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
        }
        java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$waktuSelesai();
        if (realmGet$waktuSelesai != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
        }
        String realmGet$alamatAsal = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$alamatAsal();
        if (realmGet$alamatAsal != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
        }
        String realmGet$alamatTujuan = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$alamatTujuan();
        if (realmGet$alamatTujuan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
        }
        String realmGet$kodePromo = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$kodePromo();
        if (realmGet$kodePromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
        }
        String realmGet$kreditPromo = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$kreditPromo();
        if (realmGet$kreditPromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.pakaiWalletColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$pakaiWallet(), false);
        String realmGet$rate = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$rate();
        if (realmGet$rate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.statusColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$status(), false);
        String realmGet$estimasi = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$estimasi();
        if (realmGet$estimasi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.estimasiColKey, colKey, realmGet$estimasi, false);
        }
        String realmGet$namaPengirim = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$namaPengirim();
        if (realmGet$namaPengirim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaPengirimColKey, colKey, realmGet$namaPengirim, false);
        }
        String realmGet$teleponPengirim = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$teleponPengirim();
        if (realmGet$teleponPengirim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, realmGet$teleponPengirim, false);
        }
        String realmGet$namaPenerima = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$namaPenerima();
        if (realmGet$namaPenerima != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, realmGet$namaPenerima, false);
        }
        String realmGet$teleponPenerima = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$teleponPenerima();
        if (realmGet$teleponPenerima != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, realmGet$teleponPenerima, false);
        }
        String realmGet$namaBarang = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$namaBarang();
        if (realmGet$namaBarang != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaBarangColKey, colKey, realmGet$namaBarang, false);
        }
        String realmGet$final_cost = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$final_cost();
        if (realmGet$final_cost != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.final_costColKey, colKey, realmGet$final_cost, false);
        }
        String realmGet$total_price = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$total_price();
        if (realmGet$total_price != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.total_priceColKey, colKey, realmGet$total_price, false);
        }
        String realmGet$merchant_name = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$merchant_name();
        if (realmGet$merchant_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_nameColKey, colKey, realmGet$merchant_name, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.TransModel.class);
        long tableNativePtr = table.getNativePtr();
        TransModelColumnInfo columnInfo = (TransModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.TransModel.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ornidsmerchant.models.TransModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.TransModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$id();
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
            String realmGet$validation_code = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$validation_code();
            if (realmGet$validation_code != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.validation_codeColKey, colKey, realmGet$validation_code, false);
            }
            String realmGet$idPelanggan = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$idPelanggan();
            if (realmGet$idPelanggan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
            }
            String realmGet$idDriver = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$idDriver();
            if (realmGet$idDriver != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
            }
            String realmGet$orderFitur = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$orderFitur();
            if (realmGet$orderFitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$startLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$startLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$endLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$endLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.distanceColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$distance(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.priceColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$price(), false);
            java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$waktuOrder();
            if (realmGet$waktuOrder != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
            }
            java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$waktuSelesai();
            if (realmGet$waktuSelesai != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
            }
            String realmGet$alamatAsal = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$alamatAsal();
            if (realmGet$alamatAsal != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
            }
            String realmGet$alamatTujuan = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$alamatTujuan();
            if (realmGet$alamatTujuan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
            }
            String realmGet$kodePromo = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$kodePromo();
            if (realmGet$kodePromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
            }
            String realmGet$kreditPromo = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$kreditPromo();
            if (realmGet$kreditPromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.pakaiWalletColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$pakaiWallet(), false);
            String realmGet$rate = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$rate();
            if (realmGet$rate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.statusColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$status(), false);
            String realmGet$estimasi = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$estimasi();
            if (realmGet$estimasi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.estimasiColKey, colKey, realmGet$estimasi, false);
            }
            String realmGet$namaPengirim = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$namaPengirim();
            if (realmGet$namaPengirim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaPengirimColKey, colKey, realmGet$namaPengirim, false);
            }
            String realmGet$teleponPengirim = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$teleponPengirim();
            if (realmGet$teleponPengirim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, realmGet$teleponPengirim, false);
            }
            String realmGet$namaPenerima = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$namaPenerima();
            if (realmGet$namaPenerima != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, realmGet$namaPenerima, false);
            }
            String realmGet$teleponPenerima = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$teleponPenerima();
            if (realmGet$teleponPenerima != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, realmGet$teleponPenerima, false);
            }
            String realmGet$namaBarang = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$namaBarang();
            if (realmGet$namaBarang != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaBarangColKey, colKey, realmGet$namaBarang, false);
            }
            String realmGet$final_cost = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$final_cost();
            if (realmGet$final_cost != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.final_costColKey, colKey, realmGet$final_cost, false);
            }
            String realmGet$total_price = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$total_price();
            if (realmGet$total_price != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.total_priceColKey, colKey, realmGet$total_price, false);
            }
            String realmGet$merchant_name = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$merchant_name();
            if (realmGet$merchant_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_nameColKey, colKey, realmGet$merchant_name, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ornidsmerchant.models.TransModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.TransModel.class);
        long tableNativePtr = table.getNativePtr();
        TransModelColumnInfo columnInfo = (TransModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.TransModel.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$id();
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
        String realmGet$validation_code = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$validation_code();
        if (realmGet$validation_code != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.validation_codeColKey, colKey, realmGet$validation_code, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.validation_codeColKey, colKey, false);
        }
        String realmGet$idPelanggan = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$idPelanggan();
        if (realmGet$idPelanggan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idPelangganColKey, colKey, false);
        }
        String realmGet$idDriver = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$idDriver();
        if (realmGet$idDriver != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idDriverColKey, colKey, false);
        }
        String realmGet$orderFitur = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$orderFitur();
        if (realmGet$orderFitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.orderFiturColKey, colKey, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$startLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$startLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$endLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$endLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.distanceColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$distance(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.priceColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$price(), false);
        java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$waktuOrder();
        if (realmGet$waktuOrder != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.waktuOrderColKey, colKey, false);
        }
        java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$waktuSelesai();
        if (realmGet$waktuSelesai != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, false);
        }
        String realmGet$alamatAsal = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$alamatAsal();
        if (realmGet$alamatAsal != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.alamatAsalColKey, colKey, false);
        }
        String realmGet$alamatTujuan = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$alamatTujuan();
        if (realmGet$alamatTujuan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, false);
        }
        String realmGet$kodePromo = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$kodePromo();
        if (realmGet$kodePromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kodePromoColKey, colKey, false);
        }
        String realmGet$kreditPromo = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$kreditPromo();
        if (realmGet$kreditPromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kreditPromoColKey, colKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.pakaiWalletColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$pakaiWallet(), false);
        String realmGet$rate = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$rate();
        if (realmGet$rate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rateColKey, colKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.statusColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$status(), false);
        String realmGet$estimasi = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$estimasi();
        if (realmGet$estimasi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.estimasiColKey, colKey, realmGet$estimasi, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.estimasiColKey, colKey, false);
        }
        String realmGet$namaPengirim = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$namaPengirim();
        if (realmGet$namaPengirim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaPengirimColKey, colKey, realmGet$namaPengirim, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaPengirimColKey, colKey, false);
        }
        String realmGet$teleponPengirim = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$teleponPengirim();
        if (realmGet$teleponPengirim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, realmGet$teleponPengirim, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, false);
        }
        String realmGet$namaPenerima = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$namaPenerima();
        if (realmGet$namaPenerima != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, realmGet$namaPenerima, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, false);
        }
        String realmGet$teleponPenerima = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$teleponPenerima();
        if (realmGet$teleponPenerima != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, realmGet$teleponPenerima, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, false);
        }
        String realmGet$namaBarang = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$namaBarang();
        if (realmGet$namaBarang != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaBarangColKey, colKey, realmGet$namaBarang, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaBarangColKey, colKey, false);
        }
        String realmGet$final_cost = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$final_cost();
        if (realmGet$final_cost != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.final_costColKey, colKey, realmGet$final_cost, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.final_costColKey, colKey, false);
        }
        String realmGet$total_price = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$total_price();
        if (realmGet$total_price != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.total_priceColKey, colKey, realmGet$total_price, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.total_priceColKey, colKey, false);
        }
        String realmGet$merchant_name = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$merchant_name();
        if (realmGet$merchant_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merchant_nameColKey, colKey, realmGet$merchant_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.merchant_nameColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.TransModel.class);
        long tableNativePtr = table.getNativePtr();
        TransModelColumnInfo columnInfo = (TransModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.TransModel.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ornidsmerchant.models.TransModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ornidsmerchant.models.TransModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$id();
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
            String realmGet$validation_code = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$validation_code();
            if (realmGet$validation_code != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.validation_codeColKey, colKey, realmGet$validation_code, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.validation_codeColKey, colKey, false);
            }
            String realmGet$idPelanggan = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$idPelanggan();
            if (realmGet$idPelanggan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idPelangganColKey, colKey, false);
            }
            String realmGet$idDriver = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$idDriver();
            if (realmGet$idDriver != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idDriverColKey, colKey, false);
            }
            String realmGet$orderFitur = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$orderFitur();
            if (realmGet$orderFitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.orderFiturColKey, colKey, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$startLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$startLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$endLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$endLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.distanceColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$distance(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.priceColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$price(), false);
            java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$waktuOrder();
            if (realmGet$waktuOrder != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.waktuOrderColKey, colKey, false);
            }
            java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$waktuSelesai();
            if (realmGet$waktuSelesai != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, false);
            }
            String realmGet$alamatAsal = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$alamatAsal();
            if (realmGet$alamatAsal != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.alamatAsalColKey, colKey, false);
            }
            String realmGet$alamatTujuan = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$alamatTujuan();
            if (realmGet$alamatTujuan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, false);
            }
            String realmGet$kodePromo = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$kodePromo();
            if (realmGet$kodePromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kodePromoColKey, colKey, false);
            }
            String realmGet$kreditPromo = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$kreditPromo();
            if (realmGet$kreditPromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kreditPromoColKey, colKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.pakaiWalletColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$pakaiWallet(), false);
            String realmGet$rate = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$rate();
            if (realmGet$rate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rateColKey, colKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.statusColKey, colKey, ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$status(), false);
            String realmGet$estimasi = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$estimasi();
            if (realmGet$estimasi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.estimasiColKey, colKey, realmGet$estimasi, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.estimasiColKey, colKey, false);
            }
            String realmGet$namaPengirim = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$namaPengirim();
            if (realmGet$namaPengirim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaPengirimColKey, colKey, realmGet$namaPengirim, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaPengirimColKey, colKey, false);
            }
            String realmGet$teleponPengirim = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$teleponPengirim();
            if (realmGet$teleponPengirim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, realmGet$teleponPengirim, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, false);
            }
            String realmGet$namaPenerima = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$namaPenerima();
            if (realmGet$namaPenerima != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, realmGet$namaPenerima, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, false);
            }
            String realmGet$teleponPenerima = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$teleponPenerima();
            if (realmGet$teleponPenerima != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, realmGet$teleponPenerima, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, false);
            }
            String realmGet$namaBarang = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$namaBarang();
            if (realmGet$namaBarang != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaBarangColKey, colKey, realmGet$namaBarang, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaBarangColKey, colKey, false);
            }
            String realmGet$final_cost = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$final_cost();
            if (realmGet$final_cost != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.final_costColKey, colKey, realmGet$final_cost, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.final_costColKey, colKey, false);
            }
            String realmGet$total_price = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$total_price();
            if (realmGet$total_price != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.total_priceColKey, colKey, realmGet$total_price, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.total_priceColKey, colKey, false);
            }
            String realmGet$merchant_name = ((com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) object).realmGet$merchant_name();
            if (realmGet$merchant_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merchant_nameColKey, colKey, realmGet$merchant_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.merchant_nameColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ornidsmerchant.models.TransModel createDetachedCopy(com.ourdevelops.ornidsmerchant.models.TransModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ornidsmerchant.models.TransModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ornidsmerchant.models.TransModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ornidsmerchant.models.TransModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ornidsmerchant.models.TransModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface realmSource = (com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$validation_code(realmSource.realmGet$validation_code());
        unmanagedCopy.realmSet$idPelanggan(realmSource.realmGet$idPelanggan());
        unmanagedCopy.realmSet$idDriver(realmSource.realmGet$idDriver());
        unmanagedCopy.realmSet$orderFitur(realmSource.realmGet$orderFitur());
        unmanagedCopy.realmSet$startLatitude(realmSource.realmGet$startLatitude());
        unmanagedCopy.realmSet$startLongitude(realmSource.realmGet$startLongitude());
        unmanagedCopy.realmSet$endLatitude(realmSource.realmGet$endLatitude());
        unmanagedCopy.realmSet$endLongitude(realmSource.realmGet$endLongitude());
        unmanagedCopy.realmSet$distance(realmSource.realmGet$distance());
        unmanagedCopy.realmSet$price(realmSource.realmGet$price());
        unmanagedCopy.realmSet$waktuOrder(realmSource.realmGet$waktuOrder());
        unmanagedCopy.realmSet$waktuSelesai(realmSource.realmGet$waktuSelesai());
        unmanagedCopy.realmSet$alamatAsal(realmSource.realmGet$alamatAsal());
        unmanagedCopy.realmSet$alamatTujuan(realmSource.realmGet$alamatTujuan());
        unmanagedCopy.realmSet$kodePromo(realmSource.realmGet$kodePromo());
        unmanagedCopy.realmSet$kreditPromo(realmSource.realmGet$kreditPromo());
        unmanagedCopy.realmSet$pakaiWallet(realmSource.realmGet$pakaiWallet());
        unmanagedCopy.realmSet$rate(realmSource.realmGet$rate());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());
        unmanagedCopy.realmSet$estimasi(realmSource.realmGet$estimasi());
        unmanagedCopy.realmSet$namaPengirim(realmSource.realmGet$namaPengirim());
        unmanagedCopy.realmSet$teleponPengirim(realmSource.realmGet$teleponPengirim());
        unmanagedCopy.realmSet$namaPenerima(realmSource.realmGet$namaPenerima());
        unmanagedCopy.realmSet$teleponPenerima(realmSource.realmGet$teleponPenerima());
        unmanagedCopy.realmSet$namaBarang(realmSource.realmGet$namaBarang());
        unmanagedCopy.realmSet$final_cost(realmSource.realmGet$final_cost());
        unmanagedCopy.realmSet$total_price(realmSource.realmGet$total_price());
        unmanagedCopy.realmSet$merchant_name(realmSource.realmGet$merchant_name());

        return unmanagedObject;
    }

    static com.ourdevelops.ornidsmerchant.models.TransModel update(Realm realm, TransModelColumnInfo columnInfo, com.ourdevelops.ornidsmerchant.models.TransModel realmObject, com.ourdevelops.ornidsmerchant.models.TransModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) realmObject;
        com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ornidsmerchant_models_TransModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ornidsmerchant.models.TransModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.validation_codeColKey, realmObjectSource.realmGet$validation_code());
        builder.addString(columnInfo.idPelangganColKey, realmObjectSource.realmGet$idPelanggan());
        builder.addString(columnInfo.idDriverColKey, realmObjectSource.realmGet$idDriver());
        builder.addString(columnInfo.orderFiturColKey, realmObjectSource.realmGet$orderFitur());
        builder.addDouble(columnInfo.startLatitudeColKey, realmObjectSource.realmGet$startLatitude());
        builder.addDouble(columnInfo.startLongitudeColKey, realmObjectSource.realmGet$startLongitude());
        builder.addDouble(columnInfo.endLatitudeColKey, realmObjectSource.realmGet$endLatitude());
        builder.addDouble(columnInfo.endLongitudeColKey, realmObjectSource.realmGet$endLongitude());
        builder.addDouble(columnInfo.distanceColKey, realmObjectSource.realmGet$distance());
        builder.addInteger(columnInfo.priceColKey, realmObjectSource.realmGet$price());
        builder.addDate(columnInfo.waktuOrderColKey, realmObjectSource.realmGet$waktuOrder());
        builder.addDate(columnInfo.waktuSelesaiColKey, realmObjectSource.realmGet$waktuSelesai());
        builder.addString(columnInfo.alamatAsalColKey, realmObjectSource.realmGet$alamatAsal());
        builder.addString(columnInfo.alamatTujuanColKey, realmObjectSource.realmGet$alamatTujuan());
        builder.addString(columnInfo.kodePromoColKey, realmObjectSource.realmGet$kodePromo());
        builder.addString(columnInfo.kreditPromoColKey, realmObjectSource.realmGet$kreditPromo());
        builder.addBoolean(columnInfo.pakaiWalletColKey, realmObjectSource.realmGet$pakaiWallet());
        builder.addString(columnInfo.rateColKey, realmObjectSource.realmGet$rate());
        builder.addInteger(columnInfo.statusColKey, realmObjectSource.realmGet$status());
        builder.addString(columnInfo.estimasiColKey, realmObjectSource.realmGet$estimasi());
        builder.addString(columnInfo.namaPengirimColKey, realmObjectSource.realmGet$namaPengirim());
        builder.addString(columnInfo.teleponPengirimColKey, realmObjectSource.realmGet$teleponPengirim());
        builder.addString(columnInfo.namaPenerimaColKey, realmObjectSource.realmGet$namaPenerima());
        builder.addString(columnInfo.teleponPenerimaColKey, realmObjectSource.realmGet$teleponPenerima());
        builder.addString(columnInfo.namaBarangColKey, realmObjectSource.realmGet$namaBarang());
        builder.addString(columnInfo.final_costColKey, realmObjectSource.realmGet$final_cost());
        builder.addString(columnInfo.total_priceColKey, realmObjectSource.realmGet$total_price());
        builder.addString(columnInfo.merchant_nameColKey, realmObjectSource.realmGet$merchant_name());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("TransModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{validation_code:");
        stringBuilder.append(realmGet$validation_code() != null ? realmGet$validation_code() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{idPelanggan:");
        stringBuilder.append(realmGet$idPelanggan() != null ? realmGet$idPelanggan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{idDriver:");
        stringBuilder.append(realmGet$idDriver() != null ? realmGet$idDriver() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{orderFitur:");
        stringBuilder.append(realmGet$orderFitur() != null ? realmGet$orderFitur() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{startLatitude:");
        stringBuilder.append(realmGet$startLatitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{startLongitude:");
        stringBuilder.append(realmGet$startLongitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{endLatitude:");
        stringBuilder.append(realmGet$endLatitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{endLongitude:");
        stringBuilder.append(realmGet$endLongitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{distance:");
        stringBuilder.append(realmGet$distance());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{price:");
        stringBuilder.append(realmGet$price());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{waktuOrder:");
        stringBuilder.append(realmGet$waktuOrder() != null ? realmGet$waktuOrder() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{waktuSelesai:");
        stringBuilder.append(realmGet$waktuSelesai() != null ? realmGet$waktuSelesai() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{alamatAsal:");
        stringBuilder.append(realmGet$alamatAsal() != null ? realmGet$alamatAsal() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{alamatTujuan:");
        stringBuilder.append(realmGet$alamatTujuan() != null ? realmGet$alamatTujuan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kodePromo:");
        stringBuilder.append(realmGet$kodePromo() != null ? realmGet$kodePromo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kreditPromo:");
        stringBuilder.append(realmGet$kreditPromo() != null ? realmGet$kreditPromo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pakaiWallet:");
        stringBuilder.append(realmGet$pakaiWallet());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rate:");
        stringBuilder.append(realmGet$rate() != null ? realmGet$rate() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{estimasi:");
        stringBuilder.append(realmGet$estimasi() != null ? realmGet$estimasi() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{namaPengirim:");
        stringBuilder.append(realmGet$namaPengirim() != null ? realmGet$namaPengirim() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{teleponPengirim:");
        stringBuilder.append(realmGet$teleponPengirim() != null ? realmGet$teleponPengirim() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{namaPenerima:");
        stringBuilder.append(realmGet$namaPenerima() != null ? realmGet$namaPenerima() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{teleponPenerima:");
        stringBuilder.append(realmGet$teleponPenerima() != null ? realmGet$teleponPenerima() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{namaBarang:");
        stringBuilder.append(realmGet$namaBarang() != null ? realmGet$namaBarang() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{final_cost:");
        stringBuilder.append(realmGet$final_cost() != null ? realmGet$final_cost() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{total_price:");
        stringBuilder.append(realmGet$total_price() != null ? realmGet$total_price() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{merchant_name:");
        stringBuilder.append(realmGet$merchant_name() != null ? realmGet$merchant_name() : "null");
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
        com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy aTransModel = (com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aTransModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTransModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aTransModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
