package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: c.n.b.d.j.k.z3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4428z3 implements Iterator {

    /* JADX INFO: renamed from: f */
    public int f23649f = 0;

    /* JADX INFO: renamed from: g */
    public final int f23650g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC4402x3 f23651h;

    public C4428z3(AbstractC4402x3 abstractC4402x3) {
        this.f23651h = abstractC4402x3;
        this.f23650g = abstractC4402x3.mo9502f();
    }

    /* JADX INFO: renamed from: a */
    public final byte m10340a() {
        int i = this.f23649f;
        if (i >= this.f23650g) {
            throw new NoSuchElementException();
        }
        this.f23649f = i + 1;
        return this.f23651h.mo9503t(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23649f < this.f23650g;
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(m10340a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
