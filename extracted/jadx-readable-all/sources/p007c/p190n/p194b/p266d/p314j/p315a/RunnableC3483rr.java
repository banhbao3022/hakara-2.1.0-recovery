package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: renamed from: c.n.b.d.j.a.rr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3483rr implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f19037f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f19038g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f19039h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f19040i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f19041j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f19042k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f19043l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean f19044m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f19045n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f19046o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ AbstractC3669wr f19047p;

    public RunnableC3483rr(AbstractC3669wr abstractC3669wr, String str, String str2, long j2, long j3, long j4, long j5, long j6, boolean z, int i, int i2) {
        this.f19047p = abstractC3669wr;
        this.f19037f = str;
        this.f19038g = str2;
        this.f19039h = j2;
        this.f19040i = j3;
        this.f19041j = j4;
        this.f19042k = j5;
        this.f19043l = j6;
        this.f19044m = z;
        this.f19045n = i;
        this.f19046o = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f19037f);
        map.put("cachedSrc", this.f19038g);
        map.put("bufferedDuration", Long.toString(this.f19039h));
        map.put("totalDuration", Long.toString(this.f19040i));
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14333d1)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f19041j));
            map.put("qoeCachedBytes", Long.toString(this.f19042k));
            map.put("totalBytes", Long.toString(this.f19043l));
            map.put("reportTime", Long.toString(C2330u.f10884a.f10896k.mo5623c()));
        }
        map.put("cacheReady", true != this.f19044m ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f19045n));
        map.put("playerPreparedCount", Integer.toString(this.f19046o));
        AbstractC3669wr.m8668p(this.f19047p, map);
    }
}
