package p636z0.p663d.p664a;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: z0.d.a.e, reason: use source file name */
/* JADX INFO: compiled from: CustomTabsClient.java */
/* JADX INFO: loaded from: classes.dex */
public class CustomTabsClient4 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f35357f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Bundle f35358g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CustomTabsClient6 f35359h;

    public CustomTabsClient4(CustomTabsClient6 customTabsClient6, String str, Bundle bundle) {
        this.f35359h = customTabsClient6;
        this.f35357f = str;
        this.f35358g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        Objects.requireNonNull(this.f35359h.f35366g);
    }
}
