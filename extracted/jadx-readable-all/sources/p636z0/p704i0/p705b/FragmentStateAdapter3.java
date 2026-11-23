package p636z0.p704i0.p705b;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentLifecycleCallbacksDispatcher;
import p636z0.p752p.p753c.FragmentManager;

/* JADX INFO: renamed from: z0.i0.b.b, reason: use source file name */
/* JADX INFO: compiled from: FragmentStateAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentStateAdapter3 extends FragmentManager.k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Fragment f37180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameLayout f37181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FragmentStateAdapter f37182c;

    public FragmentStateAdapter3(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        this.f37182c = fragmentStateAdapter;
        this.f37180a = fragment;
        this.f37181b = frameLayout;
    }

    @Override // p636z0.p752p.p753c.FragmentManager.k
    /* JADX INFO: renamed from: a */
    public void mo15863a(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (fragment == this.f37180a) {
            FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = fragmentManager.f38628n;
            synchronized (fragmentLifecycleCallbacksDispatcher.f38600a) {
                int size = fragmentLifecycleCallbacksDispatcher.f38600a.size();
                for (int i = 0; i < size; i++) {
                    if (fragmentLifecycleCallbacksDispatcher.f38600a.get(i).f38602a == this) {
                        fragmentLifecycleCallbacksDispatcher.f38600a.remove(i);
                        break;
                    }
                }
            }
            this.f37182c.m913n(view, this.f37181b);
        }
    }
}
