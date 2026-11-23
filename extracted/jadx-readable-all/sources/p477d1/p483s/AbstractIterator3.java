package p477d1.p483s;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p477d1.p493x.p495c.p496v.KMarkers;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: d1.s.b, reason: use source file name */
/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractIterator3<T> implements Iterator<T>, KMarkers {

    /* JADX INFO: renamed from: f */
    public int f29506f = 2;

    /* JADX INFO: renamed from: g */
    public T f29507g;

    /* JADX INFO: renamed from: a */
    public abstract void mo13025a();

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.f29506f;
        if (!(i != 4)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iM15315d = C7804v0.m15315d(i);
        if (iM15315d != 0) {
            if (iM15315d == 2) {
                return false;
            }
            this.f29506f = 4;
            mo13025a();
            if (this.f29506f != 1) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f29506f = 2;
        return this.f29507g;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
