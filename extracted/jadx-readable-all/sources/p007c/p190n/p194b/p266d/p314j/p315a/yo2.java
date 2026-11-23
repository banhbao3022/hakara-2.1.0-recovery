package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yo2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f21943f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21944g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f21945h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ float f21946i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ cp2 f21947j;

    public yo2(cp2 cp2Var, int i, int i2, int i3, float f) {
        this.f21947j = cp2Var;
        this.f21943f = i;
        this.f21944g = i2;
        this.f21945h = i3;
        this.f21946i = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp2 dp2Var = this.f21947j.f13078b;
        int i = this.f21943f;
        int i2 = this.f21944g;
        InterfaceC2965dr interfaceC2965dr = ((C3002er) dp2Var).f13662r;
        if (interfaceC2965dr != null) {
            interfaceC2965dr.mo6430f(i, i2);
        }
    }
}
