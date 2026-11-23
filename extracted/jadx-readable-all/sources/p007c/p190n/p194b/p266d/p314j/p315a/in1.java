package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class in1 {

    /* JADX INFO: renamed from: a */
    public boolean f15327a;

    /* JADX INFO: renamed from: a */
    public final void m7285a(Context context) {
        C2622l.m5341a1(context, "Application Context cannot be null");
        if (this.f15327a) {
            return;
        }
        this.f15327a = true;
        fo1 fo1VarM6847a = fo1.m6847a();
        Objects.requireNonNull(fo1VarM6847a);
        fo1VarM6847a.f14085c = new wn1(new Handler(), context, new un1(), fo1VarM6847a, null);
        ao1.f12237a.f12238b = context.getApplicationContext();
        WindowManager windowManager = po1.f18046a;
        po1.f18048c = context.getResources().getDisplayMetrics().density;
        po1.f18046a = (WindowManager) context.getSystemService("window");
        co1.f13066a.f13067b = context.getApplicationContext();
    }
}
