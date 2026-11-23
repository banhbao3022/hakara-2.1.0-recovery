package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Binder;
import java.io.InputStream;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class at0 implements AbstractC2717c.a, AbstractC2717c.b {

    /* JADX INFO: renamed from: a */
    public final C3147io<InputStream> f12266a = new C3147io<>();

    /* JADX INFO: renamed from: b */
    public final Object f12267b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f12268c = false;

    /* JADX INFO: renamed from: d */
    public boolean f12269d = false;

    /* JADX INFO: renamed from: e */
    public C3437qi f12270e;

    /* JADX INFO: renamed from: f */
    public C2844ai f12271f;

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: Q */
    public final void mo5562Q(int i) {
        C2622l.m5318U2("Cannot connect to remote service, fallback to local instance.");
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.b
    /* JADX INFO: renamed from: W */
    public void mo5565W(C2602b c2602b) {
        C2622l.m5318U2("Disconnected from remote ad request service.");
        this.f12266a.m7287b(new ot0(1));
    }

    /* JADX INFO: renamed from: a */
    public final void m5851a() {
        synchronized (this.f12267b) {
            this.f12269d = true;
            if (this.f12271f.m5582u0() || this.f12271f.m5572d()) {
                this.f12271f.mo5133J();
            }
            Binder.flushPendingCommands();
        }
    }
}
