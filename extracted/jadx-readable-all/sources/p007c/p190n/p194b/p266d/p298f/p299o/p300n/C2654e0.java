package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a.d;
import p007c.p190n.p194b.p266d.p298f.p299o.C2631d;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.e0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2654e0<O extends C2628a.d> extends C2699x {

    /* JADX INFO: renamed from: b */
    public final C2631d<O> f11651b;

    public C2654e0(C2631d<O> c2631d) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f11651b = c2631d;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e
    /* JADX INFO: renamed from: a */
    public final <A extends C2628a.b, T extends AbstractC2650d<? extends InterfaceC2638k, A>> T mo5490a(T t) {
        C2631d<O> c2631d = this.f11651b;
        Objects.requireNonNull(c2631d);
        t.f28670m = t.f28670m || BasePendingResult.f28658a.get().booleanValue();
        C2659g c2659g = c2631d.f11618i;
        Objects.requireNonNull(c2659g);
        C2698w0 c2698w0 = new C2698w0(1, t);
        Handler handler = c2659g.f11672t;
        handler.sendMessage(handler.obtainMessage(4, new C2666i0(c2698w0, c2659g.f11667o.get(), c2631d)));
        return t;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e
    /* JADX INFO: renamed from: b */
    public final Looper mo5491b() {
        return this.f11651b.f11614e;
    }
}
