package p636z0.p663d.p664a;

import android.content.ComponentName;
import p629y0.p630a.p631a.ICustomTabsCallback;
import p629y0.p630a.p631a.ICustomTabsService;

/* JADX INFO: renamed from: z0.d.a.k, reason: use source file name */
/* JADX INFO: compiled from: CustomTabsSession.java */
/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsSession {

    /* JADX INFO: renamed from: a */
    public final ICustomTabsService f35372a;

    /* JADX INFO: renamed from: b */
    public final ICustomTabsCallback f35373b;

    /* JADX INFO: renamed from: c */
    public final ComponentName f35374c;

    public CustomTabsSession(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName) {
        this.f35372a = iCustomTabsService;
        this.f35373b = iCustomTabsCallback;
        this.f35374c = componentName;
    }
}
