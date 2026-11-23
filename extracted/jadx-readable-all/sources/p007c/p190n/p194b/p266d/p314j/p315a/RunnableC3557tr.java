package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;

/* JADX INFO: renamed from: c.n.b.d.j.a.tr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3557tr implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f19966f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f19967g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f19968h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC3669wr f19969i;

    public RunnableC3557tr(AbstractC3669wr abstractC3669wr, String str, String str2, int i) {
        this.f19969i = abstractC3669wr;
        this.f19966f = str;
        this.f19967g = str2;
        this.f19968h = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f19966f);
        map.put("cachedSrc", this.f19967g);
        map.put("totalBytes", Integer.toString(this.f19968h));
        AbstractC3669wr.m8668p(this.f19969i, map);
    }
}
