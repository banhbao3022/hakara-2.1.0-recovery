package p636z0.p663d.p664a;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: z0.d.a.f, reason: use source file name */
/* JADX INFO: compiled from: CustomTabsClient.java */
/* JADX INFO: loaded from: classes.dex */
public class CustomTabsClient5 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f35360f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Uri f35361g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f35362h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Bundle f35363i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ CustomTabsClient6 f35364j;

    public CustomTabsClient5(CustomTabsClient6 customTabsClient6, int i, Uri uri, boolean z, Bundle bundle) {
        this.f35364j = customTabsClient6;
        this.f35360f = i;
        this.f35361g = uri;
        this.f35362h = z;
        this.f35363i = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        Objects.requireNonNull(this.f35364j.f35366g);
    }
}
