package p636z0.p745m.p747b;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: z0.m.b.d, reason: use source file name */
/* JADX INFO: compiled from: FocusStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public class FocusStrategy3<T> implements Comparator<T> {

    /* JADX INFO: renamed from: f */
    public final Rect f38165f = new Rect();

    /* JADX INFO: renamed from: g */
    public final Rect f38166g = new Rect();

    /* JADX INFO: renamed from: h */
    public final boolean f38167h;

    /* JADX INFO: renamed from: i */
    public final FocusStrategy<T> f38168i;

    public FocusStrategy3(boolean z, FocusStrategy<T> focusStrategy) {
        this.f38167h = z;
        this.f38168i = focusStrategy;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        Rect rect = this.f38165f;
        Rect rect2 = this.f38166g;
        ((ExploreByTouchHelper.a) this.f38168i).m16373a(t, rect);
        ((ExploreByTouchHelper.a) this.f38168i).m16373a(t2, rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        if (i3 < i4) {
            return this.f38167h ? 1 : -1;
        }
        if (i3 > i4) {
            return this.f38167h ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return this.f38167h ? 1 : -1;
        }
        if (i7 > i8) {
            return this.f38167h ? -1 : 1;
        }
        return 0;
    }
}
