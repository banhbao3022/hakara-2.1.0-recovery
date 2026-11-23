package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class we2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public final Activity f21043h;

    /* JADX INFO: renamed from: i */
    public final View f21044i;

    public we2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2, View view, Activity activity) {
        super(pe2Var, "d7iz/RaEjr4+F5KeSshTAEj7Q3zrU63hP4JJ9g4PP8N7gmW+Iw0VuVNSijbICL3k", "qWEJpfGQyAWr4gtX2zyFUAILvlzTpMpm09EeOcWOxm8=", go0Var, i, 62);
        this.f21044i = view;
        this.f21043h = activity;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        if (this.f21044i == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14459v1)).booleanValue();
        Object[] objArr = (Object[]) this.f21526e.invoke(null, this.f21044i, this.f21043h, Boolean.valueOf(zBooleanValue));
        synchronized (this.f21525d) {
            try {
                go0 go0Var = this.f21525d;
                long jLongValue = ((Long) objArr[0]).longValue();
                if (go0Var.f13191h) {
                    go0Var.m6298m();
                    go0Var.f13191h = false;
                }
                f31.m6740b0((f31) go0Var.f13190g, jLongValue);
                go0 go0Var2 = this.f21525d;
                long jLongValue2 = ((Long) objArr[1]).longValue();
                if (go0Var2.f13191h) {
                    go0Var2.m6298m();
                    go0Var2.f13191h = false;
                }
                f31.m6741c0((f31) go0Var2.f13190g, jLongValue2);
                if (zBooleanValue) {
                    go0 go0Var3 = this.f21525d;
                    String str = (String) objArr[2];
                    if (go0Var3.f13191h) {
                        go0Var3.m6298m();
                        go0Var3.f13191h = false;
                    }
                    f31.m6742d0((f31) go0Var3.f13190g, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
