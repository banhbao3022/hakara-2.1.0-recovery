package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.p307u.C2783c;
import p007c.p190n.p194b.p266d.p314j.p315a.C2998en;
import p007c.p190n.p194b.p266d.p314j.p315a.C3646w4;
import p007c.p190n.p194b.p266d.p314j.p315a.C3696xh;
import p007c.p190n.p194b.p266d.p314j.p315a.xr1;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.v0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC2303v0 extends xr1 {
    public HandlerC2303v0(Looper looper) {
        super(looper);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xr1
    /* JADX INFO: renamed from: a */
    public final void mo4807a(Message message) {
        try {
            super.mo4807a(message);
        } catch (Throwable th) {
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            Context context = C2330u.f10884a.f10893h.f13616e;
            if (context != null) {
                try {
                    if (C3646w4.f20986b.m6603d().booleanValue()) {
                        C2783c.m5625a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "AdMobHandler.handleMessage");
        }
    }
}
