package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;

/* JADX INFO: renamed from: c.n.b.d.j.a.ur */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3594ur implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f20407f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f20408g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f20409h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC3669wr f20410i;

    public RunnableC3594ur(AbstractC3669wr abstractC3669wr, String str, String str2, long j2) {
        this.f20410i = abstractC3669wr;
        this.f20407f = str;
        this.f20408g = str2;
        this.f20409h = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f20407f);
        map.put("cachedSrc", this.f20408g);
        map.put("totalDuration", Long.toString(this.f20409h));
        AbstractC3669wr.m8668p(this.f20410i, map);
    }
}
