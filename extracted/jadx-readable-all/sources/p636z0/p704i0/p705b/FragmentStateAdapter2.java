package p636z0.p704i0.p705b;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/* JADX INFO: renamed from: z0.i0.b.a, reason: use source file name */
/* JADX INFO: compiled from: FragmentStateAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentStateAdapter2 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ FrameLayout f37177f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ FragmentViewHolder f37178g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ FragmentStateAdapter f37179h;

    public FragmentStateAdapter2(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, FragmentViewHolder fragmentViewHolder) {
        this.f37179h = fragmentStateAdapter;
        this.f37177f = frameLayout;
        this.f37178g = fragmentViewHolder;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f37177f.getParent() != null) {
            this.f37177f.removeOnLayoutChangeListener(this);
            this.f37179h.m918t(this.f37178g);
        }
    }
}
