package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ua1 implements ia1<sa1> {

    /* JADX INFO: renamed from: a */
    public final lv1 f20256a;

    /* JADX INFO: renamed from: b */
    public final Context f20257b;

    public ua1(lv1 lv1Var, Context context) {
        this.f20256a = lv1Var;
        this.f20257b = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<sa1> zza() {
        return this.f20256a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.ta1

            /* JADX INFO: renamed from: a */
            public final ua1 f19805a;

            {
                this.f19805a = this;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x002b  */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int networkType;
                int i;
                boolean zIsActiveNetworkMetered;
                int i2;
                int i3;
                ua1 ua1Var = this.f19805a;
                TelephonyManager telephonyManager = (TelephonyManager) ua1Var.f20257b.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                if (C2622l.m5222A()) {
                    if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14316a5)).booleanValue()) {
                        networkType = 0;
                    } else {
                        networkType = telephonyManager.getNetworkType();
                    }
                } else {
                    networkType = telephonyManager.getNetworkType();
                }
                int phoneType = telephonyManager.getPhoneType();
                C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                int iOrdinal = -1;
                if (C2267h1.m4744c(ua1Var.f20257b, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) ua1Var.f20257b.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                        i3 = type;
                    } else {
                        i3 = -1;
                    }
                    zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                    i = i3;
                    i2 = iOrdinal;
                } else {
                    i = -2;
                    zIsActiveNetworkMetered = false;
                    i2 = -1;
                }
                return new sa1(networkOperator, i, networkType, phoneType, zIsActiveNetworkMetered, i2);
            }
        });
    }
}
