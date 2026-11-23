package p636z0.p644b.p645c;

import android.view.View;
import p636z0.p725k.p729e.Insets;
import p636z0.p725k.p739l.OnApplyWindowInsetsListener;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.WindowInsetsCompat;

/* JADX INFO: renamed from: z0.b.c.l, reason: use source file name */
/* JADX INFO: compiled from: AppCompatDelegateImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatDelegateImpl2 implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppCompatDelegateImpl f34515a;

    public AppCompatDelegateImpl2(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f34515a = appCompatDelegateImpl;
    }

    @Override // p636z0.p725k.p739l.OnApplyWindowInsetsListener
    /* JADX INFO: renamed from: a */
    public WindowInsetsCompat mo307a(View view, WindowInsetsCompat windowInsetsCompat) {
        int iM16230e = windowInsetsCompat.m16230e();
        int iM14664Y = this.f34515a.m14664Y(windowInsetsCompat, null);
        if (iM16230e != iM14664Y) {
            int iM16228c = windowInsetsCompat.m16228c();
            int iM16229d = windowInsetsCompat.m16229d();
            int iM16227b = windowInsetsCompat.m16227b();
            WindowInsetsCompat.b bVar = new WindowInsetsCompat.b(windowInsetsCompat);
            bVar.f37986a.mo16237d(Insets.m16166a(iM16228c, iM14664Y, iM16229d, iM16227b));
            windowInsetsCompat = bVar.m16233a();
        }
        return ViewCompat.m16321o(view, windowInsetsCompat);
    }
}
