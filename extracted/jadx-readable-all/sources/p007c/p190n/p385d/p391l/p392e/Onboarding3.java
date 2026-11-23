package p007c.p190n.p385d.p391l.p392e;

import android.util.Log;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4767b;

/* JADX INFO: renamed from: c.n.d.l.e.g, reason: use source file name */
/* JADX INFO: compiled from: Onboarding.java */
/* JADX INFO: loaded from: classes.dex */
public class Onboarding3 implements InterfaceC4767b<Void, Object> {
    public Onboarding3(Onboarding4 onboarding4) {
    }

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4767b
    /* JADX INFO: renamed from: a */
    public Object mo5191a(AbstractC4781i<Void> abstractC4781i) throws Exception {
        if (abstractC4781i.mo10941n()) {
            return null;
        }
        Logger4 logger4 = Logger4.f26421a;
        Exception excMo10936i = abstractC4781i.mo10936i();
        if (!logger4.m11712a(6)) {
            return null;
        }
        Log.e(logger4.f26422b, "Error fetching settings.", excMo10936i);
        return null;
    }
}
