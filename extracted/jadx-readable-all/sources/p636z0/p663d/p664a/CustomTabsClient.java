package p636z0.p663d.p664a;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: z0.d.a.b, reason: use source file name */
/* JADX INFO: compiled from: CustomTabsClient.java */
/* JADX INFO: loaded from: classes.dex */
public class CustomTabsClient implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f35349f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Bundle f35350g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CustomTabsClient6 f35351h;

    public CustomTabsClient(CustomTabsClient6 customTabsClient6, int i, Bundle bundle) {
        this.f35351h = customTabsClient6;
        this.f35349f = i;
        this.f35350g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        Objects.requireNonNull(this.f35351h.f35366g);
    }
}
