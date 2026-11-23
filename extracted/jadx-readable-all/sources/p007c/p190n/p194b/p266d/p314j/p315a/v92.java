package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class v92 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ va2 f20719f;

    public v92(va2 va2Var) {
        this.f20719f = va2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f20719f.f20727e != null) {
            return;
        }
        synchronized (va2.f20723a) {
            if (this.f20719f.f20727e == null) {
                boolean z = false;
                try {
                    zBooleanValue = C3052g3.f14431r1.m6603d().booleanValue();
                } catch (IllegalStateException unused) {
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    try {
                        va2.f20724b = new lr1(this.f20719f.f20726d.f17947b, "ADSHIELD", null);
                    } catch (Throwable unused2) {
                    }
                }
                z = zBooleanValue;
                this.f20719f.f20727e = Boolean.valueOf(z);
                va2.f20723a.open();
            }
        }
    }
}
