package p636z0.p644b.p651g;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p636z0.p725k.p739l.ViewPropertyAnimatorCompat;
import p636z0.p725k.p739l.ViewPropertyAnimatorListener;
import p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: renamed from: z0.b.g.g, reason: use source file name */
/* JADX INFO: compiled from: ViewPropertyAnimatorCompatSet.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewPropertyAnimatorCompatSet {

    /* JADX INFO: renamed from: c */
    public Interpolator f34727c;

    /* JADX INFO: renamed from: d */
    public ViewPropertyAnimatorListener f34728d;

    /* JADX INFO: renamed from: e */
    public boolean f34729e;

    /* JADX INFO: renamed from: b */
    public long f34726b = -1;

    /* JADX INFO: renamed from: f */
    public final ViewPropertyAnimatorListenerAdapter f34730f = new a();

    /* JADX INFO: renamed from: a */
    public final ArrayList<ViewPropertyAnimatorCompat> f34725a = new ArrayList<>();

    /* JADX INFO: renamed from: z0.b.g.g$a */
    /* JADX INFO: compiled from: ViewPropertyAnimatorCompatSet.java */
    public class a extends ViewPropertyAnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f34731a = false;

        /* JADX INFO: renamed from: b */
        public int f34732b = 0;

        public a() {
        }

        @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter, p636z0.p725k.p739l.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: b */
        public void mo14669b(View view) {
            int i = this.f34732b + 1;
            this.f34732b = i;
            if (i == ViewPropertyAnimatorCompatSet.this.f34725a.size()) {
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.f34728d;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.mo14669b(null);
                }
                this.f34732b = 0;
                this.f34731a = false;
                ViewPropertyAnimatorCompatSet.this.f34729e = false;
            }
        }

        @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter, p636z0.p725k.p739l.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: c */
        public void mo14677c(View view) {
            if (this.f34731a) {
                return;
            }
            this.f34731a = true;
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.f34728d;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.mo14677c(null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14737a() {
        if (this.f34729e) {
            Iterator<ViewPropertyAnimatorCompat> it = this.f34725a.iterator();
            while (it.hasNext()) {
                it.next().m16346b();
            }
            this.f34729e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14738b() {
        View view;
        if (this.f34729e) {
            return;
        }
        for (ViewPropertyAnimatorCompat viewPropertyAnimatorCompat : this.f34725a) {
            long j2 = this.f34726b;
            if (j2 >= 0) {
                viewPropertyAnimatorCompat.m16347c(j2);
            }
            Interpolator interpolator = this.f34727c;
            if (interpolator != null && (view = viewPropertyAnimatorCompat.f38092a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f34728d != null) {
                viewPropertyAnimatorCompat.m16348d(this.f34730f);
            }
            View view2 = viewPropertyAnimatorCompat.f38092a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f34729e = true;
    }
}
