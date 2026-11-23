package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class js1 implements Iterator {

    /* JADX INFO: renamed from: f */
    @NullableDecl
    public T f15713f;

    /* JADX INFO: renamed from: h */
    public final CharSequence f15715h;

    /* JADX INFO: renamed from: j */
    public int f15717j;

    /* JADX INFO: renamed from: g */
    public int f15714g = 2;

    /* JADX INFO: renamed from: i */
    public int f15716i = 0;

    public js1(ks1 ks1Var, CharSequence charSequence) {
        Objects.requireNonNull(ks1Var);
        this.f15717j = Integer.MAX_VALUE;
        this.f15715h = charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.f15714g;
        if (i2 == 4) {
            throw new IllegalStateException();
        }
        int i3 = i2 - 1;
        T string = 0;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.f15714g = 4;
            int i4 = this.f15716i;
            while (true) {
                int length = this.f15716i;
                if (length == -1) {
                    this.f15714g = 3;
                    break;
                }
                gs1 gs1Var = (gs1) this;
                zr1 zr1Var = gs1Var.f14659k.f14955a;
                CharSequence charSequence = gs1Var.f15715h;
                int length2 = charSequence.length();
                C2622l.m5338Z2(length, length2, "index");
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (zr1Var.mo5844a(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = this.f15715h.length();
                    this.f15716i = -1;
                    i = -1;
                } else {
                    i = length + 1;
                    this.f15716i = i;
                }
                if (i != i4) {
                    if (i4 < length) {
                        this.f15715h.charAt(i4);
                    }
                    if (i4 < length) {
                        this.f15715h.charAt(length - 1);
                    }
                    int i5 = this.f15717j;
                    if (i5 == 1) {
                        length = this.f15715h.length();
                        this.f15716i = -1;
                        if (length > i4) {
                            this.f15715h.charAt(length - 1);
                        }
                    } else {
                        this.f15717j = i5 - 1;
                    }
                    string = this.f15715h.subSequence(i4, length).toString();
                    break;
                }
                int i6 = i + 1;
                this.f15716i = i6;
                if (i6 > this.f15715h.length()) {
                    this.f15716i = -1;
                }
            }
            this.f15713f = string;
            if (this.f15714g != 3) {
                this.f15714g = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15714g = 2;
        T t = this.f15713f;
        this.f15713f = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
