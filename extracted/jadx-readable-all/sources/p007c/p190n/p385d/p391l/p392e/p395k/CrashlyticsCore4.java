package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.concurrent.Callable;
import p007c.p190n.p385d.p391l.p392e.Logger4;

/* JADX INFO: renamed from: c.n.d.l.e.k.h0, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsCore.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsCore4 implements Callable<Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CrashlyticsCore3 f26521a;

    public CrashlyticsCore4(CrashlyticsCore3 crashlyticsCore3) {
        this.f26521a = crashlyticsCore3;
    }

    @Override // java.util.concurrent.Callable
    public Boolean call() throws Exception {
        C5335t c5335t = this.f26521a.f26506g;
        boolean z = true;
        if (c5335t.f26594k.m11766b().exists()) {
            Logger4.f26421a.m11713b("Found previous crash marker.");
            c5335t.f26594k.m11766b().delete();
        } else {
            String strM11793i = c5335t.m11793i();
            if (strM11793i == null || !c5335t.f26606w.mo11708e(strM11793i)) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
