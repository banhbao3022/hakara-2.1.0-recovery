package p555j.p556a.p557a.p558a.p596f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import mtp.media.karaoke.R;
import p636z0.p695h0.p696a.PagerAdapter2;

/* JADX INFO: renamed from: j.a.a.a.f.h, reason: use source file name */
/* JADX INFO: compiled from: TipPagerAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class TipPagerAdapter extends PagerAdapter2 {

    /* JADX INFO: renamed from: b */
    public Context f32076b;

    /* JADX INFO: renamed from: c */
    public int[] f32077c;

    public TipPagerAdapter(Context context, int[] iArr) {
        this.f32076b = context;
        this.f32077c = iArr;
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: a */
    public void mo12479a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((LinearLayout) obj);
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: c */
    public int mo12480c() {
        return this.f32077c.length;
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: f */
    public Object mo12482f(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.f32076b).inflate(R.layout.tip_item, viewGroup, false);
        ((TextView) viewInflate.findViewById(R.id.tip_string)).setText(this.f32077c[i]);
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: g */
    public boolean mo12483g(View view, Object obj) {
        return view == ((LinearLayout) obj);
    }
}
