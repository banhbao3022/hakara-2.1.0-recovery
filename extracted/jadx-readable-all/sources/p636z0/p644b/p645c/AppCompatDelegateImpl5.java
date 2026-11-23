package p636z0.p644b.p645c;

import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: renamed from: z0.b.c.o, reason: use source file name */
/* JADX INFO: compiled from: AppCompatDelegateImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatDelegateImpl5 extends ViewPropertyAnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppCompatDelegateImpl f34519a;

    public AppCompatDelegateImpl5(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f34519a = appCompatDelegateImpl;
    }

    @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter, p636z0.p725k.p739l.ViewPropertyAnimatorListener
    /* JADX INFO: renamed from: b */
    public void mo14669b(View view) {
        this.f34519a.f34480x.setAlpha(1.0f);
        this.f34519a.f34435A.m16348d(null);
        this.f34519a.f34435A = null;
    }

    @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter, p636z0.p725k.p739l.ViewPropertyAnimatorListener
    /* JADX INFO: renamed from: c */
    public void mo14677c(View view) {
        this.f34519a.f34480x.setVisibility(0);
        this.f34519a.f34480x.sendAccessibilityEvent(32);
        if (this.f34519a.f34480x.getParent() instanceof View) {
            View view2 = (View) this.f34519a.f34480x.getParent();
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            view2.requestApplyInsets();
        }
    }
}
