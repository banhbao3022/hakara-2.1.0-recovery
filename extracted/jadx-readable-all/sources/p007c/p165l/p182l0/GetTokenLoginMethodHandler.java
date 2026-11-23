package p007c.p165l.p182l0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p007c.p165l.AccessToken;
import p007c.p165l.AccessTokenSource;
import p007c.p165l.p178k0.FacebookSignatureValidator;
import p007c.p165l.p178k0.NativeProtocol;
import p007c.p165l.p178k0.PlatformServiceClient;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.l0.k, reason: use source file name */
/* JADX INFO: compiled from: GetTokenLoginMethodHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new b();

    /* JADX INFO: renamed from: h */
    public GetTokenClient f5110h;

    /* JADX INFO: renamed from: c.l.l0.k$a */
    /* JADX INFO: compiled from: GetTokenLoginMethodHandler.java */
    public class a implements PlatformServiceClient.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LoginClient.d f5111a;

        public a(LoginClient.d dVar) {
            this.f5111a = dVar;
        }
    }

    /* JADX INFO: renamed from: c.l.l0.k$b */
    /* JADX INFO: compiled from: GetTokenLoginMethodHandler.java */
    public static class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    }

    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: b */
    public void mo2570b() {
        GetTokenClient getTokenClient = this.f5110h;
        if (getTokenClient != null) {
            getTokenClient.f4880d = false;
            getTokenClient.f4879c = null;
            this.f5110h = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public String mo2554e() {
        return "get_token";
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: i */
    public boolean mo2557i(LoginClient.d dVar) {
        boolean z;
        Intent intent;
        ResolveInfo resolveInfoResolveService;
        GetTokenClient getTokenClient = new GetTokenClient(this.f5163g.m2578e(), dVar.f5129i);
        this.f5110h = getTokenClient;
        if (getTokenClient.f4880d) {
            z = false;
        } else {
            int i = getTokenClient.f4885i;
            List<NativeProtocol.f> list = NativeProtocol.f5058b;
            if (NativeProtocol.m2544h(list, new int[]{i}).f5065b == -1) {
                z = false;
            } else {
                Context context = getTokenClient.f4877a;
                Iterator<NativeProtocol.f> it = list.iterator();
                do {
                    intent = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Intent intentAddCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(it.next().mo2552c()).addCategory("android.intent.category.DEFAULT");
                    if (intentAddCategory != null && (resolveInfoResolveService = context.getPackageManager().resolveService(intentAddCategory, 0)) != null && FacebookSignatureValidator.m2512a(context, resolveInfoResolveService.serviceInfo.packageName)) {
                        intent = intentAddCategory;
                    }
                } while (intent == null);
                if (intent == null) {
                    z = false;
                } else {
                    getTokenClient.f4880d = true;
                    getTokenClient.f4877a.bindService(intent, getTokenClient, 1);
                    z = true;
                }
            }
        }
        if (!z) {
            return false;
        }
        LoginClient.b bVar = this.f5163g.f5120j;
        if (bVar != null) {
            ((LoginFragment.b) bVar).f5151a.setVisibility(0);
        }
        this.f5110h.f4879c = new a(dVar);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void m2571k(LoginClient.d dVar, Bundle bundle) {
        AccessToken accessToken;
        AccessTokenSource accessTokenSource = AccessTokenSource.FACEBOOK_APPLICATION_SERVICE;
        String str = dVar.f5129i;
        Date dateM2451j = Utility.m2451j(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date dateM2451j2 = Utility.m2451j(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (Utility.m2466y(string)) {
            accessToken = null;
        } else {
            accessToken = new AccessToken(string, str, bundle.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, accessTokenSource, dateM2451j, new Date(), dateM2451j2, bundle.getString("graph_domain"));
        }
        this.f5163g.m2577d(LoginClient.e.m2587d(this.f5163g.f5122l, accessToken));
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Utility.m2441N(parcel, this.f5162f);
    }

    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
