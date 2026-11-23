package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.a.ty */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3564ty implements InterfaceC3464r8<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3602uy f20178a;

    public C3564ty(C3602uy c3602uy) {
        this.f20178a = c3602uy;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map<String, String> map) {
        if (C3602uy.m8525b(this.f20178a, map)) {
            this.f20178a.f20673c.execute(new Runnable(this) { // from class: c.n.b.d.j.a.sy

                /* JADX INFO: renamed from: f */
                public final C3564ty f19733f;

                {
                    this.f19733f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C3787zy c3787zy = this.f19733f.f20178a.f20674d;
                    synchronized (c3787zy) {
                        c3787zy.m8913c();
                        c3787zy.f22443n = true;
                    }
                }
            });
        }
    }
}
