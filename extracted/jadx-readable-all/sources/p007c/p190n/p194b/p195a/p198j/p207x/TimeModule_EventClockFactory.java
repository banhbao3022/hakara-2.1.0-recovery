package p007c.p190n.p194b.p195a.p198j.p207x;

import p005b1.p006a.Provider;

/* JADX INFO: renamed from: c.n.b.a.j.x.b, reason: use source file name */
/* JADX INFO: compiled from: TimeModule_EventClockFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class TimeModule_EventClockFactory implements Provider {

    /* JADX INFO: renamed from: c.n.b.a.j.x.b$a */
    /* JADX INFO: compiled from: TimeModule_EventClockFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final TimeModule_EventClockFactory f5922a = new TimeModule_EventClockFactory();
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        return new WallTimeClock();
    }
}
