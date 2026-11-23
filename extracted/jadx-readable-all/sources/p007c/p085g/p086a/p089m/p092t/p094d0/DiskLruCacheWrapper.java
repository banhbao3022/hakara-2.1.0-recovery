package p007c.p085g.p086a.p089m.p092t.p094d0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p007c.p085g.p086a.p087k.DiskLruCache;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p092t.DataCacheWriter;

/* JADX INFO: renamed from: c.g.a.m.t.d0.e, reason: use source file name */
/* JADX INFO: compiled from: DiskLruCacheWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class DiskLruCacheWrapper implements DiskCache {

    /* JADX INFO: renamed from: b */
    public final File f3162b;

    /* JADX INFO: renamed from: c */
    public final long f3163c;

    /* JADX INFO: renamed from: e */
    public DiskLruCache f3165e;

    /* JADX INFO: renamed from: d */
    public final DiskCacheWriteLocker f3164d = new DiskCacheWriteLocker();

    /* JADX INFO: renamed from: a */
    public final SafeKeyGenerator f3161a = new SafeKeyGenerator();

    @Deprecated
    public DiskLruCacheWrapper(File file, long j2) {
        this.f3162b = file;
        this.f3163c = j2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p007c.p085g.p086a.p089m.p092t.p094d0.DiskCache
    /* JADX INFO: renamed from: a */
    public void mo1776a(Key key, DiskCache.b bVar) {
        DiskCacheWriteLocker.a aVarPoll;
        String strM1784a = this.f3161a.m1784a(key);
        DiskCacheWriteLocker diskCacheWriteLocker = this.f3164d;
        synchronized (diskCacheWriteLocker) {
            aVarPoll = diskCacheWriteLocker.f3151a.get(strM1784a);
            if (aVarPoll == null) {
                DiskCacheWriteLocker.b bVar2 = diskCacheWriteLocker.f3152b;
                synchronized (bVar2.f3155a) {
                    aVarPoll = bVar2.f3155a.poll();
                }
                if (aVarPoll == null) {
                    aVarPoll = new DiskCacheWriteLocker.a();
                }
                diskCacheWriteLocker.f3151a.put(strM1784a, aVarPoll);
            }
            aVarPoll.f3154b++;
        }
        aVarPoll.f3153a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM1784a + " for for Key: " + key);
            }
            try {
                DiskLruCache diskLruCacheM1780c = m1780c();
                if (diskLruCacheM1780c.m1667D(strM1784a) == null) {
                    DiskLruCache.c cVarM1675u = diskLruCacheM1780c.m1675u(strM1784a);
                    if (cVarM1675u == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strM1784a);
                    }
                    try {
                        DataCacheWriter dataCacheWriter = (DataCacheWriter) bVar;
                        if (dataCacheWriter.f3198a.mo1700a(dataCacheWriter.f3199b, cVarM1675u.m1677b(0), dataCacheWriter.f3200c)) {
                            DiskLruCache.m1663a(DiskLruCache.this, cVarM1675u, true);
                            cVarM1675u.f2949c = true;
                        }
                        if (!cVarM1675u.f2949c) {
                            try {
                                cVarM1675u.m1676a();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!cVarM1675u.f2949c) {
                            try {
                                cVarM1675u.m1676a();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            this.f3164d.m1778a(strM1784a);
        } catch (Throwable th2) {
            this.f3164d.m1778a(strM1784a);
            throw th2;
        }
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p094d0.DiskCache
    /* JADX INFO: renamed from: b */
    public File mo1777b(Key key) {
        String strM1784a = this.f3161a.m1784a(key);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM1784a + " for for Key: " + key);
        }
        try {
            DiskLruCache.e eVarM1667D = m1780c().m1667D(strM1784a);
            if (eVarM1667D != null) {
                return eVarM1667D.f2959a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized DiskLruCache m1780c() throws IOException {
        if (this.f3165e == null) {
            this.f3165e = DiskLruCache.m1662O(this.f3162b, 1, 1, this.f3163c);
        }
        return this.f3165e;
    }
}
