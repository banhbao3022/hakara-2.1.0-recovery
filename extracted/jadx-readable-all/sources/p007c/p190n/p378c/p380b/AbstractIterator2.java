package p007c.p190n.p378c.p380b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.n.c.b.b, reason: use source file name */
/* JADX INFO: compiled from: AbstractIterator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractIterator2<T> extends UnmodifiableIterator<T> {

    /* JADX INFO: renamed from: f */
    public int f26146f = 2;

    /* JADX INFO: renamed from: g */
    @NullableDecl
    public T f26147g;

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        T t;
        int i = this.f26146f;
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
        this.f26146f = 4;
        Sets2 sets2 = (Sets2) this;
        do {
            if (!sets2.f26270h.hasNext()) {
                sets2.f26146f = 3;
                t = null;
                break;
            }
            t = (T) sets2.f26270h.next();
        } while (!sets2.f26271i.f26190g.contains(t));
        this.f26147g = t;
        if (this.f26146f == 3) {
            return false;
        }
        this.f26146f = 1;
        return true;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26146f = 2;
        T t = this.f26147g;
        this.f26147g = null;
        return t;
    }
}
