package p007c.p085g.p086a.p089m.p092t.p094d0;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: c.g.a.m.t.d0.f, reason: use source file name */
/* JADX INFO: compiled from: InternalCacheDiskCacheFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class InternalCacheDiskCacheFactory extends DiskLruCacheFactory {

    /* JADX INFO: renamed from: c.g.a.m.t.d0.f$a */
    /* JADX INFO: compiled from: InternalCacheDiskCacheFactory.java */
    public class a implements DiskLruCacheFactory.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3166a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f3167b;

        public a(Context context, String str) {
            this.f3166a = context;
            this.f3167b = str;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.p094d0.DiskLruCacheFactory.c
        /* JADX INFO: renamed from: a */
        public File mo1779a() {
            File cacheDir = this.f3166a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f3167b != null ? new File(cacheDir, this.f3167b) : cacheDir;
        }
    }

    public InternalCacheDiskCacheFactory(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public InternalCacheDiskCacheFactory(Context context, long j2) {
        this(context, "image_manager_disk_cache", j2);
    }

    public InternalCacheDiskCacheFactory(Context context, String str, long j2) {
        super(new a(context, str), j2);
    }
}
