package p477d1.p480c0;

import java.util.Iterator;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.p496v.KMarkers;

/* JADX INFO: renamed from: d1.c0.k, reason: use source file name */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Sequences4<T, R> implements Sequence<R> {

    /* JADX INFO: renamed from: a */
    public final Sequence<T> f29448a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6164l<T, R> f29449b;

    /* JADX INFO: renamed from: d1.c0.k$a */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, KMarkers {

        /* JADX INFO: renamed from: f */
        public final Iterator<T> f29450f;

        public a() {
            this.f29450f = Sequences4.this.f29448a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29450f.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) Sequences4.this.f29449b.mo3b(this.f29450f.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Sequences4(Sequence<? extends T> sequence, InterfaceC6164l<? super T, ? extends R> interfaceC6164l) {
        Intrinsics2.m13089e(sequence, "sequence");
        Intrinsics2.m13089e(interfaceC6164l, "transformer");
        this.f29448a = sequence;
        this.f29449b = interfaceC6164l;
    }

    @Override // p477d1.p480c0.Sequence
    public Iterator<R> iterator() {
        return new a();
    }
}
