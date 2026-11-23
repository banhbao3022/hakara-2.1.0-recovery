package p007c.p165l.p178k0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import p007c.p165l.FacebookSdk;

/* JADX INFO: renamed from: c.l.k0.c0, reason: use source file name */
/* JADX INFO: compiled from: ServerProtocol.java */
/* JADX INFO: loaded from: classes.dex */
public final class ServerProtocol {

    /* JADX INFO: renamed from: a */
    public static final Collection<String> f4898a = Collections.unmodifiableCollection(Arrays.asList("service_disabled", "AndroidAuthKillSwitchException"));

    /* JADX INFO: renamed from: b */
    public static final Collection<String> f4899b = Collections.unmodifiableCollection(Arrays.asList("access_denied", "OAuthAccessDeniedException"));

    /* JADX INFO: renamed from: a */
    public static final String m2421a() {
        return String.format("m.%s", FacebookSdk.m2661c());
    }

    /* JADX INFO: renamed from: b */
    public static final String m2422b() {
        return String.format("https://graph.%s", FacebookSdk.m2661c());
    }
}
