package p636z0.p663d.p664a;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: z0.d.a.d, reason: use source file name */
/* JADX INFO: compiled from: CustomTabsClient.java */
/* JADX INFO: loaded from: classes.dex */
public class CustomTabsClient3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Bundle f35355f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CustomTabsClient6 f35356g;

    public CustomTabsClient3(CustomTabsClient6 customTabsClient6, Bundle bundle) {
        this.f35356g = customTabsClient6;
        this.f35355f = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        Objects.requireNonNull(this.f35356g.f35366g);
    }
}
