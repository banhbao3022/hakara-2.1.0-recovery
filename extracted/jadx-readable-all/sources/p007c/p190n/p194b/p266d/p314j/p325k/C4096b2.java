package p007c.p190n.p194b.p266d.p314j.p325k;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.b.d.j.k.b2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4096b2 implements InterfaceC4138e2 {

    /* JADX INFO: renamed from: a */
    public static final Map<Uri, C4096b2> f23077a = new ArrayMap();

    /* JADX INFO: renamed from: b */
    public static final String[] f23078b = {"key", "value"};

    /* JADX INFO: renamed from: c */
    public final ContentResolver f23079c;

    /* JADX INFO: renamed from: d */
    public final Uri f23080d;

    /* JADX INFO: renamed from: e */
    public final ContentObserver f23081e;

    /* JADX INFO: renamed from: f */
    public final Object f23082f;

    /* JADX INFO: renamed from: g */
    public volatile Map<String, String> f23083g;

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC4110c2> f23084h;

    public C4096b2(ContentResolver contentResolver, Uri uri) {
        C4124d2 c4124d2 = new C4124d2(this);
        this.f23081e = c4124d2;
        this.f23082f = new Object();
        this.f23084h = new ArrayList();
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f23079c = contentResolver;
        this.f23080d = uri;
        contentResolver.registerContentObserver(uri, false, c4124d2);
    }

    /* JADX INFO: renamed from: a */
    public static C4096b2 m9404a(ContentResolver contentResolver, Uri uri) {
        C4096b2 c4096b2;
        synchronized (C4096b2.class) {
            Map<Uri, C4096b2> map = f23077a;
            c4096b2 = map.get(uri);
            if (c4096b2 == null) {
                try {
                    C4096b2 c4096b3 = new C4096b2(contentResolver, uri);
                    try {
                        map.put(uri, c4096b3);
                    } catch (SecurityException unused) {
                    }
                    c4096b2 = c4096b3;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c4096b2;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m9405c() {
        for (C4096b2 c4096b2 : f23077a.values()) {
            c4096b2.f23079c.unregisterContentObserver(c4096b2.f23081e);
        }
        f23077a.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: b */
    public final Map<String, String> m9406b() {
        ?? r0;
        Map<String, String> map;
        Map<String, String> map2 = this.f23083g;
        ?? r1 = map2;
        if (map2 == null) {
            synchronized (this.f23082f) {
                Map<String, String> map3 = this.f23083g;
                r0 = map3;
                if (map3 == null) {
                    ?? AllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) C2622l.m5243E0(new InterfaceC4166g2(this) { // from class: c.n.b.d.j.k.a2

                                /* JADX INFO: renamed from: a */
                                public final C4096b2 f23026a;

                                {
                                    this.f23026a = this;
                                }

                                @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4166g2
                                public final Object zza() {
                                    C4096b2 c4096b2 = this.f23026a;
                                    Cursor cursorQuery = c4096b2.f23079c.query(c4096b2.f23080d, C4096b2.f23078b, null, null, null);
                                    if (cursorQuery == null) {
                                        return Collections.emptyMap();
                                    }
                                    try {
                                        int count = cursorQuery.getCount();
                                        if (count == 0) {
                                            return Collections.emptyMap();
                                        }
                                        Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
                                        while (cursorQuery.moveToNext()) {
                                            arrayMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                        }
                                        return arrayMap;
                                    } finally {
                                        cursorQuery.close();
                                    }
                                }
                            });
                            StrictMode.setThreadPolicy(AllowThreadDiskReads);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(AllowThreadDiskReads);
                            throw th;
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(AllowThreadDiskReads);
                        map = null;
                    }
                    this.f23083g = map;
                    AllowThreadDiskReads = map;
                    r0 = AllowThreadDiskReads;
                }
            }
            r1 = r0;
        }
        return r1 != 0 ? r1 : Collections.emptyMap();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4138e2
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object mo9407f(String str) {
        return m9406b().get(str);
    }
}
