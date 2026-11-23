package p636z0.p695h0.p696a;

import android.database.DataSetObservable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: z0.h0.a.a, reason: use source file name */
/* JADX INFO: compiled from: PagerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class PagerAdapter2 {

    /* JADX INFO: renamed from: a */
    public final DataSetObservable f36715a = new DataSetObservable();

    /* JADX INFO: renamed from: a */
    public void mo12479a(ViewGroup viewGroup, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* JADX INFO: renamed from: b */
    public void mo15662b(ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo12480c();

    /* JADX INFO: renamed from: d */
    public int mo12481d(Object obj) {
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public CharSequence mo13991e(int i) {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public Object mo12482f(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo12483g(View view, Object obj);

    /* JADX INFO: renamed from: h */
    public void mo12484h(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* JADX INFO: renamed from: i */
    public Parcelable mo12485i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void mo15663j(ViewGroup viewGroup, int i, Object obj) {
    }

    /* JADX INFO: renamed from: k */
    public void mo15664k(ViewGroup viewGroup) {
    }
}
