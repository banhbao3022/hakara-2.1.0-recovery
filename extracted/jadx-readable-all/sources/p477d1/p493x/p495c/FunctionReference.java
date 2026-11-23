package p477d1.p493x.p495c;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p479b0.KCallable;
import p477d1.p479b0.KFunction;

/* JADX INFO: renamed from: d1.x.c.h, reason: use source file name */
/* JADX INFO: compiled from: FunctionReference.java */
/* JADX INFO: loaded from: classes.dex */
public class FunctionReference extends CallableReference implements FunctionBase, KFunction {

    /* JADX INFO: renamed from: l */
    public final int f29598l;

    /* JADX INFO: renamed from: m */
    public final int f29599m;

    public FunctionReference(int i) {
        this(i, CallableReference.a.f29590f, null, null, null, 0);
    }

    @Override // p477d1.p493x.p495c.FunctionBase
    /* JADX INFO: renamed from: d */
    public int mo13073d() {
        return this.f29598l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return Intrinsics2.m13085a(mo12498j(), functionReference.mo12498j()) && mo12497i().equals(functionReference.mo12497i()) && mo12499k().equals(functionReference.mo12499k()) && this.f29599m == functionReference.f29599m && this.f29598l == functionReference.f29598l && Intrinsics2.m13085a(this.f29585g, functionReference.f29585g);
        }
        if (obj instanceof KFunction) {
            return obj.equals(m13080e());
        }
        return false;
    }

    @Override // p477d1.p493x.p495c.CallableReference
    /* JADX INFO: renamed from: g */
    public KCallable mo13081g() {
        Objects.requireNonNull(Reflection.f29605a);
        return this;
    }

    public int hashCode() {
        return mo12499k().hashCode() + ((mo12497i().hashCode() + (mo12498j() == null ? 0 : mo12498j().hashCode() * 31)) * 31);
    }

    public String toString() {
        KCallable kCallableM13080e = m13080e();
        if (kCallableM13080e != this) {
            return kCallableM13080e.toString();
        }
        if ("<init>".equals(mo12497i())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder sbM1556G = outline.m1556G("function ");
        sbM1556G.append(mo12497i());
        sbM1556G.append(" (Kotlin reflection is not available)");
        return sbM1556G.toString();
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f29598l = i;
        this.f29599m = i2 >> 1;
    }
}
