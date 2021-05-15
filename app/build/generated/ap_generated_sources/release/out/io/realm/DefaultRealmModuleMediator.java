package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(14);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.BankModel.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.CustomerModel.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.DriverModel.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.PayuModel.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.TransModel.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.User.class);
        modelClasses.add(com.ourdevelops.ornidsmerchant.models.WalletModel.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(14);
        infoMap.put(com.ourdevelops.ornidsmerchant.models.BankModel.class, io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class, io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class, io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.CategoryModel.class, io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.CustomerModel.class, io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.DriverModel.class, io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class, io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.ItemModel.class, io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class, io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.PayuModel.class, io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.ServiceModel.class, io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.TransModel.class, io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.User.class, io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.ourdevelops.ornidsmerchant.models.WalletModel.class, io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
            return io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
            return "BankModel";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
            return "CategoryItemModel";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
            return "CategoryItemNonModel";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
            return "CategoryModel";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
            return "CustomerModel";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
            return "DriverModel";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
            return "FirebaseToken";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
            return "ItemModel";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
            return "ItemOrderModel";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
            return "PayuModel";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
            return "ServiceModel";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
            return "TransModel";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
            return "User";
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
            return "WalletModel";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy());
            }
            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
                return clazz.cast(new io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
            com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.BankModelColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.BankModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.BankModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.BankModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
            com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.CategoryItemModelColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.CategoryItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.CategoryItemModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
            com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.CategoryItemNonModelColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.CategoryItemNonModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
            com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.CategoryModelColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.CategoryModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CategoryModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.CategoryModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
            com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.CustomerModelColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.CustomerModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.CustomerModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.CustomerModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
            com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.DriverModelColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.DriverModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.DriverModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.DriverModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
            com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.FirebaseTokenColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.FirebaseTokenColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.FirebaseToken) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
            com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.ItemModelColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.ItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.ItemModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
            com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.ItemOrderModelColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.ItemOrderModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.ItemOrderModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
            com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.PayuModelColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.PayuModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.PayuModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.PayuModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
            com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.ServiceModelColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.ServiceModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.ServiceModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.ServiceModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
            com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.TransModelColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.TransModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.TransModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.TransModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
            com_ourdevelops_ornidsmerchant_models_UserRealmProxy.UserColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.User.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.User) obj, update, cache, flags));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
            com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.WalletModelColumnInfo columnInfo = (com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.WalletModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ornidsmerchant.models.WalletModel.class);
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.ourdevelops.ornidsmerchant.models.WalletModel) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.BankModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.CategoryItemModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.CategoryModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.CustomerModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.DriverModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.FirebaseToken) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.ItemModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.ItemOrderModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.PayuModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.ServiceModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.TransModel) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.User) object, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.WalletModel) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.BankModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.CategoryItemModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.CategoryModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.CustomerModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.DriverModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.FirebaseToken) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.ItemModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.ItemOrderModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.PayuModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.ServiceModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.TransModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.User) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.insert(realm, (com.ourdevelops.ornidsmerchant.models.WalletModel) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.BankModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.CategoryItemModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.CategoryModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.CustomerModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.DriverModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.FirebaseToken) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.ItemModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.ItemOrderModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.PayuModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.ServiceModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.TransModel) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.User) obj, cache);
        } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
            io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.WalletModel) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.BankModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.CategoryItemModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.CategoryModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.CustomerModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.DriverModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.FirebaseToken) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.ItemModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.ItemOrderModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.PayuModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.ServiceModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.TransModel) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.User) object, cache);
            } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
                io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.insertOrUpdate(realm, (com.ourdevelops.ornidsmerchant.models.WalletModel) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
                    io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.BankModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_BankModelRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.BankModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemModelRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.CategoryItemModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CategoryItemNonModelRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.CategoryItemNonModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CategoryModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CategoryModelRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.CategoryModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.CustomerModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_CustomerModelRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.CustomerModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.DriverModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_DriverModelRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.DriverModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.FirebaseToken.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_FirebaseTokenRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.FirebaseToken) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_ItemModelRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.ItemModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ItemOrderModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_ItemOrderModelRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.ItemOrderModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.PayuModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_PayuModelRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.PayuModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.ServiceModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_ServiceModelRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.ServiceModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.TransModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_TransModelRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.TransModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.User.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_UserRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.User) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.ourdevelops.ornidsmerchant.models.WalletModel.class)) {
            return clazz.cast(io.realm.com_ourdevelops_ornidsmerchant_models_WalletModelRealmProxy.createDetachedCopy((com.ourdevelops.ornidsmerchant.models.WalletModel) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
