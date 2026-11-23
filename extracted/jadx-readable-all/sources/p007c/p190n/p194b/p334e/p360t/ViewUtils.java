package p007c.p190n.p194b.p334e.p360t;

import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.C4799a;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.WindowInsetsCompat;

/* JADX INFO: renamed from: c.n.b.e.t.l, reason: use source file name */
/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class ViewUtils implements ViewUtils3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f25508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f25509b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f25510c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewUtils3 f25511d;

    public ViewUtils(boolean z, boolean z2, boolean z3, ViewUtils3 viewUtils3) {
        this.f25508a = z;
        this.f25509b = z2;
        this.f25510c = z3;
        this.f25511d = viewUtils3;
    }

    @Override // p007c.p190n.p194b.p334e.p360t.ViewUtils3
    /* JADX INFO: renamed from: a */
    public WindowInsetsCompat mo11121a(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils4 viewUtils4) {
        if (this.f25508a) {
            viewUtils4.f25515d = windowInsetsCompat.m16227b() + viewUtils4.f25515d;
        }
        boolean zM10975Z = C4799a.m10975Z(view);
        if (this.f25509b) {
            if (zM10975Z) {
                viewUtils4.f25514c = windowInsetsCompat.m16228c() + viewUtils4.f25514c;
            } else {
                viewUtils4.f25512a = windowInsetsCompat.m16228c() + viewUtils4.f25512a;
            }
        }
        if (this.f25510c) {
            if (zM10975Z) {
                viewUtils4.f25512a = windowInsetsCompat.m16229d() + viewUtils4.f25512a;
            } else {
                viewUtils4.f25514c = windowInsetsCompat.m16229d() + viewUtils4.f25514c;
            }
        }
        int i = viewUtils4.f25512a;
        int i2 = viewUtils4.f25513b;
        int i3 = viewUtils4.f25514c;
        int i4 = viewUtils4.f25515d;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        view.setPaddingRelative(i, i2, i3, i4);
        ViewUtils3 viewUtils3 = this.f25511d;
        return viewUtils3 != null ? viewUtils3.mo11121a(view, windowInsetsCompat, viewUtils4) : windowInsetsCompat;
    }
}
