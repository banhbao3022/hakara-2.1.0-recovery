package p007c.p085g.p086a.p089m.p092t;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Key;

/* JADX INFO: renamed from: c.g.a.m.t.r, reason: use source file name */
/* JADX INFO: compiled from: GlideException.java */
/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: f */
    public static final StackTraceElement[] f3352f = new StackTraceElement[0];

    /* JADX INFO: renamed from: g */
    public final List<Throwable> f3353g;

    /* JADX INFO: renamed from: h */
    public Key f3354h;

    /* JADX INFO: renamed from: i */
    public DataSource f3355i;

    /* JADX INFO: renamed from: j */
    public Class<?> f3356j;

    /* JADX INFO: renamed from: k */
    public String f3357k;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* JADX INFO: renamed from: b */
    public static void m1834b(List<Throwable> list, Appendable appendable) {
        try {
            m1835c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1835c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m1839f(appendable);
            } else {
                m1836d(th, appendable);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1836d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1837a(Throwable th, List<Throwable> list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).f3353g.iterator();
        while (it.hasNext()) {
            m1837a(it.next(), list);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m1838e(String str) {
        ArrayList arrayList = new ArrayList();
        m1837a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sbM1556G = outline.m1556G("Root cause (");
            int i2 = i + 1;
            sbM1556G.append(i2);
            sbM1556G.append(" of ");
            sbM1556G.append(size);
            sbM1556G.append(")");
            Log.i(str, sbM1556G.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1839f(Appendable appendable) {
        m1836d(this, appendable);
        m1834b(this.f3353g, new a(appendable));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f3357k);
        String string3 = "";
        if (this.f3356j != null) {
            StringBuilder sbM1556G = outline.m1556G(", ");
            sbM1556G.append(this.f3356j);
            string = sbM1556G.toString();
        } else {
            string = "";
        }
        sb.append(string);
        if (this.f3355i != null) {
            StringBuilder sbM1556G2 = outline.m1556G(", ");
            sbM1556G2.append(this.f3355i);
            string2 = sbM1556G2.toString();
        } else {
            string2 = "";
        }
        sb.append(string2);
        if (this.f3354h != null) {
            StringBuilder sbM1556G3 = outline.m1556G(", ");
            sbM1556G3.append(this.f3354h);
            string3 = sbM1556G3.toString();
        }
        sb.append(string3);
        ArrayList<Throwable> arrayList = new ArrayList();
        m1837a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        m1839f(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public GlideException(String str, List<Throwable> list) {
        this.f3357k = str;
        setStackTrace(f3352f);
        this.f3353g = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m1839f(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m1839f(printWriter);
    }

    /* JADX INFO: renamed from: c.g.a.m.t.r$a */
    /* JADX INFO: compiled from: GlideException.java */
    public static final class a implements Appendable {

        /* JADX INFO: renamed from: f */
        public final Appendable f3358f;

        /* JADX INFO: renamed from: g */
        public boolean f3359g = true;

        public a(Appendable appendable) {
            this.f3358f = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            if (this.f3359g) {
                this.f3359g = false;
                this.f3358f.append("  ");
            }
            this.f3359g = c2 == '\n';
            this.f3358f.append(c2);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.f3359g) {
                this.f3359g = false;
                this.f3358f.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f3359g = z;
            this.f3358f.append(charSequence, i, i2);
            return this;
        }
    }
}
