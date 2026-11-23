package p477d1.p485u.p487j.p488a;

import p477d1.p485u.Continuation;
import p477d1.p493x.p495c.FunctionBase;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Reflection;

/* JADX INFO: renamed from: d1.u.j.a.h, reason: use source file name */
/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class ContinuationImpl5 extends ContinuationImpl3 implements FunctionBase<Object> {

    /* JADX INFO: renamed from: i */
    public final int f29557i;

    public ContinuationImpl5(int i, Continuation<Object> continuation) {
        super(continuation);
        this.f29557i = i;
    }

    @Override // p477d1.p493x.p495c.FunctionBase
    /* JADX INFO: renamed from: d */
    public int mo13073d() {
        return this.f29557i;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    public String toString() {
        if (this.f29547f != null) {
            return super.toString();
        }
        String strM13098a = Reflection.f29605a.m13098a(this);
        Intrinsics2.m13088d(strM13098a, "Reflection.renderLambdaToString(this)");
        return strM13098a;
    }

    public ContinuationImpl5(int i) {
        this(i, null);
    }
}
