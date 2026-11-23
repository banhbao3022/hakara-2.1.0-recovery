package p555j.p556a.p557a;

import java.io.File;
import mtp.media.karaoke.MainApplication;
import p007c.p008a.p009a.p010a.ExoMedia2;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p210a2.p211j0.CacheDataSource;
import p007c.p190n.p194b.p209b.p210a2.p211j0.LeastRecentlyUsedCacheEvictor;
import p007c.p190n.p194b.p209b.p210a2.p211j0.SimpleCache2;
import p007c.p190n.p194b.p209b.p219r1.p220a.OkHttpDataSource;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.OkHttpClient;

/* JADX INFO: renamed from: j.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: MainApplication.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MainApplication2 implements ExoMedia2 {

    /* JADX INFO: renamed from: a */
    public CacheDataSource.b f32078a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MainApplication f32079b;

    public MainApplication2(MainApplication mainApplication) {
        this.f32079b = mainApplication;
    }

    @Override // p007c.p008a.p009a.p010a.ExoMedia2
    /* JADX INFO: renamed from: a */
    public DataSource3.a mo1011a(String str, TransferListener transferListener) {
        Intrinsics2.m13089e(str, "userAgent");
        if (this.f32078a == null) {
            OkHttpDataSource.a aVar = new OkHttpDataSource.a(new OkHttpClient());
            aVar.f7462c = str;
            aVar.f7463d = transferListener;
            SimpleCache2 simpleCache2 = new SimpleCache2(new File(this.f32079b.getCacheDir(), "ExoMediaCache"), new LeastRecentlyUsedCacheEvictor(104857600));
            CacheDataSource.b bVar = new CacheDataSource.b();
            bVar.f6063a = simpleCache2;
            bVar.f6066d = aVar;
            bVar.f6067e = 2;
            this.f32078a = bVar;
        }
        CacheDataSource.b bVar2 = this.f32078a;
        Intrinsics2.m13087c(bVar2);
        return bVar2;
    }
}
