package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jn1 {
    /* JADX INFO: renamed from: f */
    public static jn1 m7363f(kn1 kn1Var, ln1 ln1Var) {
        if (hn1.f14918a.f15327a) {
            return new nn1(kn1Var, ln1Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7364a();

    /* JADX INFO: renamed from: b */
    public abstract void mo7365b(View view);

    /* JADX INFO: renamed from: c */
    public abstract void mo7366c();

    /* JADX INFO: renamed from: d */
    public abstract void mo7367d(View view, pn1 pn1Var, String str);

    @Deprecated
    /* JADX INFO: renamed from: e */
    public abstract void mo7368e(View view);
}
