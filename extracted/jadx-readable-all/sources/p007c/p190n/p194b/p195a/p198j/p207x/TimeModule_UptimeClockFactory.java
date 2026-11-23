package p007c.p190n.p194b.p195a.p198j.p207x;

import p005b1.p006a.Provider;

/* JADX INFO: renamed from: c.n.b.a.j.x.c, reason: use source file name */
/* JADX INFO: compiled from: TimeModule_UptimeClockFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class TimeModule_UptimeClockFactory implements Provider {

    /* JADX INFO: renamed from: c.n.b.a.j.x.c$a */
    /* JADX INFO: compiled from: TimeModule_UptimeClockFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final TimeModule_UptimeClockFactory f5923a = new TimeModule_UptimeClockFactory();
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        return new UptimeClock();
    }
}
