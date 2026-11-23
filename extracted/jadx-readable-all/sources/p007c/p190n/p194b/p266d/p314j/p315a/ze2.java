package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ze2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public static final yf2<so1> f22246h = new yf2<>();

    /* JADX INFO: renamed from: i */
    public final Context f22247i;

    public ze2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2, Context context, df0 df0Var) {
        super(pe2Var, "UZTSNWb1zXgw5vjxx2ZhxjLLyqN54Pno04MXjtzCVCMzKVc+OfmNkNnAKjZ08r/h", "BTQuS/+Ue5xwms1CJL1YODGUh5Ur1d+4x5VZpgqRylk=", go0Var, i, 27);
        this.f22247i = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        gk0 gk0Var;
        so1 so1Var;
        gk0 gk0Var2 = gk0.ENUM_SIGNAL_SOURCE_ADSHIELD;
        AtomicReference<so1> atomicReferenceM8794a = f22246h.m8794a(this.f22247i.getPackageName());
        synchronized (atomicReferenceM8794a) {
            so1 so1Var2 = atomicReferenceM8794a.get();
            if (so1Var2 == null || re2.m8276a(so1Var2.f19634b) || so1Var2.f19634b.equals("E") || so1Var2.f19634b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                String strM6764k0 = null;
                if (re2.m8276a(null)) {
                    gk0Var = ((!re2.m8276a(null) ? Boolean.FALSE : Boolean.FALSE).booleanValue() && this.f21522a.f17960o) ? gk0.ENUM_SIGNAL_SOURCE_GASS : gk0Var2;
                } else {
                    gk0Var = gk0.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                }
                Boolean boolValueOf = Boolean.valueOf(gk0Var == gk0Var2);
                AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14410o1;
                C2862b c2862b = C2862b.f12493a;
                so1 so1Var3 = new so1((String) this.f21526e.invoke(null, this.f22247i, boolValueOf, (Boolean) c2862b.f12496d.m6596a(abstractC3718y2), (String) c2862b.f12496d.m6596a(C3052g3.f14417p1)));
                if (re2.m8276a(so1Var3.f19634b) || so1Var3.f19634b.equals("E")) {
                    int iOrdinal = gk0Var.ordinal();
                    if (iOrdinal == 3) {
                        try {
                            Future future = this.f21522a.f17957l;
                            if (future != null) {
                                future.get();
                            }
                            f31 f31Var = this.f21522a.f17956k;
                            if (f31Var != null && f31Var.m6763W()) {
                                strM6764k0 = f31Var.m6764k0();
                            }
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                        if (!re2.m8276a(strM6764k0)) {
                            so1Var3.f19634b = strM6764k0;
                        }
                    } else if (iOrdinal == 4) {
                        throw null;
                    }
                }
                atomicReferenceM8794a.set(so1Var3);
            }
            so1Var = atomicReferenceM8794a.get();
        }
        synchronized (this.f21525d) {
            if (so1Var != null) {
                go0 go0Var = this.f21525d;
                String str = so1Var.f19634b;
                if (go0Var.f13191h) {
                    go0Var.m6298m();
                    go0Var.f13191h = false;
                }
                f31.m6754v((f31) go0Var.f13190g, str);
                go0 go0Var2 = this.f21525d;
                long j2 = so1Var.f19635c;
                if (go0Var2.f13191h) {
                    go0Var2.m6298m();
                    go0Var2.f13191h = false;
                }
                f31.m6710C((f31) go0Var2.f13190g, j2);
                go0 go0Var3 = this.f21525d;
                String str2 = so1Var.f19636d;
                if (go0Var3.f13191h) {
                    go0Var3.m6298m();
                    go0Var3.f13191h = false;
                }
                f31.m6708B((f31) go0Var3.f13190g, str2);
                go0 go0Var4 = this.f21525d;
                String str3 = so1Var.f19637e;
                if (go0Var4.f13191h) {
                    go0Var4.m6298m();
                    go0Var4.f13191h = false;
                }
                f31.m6725L((f31) go0Var4.f13190g, str3);
                go0 go0Var5 = this.f21525d;
                String str4 = so1Var.f19638f;
                if (go0Var5.f13191h) {
                    go0Var5.m6298m();
                    go0Var5.f13191h = false;
                }
                f31.m6726M((f31) go0Var5.f13190g, str4);
            }
        }
    }
}
