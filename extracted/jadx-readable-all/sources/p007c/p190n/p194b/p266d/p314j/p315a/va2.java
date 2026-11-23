package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.ConditionVariable;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;
import java.util.Random;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class va2 {

    /* JADX INFO: renamed from: a */
    public static final ConditionVariable f20723a = new ConditionVariable();

    /* JADX INFO: renamed from: b */
    public static volatile lr1 f20724b = null;

    /* JADX INFO: renamed from: c */
    public static volatile Random f20725c = null;

    /* JADX INFO: renamed from: d */
    public final pe2 f20726d;

    /* JADX INFO: renamed from: e */
    public volatile Boolean f20727e;

    public va2(pe2 pe2Var) {
        this.f20726d = pe2Var;
        pe2Var.f17948c.execute(new v92(this));
    }

    /* JADX INFO: renamed from: b */
    public static Random m8541b() {
        if (f20725c == null) {
            synchronized (va2.class) {
                if (f20725c == null) {
                    f20725c = new Random();
                }
            }
        }
        return f20725c;
    }

    /* JADX INFO: renamed from: a */
    public final void m8542a(int i, int i2, long j2, String str, Exception exc) {
        try {
            f20723a.block();
            if (!this.f20727e.booleanValue() || f20724b == null) {
                return;
            }
            d70 d70VarM6987v = gc0.m6987v();
            String packageName = this.f20726d.f17947b.getPackageName();
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
            if (str != null) {
                if (d70VarM6987v.f13191h) {
                    d70VarM6987v.m6298m();
                    d70VarM6987v.f13191h = false;
                }
                gc0.m6984C((gc0) d70VarM6987v.f13190g, str);
            }
            if (exc != null) {
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
            lr1 lr1Var = f20724b;
            byte[] bArrMo7574w = d70VarM6987v.m6300o().mo7574w();
            Objects.requireNonNull(lr1Var);
            if (i2 == -1) {
                i2 = 0;
            }
            try {
                if (lr1Var.f16472a) {
                    mr1 mr1Var = lr1Var.f16473b;
                    Parcel parcelM7001E0 = mr1Var.m7001E0();
                    parcelM7001E0.writeByteArray(bArrMo7574w);
                    mr1Var.m7002T1(5, parcelM7001E0);
                    mr1 mr1Var2 = lr1Var.f16473b;
                    Parcel parcelM7001E1 = mr1Var2.m7001E0();
                    parcelM7001E1.writeInt(i2);
                    mr1Var2.m7002T1(6, parcelM7001E1);
                    mr1 mr1Var3 = lr1Var.f16473b;
                    Parcel parcelM7001E2 = mr1Var3.m7001E0();
                    parcelM7001E2.writeInt(i);
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
        } catch (Exception unused) {
        }
    }
}
