package p007c.p043b.p044a.p045a.p051b.p052a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p477d1.TypeCastException;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c.b.a.a.b.a.a, reason: use source file name */
/* JADX INFO: compiled from: NetworkListener.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NetworkListener extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public InterfaceC6153a<Unit> f1868a = a.f1871h;

    /* JADX INFO: renamed from: b */
    public InterfaceC6153a<Unit> f1869b = a.f1870g;

    /* JADX INFO: renamed from: c.b.a.a.b.a.a$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class a extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f1870g = new a(0);

        /* JADX INFO: renamed from: h */
        public static final a f1871h = new a(1);

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f1872i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.f1872i = i;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            int i = this.f1872i;
            if (i == 0) {
                return Unit.f29502a;
            }
            if (i == 1) {
                return Unit.f29502a;
            }
            throw null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics2.m13090f(context, "context");
        Intrinsics2.m13090f(intent, "intent");
        Intrinsics2.m13090f(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            this.f1869b.mo2c();
        } else {
            this.f1868a.mo2c();
        }
    }
}
