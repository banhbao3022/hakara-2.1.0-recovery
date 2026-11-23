package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vp1 implements AbstractC2717c.a, AbstractC2717c.b {

    /* JADX INFO: renamed from: a */
    public final tq1 f20901a;

    /* JADX INFO: renamed from: b */
    public final mq1 f20902b;

    /* JADX INFO: renamed from: c */
    public final Object f20903c = new Object();

    /* JADX INFO: renamed from: d */
    public boolean f20904d = false;

    /* JADX INFO: renamed from: e */
    public boolean f20905e = false;

    public vp1(Context context, Looper looper, mq1 mq1Var) {
        this.f20902b = mq1Var;
        this.f20901a = new tq1(context, looper, this, this, 12800000);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: Q */
    public final void mo5562Q(int i) {
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.b
    /* JADX INFO: renamed from: W */
    public final void mo5565W(C2602b c2602b) {
    }

    /* JADX INFO: renamed from: a */
    public final void m8583a() {
        synchronized (this.f20903c) {
            if (this.f20901a.m5582u0() || this.f20901a.m5572d()) {
                this.f20901a.mo5133J();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c.a
    /* JADX INFO: renamed from: c0 */
    public final void mo5563c0(Bundle bundle) {
        synchronized (this.f20903c) {
            if (this.f20905e) {
                return;
            }
            this.f20905e = true;
            try {
                yq1 yq1VarM8446C = this.f20901a.m8446C();
                rq1 rq1Var = new rq1(this.f20902b.mo7574w());
                Parcel parcelM7001E0 = yq1VarM8446C.m7001E0();
                ig2.m7251b(parcelM7001E0, rq1Var);
                yq1VarM8446C.m7002T1(2, parcelM7001E0);
            } catch (Exception unused) {
            } finally {
                m8583a();
            }
        }
    }
}
