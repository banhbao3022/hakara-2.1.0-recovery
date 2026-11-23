package p007c.p190n.p194b.p209b.p210a2.p211j0;

import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p216o1.DatabaseIOException;
import p007c.p190n.p194b.p209b.p216o1.DatabaseProvider;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p380b.ImmutableSet;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.s, reason: use source file name */
/* JADX INFO: compiled from: SimpleCache.java */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleCache2 implements Cache {

    /* JADX INFO: renamed from: a */
    public static final HashSet<File> f6115a = new HashSet<>();

    /* JADX INFO: renamed from: b */
    public final File f6116b;

    /* JADX INFO: renamed from: c */
    public final CacheEvictor f6117c;

    /* JADX INFO: renamed from: d */
    public final CachedContentIndex f6118d;

    /* JADX INFO: renamed from: e */
    public final CacheFileMetadataIndex f6119e;

    /* JADX INFO: renamed from: f */
    public final HashMap<String, ArrayList<Cache.b>> f6120f;

    /* JADX INFO: renamed from: g */
    public final Random f6121g;

    /* JADX INFO: renamed from: h */
    public final boolean f6122h;

    /* JADX INFO: renamed from: i */
    public long f6123i;

    /* JADX INFO: renamed from: j */
    public long f6124j;

    /* JADX INFO: renamed from: k */
    public Cache.a f6125k;

    @Deprecated
    public SimpleCache2(File file, CacheEvictor cacheEvictor) {
        this(file, cacheEvictor, null, false);
    }

    /* JADX INFO: renamed from: j */
    public static void m2987j(SimpleCache2 simpleCache2) {
        long j2;
        if (!simpleCache2.f6116b.exists()) {
            try {
                m2988m(simpleCache2.f6116b);
            } catch (Cache.a e) {
                simpleCache2.f6125k = e;
                return;
            }
        }
        File[] fileArrListFiles = simpleCache2.f6116b.listFiles();
        if (fileArrListFiles == null) {
            StringBuilder sbM1556G = outline.m1556G("Failed to list cache directory files: ");
            sbM1556G.append(simpleCache2.f6116b);
            String string = sbM1556G.toString();
            Log.e("SimpleCache", string);
            simpleCache2.f6125k = new Cache.a(string);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j2 = -1;
                break;
            }
            File file = fileArrListFiles[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    Log.e("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i++;
        }
        simpleCache2.f6123i = j2;
        if (j2 == -1) {
            try {
                simpleCache2.f6123i = m2989n(simpleCache2.f6116b);
            } catch (IOException e2) {
                StringBuilder sbM1556G2 = outline.m1556G("Failed to create cache UID: ");
                sbM1556G2.append(simpleCache2.f6116b);
                String string2 = sbM1556G2.toString();
                p007c.p190n.p194b.p209b.p212b2.Log.m3154b("SimpleCache", string2, e2);
                simpleCache2.f6125k = new Cache.a(string2, e2);
                return;
            }
        }
        try {
            simpleCache2.f6118d.m2967e(simpleCache2.f6123i);
            CacheFileMetadataIndex cacheFileMetadataIndex = simpleCache2.f6119e;
            if (cacheFileMetadataIndex != null) {
                cacheFileMetadataIndex.m2958b(simpleCache2.f6123i);
                Map<String, CacheFileMetadata> mapM2957a = simpleCache2.f6119e.m2957a();
                simpleCache2.m2993p(simpleCache2.f6116b, true, fileArrListFiles, mapM2957a);
                simpleCache2.f6119e.m2959c(((HashMap) mapM2957a).keySet());
            } else {
                simpleCache2.m2993p(simpleCache2.f6116b, true, fileArrListFiles, null);
            }
            CachedContentIndex cachedContentIndex = simpleCache2.f6118d;
            Iterator it = ImmutableSet.m11661v(cachedContentIndex.f6087a.keySet()).iterator();
            while (it.hasNext()) {
                cachedContentIndex.m2968f((String) it.next());
            }
            try {
                simpleCache2.f6118d.m2969g();
            } catch (IOException e3) {
                p007c.p190n.p194b.p209b.p212b2.Log.m3154b("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            StringBuilder sbM1556G3 = outline.m1556G("Failed to initialize cache indices: ");
            sbM1556G3.append(simpleCache2.f6116b);
            String string3 = sbM1556G3.toString();
            p007c.p190n.p194b.p209b.p212b2.Log.m3154b("SimpleCache", string3, e4);
            simpleCache2.f6125k = new Cache.a(string3, e4);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m2988m(File file) throws Cache.a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        Log.e("SimpleCache", str);
        throw new Cache.a(str);
    }

    /* JADX INFO: renamed from: n */
    public static long m2989n(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, outline.m1599u(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.Cache
    /* JADX INFO: renamed from: a */
    public synchronized File mo2930a(String str, long j2, long j3) throws Cache.a {
        CachedContent cachedContent;
        File file;
        C2096e.m4570f(true);
        m2991l();
        cachedContent = this.f6118d.f6087a.get(str);
        Objects.requireNonNull(cachedContent);
        C2096e.m4570f(cachedContent.m2962a(j2, j3));
        if (!this.f6116b.exists()) {
            m2988m(this.f6116b);
            m2995r();
        }
        this.f6117c.mo2954a(this, str, j2, j3);
        file = new File(this.f6116b, Integer.toString(this.f6121g.nextInt(10)));
        if (!file.exists()) {
            m2988m(file);
        }
        return SimpleCacheSpan.m2998j(file, cachedContent.f6080a, j2, System.currentTimeMillis());
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.Cache
    /* JADX INFO: renamed from: b */
    public synchronized ContentMetadata2 mo2931b(String str) {
        CachedContent cachedContent;
        C2096e.m4570f(true);
        cachedContent = this.f6118d.f6087a.get(str);
        return cachedContent != null ? cachedContent.f6084e : DefaultContentMetadata.f6107a;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.Cache
    /* JADX INFO: renamed from: c */
    public synchronized void mo2932c(String str, ContentMetadataMutations contentMetadataMutations) throws Cache.a {
        C2096e.m4570f(true);
        m2991l();
        CachedContentIndex cachedContentIndex = this.f6118d;
        CachedContent cachedContentM2966d = cachedContentIndex.m2966d(str);
        DefaultContentMetadata defaultContentMetadata = cachedContentM2966d.f6084e;
        DefaultContentMetadata defaultContentMetadataM2985a = defaultContentMetadata.m2985a(contentMetadataMutations);
        cachedContentM2966d.f6084e = defaultContentMetadataM2985a;
        if (!defaultContentMetadataM2985a.equals(defaultContentMetadata)) {
            cachedContentIndex.f6091e.mo2972c(cachedContentM2966d);
        }
        try {
            this.f6118d.m2969g();
        } catch (IOException e) {
            throw new Cache.a(e);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.Cache
    /* JADX INFO: renamed from: d */
    public synchronized void mo2933d(CacheSpan cacheSpan) {
        C2096e.m4570f(true);
        m2994q(cacheSpan);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[PHI: r20
  0x0059: PHI (r20v6 c.n.b.b.a2.j0.t) = (r20v3 c.n.b.b.a2.j0.t), (r20v7 c.n.b.b.a2.j0.t) binds: [B:23:0x0056, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[PHI: r20
  0x005b: PHI (r20v4 c.n.b.b.a2.j0.t) = (r20v3 c.n.b.b.a2.j0.t), (r20v3 c.n.b.b.a2.j0.t), (r20v7 c.n.b.b.a2.j0.t), (r20v7 c.n.b.b.a2.j0.t) binds: [B:21:0x0050, B:24:0x0058, B:16:0x0044, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.Cache
    /* JADX INFO: renamed from: e */
    public synchronized CacheSpan mo2934e(String str, long j2, long j3) throws Cache.a {
        SimpleCacheSpan simpleCacheSpan;
        boolean z;
        boolean z2;
        C2096e.m4570f(true);
        m2991l();
        SimpleCacheSpan simpleCacheSpanM2992o = m2992o(str, j2, j3);
        if (simpleCacheSpanM2992o.f6077i) {
            return m2996s(str, simpleCacheSpanM2992o);
        }
        CachedContent cachedContentM2966d = this.f6118d.m2966d(str);
        long j4 = simpleCacheSpanM2992o.f6076h;
        int i = 0;
        while (true) {
            if (i >= cachedContentM2966d.f6083d.size()) {
                simpleCacheSpan = simpleCacheSpanM2992o;
                cachedContentM2966d.f6083d.add(new CachedContent.a(j2, j4));
                z = true;
                break;
            }
            CachedContent.a aVar = cachedContentM2966d.f6083d.get(i);
            long j5 = aVar.f6085a;
            if (j5 <= j2) {
                simpleCacheSpan = simpleCacheSpanM2992o;
                long j6 = aVar.f6086b;
                if (j6 == -1 || j5 + j6 > j2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                simpleCacheSpan = simpleCacheSpanM2992o;
                if (j4 == -1 || j2 + j4 > j5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                z = false;
                break;
            }
            i++;
            simpleCacheSpanM2992o = simpleCacheSpan;
        }
        if (z) {
            return simpleCacheSpan;
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.Cache
    /* JADX INFO: renamed from: f */
    public synchronized CacheSpan mo2935f(String str, long j2, long j3) throws InterruptedException, Cache.a {
        CacheSpan cacheSpanMo2934e;
        C2096e.m4570f(true);
        m2991l();
        while (true) {
            cacheSpanMo2934e = mo2934e(str, j2, j3);
            if (cacheSpanMo2934e == null) {
                wait();
            }
        }
        return cacheSpanMo2934e;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.Cache
    /* JADX INFO: renamed from: g */
    public synchronized void mo2936g(File file, long j2) throws Cache.a {
        boolean z = true;
        C2096e.m4570f(true);
        if (file.exists()) {
            if (j2 == 0) {
                file.delete();
                return;
            }
            SimpleCacheSpan simpleCacheSpanM2997h = SimpleCacheSpan.m2997h(file, j2, -9223372036854775807L, this.f6118d);
            Objects.requireNonNull(simpleCacheSpanM2997h);
            CachedContent cachedContentM2965c = this.f6118d.m2965c(simpleCacheSpanM2997h.f6074f);
            Objects.requireNonNull(cachedContentM2965c);
            C2096e.m4570f(cachedContentM2965c.m2962a(simpleCacheSpanM2997h.f6075g, simpleCacheSpanM2997h.f6076h));
            long jM2982a = ContentMetadata.m2982a(cachedContentM2965c.f6084e);
            if (jM2982a != -1) {
                if (simpleCacheSpanM2997h.f6075g + simpleCacheSpanM2997h.f6076h > jM2982a) {
                    z = false;
                }
                C2096e.m4570f(z);
            }
            if (this.f6119e == null) {
                m2990k(simpleCacheSpanM2997h);
                this.f6118d.m2969g();
                notifyAll();
                return;
            }
            try {
                this.f6119e.m2960d(file.getName(), simpleCacheSpanM2997h.f6076h, simpleCacheSpanM2997h.f6079k);
                m2990k(simpleCacheSpanM2997h);
                try {
                    this.f6118d.m2969g();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new Cache.a(e);
                }
            } catch (IOException e2) {
                throw new Cache.a(e2);
            }
            throw th;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.Cache
    /* JADX INFO: renamed from: h */
    public synchronized long mo2937h() {
        C2096e.m4570f(true);
        return this.f6124j;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.Cache
    /* JADX INFO: renamed from: i */
    public synchronized void mo2938i(CacheSpan cacheSpan) {
        C2096e.m4570f(true);
        CachedContent cachedContentM2965c = this.f6118d.m2965c(cacheSpan.f6074f);
        Objects.requireNonNull(cachedContentM2965c);
        long j2 = cacheSpan.f6075g;
        for (int i = 0; i < cachedContentM2965c.f6083d.size(); i++) {
            if (cachedContentM2965c.f6083d.get(i).f6085a == j2) {
                cachedContentM2965c.f6083d.remove(i);
                this.f6118d.m2968f(cachedContentM2965c.f6081b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: k */
    public final void m2990k(SimpleCacheSpan simpleCacheSpan) {
        this.f6118d.m2966d(simpleCacheSpan.f6074f).f6082c.add(simpleCacheSpan);
        this.f6124j += simpleCacheSpan.f6076h;
        ArrayList<Cache.b> arrayList = this.f6120f.get(simpleCacheSpan.f6074f);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    arrayList.get(size).mo2941d(this, simpleCacheSpan);
                }
            }
        }
        this.f6117c.mo2941d(this, simpleCacheSpan);
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m2991l() throws Cache.a {
        Cache.a aVar = this.f6125k;
        if (aVar != null) {
            throw aVar;
        }
    }

    /* JADX INFO: renamed from: o */
    public final SimpleCacheSpan m2992o(String str, long j2, long j3) {
        SimpleCacheSpan simpleCacheSpanFloor;
        long j4;
        CachedContent cachedContent = this.f6118d.f6087a.get(str);
        if (cachedContent == null) {
            return new SimpleCacheSpan(str, j2, j3, -9223372036854775807L, null);
        }
        while (true) {
            SimpleCacheSpan simpleCacheSpan = new SimpleCacheSpan(cachedContent.f6081b, j2, -1L, -9223372036854775807L, null);
            simpleCacheSpanFloor = cachedContent.f6082c.floor(simpleCacheSpan);
            if (simpleCacheSpanFloor == null || simpleCacheSpanFloor.f6075g + simpleCacheSpanFloor.f6076h <= j2) {
                SimpleCacheSpan simpleCacheSpanCeiling = cachedContent.f6082c.ceiling(simpleCacheSpan);
                if (simpleCacheSpanCeiling != null) {
                    long jMin = simpleCacheSpanCeiling.f6075g - j2;
                    if (j3 != -1) {
                        jMin = Math.min(jMin, j3);
                    }
                    j4 = jMin;
                } else {
                    j4 = j3;
                }
                simpleCacheSpanFloor = new SimpleCacheSpan(cachedContent.f6081b, j2, j4, -9223372036854775807L, null);
            }
            if (!simpleCacheSpanFloor.f6077i || simpleCacheSpanFloor.f6078j.length() == simpleCacheSpanFloor.f6076h) {
                break;
            }
            m2995r();
        }
        return simpleCacheSpanFloor;
    }

    /* JADX INFO: renamed from: p */
    public final void m2993p(File file, boolean z, File[] fileArr, Map<String, CacheFileMetadata> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                m2993p(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                long j2 = -1;
                long j3 = -9223372036854775807L;
                CacheFileMetadata cacheFileMetadataRemove = map != null ? map.remove(name) : null;
                if (cacheFileMetadataRemove != null) {
                    j2 = cacheFileMetadataRemove.f6068a;
                    j3 = cacheFileMetadataRemove.f6069b;
                }
                SimpleCacheSpan simpleCacheSpanM2997h = SimpleCacheSpan.m2997h(file2, j2, j3, this.f6118d);
                if (simpleCacheSpanM2997h != null) {
                    m2990k(simpleCacheSpanM2997h);
                } else {
                    file2.delete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2994q(CacheSpan cacheSpan) {
        boolean z;
        CachedContent cachedContentM2965c = this.f6118d.m2965c(cacheSpan.f6074f);
        if (cachedContentM2965c != null) {
            if (cachedContentM2965c.f6082c.remove(cacheSpan)) {
                File file = cacheSpan.f6078j;
                if (file != null) {
                    file.delete();
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f6124j -= cacheSpan.f6076h;
                if (this.f6119e != null) {
                    String name = cacheSpan.f6078j.getName();
                    try {
                        CacheFileMetadataIndex cacheFileMetadataIndex = this.f6119e;
                        Objects.requireNonNull(cacheFileMetadataIndex.f6072c);
                        try {
                            cacheFileMetadataIndex.f6071b.m3623e().delete(cacheFileMetadataIndex.f6072c, "name = ?", new String[]{name});
                        } catch (SQLException e) {
                            throw new DatabaseIOException(e);
                        }
                    } catch (IOException unused) {
                        outline.m1567R("Failed to remove file index entry for: ", name, "SimpleCache");
                    }
                }
                this.f6118d.m2968f(cachedContentM2965c.f6081b);
                ArrayList<Cache.b> arrayList = this.f6120f.get(cacheSpan.f6074f);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else {
                            arrayList.get(size).mo2939b(this, cacheSpan);
                        }
                    }
                }
                this.f6117c.mo2939b(this, cacheSpan);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2995r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.f6118d.f6087a.values()).iterator();
        while (it.hasNext()) {
            for (SimpleCacheSpan simpleCacheSpan : ((CachedContent) it.next()).f6082c) {
                if (simpleCacheSpan.f6078j.length() != simpleCacheSpan.f6076h) {
                    arrayList.add(simpleCacheSpan);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m2994q((CacheSpan) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: s */
    public final SimpleCacheSpan m2996s(String str, SimpleCacheSpan simpleCacheSpan) {
        File file;
        if (!this.f6122h) {
            return simpleCacheSpan;
        }
        File file2 = simpleCacheSpan.f6078j;
        Objects.requireNonNull(file2);
        String name = file2.getName();
        long j2 = simpleCacheSpan.f6076h;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        CacheFileMetadataIndex cacheFileMetadataIndex = this.f6119e;
        if (cacheFileMetadataIndex != null) {
            try {
                cacheFileMetadataIndex.m2960d(name, j2, jCurrentTimeMillis);
            } catch (IOException unused) {
                Log.w("SimpleCache", "Failed to update index with new touch timestamp.");
            }
        } else {
            z = true;
        }
        CachedContent cachedContent = this.f6118d.f6087a.get(str);
        C2096e.m4570f(cachedContent.f6082c.remove(simpleCacheSpan));
        File file3 = simpleCacheSpan.f6078j;
        Objects.requireNonNull(file3);
        if (z) {
            File parentFile = file3.getParentFile();
            Objects.requireNonNull(parentFile);
            File fileM2998j = SimpleCacheSpan.m2998j(parentFile, cachedContent.f6080a, simpleCacheSpan.f6075g, jCurrentTimeMillis);
            if (file3.renameTo(fileM2998j)) {
                file = fileM2998j;
            } else {
                Log.w("CachedContent", "Failed to rename " + file3 + " to " + fileM2998j);
                file = file3;
            }
        } else {
            file = file3;
        }
        C2096e.m4570f(simpleCacheSpan.f6077i);
        SimpleCacheSpan simpleCacheSpan2 = new SimpleCacheSpan(simpleCacheSpan.f6074f, simpleCacheSpan.f6075g, simpleCacheSpan.f6076h, jCurrentTimeMillis, file);
        cachedContent.f6082c.add(simpleCacheSpan2);
        ArrayList<Cache.b> arrayList = this.f6120f.get(simpleCacheSpan.f6074f);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                arrayList.get(size).mo2940c(this, simpleCacheSpan, simpleCacheSpan2);
            }
        }
        this.f6117c.mo2940c(this, simpleCacheSpan, simpleCacheSpan2);
        return simpleCacheSpan2;
    }

    @Deprecated
    public SimpleCache2(File file, CacheEvictor cacheEvictor, byte[] bArr) {
        this(file, cacheEvictor, bArr, bArr != null);
    }

    @Deprecated
    public SimpleCache2(File file, CacheEvictor cacheEvictor, byte[] bArr, boolean z) {
        this(file, cacheEvictor, null, bArr, z, true);
    }

    public SimpleCache2(File file, CacheEvictor cacheEvictor, DatabaseProvider databaseProvider) {
        this(file, cacheEvictor, databaseProvider, null, false, false);
    }

    public SimpleCache2(File file, CacheEvictor cacheEvictor, DatabaseProvider databaseProvider, byte[] bArr, boolean z, boolean z2) {
        boolean zAdd;
        CachedContentIndex cachedContentIndex = new CachedContentIndex(databaseProvider, file, bArr, z, z2);
        CacheFileMetadataIndex cacheFileMetadataIndex = (databaseProvider == null || z2) ? null : new CacheFileMetadataIndex(databaseProvider);
        synchronized (SimpleCache2.class) {
            zAdd = f6115a.add(file.getAbsoluteFile());
        }
        if (zAdd) {
            this.f6116b = file;
            this.f6117c = cacheEvictor;
            this.f6118d = cachedContentIndex;
            this.f6119e = cacheFileMetadataIndex;
            this.f6120f = new HashMap<>();
            this.f6121g = new Random();
            this.f6122h = cacheEvictor.mo2956f();
            this.f6123i = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new SimpleCache(this, "ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
