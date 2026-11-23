package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p280x.C2211a;
import p007c.p190n.p194b.p266d.p298f.C2612g;
import p007c.p190n.p194b.p266d.p298f.C2614h;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class me2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ pe2 f16738f;

    public me2(pe2 pe2Var) {
        this.f16738f = pe2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pe2 pe2Var = this.f16738f;
        Objects.requireNonNull(pe2Var);
        try {
            if (pe2Var.f17952g == null && pe2Var.f17955j) {
                C2211a c2211a = new C2211a(pe2Var.f17947b);
                c2211a.m4663h(true);
                pe2Var.f17952g = c2211a;
            }
        } catch (C2612g | C2614h | IOException unused) {
            pe2Var.f17952g = null;
        }
    }
}
