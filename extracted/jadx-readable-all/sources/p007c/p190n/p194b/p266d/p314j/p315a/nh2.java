package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nh2 {

    /* JADX INFO: renamed from: a */
    public static final nh2 f17107a = new kh2();

    /* JADX INFO: renamed from: a */
    public abstract int mo7495a();

    /* JADX INFO: renamed from: b */
    public abstract mh2 mo7496b(int i, mh2 mh2Var, boolean z, long j2);

    /* JADX INFO: renamed from: c */
    public abstract int mo7497c();

    /* JADX INFO: renamed from: d */
    public abstract lh2 mo7498d(int i, lh2 lh2Var, boolean z);

    /* JADX INFO: renamed from: e */
    public abstract int mo7499e(Object obj);

    /* JADX INFO: renamed from: f */
    public final boolean m7863f() {
        return mo7495a() == 0;
    }

    /* JADX INFO: renamed from: g */
    public final mh2 m7864g(int i, mh2 mh2Var) {
        return mo7496b(i, mh2Var, false, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX INFO: renamed from: h */
    public final int m7865h(int i, lh2 lh2Var, mh2 mh2Var, int i2) {
        mo7498d(i, lh2Var, false);
        m7864g(0, mh2Var);
        int i3 = 1;
        if (i != 0) {
            return i + 1;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = 0;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                if (mo7495a() - 1 == 0) {
                    i3 = 0;
                }
            }
        } else if (mo7495a() - 1 == 0) {
            i3 = -1;
        }
        if (i3 == -1) {
            return -1;
        }
        m7864g(i3, mh2Var);
        return 0;
    }
}
