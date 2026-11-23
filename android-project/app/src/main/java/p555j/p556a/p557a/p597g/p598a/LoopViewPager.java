package p555j.p556a.p557a.p597g.p598a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import p636z0.p695h0.p696a.PagerAdapter2;

/* JADX INFO: renamed from: j.a.a.g.a.a, reason: use source file name */
/* JADX INFO: compiled from: LoopViewPager.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class LoopViewPager extends ViewPager {

    /* JADX INFO: renamed from: i0 */
    public int f32095i0;

    /* JADX INFO: renamed from: j0 */
    public int f32096j0;

    /* JADX INFO: renamed from: k0 */
    public int f32097k0;

    /* JADX INFO: renamed from: l0 */
    public int f32098l0;

    /* JADX INFO: renamed from: m0 */
    public d f32099m0;

    /* JADX INFO: renamed from: n0 */
    public b f32100n0;

    /* JADX INFO: renamed from: j.a.a.g.a.a$b */
    /* JADX INFO: compiled from: LoopViewPager.java */
    public class b implements ViewPager.InterfaceC0201j {
        public b(a aVar) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0201j
        /* JADX INFO: renamed from: a */
        public void mo907a(int i) {
            if (i == 0) {
                LoopViewPager loopViewPager = LoopViewPager.this;
                loopViewPager.f32099m0.m13996c(loopViewPager.f32097k0);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0201j
        /* JADX INFO: renamed from: b */
        public void mo908b(int i) {
            LoopViewPager loopViewPager = LoopViewPager.this;
            int i2 = i % loopViewPager.f32095i0;
            loopViewPager.f32097k0 = i2;
            loopViewPager.f32099m0.m13995b(i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0201j
        /* JADX INFO: renamed from: c */
        public void mo909c(int i, float f, int i2) {
            LoopViewPager.this.f32099m0.m13994a(i, f, i2);
        }
    }

    /* JADX INFO: renamed from: j.a.a.g.a.a$c */
    /* JADX INFO: compiled from: LoopViewPager.java */
    public class c extends PagerAdapter2 {
        public c(a aVar) {
        }

        @Override // p636z0.p695h0.p696a.PagerAdapter2
        /* JADX INFO: renamed from: a */
        public void mo12479a(ViewGroup viewGroup, int i, Object obj) {
            ((ViewPager) viewGroup).removeView((View) obj);
        }

        @Override // p636z0.p695h0.p696a.PagerAdapter2
        /* JADX INFO: renamed from: c */
        public int mo12480c() {
            return LoopViewPager.this.f32098l0;
        }

        @Override // p636z0.p695h0.p696a.PagerAdapter2
        /* JADX INFO: renamed from: f */
        public Object mo12482f(ViewGroup viewGroup, int i) {
            LoopViewPager loopViewPager = LoopViewPager.this;
            View viewM13997d = loopViewPager.f32099m0.m13997d(i % loopViewPager.f32095i0);
            viewGroup.addView(viewM13997d);
            return viewM13997d;
        }

        @Override // p636z0.p695h0.p696a.PagerAdapter2
        /* JADX INFO: renamed from: g */
        public boolean mo12483g(View view, Object obj) {
            return view.equals(obj);
        }
    }

    /* JADX INFO: renamed from: j.a.a.g.a.a$d */
    /* JADX INFO: compiled from: LoopViewPager.java */
    public interface d {
        /* JADX INFO: renamed from: a */
        void m13994a(int i, float f, int i2);

        /* JADX INFO: renamed from: b */
        void m13995b(int i);

        /* JADX INFO: renamed from: c */
        void m13996c(int i);

        /* JADX INFO: renamed from: d */
        View m13997d(int i);
    }

    public LoopViewPager(Context context, int i, d dVar) {
        super(context);
        this.f32095i0 = i;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f32098l0 = 1;
        } else {
            this.f32098l0 = 100000;
        }
        setAdapter(new c(null));
        int i2 = this.f32095i0;
        this.f32096j0 = ((100000 / i2) / 2) * i2;
        mo904w(-1, false);
        this.f32099m0 = dVar;
        b bVar = new b(null);
        this.f32100n0 = bVar;
        setOnPageChangeListener(bVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(i < 0 ? this.f32096j0 : i + this.f32096j0);
    }

    public void setCurrentItemAfterCancelListener(int i) {
        setOnPageChangeListener(null);
        super.setCurrentItem(i < 0 ? this.f32096j0 : i + this.f32096j0);
        setOnPageChangeListener(this.f32100n0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    /* JADX INFO: renamed from: w */
    public void mo904w(int i, boolean z) {
        super.mo904w(i < 0 ? this.f32096j0 : i + this.f32096j0, z);
    }

    /* JADX INFO: renamed from: y */
    public void m13993y(int i, boolean z) {
        setOnPageChangeListener(null);
        super.mo904w(i < 0 ? this.f32096j0 : i + this.f32096j0, z);
        setOnPageChangeListener(this.f32100n0);
    }
}
