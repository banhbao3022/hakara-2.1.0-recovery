package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;

/* JADX INFO: renamed from: c.n.b.d.j.a.qr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3446qr implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f18415f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f18416g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f18417h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f18418i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC3669wr f18419j;

    public RunnableC3446qr(AbstractC3669wr abstractC3669wr, String str, String str2, int i, int i2) {
        this.f18419j = abstractC3669wr;
        this.f18415f = str;
        this.f18416g = str2;
        this.f18417h = i;
        this.f18418i = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f18415f);
        map.put("cachedSrc", this.f18416g);
        map.put("bytesLoaded", Integer.toString(this.f18417h));
        map.put("totalBytes", Integer.toString(this.f18418i));
        map.put("cacheReady", "0");
        AbstractC3669wr.m8668p(this.f18419j, map);
    }
}
