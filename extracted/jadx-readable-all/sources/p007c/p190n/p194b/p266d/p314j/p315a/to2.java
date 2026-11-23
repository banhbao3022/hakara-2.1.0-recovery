package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public final class to2 {

    /* JADX INFO: renamed from: a */
    public final so2 f19933a;

    /* JADX INFO: renamed from: b */
    public final boolean f19934b;

    /* JADX INFO: renamed from: c */
    public final long f19935c;

    /* JADX INFO: renamed from: d */
    public final long f19936d;

    /* JADX INFO: renamed from: e */
    public long f19937e;

    /* JADX INFO: renamed from: f */
    public long f19938f;

    /* JADX INFO: renamed from: g */
    public long f19939g;

    /* JADX INFO: renamed from: h */
    public boolean f19940h;

    /* JADX INFO: renamed from: i */
    public long f19941i;

    /* JADX INFO: renamed from: j */
    public long f19942j;

    /* JADX INFO: renamed from: k */
    public long f19943k;

    public to2(double d) {
        long j2;
        boolean z = d != -1.0d;
        this.f19934b = z;
        if (z) {
            this.f19933a = so2.f19639f;
            long j3 = (long) (1.0E9d / d);
            this.f19935c = j3;
            j2 = (j3 * 80) / 100;
        } else {
            this.f19933a = null;
            j2 = -1;
            this.f19935c = -1L;
        }
        this.f19936d = j2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8438a(long j2, long j3) {
        return Math.abs((j3 - this.f19941i) - (j2 - this.f19942j)) > 20000000;
    }

    public to2() {
        this(-1.0d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public to2(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this(windowManager.getDefaultDisplay() != null ? windowManager.getDefaultDisplay().getRefreshRate() : -1.0d);
    }
}
