package p477d1.p478a0;

import java.util.NoSuchElementException;
import p477d1.p483s.Iterators5;

/* JADX INFO: renamed from: d1.a0.b, reason: use source file name */
/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ProgressionIterators extends Iterators5 {

    /* JADX INFO: renamed from: f */
    public final int f29434f;

    /* JADX INFO: renamed from: g */
    public boolean f29435g;

    /* JADX INFO: renamed from: h */
    public int f29436h;

    /* JADX INFO: renamed from: i */
    public final int f29437i;

    public ProgressionIterators(int i, int i2, int i3) {
        this.f29437i = i3;
        this.f29434f = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f29435g = z;
        this.f29436h = z ? i : i2;
    }

    @Override // p477d1.p483s.Iterators5
    /* JADX INFO: renamed from: a */
    public int mo12965a() {
        int i = this.f29436h;
        if (i != this.f29434f) {
            this.f29436h = this.f29437i + i;
        } else {
            if (!this.f29435g) {
                throw new NoSuchElementException();
            }
            this.f29435g = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f29435g;
    }
}
