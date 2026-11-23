package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;
import p007c.p190n.p194b.p266d.p314j.p315a.ha1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class d71<S extends ha1> implements ia1<S> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<c71<S>> f13182a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final InterfaceC2782b f13183b;

    /* JADX INFO: renamed from: c */
    public final ia1<S> f13184c;

    /* JADX INFO: renamed from: d */
    public final long f13185d;

    public d71(ia1<S> ia1Var, long j2, InterfaceC2782b interfaceC2782b) {
        this.f13183b = interfaceC2782b;
        this.f13184c = ia1Var;
        this.f13185d = j2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<S> zza() {
        c71<S> c71Var = this.f13182a.get();
        if (c71Var == null) {
            c71Var = new c71<>(this.f13184c.zza(), this.f13185d, this.f13183b);
            this.f13182a.set(c71Var);
        } else {
            if (c71Var.f12951b < c71Var.f12952c.mo5621a()) {
                c71Var = new c71<>(this.f13184c.zza(), this.f13185d, this.f13183b);
                this.f13182a.set(c71Var);
            }
        }
        return c71Var.f12950a;
    }
}
