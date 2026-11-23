package p555j.p556a.p557a.p558a.p596f;

import java.util.ArrayList;
import java.util.List;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentManager;
import p636z0.p752p.p753c.FragmentPagerAdapter;

/* JADX INFO: renamed from: j.a.a.a.f.e, reason: use source file name */
/* JADX INFO: compiled from: PagerAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class PagerAdapter extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: g */
    public final List<Fragment> f32069g;

    /* JADX INFO: renamed from: h */
    public final List<String> f32070h;

    public PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f32069g = new ArrayList();
        this.f32070h = new ArrayList();
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: c */
    public int mo12480c() {
        return this.f32069g.size();
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: e */
    public CharSequence mo13991e(int i) {
        return this.f32070h.get(i);
    }

    @Override // p636z0.p752p.p753c.FragmentPagerAdapter
    /* JADX INFO: renamed from: l */
    public Fragment mo13992l(int i) {
        return this.f32069g.get(i);
    }
}
