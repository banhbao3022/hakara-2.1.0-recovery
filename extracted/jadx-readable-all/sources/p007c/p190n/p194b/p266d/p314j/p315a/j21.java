package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2317h;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class j21 implements InterfaceC2317h {

    /* JADX INFO: renamed from: a */
    public final g60 f15443a;

    /* JADX INFO: renamed from: b */
    public final y60 f15444b;

    /* JADX INFO: renamed from: c */
    public final hc0 f15445c;

    /* JADX INFO: renamed from: d */
    public final dc0 f15446d;

    /* JADX INFO: renamed from: e */
    public final C3787zy f15447e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f15448f = new AtomicBoolean(false);

    public j21(g60 g60Var, y60 y60Var, hc0 hc0Var, dc0 dc0Var, C3787zy c3787zy) {
        this.f15443a = g60Var;
        this.f15444b = y60Var;
        this.f15445c = hc0Var;
        this.f15446d = dc0Var;
        this.f15447e = c3787zy;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2317h
    /* JADX INFO: renamed from: a */
    public final void mo4846a() {
        if (this.f15448f.get()) {
            this.f15443a.m7108A0(f60.f13980a);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2317h
    /* JADX INFO: renamed from: b */
    public final void mo4847b() {
        if (this.f15448f.get()) {
            this.f15444b.zza();
            this.f15445c.zza();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2317h
    /* JADX INFO: renamed from: c */
    public final synchronized void mo4848c(View view) {
        if (this.f15448f.compareAndSet(false, true)) {
            this.f15447e.mo5699i();
            this.f15446d.m6351B0(view);
        }
    }
}
