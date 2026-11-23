package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4316qc;

/* JADX INFO: renamed from: c.n.b.d.k.b.l8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4586l8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f24127f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24128g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4480ca f24129h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC4316qc f24130i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4677t7 f24131j;

    public RunnableC4586l8(C4677t7 c4677t7, String str, String str2, C4480ca c4480ca, InterfaceC4316qc interfaceC4316qc) {
        this.f24131j = c4677t7;
        this.f24127f = str;
        this.f24128g = str2;
        this.f24129h = c4480ca;
        this.f24130i = interfaceC4316qc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                C4677t7 c4677t7 = this.f24131j;
                InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
                if (interfaceC4569k3 == null) {
                    c4677t7.mo10684l().f24418f.m10813c("Failed to get conditional properties; not connected to service", this.f24127f, this.f24128g);
                    this.f24131j.m10817f().m10880N(this.f24130i, arrayList);
                } else {
                    ArrayList<Bundle> arrayListM10861j0 = C4723x9.m10861j0(interfaceC4569k3.mo10399g3(this.f24127f, this.f24128g, this.f24129h));
                    this.f24131j.m10772F();
                    this.f24131j.m10817f().m10880N(this.f24130i, arrayListM10861j0);
                }
            } catch (RemoteException e) {
                this.f24131j.mo10684l().f24418f.m10814d("Failed to get conditional properties; remote exception", this.f24127f, this.f24128g, e);
                this.f24131j.m10817f().m10880N(this.f24130i, arrayList);
            }
        } catch (Throwable th) {
            this.f24131j.m10817f().m10880N(this.f24130i, arrayList);
            throw th;
        }
    }
}
