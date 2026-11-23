package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class mc2 implements Iterator<b10>, Closeable, a20 {

    /* JADX INFO: renamed from: f */
    public static final b10 f16719f = new lc2();

    /* JADX INFO: renamed from: g */
    public InterfaceC3046fy f16720g;

    /* JADX INFO: renamed from: h */
    public nc2 f16721h;

    /* JADX INFO: renamed from: i */
    public b10 f16722i = null;

    /* JADX INFO: renamed from: j */
    public long f16723j = 0;

    /* JADX INFO: renamed from: k */
    public long f16724k = 0;

    /* JADX INFO: renamed from: l */
    public final List<b10> f16725l = new ArrayList();

    static {
        tc2.m8414b(mc2.class);
    }

    public void close() throws IOException {
    }

    /* JADX INFO: renamed from: h */
    public final List<b10> m7690h() {
        return (this.f16721h == null || this.f16722i == f16719f) ? this.f16725l : new sc2(this.f16725l, this);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b10 b10Var = this.f16722i;
        if (b10Var == f16719f) {
            return false;
        }
        if (b10Var != null) {
            return true;
        }
        try {
            this.f16722i = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f16722i = f16719f;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f16725l.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.f16725l.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final b10 next() {
        b10 b10VarM7038b;
        b10 b10Var = this.f16722i;
        if (b10Var != null && b10Var != f16719f) {
            this.f16722i = null;
            return b10Var;
        }
        nc2 nc2Var = this.f16721h;
        if (nc2Var == null || this.f16723j >= this.f16724k) {
            this.f16722i = f16719f;
            throw new NoSuchElementException();
        }
        try {
            synchronized (nc2Var) {
                ((C3076gr) this.f16721h).m7018f(this.f16723j);
                b10VarM7038b = ((AbstractC3082gx) this.f16720g).m7038b(this.f16721h, this);
                this.f16723j = ((C3076gr) this.f16721h).m7017c();
            }
            return b10VarM7038b;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }
}
