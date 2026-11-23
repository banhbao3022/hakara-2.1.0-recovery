package p636z0.p759s;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: z0.s.i, reason: use source file name */
/* JADX INFO: compiled from: Lifecycle.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Lifecycle3 {

    /* JADX INFO: renamed from: z0.s.i$a */
    /* JADX INFO: compiled from: Lifecycle.java */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static a downFrom(b bVar) {
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 2) {
                return ON_DESTROY;
            }
            if (iOrdinal == 3) {
                return ON_STOP;
            }
            if (iOrdinal != 4) {
                return null;
            }
            return ON_PAUSE;
        }

        public static a downTo(b bVar) {
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 0) {
                return ON_DESTROY;
            }
            if (iOrdinal == 2) {
                return ON_STOP;
            }
            if (iOrdinal != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        public static a upFrom(b bVar) {
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 1) {
                return ON_CREATE;
            }
            if (iOrdinal == 2) {
                return ON_START;
            }
            if (iOrdinal != 3) {
                return null;
            }
            return ON_RESUME;
        }

        public static a upTo(b bVar) {
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 2) {
                return ON_CREATE;
            }
            if (iOrdinal == 3) {
                return ON_START;
            }
            if (iOrdinal != 4) {
                return null;
            }
            return ON_RESUME;
        }

        public b getTargetState() {
            int iOrdinal = ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return b.RESUMED;
                    }
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            if (iOrdinal == 5) {
                                return b.DESTROYED;
                            }
                            throw new IllegalArgumentException(this + " has no target state");
                        }
                    }
                }
                return b.STARTED;
            }
            return b.CREATED;
        }
    }

    /* JADX INFO: renamed from: z0.s.i$b */
    /* JADX INFO: compiled from: Lifecycle.java */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public Lifecycle3() {
        new AtomicReference();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo16727a(LifecycleObserver lifecycleObserver);

    /* JADX INFO: renamed from: b */
    public abstract b mo16728b();

    /* JADX INFO: renamed from: c */
    public abstract void mo16729c(LifecycleObserver lifecycleObserver);
}
