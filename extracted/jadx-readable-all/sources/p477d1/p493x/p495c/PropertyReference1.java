package p477d1.p493x.p495c;

import java.util.Objects;
import p477d1.p479b0.KCallable;
import p477d1.p479b0.KProperty;
import p477d1.p479b0.KProperty2;
import p477d1.p493x.KotlinReflectionNotSupportedError;

/* JADX INFO: renamed from: d1.x.c.m, reason: use source file name */
/* JADX INFO: compiled from: PropertyReference1.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class PropertyReference1 extends PropertyReference implements KProperty {
    public PropertyReference1() {
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Object mo3b(Object obj) {
        return ((PropertyReference1Impl) this).mo12973h().m12971a(obj);
    }

    @Override // p477d1.p493x.p495c.CallableReference
    /* JADX INFO: renamed from: g */
    public KCallable mo13081g() {
        Objects.requireNonNull(Reflection.f29605a);
        return this;
    }

    @Override // p477d1.p479b0.KProperty
    /* JADX INFO: renamed from: h */
    public KProperty.a mo12973h() {
        KCallable kCallableM13080e = m13080e();
        if (kCallableM13080e != this) {
            return ((KProperty) ((KProperty2) kCallableM13080e)).mo12973h();
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
