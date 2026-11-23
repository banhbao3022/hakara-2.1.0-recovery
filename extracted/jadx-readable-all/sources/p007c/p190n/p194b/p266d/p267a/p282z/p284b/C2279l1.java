package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.l1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(18)
public class C2279l1 extends C2276k1 {
    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: g */
    public boolean mo4718g(View view) {
        return super.mo4718g(view) || view.getWindowId() != null;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: h */
    public final int mo4719h() {
        return 14;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: i */
    public final long mo4720i() {
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
    }
}
