package p007c.p190n.p194b.p334e.p336b0;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: c.n.b.e.b0.d, reason: use source file name */
/* JADX INFO: compiled from: TabLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class TabLayout2 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ View f24775f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TabLayout.C5971i f24776g;

    public TabLayout2(TabLayout.C5971i c5971i, View view) {
        this.f24776g = c5971i;
        this.f24775f = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f24775f.getVisibility() == 0) {
            this.f24776g.m12844e(this.f24775f);
        }
    }
}
