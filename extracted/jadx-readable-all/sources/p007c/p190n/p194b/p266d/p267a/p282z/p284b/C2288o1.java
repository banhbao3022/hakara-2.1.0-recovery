package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3331nn;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.o1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public class C2288o1 extends C2285n1 {
    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: o */
    public final boolean mo4726o(Activity activity, Configuration configuration) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14199H2;
        C2862b c2862b = C2862b.f12493a;
        if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            return false;
        }
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14211J2)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        C3331nn c3331nn = gx2.f14692a.f14693b;
        int iM7886d = C3331nn.m7886d(activity.getResources().getDisplayMetrics(), configuration.screenHeightDp);
        int iM7886d2 = C3331nn.m7886d(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        DisplayMetrics displayMetricsM4741K = C2267h1.m4741K(windowManager);
        int i = displayMetricsM4741K.heightPixels;
        int i2 = displayMetricsM4741K.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iIntValue = ((Integer) c2862b.f12496d.m6596a(C3052g3.f14187F2)).intValue() * ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d));
        if (Math.abs(i - (iM7886d + dimensionPixelSize)) <= iIntValue) {
            return !(Math.abs(i2 - iM7886d2) <= iIntValue);
        }
        return true;
    }
}
