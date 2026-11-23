package p636z0.p644b.p645c;

import android.view.View;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.ViewPropertyAnimatorCompat;
import p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: renamed from: z0.b.c.n, reason: use source file name */
/* JADX INFO: compiled from: AppCompatDelegateImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatDelegateImpl4 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AppCompatDelegateImpl f34517f;

    /* JADX INFO: renamed from: z0.b.c.n$a */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class a extends ViewPropertyAnimatorListenerAdapter {
        public a() {
        }

        @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter, p636z0.p725k.p739l.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: b */
        public void mo14669b(View view) {
            AppCompatDelegateImpl4.this.f34517f.f34480x.setAlpha(1.0f);
            AppCompatDelegateImpl4.this.f34517f.f34435A.m16348d(null);
            AppCompatDelegateImpl4.this.f34517f.f34435A = null;
        }

        @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter, p636z0.p725k.p739l.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: c */
        public void mo14677c(View view) {
            AppCompatDelegateImpl4.this.f34517f.f34480x.setVisibility(0);
        }
    }

    public AppCompatDelegateImpl4(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f34517f = appCompatDelegateImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f34517f;
        appCompatDelegateImpl.f34481y.showAtLocation(appCompatDelegateImpl.f34480x, 55, 0, 0);
        this.f34517f.m14649J();
        if (!this.f34517f.m14662W()) {
            this.f34517f.f34480x.setAlpha(1.0f);
            this.f34517f.f34480x.setVisibility(0);
            return;
        }
        this.f34517f.f34480x.setAlpha(0.0f);
        AppCompatDelegateImpl appCompatDelegateImpl2 = this.f34517f;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatM16308b = ViewCompat.m16308b(appCompatDelegateImpl2.f34480x);
        viewPropertyAnimatorCompatM16308b.m16345a(1.0f);
        appCompatDelegateImpl2.f34435A = viewPropertyAnimatorCompatM16308b;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f34517f.f34435A;
        a aVar = new a();
        View view = viewPropertyAnimatorCompat.f38092a.get();
        if (view != null) {
            viewPropertyAnimatorCompat.m16349e(view, aVar);
        }
    }
}
