package p007c.p190n.p194b.p195a.p198j.p199s;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.a.j.s.k, reason: use source file name */
/* JADX INFO: compiled from: MetadataBackendRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class MetadataBackendRegistry implements BackendRegistry {

    /* JADX INFO: renamed from: a */
    public final a f5779a;

    /* JADX INFO: renamed from: b */
    public final CreationContextFactory f5780b;

    /* JADX INFO: renamed from: c */
    public final Map<String, TransportBackend> f5781c;

    /* JADX INFO: renamed from: c.n.b.a.j.s.k$a */
    /* JADX INFO: compiled from: MetadataBackendRegistry.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Context f5782a;

        /* JADX INFO: renamed from: b */
        public Map<String, String> f5783b = null;

        public a(Context context) {
            this.f5782a = context;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003a  */
        /* JADX WARN: Code duplicated, block: B:17:0x0044  */
        /* JADX WARN: Code duplicated, block: B:20:0x0057  */
        /* JADX INFO: renamed from: a */
        public BackendFactory m2833a(String str) {
            Bundle bundle;
            Map<String, String> mapEmptyMap;
            Object obj;
            if (this.f5783b == null) {
                Context context = this.f5782a;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        Log.w("BackendRegistry", "Context has no PackageManager.");
                    } else {
                        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                        if (serviceInfo == null) {
                            Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        } else {
                            bundle = serviceInfo.metaData;
                        }
                        if (bundle == null) {
                            Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                            mapEmptyMap = Collections.emptyMap();
                        } else {
                            HashMap map = new HashMap();
                            for (String str2 : bundle.keySet()) {
                                obj = bundle.get(str2);
                                if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                    for (String str3 : ((String) obj).split(",", -1)) {
                                        String strTrim = str3.trim();
                                        if (!strTrim.isEmpty()) {
                                            map.put(strTrim, str2.substring(8));
                                        }
                                    }
                                }
                            }
                            mapEmptyMap = map;
                        }
                        this.f5783b = mapEmptyMap;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("BackendRegistry", "Application info not found.");
                }
                bundle = null;
                if (bundle == null) {
                    Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map2 = new HashMap();
                    while (r7.hasNext()) {
                        obj = bundle.get(str2);
                        if (!(obj instanceof String)) {
                        }
                    }
                    mapEmptyMap = map2;
                }
                this.f5783b = mapEmptyMap;
            }
            String str4 = this.f5783b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (BackendFactory) Class.forName(str4).asSubclass(BackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str4), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e5);
                return null;
            }
        }
    }

    public MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        a aVar = new a(context);
        this.f5781c = new HashMap();
        this.f5779a = aVar;
        this.f5780b = creationContextFactory;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p199s.BackendRegistry
    /* JADX INFO: renamed from: a */
    public synchronized TransportBackend mo2831a(String str) {
        if (this.f5781c.containsKey(str)) {
            return this.f5781c.get(str);
        }
        BackendFactory backendFactoryM2833a = this.f5779a.m2833a(str);
        if (backendFactoryM2833a == null) {
            return null;
        }
        CreationContextFactory creationContextFactory = this.f5780b;
        TransportBackend transportBackendCreate = backendFactoryM2833a.create(new AutoValue_CreationContext(creationContextFactory.f5773a, creationContextFactory.f5774b, creationContextFactory.f5775c, str));
        this.f5781c.put(str, transportBackendCreate);
        return transportBackendCreate;
    }
}
