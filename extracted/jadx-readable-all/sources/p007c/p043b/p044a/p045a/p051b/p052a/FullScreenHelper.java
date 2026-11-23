package p007c.p043b.p044a.p045a.p051b.p052a;

import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerFullScreenListener;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.b.a.a.b.a.b, reason: use source file name */
/* JADX INFO: compiled from: FullScreenHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FullScreenHelper {

    /* JADX INFO: renamed from: a */
    public boolean f1873a;

    /* JADX INFO: renamed from: b */
    public final Set<YouTubePlayerFullScreenListener> f1874b;

    /* JADX INFO: renamed from: c */
    public final View f1875c;

    public FullScreenHelper(View view) {
        Intrinsics2.m13090f(view, "targetView");
        this.f1875c = view;
        this.f1874b = new HashSet();
    }

    /* JADX INFO: renamed from: a */
    public final void m1316a() {
        if (this.f1873a) {
            return;
        }
        this.f1873a = true;
        ViewGroup.LayoutParams layoutParams = this.f1875c.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this.f1875c.setLayoutParams(layoutParams);
        Iterator<YouTubePlayerFullScreenListener> it = this.f1874b.iterator();
        while (it.hasNext()) {
            it.next().mo1304n();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1317b() {
        if (this.f1873a) {
            this.f1873a = false;
            ViewGroup.LayoutParams layoutParams = this.f1875c.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.width = -1;
            this.f1875c.setLayoutParams(layoutParams);
            Iterator<YouTubePlayerFullScreenListener> it = this.f1874b.iterator();
            while (it.hasNext()) {
                it.next().mo1302l();
            }
        }
    }
}
