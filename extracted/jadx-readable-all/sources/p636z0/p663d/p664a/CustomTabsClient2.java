package p636z0.p663d.p664a;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: z0.d.a.c, reason: use source file name */
/* JADX INFO: compiled from: CustomTabsClient.java */
/* JADX INFO: loaded from: classes.dex */
public class CustomTabsClient2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f35352f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Bundle f35353g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CustomTabsClient6 f35354h;

    public CustomTabsClient2(CustomTabsClient6 customTabsClient6, String str, Bundle bundle) {
        this.f35354h = customTabsClient6;
        this.f35352f = str;
        this.f35353g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        Objects.requireNonNull(this.f35354h.f35366g);
    }
}
