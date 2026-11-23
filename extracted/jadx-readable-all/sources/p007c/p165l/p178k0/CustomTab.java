package p007c.p165l.p178k0;

import android.net.Uri;
import android.os.Bundle;
import p007c.p165l.FacebookSdk;

/* JADX INFO: renamed from: c.l.k0.f, reason: use source file name */
/* JADX INFO: compiled from: CustomTab.java */
/* JADX INFO: loaded from: classes.dex */
public class CustomTab {

    /* JADX INFO: renamed from: a */
    public Uri f4921a;

    public CustomTab(String str, Bundle bundle) {
        bundle = bundle == null ? new Bundle() : bundle;
        this.f4921a = Utility.m2444c(ServerProtocol.m2421a(), FacebookSdk.m2662d() + "/dialog/" + str, bundle);
    }
}
