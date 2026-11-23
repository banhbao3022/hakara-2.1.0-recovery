package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ou1<OutputT> extends au1<OutputT> {

    /* JADX INFO: renamed from: m */
    public static final lu1 f17737m;

    /* JADX INFO: renamed from: n */
    public static final Logger f17738n = Logger.getLogger(ou1.class.getName());

    /* JADX INFO: renamed from: o */
    public volatile Set<Throwable> f17739o = null;

    /* JADX INFO: renamed from: p */
    public volatile int f17740p;

    static {
        Throwable th;
        lu1 nu1Var;
        try {
            nu1Var = new mu1(AtomicReferenceFieldUpdater.newUpdater(ou1.class, Set.class, "o"), AtomicIntegerFieldUpdater.newUpdater(ou1.class, "p"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            nu1Var = new nu1();
        }
        Throwable th3 = th;
        f17737m = nu1Var;
        if (th3 != null) {
            f17738n.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public ou1(int i) {
        this.f17740p = i;
    }
}
