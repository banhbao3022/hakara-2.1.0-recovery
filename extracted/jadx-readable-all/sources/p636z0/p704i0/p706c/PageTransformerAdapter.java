package p636z0.p704i0.p706c;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: renamed from: z0.i0.c.e, reason: use source file name */
/* JADX INFO: compiled from: PageTransformerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class PageTransformerAdapter extends ViewPager2.AbstractC0215g {

    /* JADX INFO: renamed from: a */
    public final LinearLayoutManager f37191a;

    /* JADX INFO: renamed from: b */
    public ViewPager2.InterfaceC0217i f37192b;

    public PageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.f37191a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0215g
    /* JADX INFO: renamed from: a */
    public void mo928a(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0215g
    /* JADX INFO: renamed from: b */
    public void mo932b(int i, float f, int i2) {
        if (this.f37192b == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.f37191a.m764y(); i3++) {
            View viewM762x = this.f37191a.m762x(i3);
            if (viewM762x == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f37191a.m764y())));
            }
            this.f37192b.m936a(viewM762x, (this.f37191a.m735R(viewM762x) - i) + f2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0215g
    /* JADX INFO: renamed from: c */
    public void mo929c(int i) {
    }
}
