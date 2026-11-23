package p007c.p080e.p081a;

/* JADX INFO: renamed from: c.e.a.e, reason: use source file name */
/* JADX INFO: compiled from: Level.java */
/* JADX INFO: loaded from: classes.dex */
public enum Level {
    AV_LOG_STDERR(-16),
    AV_LOG_QUIET(-8),
    AV_LOG_PANIC(0),
    AV_LOG_FATAL(8),
    AV_LOG_ERROR(16),
    AV_LOG_WARNING(24),
    AV_LOG_INFO(32),
    AV_LOG_VERBOSE(40),
    AV_LOG_DEBUG(48),
    AV_LOG_TRACE(56);


    /* JADX INFO: renamed from: q */
    public int f2806q;

    Level(int i) {
        this.f2806q = i;
    }

    /* JADX INFO: renamed from: f */
    public static Level m1608f(int i) {
        Level level = AV_LOG_STDERR;
        if (i == -16) {
            return level;
        }
        Level level2 = AV_LOG_QUIET;
        if (i == -8) {
            return level2;
        }
        Level level3 = AV_LOG_PANIC;
        if (i == 0) {
            return level3;
        }
        Level level4 = AV_LOG_FATAL;
        if (i == 8) {
            return level4;
        }
        Level level5 = AV_LOG_ERROR;
        if (i == 16) {
            return level5;
        }
        Level level6 = AV_LOG_WARNING;
        if (i == 24) {
            return level6;
        }
        Level level7 = AV_LOG_INFO;
        if (i == 32) {
            return level7;
        }
        Level level8 = AV_LOG_VERBOSE;
        if (i == 40) {
            return level8;
        }
        return i == 48 ? AV_LOG_DEBUG : AV_LOG_TRACE;
    }
}
