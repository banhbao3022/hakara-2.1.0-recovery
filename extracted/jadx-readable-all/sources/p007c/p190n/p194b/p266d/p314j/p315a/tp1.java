package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tp1 implements AbstractC2717c.a, AbstractC2717c.b {

    /* JADX INFO: renamed from: a */
    public final tq1 f19944a;

    /* JADX INFO: renamed from: b */
    public final String f19945b;

    /* JADX INFO: renamed from: c */
    public final String f19946c;

    /* JADX INFO: renamed from: d */
    public final zf2 f19947d;

    /* JADX INFO: renamed from: e */
    public final LinkedBlockingQueue<er1> f19948e;

    /* JADX INFO: renamed from: f */
    public final HandlerThread f19949f;

    /* JADX INFO: renamed from: g */
    public final np1 f19950g;

    /* JADX INFO: renamed from: h */
    public final long f19951h;

    public tp1(Context context, int i, zf2 zf2Var, String str, String str2, String str3, np1 np1Var) {
        this.f19945b = str;
        this.f19947d = zf2Var;
        this.f19946c = str2;
        this.f19950g = np1Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f19949f = handlerThread;
        handlerThread.start();
        this.f19951h = System.currentTimeMillis();
        tq1 tq1Var = new tq1(context, handlerThread.getLooper(), this, this, 19621000);
        this.f19944a = tq1Var;
        this.f19948e = new LinkedBlockingQueue<>();
        tq1Var.m5578o();
    }

    /* JADX INFO: renamed from: b */
    public static er1 m8439b() {
        return new er1(null, 1);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: Q */
    public final void mo5562Q(int i) {
        try {
            m8441c(4011, this.f19951h, null);
            this.f19948e.put(m8439b());
        } catch (InterruptedException unused) {
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.b
    /* JADX INFO: renamed from: W */
    public final void mo5565W(C2602b c2602b) {
        try {
            m8441c(4012, this.f19951h, null);
            this.f19948e.put(m8439b());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8440a() {
        tq1 tq1Var = this.f19944a;
        if (tq1Var != null) {
            if (tq1Var.m5582u0() || this.f19944a.m5572d()) {
                this.f19944a.mo5133J();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8441c(int i, long j2, Exception exc) {
        np1 np1Var = this.f19950g;
        if (np1Var != null) {
            np1Var.m7914c(i, System.currentTimeMillis() - j2, exc);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: c0 */
    public final void mo5563c0(Bundle bundle) {
        yq1 yq1VarM8446C;
        try {
            yq1VarM8446C = this.f19944a.m8446C();
        } catch (DeadObjectException | IllegalStateException unused) {
            yq1VarM8446C = null;
        }
        if (yq1VarM8446C != null) {
            try {
                cr1 cr1Var = new cr1(1, this.f19947d, this.f19945b, this.f19946c);
                Parcel parcelM7001E0 = yq1VarM8446C.m7001E0();
                ig2.m7251b(parcelM7001E0, cr1Var);
                Parcel parcelM7003i1 = yq1VarM8446C.m7003i1(3, parcelM7001E0);
                er1 er1Var = (er1) ig2.m7250a(parcelM7003i1, er1.CREATOR);
                parcelM7003i1.recycle();
                m8441c(5011, this.f19951h, null);
                this.f19948e.put(er1Var);
            } catch (Throwable th) {
                try {
                    m8441c(2010, this.f19951h, new Exception(th));
                } finally {
                    m8440a();
                    this.f19949f.quit();
                }
            }
        }
    }
}
