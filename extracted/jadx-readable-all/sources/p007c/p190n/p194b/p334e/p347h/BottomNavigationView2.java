package p007c.p190n.p194b.p334e.p347h;

import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.p360t.ViewUtils3;
import p007c.p190n.p194b.p334e.p360t.ViewUtils4;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.WindowInsetsCompat;

/* JADX INFO: renamed from: c.n.b.e.h.e, reason: use source file name */
/* JADX INFO: compiled from: BottomNavigationView.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView2 implements ViewUtils3 {
    public BottomNavigationView2(BottomNavigationView bottomNavigationView) {
    }

    @Override // p007c.p190n.p194b.p334e.p360t.ViewUtils3
    /* JADX INFO: renamed from: a */
    public WindowInsetsCompat mo11121a(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils4 viewUtils4) {
        viewUtils4.f25515d = windowInsetsCompat.m16227b() + viewUtils4.f25515d;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        boolean z = view.getLayoutDirection() == 1;
        int iM16228c = windowInsetsCompat.m16228c();
        int iM16229d = windowInsetsCompat.m16229d();
        int i = viewUtils4.f25512a + (z ? iM16229d : iM16228c);
        viewUtils4.f25512a = i;
        int i2 = viewUtils4.f25514c;
        if (!z) {
            iM16228c = iM16229d;
        }
        int i3 = i2 + iM16228c;
        viewUtils4.f25514c = i3;
        view.setPaddingRelative(i, viewUtils4.f25513b, i3, viewUtils4.f25515d);
        return windowInsetsCompat;
    }
}
