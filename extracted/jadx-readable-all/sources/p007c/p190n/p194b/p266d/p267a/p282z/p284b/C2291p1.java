package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p314j.p315a.lt2;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.p1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(26)
public class C2291p1 extends C2288o1 {
    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: p */
    public final lt2 mo4727p(Context context, TelephonyManager telephonyManager) {
        lt2 lt2Var = lt2.ENUM_FALSE;
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        return (C2267h1.m4744c(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? lt2.ENUM_TRUE : lt2Var;
    }
}
