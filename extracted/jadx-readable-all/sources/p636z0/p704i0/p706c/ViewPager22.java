package p636z0.p704i0.p706c;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: z0.i0.c.g, reason: use source file name */
/* JADX INFO: compiled from: ViewPager2.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewPager22 implements RecyclerView.InterfaceC0162o {
    public ViewPager22(ViewPager2 viewPager2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0162o
    /* JADX INFO: renamed from: a */
    public void mo775a(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0162o
    /* JADX INFO: renamed from: b */
    public void mo776b(View view) {
        RecyclerView.C0161n c0161n = (RecyclerView.C0161n) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c0161n).width != -1 || ((ViewGroup.MarginLayoutParams) c0161n).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
