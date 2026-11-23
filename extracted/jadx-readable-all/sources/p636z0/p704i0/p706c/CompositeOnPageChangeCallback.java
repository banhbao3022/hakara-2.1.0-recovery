package p636z0.p704i0.p706c;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: z0.i0.c.c, reason: use source file name */
/* JADX INFO: compiled from: CompositeOnPageChangeCallback.java */
/* JADX INFO: loaded from: classes.dex */
public final class CompositeOnPageChangeCallback extends ViewPager2.AbstractC0215g {

    /* JADX INFO: renamed from: a */
    public final List<ViewPager2.AbstractC0215g> f37189a;

    public CompositeOnPageChangeCallback(int i) {
        this.f37189a = new ArrayList(i);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0215g
    /* JADX INFO: renamed from: a */
    public void mo928a(int i) {
        try {
            Iterator<ViewPager2.AbstractC0215g> it = this.f37189a.iterator();
            while (it.hasNext()) {
                it.next().mo928a(i);
            }
        } catch (ConcurrentModificationException e) {
            m15865d(e);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0215g
    /* JADX INFO: renamed from: b */
    public void mo932b(int i, float f, int i2) {
        try {
            Iterator<ViewPager2.AbstractC0215g> it = this.f37189a.iterator();
            while (it.hasNext()) {
                it.next().mo932b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m15865d(e);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0215g
    /* JADX INFO: renamed from: c */
    public void mo929c(int i) {
        try {
            Iterator<ViewPager2.AbstractC0215g> it = this.f37189a.iterator();
            while (it.hasNext()) {
                it.next().mo929c(i);
            }
        } catch (ConcurrentModificationException e) {
            m15865d(e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15865d(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
