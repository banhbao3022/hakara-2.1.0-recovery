package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4767b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class np1 {

    /* JADX INFO: renamed from: a */
    public static volatile fb0 f17211a = fb0.UNKNOWN;

    /* JADX INFO: renamed from: b */
    public final Context f17212b;

    /* JADX INFO: renamed from: c */
    public final Executor f17213c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4781i<lr1> f17214d;

    /* JADX INFO: renamed from: e */
    public final boolean f17215e;

    public np1(Context context, Executor executor, AbstractC4781i<lr1> abstractC4781i, boolean z) {
        this.f17212b = context;
        this.f17213c = executor;
        this.f17214d = abstractC4781i;
        this.f17215e = z;
    }

    /* JADX INFO: renamed from: a */
    public static np1 m7912a(final Context context, Executor executor, boolean z) {
        return new np1(context, executor, C4340s8.m10206c(executor, new Callable(context) { // from class: c.n.b.d.j.a.kp1

            /* JADX INFO: renamed from: a */
            public final Context f16011a;

            {
                this.f16011a = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new lr1(this.f16011a, "GLAS", null);
            }
        }), z);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC4781i<Boolean> m7913b(int i, long j2) {
        return m7917f(i, j2, null, null, null, null);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC4781i<Boolean> m7914c(int i, long j2, Exception exc) {
        return m7917f(i, j2, exc, null, null, null);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC4781i m7915d(int i, long j2, String str) {
        return m7917f(i, j2, null, str, null, null);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC4781i<Boolean> m7916e(int i, String str) {
        return m7917f(i, 0L, null, null, null, str);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC4781i<Boolean> m7917f(final int i, long j2, Exception exc, String str, Map<String, String> map, String str2) {
        if (!this.f17215e) {
            return this.f17214d.mo10934g(this.f17213c, lp1.f16438a);
        }
        final d70 d70VarM6987v = gc0.m6987v();
        String packageName = this.f17212b.getPackageName();
        if (d70VarM6987v.f13191h) {
            d70VarM6987v.m6298m();
            d70VarM6987v.f13191h = false;
        }
        gc0.m6989y((gc0) d70VarM6987v.f13190g, packageName);
        if (d70VarM6987v.f13191h) {
            d70VarM6987v.m6298m();
            d70VarM6987v.f13191h = false;
        }
        gc0.m6990z((gc0) d70VarM6987v.f13190g, j2);
        fb0 fb0Var = f17211a;
        if (d70VarM6987v.f13191h) {
            d70VarM6987v.m6298m();
            d70VarM6987v.f13191h = false;
        }
        gc0.m6986E((gc0) d70VarM6987v.f13190g, fb0Var);
        if (exc != null) {
            Object obj = ms1.f16843a;
            StringWriter stringWriter = new StringWriter();
            q62.f18207a.mo7444c(exc, new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            if (d70VarM6987v.f13191h) {
                d70VarM6987v.m6298m();
                d70VarM6987v.f13191h = false;
            }
            gc0.m6982A((gc0) d70VarM6987v.f13190g, string);
            String name = exc.getClass().getName();
            if (d70VarM6987v.f13191h) {
                d70VarM6987v.m6298m();
                d70VarM6987v.f13191h = false;
            }
            gc0.m6983B((gc0) d70VarM6987v.f13190g, name);
        }
        if (str2 != null) {
            if (d70VarM6987v.f13191h) {
                d70VarM6987v.m6298m();
                d70VarM6987v.f13191h = false;
            }
            gc0.m6984C((gc0) d70VarM6987v.f13190g, str2);
        }
        if (str != null) {
            if (d70VarM6987v.f13191h) {
                d70VarM6987v.m6298m();
                d70VarM6987v.f13191h = false;
            }
            gc0.m6985D((gc0) d70VarM6987v.f13190g, str);
        }
        return this.f17214d.mo10934g(this.f17213c, new InterfaceC4767b(d70VarM6987v, i) { // from class: c.n.b.d.j.a.mp1

            /* JADX INFO: renamed from: a */
            public final d70 f16821a;

            /* JADX INFO: renamed from: b */
            public final int f16822b;

            {
                this.f16821a = d70VarM6987v;
                this.f16822b = i;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4767b
            /* JADX INFO: renamed from: a */
            public final Object mo5191a(AbstractC4781i abstractC4781i) {
                d70 d70Var = this.f16821a;
                int i2 = this.f16822b;
                if (!abstractC4781i.mo10941n()) {
                    return Boolean.FALSE;
                }
                lr1 lr1Var = (lr1) abstractC4781i.mo10937j();
                byte[] bArrMo7574w = d70Var.m6300o().mo7574w();
                Objects.requireNonNull(lr1Var);
                try {
                    if (lr1Var.f16472a) {
                        mr1 mr1Var = lr1Var.f16473b;
                        Parcel parcelM7001E0 = mr1Var.m7001E0();
                        parcelM7001E0.writeByteArray(bArrMo7574w);
                        mr1Var.m7002T1(5, parcelM7001E0);
                        mr1 mr1Var2 = lr1Var.f16473b;
                        Parcel parcelM7001E1 = mr1Var2.m7001E0();
                        parcelM7001E1.writeInt(0);
                        mr1Var2.m7002T1(6, parcelM7001E1);
                        mr1 mr1Var3 = lr1Var.f16473b;
                        Parcel parcelM7001E2 = mr1Var3.m7001E0();
                        parcelM7001E2.writeInt(i2);
                        mr1Var3.m7002T1(7, parcelM7001E2);
                        mr1 mr1Var4 = lr1Var.f16473b;
                        Parcel parcelM7001E3 = mr1Var4.m7001E0();
                        parcelM7001E3.writeIntArray(null);
                        mr1Var4.m7002T1(4, parcelM7001E3);
                        mr1 mr1Var5 = lr1Var.f16473b;
                        mr1Var5.m7002T1(3, mr1Var5.m7001E0());
                    }
                } catch (RemoteException e) {
                    Log.d("GASS", "Clearcut log failed", e);
                }
                return Boolean.TRUE;
            }
        });
    }
}
