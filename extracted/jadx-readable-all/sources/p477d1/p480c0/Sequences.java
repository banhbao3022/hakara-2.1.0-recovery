package p477d1.p480c0;

import java.util.Iterator;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.p496v.KMarkers;

/* JADX INFO: renamed from: d1.c0.b, reason: use source file name */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Sequences<T> implements Sequence<T>, Sequences2<T> {

    /* JADX INFO: renamed from: a */
    public final Sequence<T> f29442a;

    /* JADX INFO: renamed from: b */
    public final int f29443b;

    /* JADX INFO: renamed from: d1.c0.b$a */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, KMarkers {

        /* JADX INFO: renamed from: f */
        public final Iterator<T> f29444f;

        /* JADX INFO: renamed from: g */
        public int f29445g;

        public a(Sequences sequences) {
            this.f29444f = sequences.f29442a.iterator();
            this.f29445g = sequences.f29443b;
        }

        /* JADX INFO: renamed from: a */
        public final void m12975a() {
            while (this.f29445g > 0 && this.f29444f.hasNext()) {
                this.f29444f.next();
                this.f29445g--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m12975a();
            return this.f29444f.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            m12975a();
            return this.f29444f.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Sequences(Sequence<? extends T> sequence, int i) {
        Intrinsics2.m13089e(sequence, "sequence");
        this.f29442a = sequence;
        this.f29443b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p477d1.p480c0.Sequences2
    /* JADX INFO: renamed from: a */
    public Sequence<T> mo12974a(int i) {
        int i2 = this.f29443b + i;
        return i2 < 0 ? new Sequences(this, i) : new Sequences(this.f29442a, i2);
    }

    @Override // p477d1.p480c0.Sequence
    public Iterator<T> iterator() {
        return new a(this);
    }
}
