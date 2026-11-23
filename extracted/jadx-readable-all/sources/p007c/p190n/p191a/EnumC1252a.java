package p007c.p190n.p191a;

import androidx.annotation.RecentlyNonNull;

/* JADX INFO: renamed from: c.n.a.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1252a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");


    /* JADX INFO: renamed from: k */
    public final String f5492k;

    EnumC1252a(String str) {
        this.f5492k = str;
    }

    @Override // java.lang.Enum
    @RecentlyNonNull
    public String toString() {
        return this.f5492k;
    }
}
