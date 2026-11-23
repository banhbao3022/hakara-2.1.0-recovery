package p007c.p190n.p194b.p266d.p298f.p302q;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p266d.p298f.C2608e;
import p007c.p190n.p194b.p266d.p298f.C2610f;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;

/* JADX INFO: renamed from: c.n.b.d.f.q.i */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2735i<T extends IInterface> extends AbstractC2717c<T> implements C2628a.f {

    /* JADX INFO: renamed from: x */
    public final C2720d f11877x;

    /* JADX INFO: renamed from: y */
    public final Set<Scope> f11878y;

    /* JADX INFO: renamed from: z */
    public final Account f11879z;

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public AbstractC2735i(Context context, Looper looper, int i, C2720d c2720d, AbstractC2632e.a aVar, AbstractC2632e.b bVar) {
        AbstractC2738j abstractC2738jM5599a = AbstractC2738j.m5599a(context);
        C2608e c2608e = C2608e.f11563d;
        Objects.requireNonNull(aVar, "null reference");
        Objects.requireNonNull(bVar, "null reference");
        super(context, looper, abstractC2738jM5599a, c2608e, i, new C2712a0(aVar), new C2715b0(bVar), c2720d.f11830g);
        this.f11877x = c2720d;
        this.f11879z = c2720d.f11824a;
        Set<Scope> set = c2720d.f11826c;
        Iterator<Scope> it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f11878y = set;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: a */
    public Set<Scope> mo5472a() {
        return mo5480m() ? this.f11878y : Collections.emptySet();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: k */
    public int mo4925k() {
        return C2610f.f11567a;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: p */
    public final Account mo5579p() {
        return this.f11879z;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: t */
    public final Set<Scope> mo5580t() {
        return this.f11878y;
    }
}
