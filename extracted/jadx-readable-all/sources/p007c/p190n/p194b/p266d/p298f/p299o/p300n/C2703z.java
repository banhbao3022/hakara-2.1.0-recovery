package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.os.Handler;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.z */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2703z implements ComponentCallbacks2C2647c.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2659g f11771a;

    public C2703z(C2659g c2659g) {
        this.f11771a = c2659g;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.ComponentCallbacks2C2647c.a
    /* JADX INFO: renamed from: a */
    public final void mo5503a(boolean z) {
        Handler handler = this.f11771a.f11672t;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
