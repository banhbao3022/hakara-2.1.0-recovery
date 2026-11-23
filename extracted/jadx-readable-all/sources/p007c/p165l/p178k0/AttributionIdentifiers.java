package p007c.p165l.p178k0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.UserSettingsManager;

/* JADX INFO: renamed from: c.l.k0.b, reason: use source file name */
/* JADX INFO: compiled from: AttributionIdentifiers.java */
/* JADX INFO: loaded from: classes.dex */
public class AttributionIdentifiers {

    /* JADX INFO: renamed from: a */
    public static AttributionIdentifiers f4887a;

    /* JADX INFO: renamed from: b */
    public String f4888b;

    /* JADX INFO: renamed from: c */
    public String f4889c;

    /* JADX INFO: renamed from: d */
    public String f4890d;

    /* JADX INFO: renamed from: e */
    public boolean f4891e;

    /* JADX INFO: renamed from: f */
    public long f4892f;

    /* JADX INFO: renamed from: c.l.k0.b$b */
    /* JADX INFO: compiled from: AttributionIdentifiers.java */
    public static final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public AtomicBoolean f4893a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b */
        public final BlockingQueue<IBinder> f4894b = new LinkedBlockingDeque();

        public b(a aVar) {
        }

        /* JADX INFO: renamed from: a */
        public IBinder m2420a() throws InterruptedException {
            if (this.f4893a.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            return this.f4894b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f4894b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static AttributionIdentifiers m2417a(AttributionIdentifiers attributionIdentifiers) {
        attributionIdentifiers.f4892f = System.currentTimeMillis();
        f4887a = attributionIdentifiers;
        return attributionIdentifiers;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f3 A[Catch: all -> 0x01fb, Exception -> 0x01fd, TRY_ENTER, TryCatch #11 {Exception -> 0x01fd, all -> 0x01fb, blocks: (B:62:0x012b, B:64:0x0135, B:66:0x0139, B:69:0x014a, B:71:0x0164, B:73:0x016c, B:80:0x0186, B:82:0x018c, B:85:0x0198, B:87:0x019c, B:89:0x01a0, B:76:0x0176, B:78:0x017e, B:108:0x01f3, B:109:0x01fa), top: B:133:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:121:0x020e  */
    /* JADX WARN: Code duplicated, block: B:127:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x01ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:64:0x0135 A[Catch: all -> 0x01fb, Exception -> 0x01fd, TryCatch #11 {Exception -> 0x01fd, all -> 0x01fb, blocks: (B:62:0x012b, B:64:0x0135, B:66:0x0139, B:69:0x014a, B:71:0x0164, B:73:0x016c, B:80:0x0186, B:82:0x018c, B:85:0x0198, B:87:0x019c, B:89:0x01a0, B:76:0x0176, B:78:0x017e, B:108:0x01f3, B:109:0x01fa), top: B:133:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0139 A[Catch: all -> 0x01fb, Exception -> 0x01fd, TryCatch #11 {Exception -> 0x01fd, all -> 0x01fb, blocks: (B:62:0x012b, B:64:0x0135, B:66:0x0139, B:69:0x014a, B:71:0x0164, B:73:0x016c, B:80:0x0186, B:82:0x018c, B:85:0x0198, B:87:0x019c, B:89:0x01a0, B:76:0x0176, B:78:0x017e, B:108:0x01f3, B:109:0x01fa), top: B:133:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0149 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0176 A[Catch: all -> 0x01fb, Exception -> 0x01fd, TryCatch #11 {Exception -> 0x01fd, all -> 0x01fb, blocks: (B:62:0x012b, B:64:0x0135, B:66:0x0139, B:69:0x014a, B:71:0x0164, B:73:0x016c, B:80:0x0186, B:82:0x018c, B:85:0x0198, B:87:0x019c, B:89:0x01a0, B:76:0x0176, B:78:0x017e, B:108:0x01f3, B:109:0x01fa), top: B:133:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x018c A[Catch: all -> 0x01fb, Exception -> 0x01fd, TryCatch #11 {Exception -> 0x01fd, all -> 0x01fb, blocks: (B:62:0x012b, B:64:0x0135, B:66:0x0139, B:69:0x014a, B:71:0x0164, B:73:0x016c, B:80:0x0186, B:82:0x018c, B:85:0x0198, B:87:0x019c, B:89:0x01a0, B:76:0x0176, B:78:0x017e, B:108:0x01f3, B:109:0x01fa), top: B:133:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0195  */
    /* JADX WARN: Code duplicated, block: B:85:0x0198 A[Catch: all -> 0x01fb, Exception -> 0x01fd, TryCatch #11 {Exception -> 0x01fd, all -> 0x01fb, blocks: (B:62:0x012b, B:64:0x0135, B:66:0x0139, B:69:0x014a, B:71:0x0164, B:73:0x016c, B:80:0x0186, B:82:0x018c, B:85:0x0198, B:87:0x019c, B:89:0x01a0, B:76:0x0176, B:78:0x017e, B:108:0x01f3, B:109:0x01fa), top: B:133:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:87:0x019c A[Catch: all -> 0x01fb, Exception -> 0x01fd, TryCatch #11 {Exception -> 0x01fd, all -> 0x01fb, blocks: (B:62:0x012b, B:64:0x0135, B:66:0x0139, B:69:0x014a, B:71:0x0164, B:73:0x016c, B:80:0x0186, B:82:0x018c, B:85:0x0198, B:87:0x019c, B:89:0x01a0, B:76:0x0176, B:78:0x017e, B:108:0x01f3, B:109:0x01fa), top: B:133:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01a0 A[Catch: all -> 0x01fb, Exception -> 0x01fd, TRY_LEAVE, TryCatch #11 {Exception -> 0x01fd, all -> 0x01fb, blocks: (B:62:0x012b, B:64:0x0135, B:66:0x0139, B:69:0x014a, B:71:0x0164, B:73:0x016c, B:80:0x0186, B:82:0x018c, B:85:0x0198, B:87:0x019c, B:89:0x01a0, B:76:0x0176, B:78:0x017e, B:108:0x01f3, B:109:0x01fa), top: B:133:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b5 A[Catch: Exception -> 0x01f1, all -> 0x020a, TryCatch #7 {all -> 0x020a, blocks: (B:91:0x01ae, B:94:0x01b5, B:97:0x01cb, B:99:0x01d1, B:102:0x01e8, B:114:0x01ff), top: B:133:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX INFO: renamed from: c */
    public static AttributionIdentifiers m2418c(Context context) {
        AttributionIdentifiers attributionIdentifiers;
        Cursor cursorQuery;
        String[] strArr;
        ProviderInfo providerInfoResolveContentProvider;
        ProviderInfo providerInfoResolveContentProvider2;
        Uri uri;
        Uri uri2;
        PackageManager packageManager;
        String installerPackageName;
        int columnIndex;
        int columnIndex2;
        long jCurrentTimeMillis;
        AttributionIdentifiers attributionIdentifiers2;
        b bVar;
        Intent intent;
        Parcel parcelObtain;
        Parcel parcelObtain2;
        Parcel parcelObtain3;
        Parcel parcelObtain4;
        Method methodM2455n;
        boolean z;
        Method methodM2455n2;
        Object objM2461t;
        ?? r6 = 0;
        try {
            try {
                methodM2455n = Utility.m2455n(Class.forName("com.google.android.gms.common.GooglePlayServicesUtil"), "isGooglePlayServicesAvailable", Context.class);
            } catch (ClassNotFoundException unused) {
                methodM2455n = null;
            }
            if (methodM2455n == null) {
                z = false;
            } else {
                Object objM2461t2 = Utility.m2461t(null, methodM2455n, context);
                if ((objM2461t2 instanceof Integer) && ((Integer) objM2461t2).intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            try {
                try {
                    if (z) {
                        try {
                            methodM2455n2 = Utility.m2455n(Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient"), "getAdvertisingIdInfo", Context.class);
                        } catch (ClassNotFoundException unused2) {
                            methodM2455n2 = null;
                        }
                        if (methodM2455n2 != null && (objM2461t = Utility.m2461t(null, methodM2455n2, context)) != null) {
                            Method methodM2455n3 = Utility.m2455n(objM2461t.getClass(), "getId", new Class[0]);
                            Method methodM2455n4 = Utility.m2455n(objM2461t.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                            if (methodM2455n3 != null && methodM2455n4 != null) {
                                attributionIdentifiers = new AttributionIdentifiers();
                                attributionIdentifiers.f4889c = (String) Utility.m2461t(objM2461t, methodM2455n3, new Object[0]);
                                attributionIdentifiers.f4891e = ((Boolean) Utility.m2461t(objM2461t, methodM2455n4, new Object[0])).booleanValue();
                            }
                        }
                        if (attributionIdentifiers == null) {
                            bVar = new b(null);
                            intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                            intent.setPackage("com.google.android.gms");
                            try {
                                if (context.bindService(intent, bVar, 1)) {
                                    try {
                                        IBinder iBinderM2420a = bVar.m2420a();
                                        attributionIdentifiers = new AttributionIdentifiers();
                                        parcelObtain = Parcel.obtain();
                                        parcelObtain2 = Parcel.obtain();
                                        try {
                                            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                            iBinderM2420a.transact(1, parcelObtain, parcelObtain2, 0);
                                            parcelObtain2.readException();
                                            String string = parcelObtain2.readString();
                                            parcelObtain2.recycle();
                                            parcelObtain.recycle();
                                            attributionIdentifiers.f4889c = string;
                                            parcelObtain3 = Parcel.obtain();
                                            parcelObtain4 = Parcel.obtain();
                                            try {
                                                parcelObtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                                parcelObtain3.writeInt(1);
                                                iBinderM2420a.transact(2, parcelObtain3, parcelObtain4, 0);
                                                parcelObtain4.readException();
                                                boolean z2 = parcelObtain4.readInt() != 0;
                                                parcelObtain4.recycle();
                                                parcelObtain3.recycle();
                                                attributionIdentifiers.f4891e = z2;
                                                context.unbindService(bVar);
                                            } catch (Throwable th) {
                                                parcelObtain4.recycle();
                                                parcelObtain3.recycle();
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            parcelObtain2.recycle();
                                            parcelObtain.recycle();
                                            throw th2;
                                        }
                                    } catch (Exception unused3) {
                                        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                                        context.unbindService(bVar);
                                        attributionIdentifiers = null;
                                    }
                                } else {
                                    attributionIdentifiers = null;
                                }
                                if (attributionIdentifiers == null) {
                                    attributionIdentifiers = new AttributionIdentifiers();
                                }
                            } catch (Throwable th3) {
                                context.unbindService(bVar);
                                throw th3;
                            }
                        }
                        if (Looper.myLooper() != Looper.getMainLooper()) {
                            throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                        }
                        if (f4887a != null) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                            attributionIdentifiers2 = f4887a;
                            if (jCurrentTimeMillis - attributionIdentifiers2.f4892f < 3600000) {
                                return attributionIdentifiers2;
                            }
                        }
                        strArr = new String[]{"aid", "androidid", "limit_tracking"};
                        providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                        providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                        if (providerInfoResolveContentProvider != null || !FacebookSignatureValidator.m2512a(context, providerInfoResolveContentProvider.packageName)) {
                            if (providerInfoResolveContentProvider2 == null && FacebookSignatureValidator.m2512a(context, providerInfoResolveContentProvider2.packageName)) {
                                uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            } else {
                                uri = null;
                            }
                            packageManager = context.getPackageManager();
                            if (packageManager != null) {
                                installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                            } else {
                                installerPackageName = null;
                            }
                            if (installerPackageName != null) {
                                attributionIdentifiers.f4890d = installerPackageName;
                            }
                            if (uri == null) {
                                m2417a(attributionIdentifiers);
                                return attributionIdentifiers;
                            }
                            cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    if (cursorQuery.moveToFirst()) {
                                        int columnIndex3 = cursorQuery.getColumnIndex("aid");
                                        columnIndex = cursorQuery.getColumnIndex("androidid");
                                        columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                                        attributionIdentifiers.f4888b = cursorQuery.getString(columnIndex3);
                                        if (columnIndex > 0 && columnIndex2 > 0 && attributionIdentifiers.m2419b() == null) {
                                            attributionIdentifiers.f4889c = cursorQuery.getString(columnIndex);
                                            attributionIdentifiers.f4891e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                                        }
                                        cursorQuery.close();
                                        m2417a(attributionIdentifiers);
                                        return attributionIdentifiers;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    e.toString();
                                    HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    return null;
                                }
                            }
                            m2417a(attributionIdentifiers);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return attributionIdentifiers;
                        }
                        uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                        uri = uri2;
                        packageManager = context.getPackageManager();
                        if (packageManager != null) {
                            installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                        } else {
                            installerPackageName = null;
                        }
                        if (installerPackageName != null) {
                            attributionIdentifiers.f4890d = installerPackageName;
                        }
                        if (uri == null) {
                            m2417a(attributionIdentifiers);
                            return attributionIdentifiers;
                        }
                        cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                        if (cursorQuery != null) {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex4 = cursorQuery.getColumnIndex("aid");
                                columnIndex = cursorQuery.getColumnIndex("androidid");
                                columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                                attributionIdentifiers.f4888b = cursorQuery.getString(columnIndex4);
                                if (columnIndex > 0) {
                                    attributionIdentifiers.f4889c = cursorQuery.getString(columnIndex);
                                    attributionIdentifiers.f4891e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                                }
                                cursorQuery.close();
                                m2417a(attributionIdentifiers);
                                return attributionIdentifiers;
                            }
                        }
                        m2417a(attributionIdentifiers);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return attributionIdentifiers;
                    }
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                    }
                    if (f4887a != null) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        attributionIdentifiers2 = f4887a;
                        if (jCurrentTimeMillis - attributionIdentifiers2.f4892f < 3600000) {
                            return attributionIdentifiers2;
                        }
                    }
                    strArr = new String[]{"aid", "androidid", "limit_tracking"};
                    providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                    providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                    if (providerInfoResolveContentProvider != null) {
                        if (providerInfoResolveContentProvider2 == null) {
                        }
                        uri = null;
                    } else {
                        if (providerInfoResolveContentProvider2 == null) {
                        }
                        uri = null;
                    }
                    packageManager = context.getPackageManager();
                    if (packageManager != null) {
                        installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                    } else {
                        installerPackageName = null;
                    }
                    if (installerPackageName != null) {
                        attributionIdentifiers.f4890d = installerPackageName;
                    }
                    if (uri == null) {
                        m2417a(attributionIdentifiers);
                        return attributionIdentifiers;
                    }
                    cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                    if (cursorQuery != null) {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex5 = cursorQuery.getColumnIndex("aid");
                            columnIndex = cursorQuery.getColumnIndex("androidid");
                            columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                            attributionIdentifiers.f4888b = cursorQuery.getString(columnIndex5);
                            if (columnIndex > 0) {
                                attributionIdentifiers.f4889c = cursorQuery.getString(columnIndex);
                                attributionIdentifiers.f4891e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                            }
                            cursorQuery.close();
                            m2417a(attributionIdentifiers);
                            return attributionIdentifiers;
                        }
                    }
                    m2417a(attributionIdentifiers);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return attributionIdentifiers;
                } catch (Throwable th4) {
                    th = th4;
                    r6 = context;
                    if (r6 != 0) {
                        r6.close();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th5) {
                th = th5;
                if (r6 != 0) {
                    r6.close();
                }
                throw th;
            }
        } catch (Exception unused4) {
            HashSet<LoggingBehavior> hashSet3 = FacebookSdk.f5352a;
        }
        attributionIdentifiers = null;
        if (attributionIdentifiers == null) {
            bVar = new b(null);
            intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, bVar, 1)) {
                IBinder iBinderM2420a2 = bVar.m2420a();
                attributionIdentifiers = new AttributionIdentifiers();
                parcelObtain = Parcel.obtain();
                parcelObtain2 = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                iBinderM2420a2.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String string2 = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                attributionIdentifiers.f4889c = string2;
                parcelObtain3 = Parcel.obtain();
                parcelObtain4 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain3.writeInt(1);
                iBinderM2420a2.transact(2, parcelObtain3, parcelObtain4, 0);
                parcelObtain4.readException();
                if (parcelObtain4.readInt() != 0) {
                }
                parcelObtain4.recycle();
                parcelObtain3.recycle();
                attributionIdentifiers.f4891e = z2;
                context.unbindService(bVar);
            } else {
                attributionIdentifiers = null;
            }
            if (attributionIdentifiers == null) {
                attributionIdentifiers = new AttributionIdentifiers();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public String m2419b() {
        if (!FacebookSdk.m2664f()) {
            return null;
        }
        UserSettingsManager.m2269b();
        if (UserSettingsManager.f4577f.m2275a()) {
            return this.f4889c;
        }
        return null;
    }
}
