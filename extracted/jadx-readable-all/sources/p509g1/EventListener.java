package p509g1;

import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.s, reason: use source file name */
/* JADX INFO: compiled from: EventListener.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EventListener {

    /* JADX INFO: renamed from: a */
    public static final EventListener f30623a;

    /* JADX INFO: renamed from: g1.s$a */
    /* JADX INFO: compiled from: EventListener.kt */
    public static final class a extends EventListener {
    }

    /* JADX INFO: renamed from: g1.s$b */
    /* JADX INFO: compiled from: EventListener.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.s$c */
    /* JADX INFO: compiled from: EventListener.kt */
    public interface c {
        /* JADX INFO: renamed from: a */
        EventListener mo13359a(Call call);
    }

    static {
        new b(null);
        f30623a = new a();
    }

    /* JADX INFO: renamed from: a */
    public void m13643a(Call call, Connection connection) {
        Intrinsics2.m13090f(call, "call");
        Intrinsics2.m13090f(connection, "connection");
    }
}
