package p636z0.p709j0.p710y.p720t;

import android.content.ComponentName;
import android.content.Context;
import p636z0.p709j0.Logger9;

/* JADX INFO: renamed from: z0.j0.y.t.g, reason: use source file name */
/* JADX INFO: compiled from: PackageManagerHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class PackageManagerHelper {

    /* JADX INFO: renamed from: a */
    public static final String f37568a = Logger9.m15886e("PackageManagerHelper");

    /* JADX INFO: renamed from: a */
    public static void m16008a(Context context, Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            Logger9 logger9M15885c = Logger9.m15885c();
            String str = f37568a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? "enabled" : "disabled";
            logger9M15885c.mo15887a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            Logger9 logger9M15885c2 = Logger9.m15885c();
            String str2 = f37568a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z ? "enabled" : "disabled";
            logger9M15885c2.mo15887a(str2, String.format("%s could not be %s", objArr2), e);
        }
    }
}
