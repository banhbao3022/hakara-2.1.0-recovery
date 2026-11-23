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
public final class sp1 implements AbstractC2717c.a, AbstractC2717c.b {

    /* JADX INFO: renamed from: a */
    public final tq1 f19647a;

    /* JADX INFO: renamed from: b */
    public final String f19648b;

    /* JADX INFO: renamed from: c */
    public final String f19649c;

    /* JADX INFO: renamed from: d */
    public final LinkedBlockingQueue<f31> f19650d;

    /* JADX INFO: renamed from: e */
    public final HandlerThread f19651e;

    public sp1(Context context, String str, String str2) {
        this.f19648b = str;
        this.f19649c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f19651e = handlerThread;
        handlerThread.start();
        tq1 tq1Var = new tq1(context, handlerThread.getLooper(), this, this, 9200000);
        this.f19647a = tq1Var;
        this.f19650d = new LinkedBlockingQueue<>();
        tq1Var.m5578o();
    }

    /* JADX INFO: renamed from: b */
    public static f31 m8359b() {
        go0 go0VarM6750r0 = f31.m6750r0();
        go0VarM6750r0.m7010v(32768L);
        return go0VarM6750r0.m6300o();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: Q */
    public final void mo5562Q(int i) {
        try {
            this.f19650d.put(m8359b());
        } catch (InterruptedException unused) {
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.b
    /* JADX INFO: renamed from: W */
    public final void mo5565W(C2602b c2602b) {
        try {
            this.f19650d.put(m8359b());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8360a() {
        tq1 tq1Var = this.f19647a;
        if (tq1Var != null) {
            if (tq1Var.m5582u0() || this.f19647a.m5572d()) {
                this.f19647a.mo5133J();
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: c0 */
    public final void mo5563c0(Bundle bundle) {
        yq1 yq1VarM8446C;
        try {
            yq1VarM8446C = this.f19647a.m8446C();
        } catch (DeadObjectException | IllegalStateException unused) {
            yq1VarM8446C = null;
        }
        if (yq1VarM8446C != null) {
            try {
                try {
                    uq1 uq1Var = new uq1(this.f19648b, this.f19649c);
                    Parcel parcelM7001E0 = yq1VarM8446C.m7001E0();
                    ig2.m7251b(parcelM7001E0, uq1Var);
                    Parcel parcelM7003i1 = yq1VarM8446C.m7003i1(1, parcelM7001E0);
                    wq1 wq1Var = (wq1) ig2.m7250a(parcelM7003i1, wq1.CREATOR);
                    parcelM7003i1.recycle();
                    if (wq1Var.f21305g == null) {
                        try {
                            wq1Var.f21305g = f31.m6749q0(wq1Var.f21306h, s72.m8347a());
                            wq1Var.f21306h = null;
                        } catch (r82 | NullPointerException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    wq1Var.m8667a();
                    this.f19650d.put(wq1Var.f21305g);
                } catch (Throwable unused2) {
                    this.f19650d.put(m8359b());
                }
            } catch (InterruptedException unused3) {
            } finally {
                m8360a();
                this.f19651e.quit();
            }
        }
    }
}
