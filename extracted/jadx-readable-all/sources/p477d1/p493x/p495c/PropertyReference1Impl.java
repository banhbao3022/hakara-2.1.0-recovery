package p477d1.p493x.p495c;

import p477d1.p479b0.KClass;
import p477d1.p479b0.KDeclarationContainer;

/* JADX INFO: renamed from: d1.x.c.n, reason: use source file name */
/* JADX INFO: compiled from: PropertyReference1Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(CallableReference.a.f29590f, ((ClassBasedDeclarationContainer) kDeclarationContainer).mo13082b(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.a.f29590f, cls, str, str2, i);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
