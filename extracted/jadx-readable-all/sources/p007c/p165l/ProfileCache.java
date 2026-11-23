package p007c.p165l;

import android.content.SharedPreferences;
import java.util.HashSet;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.a0, reason: use source file name */
/* JADX INFO: compiled from: ProfileCache.java */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileCache {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f4506a;

    public ProfileCache() {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        this.f4506a = FacebookSdk.f5360i.getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
    }
}
