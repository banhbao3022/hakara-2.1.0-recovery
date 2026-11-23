package p007c.p190n.p385d.p391l.p392e.p395k;

import java.io.File;
import java.util.HashSet;
import java.util.Objects;
import p007c.p190n.p385d.p391l.p392e.Logger4;

/* JADX INFO: renamed from: c.n.d.l.e.k.o */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC5325o implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C5335t f26552f;

    public RunnableC5325o(C5335t c5335t) {
        this.f26552f = c5335t;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5335t c5335t = this.f26552f;
        File[] fileArrM11786r = C5335t.m11786r(c5335t.m11795l(), new C5335t.i());
        Objects.requireNonNull(c5335t);
        HashSet hashSet = new HashSet();
        for (File file : fileArrM11786r) {
            Logger4.f26421a.m11713b("Found invalid session part file: " + file);
            hashSet.add(C5335t.m11785o(file));
        }
        if (hashSet.isEmpty()) {
            return;
        }
        for (File file2 : C5335t.m11786r(c5335t.m11795l(), new C5327p(c5335t, hashSet))) {
            Logger4.f26421a.m11713b("Deleting invalid session file: " + file2);
            file2.delete();
        }
    }
}
