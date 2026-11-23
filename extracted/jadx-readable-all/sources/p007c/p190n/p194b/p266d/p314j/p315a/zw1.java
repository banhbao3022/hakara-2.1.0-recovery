package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zw1 implements bx1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ww1 f22427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mw1 f22428b;

    public zw1(ww1 ww1Var, mw1 mw1Var) {
        this.f22427a = ww1Var;
        this.f22428b = mw1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx1
    /* JADX INFO: renamed from: a */
    public final hw1<?> mo6117a() {
        ww1 ww1Var = this.f22427a;
        return new vw1(ww1Var, this.f22428b, ww1Var.f16955c);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx1
    /* JADX INFO: renamed from: b */
    public final Class<?> mo6118b() {
        return this.f22427a.getClass();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx1
    /* JADX INFO: renamed from: c */
    public final Class<?> mo6119c() {
        return this.f22428b.getClass();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx1
    /* JADX INFO: renamed from: d */
    public final <Q> hw1<Q> mo6120d(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new vw1(this.f22427a, this.f22428b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx1
    /* JADX INFO: renamed from: e */
    public final Set<Class<?>> mo6121e() {
        return this.f22427a.m7737f();
    }
}
