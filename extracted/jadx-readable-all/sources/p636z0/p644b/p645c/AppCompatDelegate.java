package p636z0.p644b.p645c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p636z0.p691g.ArraySet2;

/* JADX INFO: renamed from: z0.b.c.j, reason: use source file name */
/* JADX INFO: compiled from: AppCompatDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* JADX INFO: renamed from: f */
    public static final ArraySet2<WeakReference<AppCompatDelegate>> f34429f = new ArraySet2<>();

    /* JADX INFO: renamed from: g */
    public static final Object f34430g = new Object();

    /* JADX INFO: renamed from: s */
    public static void m14616s(AppCompatDelegate appCompatDelegate) {
        synchronized (f34430g) {
            Iterator<WeakReference<AppCompatDelegate>> it = f34429f.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate2 = it.next().get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo14617c(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: d */
    public Context mo14618d(Context context) {
        return context;
    }

    /* JADX INFO: renamed from: e */
    public abstract <T extends View> T mo14619e(int i);

    /* JADX INFO: renamed from: f */
    public int mo14620f() {
        return -100;
    }

    /* JADX INFO: renamed from: g */
    public abstract MenuInflater mo14621g();

    /* JADX INFO: renamed from: h */
    public abstract ActionBar mo14622h();

    /* JADX INFO: renamed from: i */
    public abstract void mo14623i();

    /* JADX INFO: renamed from: j */
    public abstract void mo14624j();

    /* JADX INFO: renamed from: k */
    public abstract void mo14625k(Configuration configuration);

    /* JADX INFO: renamed from: l */
    public abstract void mo14626l(Bundle bundle);

    /* JADX INFO: renamed from: m */
    public abstract void mo14627m();

    /* JADX INFO: renamed from: n */
    public abstract void mo14628n(Bundle bundle);

    /* JADX INFO: renamed from: o */
    public abstract void mo14629o();

    /* JADX INFO: renamed from: p */
    public abstract void mo14630p(Bundle bundle);

    /* JADX INFO: renamed from: q */
    public abstract void mo14631q();

    /* JADX INFO: renamed from: r */
    public abstract void mo14632r();

    /* JADX INFO: renamed from: t */
    public abstract boolean mo14633t(int i);

    /* JADX INFO: renamed from: u */
    public abstract void mo14634u(int i);

    /* JADX INFO: renamed from: v */
    public abstract void mo14635v(View view);

    /* JADX INFO: renamed from: w */
    public abstract void mo14636w(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: x */
    public abstract void mo14637x(Toolbar toolbar);

    /* JADX INFO: renamed from: y */
    public void mo14638y(int i) {
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo14639z(CharSequence charSequence);
}
