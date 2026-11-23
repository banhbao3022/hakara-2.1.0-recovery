package p007c.p190n.p194b.p266d.p267a;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3247ld;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3344o;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r;
import p007c.p190n.p194b.p266d.p314j.p315a.bx2;
import p007c.p190n.p194b.p266d.p314j.p315a.ex2;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;
import p007c.p190n.p194b.p266d.p314j.p315a.iw2;

/* JADX INFO: renamed from: c.n.b.d.a.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2169e {

    /* JADX INFO: renamed from: a */
    public final iw2 f10548a;

    /* JADX INFO: renamed from: b */
    public final Context f10549b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3344o f10550c;

    /* JADX INFO: renamed from: c.n.b.d.a.e$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Context f10551a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC3455r f10552b;

        public a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
            C2622l.m5379i(context, "context cannot be null");
            Context context2 = context;
            ex2 ex2Var = gx2.f14692a.f14694c;
            BinderC3247ld binderC3247ld = new BinderC3247ld();
            Objects.requireNonNull(ex2Var);
            InterfaceC3455r interfaceC3455rM6891d = new bx2(ex2Var, context, str, binderC3247ld).m6891d(context, false);
            this.f10551a = context2;
            this.f10552b = interfaceC3455rM6891d;
        }
    }

    public C2169e(Context context, InterfaceC3344o interfaceC3344o, iw2 iw2Var) {
        this.f10549b = context;
        this.f10550c = interfaceC3344o;
        this.f10548a = iw2Var;
    }
}
