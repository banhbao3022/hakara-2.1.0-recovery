package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.a.oa */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3355oa {

    /* JADX INFO: renamed from: a */
    public static final boolean f17570a = C3282mb.f16709a;

    /* JADX INFO: renamed from: b */
    public final List<C3428q9> f17571b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f17572c = false;

    /* JADX INFO: renamed from: a */
    public final synchronized void m7975a(String str, long j2) {
        if (this.f17572c) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f17571b.add(new C3428q9(str, j2, SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7976b(String str) {
        long j2;
        this.f17572c = true;
        if (this.f17571b.size() == 0) {
            j2 = 0;
        } else {
            long j3 = this.f17571b.get(0).f18237c;
            List<C3428q9> list = this.f17571b;
            j2 = list.get(list.size() - 1).f18237c - j3;
        }
        if (j2 <= 0) {
            return;
        }
        long j4 = this.f17571b.get(0).f18237c;
        C3282mb.m7681b("(%-4d ms) %s", Long.valueOf(j2), str);
        for (C3428q9 c3428q9 : this.f17571b) {
            long j5 = c3428q9.f18237c;
            C3282mb.m7681b("(+%-4d) [%2d] %s", Long.valueOf(j5 - j4), Long.valueOf(c3428q9.f18236b), c3428q9.f18235a);
            j4 = j5;
        }
    }

    public final void finalize() throws Throwable {
        if (this.f17572c) {
            return;
        }
        m7976b("Request on the loose");
        C3282mb.m7682c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
