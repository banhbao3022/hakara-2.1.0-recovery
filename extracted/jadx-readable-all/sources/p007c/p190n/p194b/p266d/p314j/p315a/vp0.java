package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vp0 implements np0 {

    /* JADX INFO: renamed from: a */
    public final long f20899a;

    /* JADX INFO: renamed from: b */
    public final p41 f20900b;

    public vp0(long j2, Context context, pp0 pp0Var, AbstractC3264lu abstractC3264lu, String str) {
        this.f20899a = j2;
        C3266lw c3266lwMo7636r = abstractC3264lu.mo7636r();
        Objects.requireNonNull(c3266lwMo7636r);
        Objects.requireNonNull(context);
        c3266lwMo7636r.f16621a = context;
        c3266lwMo7636r.f16623c = new jw2();
        Objects.requireNonNull(str);
        c3266lwMo7636r.f16622b = str;
        p41 p41VarMo4613a = c3266lwMo7636r.m7648a().f16950g.mo4613a();
        this.f20900b = p41VarMo4613a;
        p41VarMo4613a.mo4893j5(new up0(this, pp0Var));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.np0
    /* JADX INFO: renamed from: a */
    public final void mo7909a() {
        this.f20900b.mo4884a4(new BinderC2800b(null));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.np0
    /* JADX INFO: renamed from: b */
    public final void mo7910b() {
        this.f20900b.mo4886b();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.np0
    /* JADX INFO: renamed from: c */
    public final void mo7911c(ew2 ew2Var) {
        this.f20900b.mo4904y0(ew2Var);
    }
}
