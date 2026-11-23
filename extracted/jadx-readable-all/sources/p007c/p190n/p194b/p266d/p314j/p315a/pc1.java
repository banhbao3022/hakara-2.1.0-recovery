package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2297s0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc1 implements Callable {

    /* JADX INFO: renamed from: a */
    public static final Callable f17906a = new pc1();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap map = new HashMap();
        AbstractC3718y2<String> abstractC3718y2 = C3052g3.f14163C;
        C2862b c2862b = C2862b.f12493a;
        String str = (String) c2862b.f12496d.m6596a(abstractC3718y2);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) c2862b.f12496d.m6596a(C3052g3.f14170D)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    map.put(str2, C2297s0.m4801a(str2));
                }
            }
        }
        return new rc1(map);
    }
}
