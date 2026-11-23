package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ys1 extends kt1 {

    /* JADX INFO: renamed from: f */
    public boolean f21989f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f21990g;

    public ys1(Object obj) {
        this.f21990g = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f21989f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21989f) {
            throw new NoSuchElementException();
        }
        this.f21989f = true;
        return this.f21990g;
    }
}
