package p007c.p165l.p182l0;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import p007c.p165l.p178k0.NativeProtocol;
import p007c.p165l.p178k0.Utility;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.l.l0.m, reason: use source file name */
/* JADX INFO: compiled from: KatanaProxyLoginMethodHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new a();

    /* JADX INFO: renamed from: c.l.l0.m$a */
    /* JADX INFO: compiled from: KatanaProxyLoginMethodHandler.java */
    public static class a implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public KatanaProxyLoginMethodHandler[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }
    }

    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public String mo2554e() {
        return "katana_proxy_auth";
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: i */
    public boolean mo2557i(LoginClient.d dVar) {
        Intent intentM2550n;
        String strM2572g = LoginClient.m2572g();
        FragmentActivity fragmentActivityM2578e = this.f5163g.m2578e();
        String str = dVar.f5129i;
        Set<String> set = dVar.f5127g;
        boolean zM2583a = dVar.m2583a();
        DefaultAudience defaultAudience = dVar.f5128h;
        String strM2597d = m2597d(dVar.f5130j);
        String str2 = dVar.f5133m;
        Iterator<NativeProtocol.f> it = NativeProtocol.f5058b.iterator();
        while (true) {
            if (!it.hasNext()) {
                intentM2550n = null;
                break;
            }
            String str3 = str2;
            intentM2550n = NativeProtocol.m2550n(fragmentActivityM2578e, NativeProtocol.m2539c(it.next(), str, set, strM2572g, zM2583a, defaultAudience, strM2597d, str2));
            if (intentM2550n != null) {
                break;
            }
            str2 = str3;
        }
        m2596a("e2e", strM2572g);
        int iM2573i = LoginClient.m2573i();
        if (intentM2550n == null) {
            return false;
        }
        try {
            this.f5163g.f5118h.startActivityForResult(intentM2550n, iM2573i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Utility.m2441N(parcel, this.f5162f);
    }

    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
