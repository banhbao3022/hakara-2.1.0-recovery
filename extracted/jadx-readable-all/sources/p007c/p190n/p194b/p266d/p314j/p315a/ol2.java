package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ol2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vl2 f17675f;

    public ol2(vl2 vl2Var) {
        this.f17675f = vl2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vl2 vl2Var = this.f17675f;
        if (vl2Var.f20838K || vl2Var.f20857w || vl2Var.f20855u == null || !vl2Var.f20856v) {
            return;
        }
        int size = vl2Var.f20853s.size();
        for (int i = 0; i < size; i++) {
            if (vl2Var.f20853s.valueAt(i).m7521g() == null) {
                return;
            }
        }
        xn2 xn2Var = vl2Var.f20849o;
        synchronized (xn2Var) {
            xn2Var.f21623a = false;
        }
        nm2[] nm2VarArr = new nm2[size];
        vl2Var.f20831D = new boolean[size];
        vl2Var.f20830C = new boolean[size];
        vl2Var.f20829B = vl2Var.f20855u.mo5818a();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                vl2Var.f20828A = new om2(nm2VarArr);
                vl2Var.f20857w = true;
                vl2Var.f20845k.mo5793c(new mm2(vl2Var.f20829B, vl2Var.f20855u.zza()), null);
                vl2Var.f20854t.mo5800j(vl2Var);
                return;
            }
            ch2 ch2VarM7521g = vl2Var.f20853s.valueAt(i2).m7521g();
            nm2VarArr[i2] = new nm2(ch2VarM7521g);
            String str = ch2VarM7521g.f13016k;
            if (!C2622l.m5329X1(str) && !C2622l.m5406n1(str)) {
                z = false;
            }
            vl2Var.f20831D[i2] = z;
            vl2Var.f20832E = z | vl2Var.f20832E;
            i2++;
        }
    }
}
