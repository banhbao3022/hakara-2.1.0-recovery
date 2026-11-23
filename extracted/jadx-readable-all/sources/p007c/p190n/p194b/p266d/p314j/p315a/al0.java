package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class al0 implements InterfaceC3058g9 {

    /* JADX INFO: renamed from: f */
    public final o70 f12195f;

    /* JADX INFO: renamed from: g */
    public final C3475rj f12196g;

    /* JADX INFO: renamed from: h */
    public final String f12197h;

    /* JADX INFO: renamed from: i */
    public final String f12198i;

    public al0(o70 o70Var, rh1 rh1Var) {
        this.f12195f = o70Var;
        this.f12196g = rh1Var.f18821l;
        this.f12197h = rh1Var.f18819j;
        this.f12198i = rh1Var.f18820k;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3058g9
    /* JADX INFO: renamed from: b */
    public final void mo5823b() {
        this.f12195f.m7108A0(n70.f17034a);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3058g9
    /* JADX INFO: renamed from: v */
    public final void mo5824v(C3475rj c3475rj) {
        int i;
        String str;
        C3475rj c3475rj2 = this.f12196g;
        if (c3475rj2 != null) {
            c3475rj = c3475rj2;
        }
        if (c3475rj != null) {
            str = c3475rj.f18847f;
            i = c3475rj.f18848g;
        } else {
            i = 1;
            str = "";
        }
        final BinderC2957dj binderC2957dj = new BinderC2957dj(str, i);
        o70 o70Var = this.f12195f;
        final String str2 = this.f12197h;
        final String str3 = this.f12198i;
        o70Var.m7108A0(new ga0(binderC2957dj, str2, str3) { // from class: c.n.b.d.j.a.m70

            /* JADX INFO: renamed from: a */
            public final InterfaceC3068gj f16691a;

            /* JADX INFO: renamed from: b */
            public final String f16692b;

            /* JADX INFO: renamed from: c */
            public final String f16693c;

            {
                this.f16691a = binderC2957dj;
                this.f16692b = str2;
                this.f16693c = str3;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ga0
            /* JADX INFO: renamed from: a */
            public final void mo5710a(Object obj) {
                ((i60) obj).mo6975j(this.f16691a, this.f16692b, this.f16693c);
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3058g9
    public final void zza() {
        this.f12195f.m7108A0(l70.f16293a);
    }
}
