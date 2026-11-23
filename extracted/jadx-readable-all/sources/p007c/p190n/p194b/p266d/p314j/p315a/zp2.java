package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zp2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ bq2 f22383f;

    public zp2(bq2 bq2Var) {
        this.f22383f = bq2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f22383f.f12778h) {
            try {
                bq2 bq2Var = this.f22383f;
                if (bq2Var.f12779i && bq2Var.f12780j) {
                    bq2Var.f12779i = false;
                    C2622l.m5318U2("App went background");
                    Iterator<cq2> it = this.f22383f.f12781k.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().mo6222B(false);
                        } catch (Exception e) {
                            C2622l.m5438t3("", e);
                        }
                    }
                } else {
                    C2622l.m5318U2("App is still foreground");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
