package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xn2 {

    /* JADX INFO: renamed from: a */
    public boolean f21623a;

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m8743a() {
        if (this.f21623a) {
            return false;
        }
        this.f21623a = true;
        notifyAll();
        return true;
    }
}
