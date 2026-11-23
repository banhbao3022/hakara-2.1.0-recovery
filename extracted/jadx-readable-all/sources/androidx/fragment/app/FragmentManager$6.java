package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.LifecycleEventObserver;
import p636z0.p752p.p753c.FragmentManager;
import p636z0.p752p.p753c.FragmentResultListener;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public class FragmentManager$6 implements LifecycleEventObserver {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f751f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ FragmentResultListener f752g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Lifecycle3 f753h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ FragmentManager f754i;

    public FragmentManager$6(FragmentManager fragmentManager, String str, FragmentResultListener fragmentResultListener, Lifecycle3 lifecycle3) {
        this.f754i = fragmentManager;
        this.f751f = str;
        this.f752g = fragmentResultListener;
        this.f753h = lifecycle3;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: c */
    public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
        Bundle bundle;
        if (aVar == Lifecycle3.a.ON_START && (bundle = this.f754i.f38624j.get(this.f751f)) != null) {
            this.f752g.m16474a(this.f751f, bundle);
            this.f754i.f38624j.remove(this.f751f);
        }
        if (aVar == Lifecycle3.a.ON_DESTROY) {
            this.f753h.mo16729c(this);
            this.f754i.f38625k.remove(this.f751f);
        }
    }
}
