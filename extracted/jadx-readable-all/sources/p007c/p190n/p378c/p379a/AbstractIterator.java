package p007c.p190n.p378c.p379a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.n.c.a.a, reason: use source file name */
/* JADX INFO: compiled from: AbstractIterator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: f */
    public int f26124f = 2;

    /* JADX INFO: renamed from: g */
    @NullableDecl
    public T f26125g;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        T t;
        int i = this.f26124f;
        if (!(i != 4)) {
            throw new IllegalStateException();
        }
        int iM15315d = C7804v0.m15315d(i);
        if (iM15315d == 0) {
            return true;
        }
        if (iM15315d == 2) {
            return false;
        }
        this.f26124f = 4;
        Splitter3.a aVar = (Splitter3.a) this;
        int i2 = aVar.f26142k;
        while (true) {
            int i3 = aVar.f26142k;
            if (i3 == -1) {
                aVar.f26124f = 3;
                t = null;
                break;
            }
            Splitter splitter = (Splitter) aVar;
            int iMo11577a = splitter.f26134m.f26135a.mo11577a(splitter.f26139h, i3);
            if (iMo11577a == -1) {
                iMo11577a = aVar.f26139h.length();
                aVar.f26142k = -1;
            } else {
                aVar.f26142k = iMo11577a + 1;
            }
            int i4 = aVar.f26142k;
            if (i4 == i2) {
                int i5 = i4 + 1;
                aVar.f26142k = i5;
                if (i5 > aVar.f26139h.length()) {
                    aVar.f26142k = -1;
                }
            } else {
                while (i2 < iMo11577a && aVar.f26140i.mo11578b(aVar.f26139h.charAt(i2))) {
                    i2++;
                }
                while (iMo11577a > i2) {
                    int i6 = iMo11577a - 1;
                    if (!aVar.f26140i.mo11578b(aVar.f26139h.charAt(i6))) {
                        break;
                    }
                    iMo11577a = i6;
                }
                if (!aVar.f26141j || i2 != iMo11577a) {
                    int i7 = aVar.f26143l;
                    if (i7 == 1) {
                        iMo11577a = aVar.f26139h.length();
                        aVar.f26142k = -1;
                        while (iMo11577a > i2) {
                            int i8 = iMo11577a - 1;
                            if (!aVar.f26140i.mo11578b(aVar.f26139h.charAt(i8))) {
                                break;
                            }
                            iMo11577a = i8;
                        }
                    } else {
                        aVar.f26143l = i7 - 1;
                    }
                    t = (T) aVar.f26139h.subSequence(i2, iMo11577a).toString();
                    break;
                }
                i2 = aVar.f26142k;
            }
        }
        this.f26125g = t;
        if (this.f26124f == 3) {
            return false;
        }
        this.f26124f = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26124f = 2;
        T t = this.f26125g;
        this.f26125g = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
