package p477d1.p493x.p495c;

import java.io.Serializable;

/* JADX INFO: renamed from: d1.x.c.k, reason: use source file name */
/* JADX INFO: compiled from: Lambda.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class Lambda<R> implements FunctionBase<R>, Serializable {

    /* JADX INFO: renamed from: f */
    public final int f29600f;

    public Lambda(int i) {
        this.f29600f = i;
    }

    @Override // p477d1.p493x.p495c.FunctionBase
    /* JADX INFO: renamed from: d */
    public int mo13073d() {
        return this.f29600f;
    }

    public String toString() {
        String strM13098a = Reflection.f29605a.m13098a(this);
        Intrinsics2.m13088d(strM13098a, "Reflection.renderLambdaToString(this)");
        return strM13098a;
    }
}
