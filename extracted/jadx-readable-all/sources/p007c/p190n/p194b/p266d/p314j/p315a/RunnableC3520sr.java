package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;

/* JADX INFO: renamed from: c.n.b.d.j.a.sr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3520sr implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f19674f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f19675g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f19676h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f19677i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f19678j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f19679k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f19680l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f19681m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f19682n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ AbstractC3669wr f19683o;

    public RunnableC3520sr(AbstractC3669wr abstractC3669wr, String str, String str2, int i, int i2, long j2, long j3, boolean z, int i3, int i4) {
        this.f19683o = abstractC3669wr;
        this.f19674f = str;
        this.f19675g = str2;
        this.f19676h = i;
        this.f19677i = i2;
        this.f19678j = j2;
        this.f19679k = j3;
        this.f19680l = z;
        this.f19681m = i3;
        this.f19682n = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f19674f);
        map.put("cachedSrc", this.f19675g);
        map.put("bytesLoaded", Integer.toString(this.f19676h));
        map.put("totalBytes", Integer.toString(this.f19677i));
        map.put("bufferedDuration", Long.toString(this.f19678j));
        map.put("totalDuration", Long.toString(this.f19679k));
        map.put("cacheReady", true != this.f19680l ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f19681m));
        map.put("playerPreparedCount", Integer.toString(this.f19682n));
        AbstractC3669wr.m8668p(this.f19683o, map);
    }
}
