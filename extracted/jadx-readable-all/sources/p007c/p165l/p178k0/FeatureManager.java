package p007c.p165l.p178k0;

import java.util.HashSet;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.l.k0.p, reason: use source file name */
/* JADX INFO: compiled from: FeatureManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class FeatureManager {

    /* JADX INFO: renamed from: c.l.k0.p$a */
    /* JADX INFO: compiled from: FeatureManager.java */
    public static class a implements FetchedAppGateKeepersManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f4991a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f4992b;

        public a(b bVar, int i) {
            this.f4991a = bVar;
            this.f4992b = i;
        }

        @Override // p007c.p165l.p178k0.FetchedAppGateKeepersManager.c
        /* JADX INFO: renamed from: a */
        public void mo2517a() {
            this.f4991a.mo2314a(FeatureManager.m2516c(this.f4992b));
        }
    }

    /* JADX INFO: renamed from: c.l.k0.p$b */
    /* JADX INFO: compiled from: FeatureManager.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2314a(boolean z);
    }

    /* JADX INFO: renamed from: a */
    public static void m2514a(int i, b bVar) {
        FetchedAppGateKeepersManager.m2520c(new a(bVar, i));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2515b(int i) {
        boolean z;
        StringBuilder sbM1556G = outline.m1556G("FBSDKFeature");
        sbM1556G.append(C7804v0.m15320i(i));
        String string = sbM1556G.toString();
        switch (C7804v0.m15315d(i)) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                z = false;
                break;
            default:
                z = true;
                break;
        }
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        return FetchedAppGateKeepersManager.m2519b(string, FacebookSdk.f5354c, z);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2516c(int i) {
        int iM15319h;
        if (1 == i) {
            return false;
        }
        if (2 == i) {
            return true;
        }
        int iM15332u = C7804v0.m15332u(i);
        if ((iM15332u & 255) > 0) {
            iM15319h = C7804v0.m15319h(iM15332u & (-256));
        } else if ((65280 & iM15332u) > 0) {
            iM15319h = C7804v0.m15319h(iM15332u & (-65536));
        } else {
            iM15319h = (16711680 & iM15332u) > 0 ? C7804v0.m15319h(iM15332u & (-16777216)) : C7804v0.m15319h(0);
        }
        if (iM15319h == i) {
            return m2515b(i);
        }
        return m2516c(iM15319h) && m2515b(i);
    }
}
