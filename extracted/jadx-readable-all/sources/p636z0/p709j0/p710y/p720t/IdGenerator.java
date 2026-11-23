package p636z0.p709j0.p710y.p720t;

import androidx.work.impl.WorkDatabase;
import p636z0.p709j0.p710y.p719s.Preference;
import p636z0.p709j0.p710y.p719s.PreferenceDao_Impl;

/* JADX INFO: renamed from: z0.j0.y.t.f, reason: use source file name */
/* JADX INFO: compiled from: IdGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class IdGenerator {

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f37567a;

    public IdGenerator(WorkDatabase workDatabase) {
        this.f37567a = workDatabase;
    }

    /* JADX INFO: renamed from: a */
    public final int m16006a(String str) {
        this.f37567a.m14529c();
        try {
            Long lM15973a = ((PreferenceDao_Impl) this.f37567a.mo942q()).m15973a(str);
            int i = 0;
            int iIntValue = lM15973a != null ? lM15973a.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i = iIntValue + 1;
            }
            ((PreferenceDao_Impl) this.f37567a.mo942q()).m15974b(new Preference(str, i));
            this.f37567a.m14537n();
            return iIntValue;
        } finally {
            this.f37567a.m14530f();
        }
    }

    /* JADX INFO: renamed from: b */
    public int m16007b(int i, int i2) {
        synchronized (IdGenerator.class) {
            int iM16006a = m16006a("next_job_scheduler_id");
            if (iM16006a < i || iM16006a > i2) {
                ((PreferenceDao_Impl) this.f37567a.mo942q()).m15974b(new Preference("next_job_scheduler_id", i + 1));
            } else {
                i = iM16006a;
            }
        }
        return i;
    }
}
