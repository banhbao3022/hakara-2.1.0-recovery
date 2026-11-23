package p007c.p190n.p385d.p421t;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry;
import p007c.p190n.p385d.p421t.p425s.SystemClock2;

/* JADX INFO: renamed from: c.n.d.t.o, reason: use source file name */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes.dex */
public final class Utils6 {

    /* JADX INFO: renamed from: a */
    public static final long f27156a = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: b */
    public static final Pattern f27157b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: c */
    public static Utils6 f27158c;

    /* JADX INFO: renamed from: d */
    public final SystemClock2 f27159d;

    public Utils6(SystemClock2 systemClock2) {
        this.f27159d = systemClock2;
    }

    /* JADX INFO: renamed from: c */
    public static Utils6 m12114c() {
        if (SystemClock2.f27220a == null) {
            SystemClock2.f27220a = new SystemClock2();
        }
        SystemClock2 systemClock2 = SystemClock2.f27220a;
        if (f27158c == null) {
            f27158c = new Utils6(systemClock2);
        }
        return f27158c;
    }

    /* JADX INFO: renamed from: a */
    public long m12115a() {
        Objects.requireNonNull(this.f27159d);
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public long m12116b() {
        return TimeUnit.MILLISECONDS.toSeconds(m12115a());
    }

    /* JADX INFO: renamed from: d */
    public boolean m12117d(PersistedInstallationEntry persistedInstallationEntry) {
        if (TextUtils.isEmpty(persistedInstallationEntry.mo12119a())) {
            return true;
        }
        return persistedInstallationEntry.mo12120b() + persistedInstallationEntry.mo12125g() < m12116b() + f27156a;
    }
}
