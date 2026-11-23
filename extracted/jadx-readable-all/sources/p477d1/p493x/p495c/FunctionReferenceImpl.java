package p477d1.p493x.p495c;

import p477d1.p479b0.KClass;
import p477d1.p479b0.KDeclarationContainer;

/* JADX INFO: renamed from: d1.x.c.i, reason: use source file name */
/* JADX INFO: compiled from: FunctionReferenceImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i, CallableReference.a.f29590f, ((ClassBasedDeclarationContainer) kDeclarationContainer).mo13082b(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, CallableReference.a.f29590f, cls, str, str2, i2);
    }

    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
