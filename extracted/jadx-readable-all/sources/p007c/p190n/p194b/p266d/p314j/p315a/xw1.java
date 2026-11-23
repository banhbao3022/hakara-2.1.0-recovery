package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xw1 implements bx1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hw1 f21708a;

    public xw1(hw1 hw1Var) {
        this.f21708a = hw1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx1
    /* JADX INFO: renamed from: a */
    public final hw1<?> mo6117a() {
        return this.f21708a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx1
    /* JADX INFO: renamed from: b */
    public final Class<?> mo6118b() {
        return this.f21708a.getClass();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx1
    /* JADX INFO: renamed from: c */
    public final Class<?> mo6119c() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx1
    /* JADX INFO: renamed from: d */
    public final <Q> hw1<Q> mo6120d(Class<Q> cls) throws GeneralSecurityException {
        if (((iw1) this.f21708a).f15411b.equals(cls)) {
            return this.f21708a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx1
    /* JADX INFO: renamed from: e */
    public final Set<Class<?>> mo6121e() {
        return Collections.singleton(((iw1) this.f21708a).f15411b);
    }
}
