package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.concurrent.Future;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ne2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f17083f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ pe2 f17084g;

    public ne2(pe2 pe2Var, int i) {
        this.f17084g = pe2Var;
        this.f17083f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f31 f31VarM5430s0;
        pe2 pe2Var = this.f17084g;
        int i = this.f17083f;
        if (i > 0) {
            try {
                Thread.sleep(i * CloseCodes.NORMAL_CLOSURE);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = pe2Var.f17947b.getPackageManager().getPackageInfo(pe2Var.f17947b.getPackageName(), 0);
            Context context = pe2Var.f17947b;
            f31VarM5430s0 = C2622l.m5430s0(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            f31VarM5430s0 = null;
        }
        this.f17084g.f17956k = f31VarM5430s0;
        if (this.f17083f < 4) {
            if (f31VarM5430s0 != null && f31VarM5430s0.m6763W() && !f31VarM5430s0.m6764k0().equals("0000000000000000000000000000000000000000000000000000000000000000") && f31VarM5430s0.m6768o0() && f31VarM5430s0.m6769p0().m6191v() && f31VarM5430s0.m6769p0().m6192x() != -2) {
                return;
            }
            pe2 pe2Var2 = this.f17084g;
            int i2 = this.f17083f + 1;
            if (pe2Var2.f17960o) {
                Future<?> futureSubmit = pe2Var2.f17948c.submit(new ne2(pe2Var2, i2));
                if (i2 == 0) {
                    pe2Var2.f17957l = futureSubmit;
                }
            }
        }
    }
}
