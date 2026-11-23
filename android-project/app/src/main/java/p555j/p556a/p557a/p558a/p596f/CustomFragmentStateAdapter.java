package p555j.p556a.p557a.p558a.p596f;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p752p.p753c.FragmentManager;

/* JADX INFO: renamed from: j.a.a.a.f.b, reason: use source file name */
/* JADX INFO: compiled from: CustomFragmentStateAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class CustomFragmentStateAdapter extends FragmentStateAdapter {

    /* JADX INFO: renamed from: l */
    public final FragmentActivity f32061l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFragmentStateAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics2.m13089e(fragmentActivity, "activity");
        this.f32061l = fragmentActivity;
    }

    /* JADX INFO: renamed from: w */
    public final Fragment m13990w(int i) {
        FragmentManager fragmentManagerM16577C = this.f32061l.m16577C();
        StringBuilder sbM1556G = outline.m1556G("f");
        sbM1556G.append(i);
        return fragmentManagerM16577C.m16656I(sbM1556G.toString());
    }
}
