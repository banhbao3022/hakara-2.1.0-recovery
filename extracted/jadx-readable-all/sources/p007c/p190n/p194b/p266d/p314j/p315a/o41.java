package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class o41 implements w41<yc0> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ p41 f17530a;

    public o41(p41 p41Var) {
        this.f17530a = p41Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w41
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5986b(yc0 yc0Var) {
        yc0 yc0Var2 = yc0Var;
        synchronized (this.f17530a) {
            this.f17530a.f17838l = yc0Var2;
            yc0Var2.mo7653a();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w41
    public final void zza() {
        synchronized (this.f17530a) {
            this.f17530a.f17838l = null;
        }
    }
}
