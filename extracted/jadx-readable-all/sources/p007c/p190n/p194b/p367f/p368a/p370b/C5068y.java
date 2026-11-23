package p007c.p190n.p194b.p367f.p368a.p370b;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.f.a.b.y */
/* JADX INFO: loaded from: classes.dex */
public final class C5068y extends AssetPackState {

    /* JADX INFO: renamed from: a */
    public final String f26008a;

    /* JADX INFO: renamed from: b */
    public final int f26009b;

    /* JADX INFO: renamed from: c */
    public final int f26010c;

    /* JADX INFO: renamed from: d */
    public final long f26011d;

    /* JADX INFO: renamed from: e */
    public final long f26012e;

    /* JADX INFO: renamed from: f */
    public final int f26013f;

    /* JADX INFO: renamed from: g */
    public final int f26014g;

    /* JADX INFO: renamed from: h */
    public final String f26015h;

    public C5068y(String str, int i, int i2, long j2, long j3, int i3, int i4, String str2) {
        Objects.requireNonNull(str, "Null name");
        this.f26008a = str;
        this.f26009b = i;
        this.f26010c = i2;
        this.f26011d = j2;
        this.f26012e = j3;
        this.f26013f = i3;
        this.f26014g = i4;
        Objects.requireNonNull(str2, "Null versionTag");
        this.f26015h = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: a */
    public final int mo11514a() {
        return this.f26014g;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: b */
    public final String mo11515b() {
        return this.f26015h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: c */
    public final long mo11516c() {
        return this.f26011d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f26008a.equals(assetPackState.mo11518g()) && this.f26009b == assetPackState.mo11519h() && this.f26010c == assetPackState.mo11517f() && this.f26011d == assetPackState.mo11516c() && this.f26012e == assetPackState.mo11520i() && this.f26013f == assetPackState.mo11521j() && this.f26014g == assetPackState.mo11514a() && this.f26015h.equals(assetPackState.mo11515b())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: f */
    public final int mo11517f() {
        return this.f26010c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: g */
    public final String mo11518g() {
        return this.f26008a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: h */
    public final int mo11519h() {
        return this.f26009b;
    }

    public final int hashCode() {
        int iHashCode = this.f26008a.hashCode();
        int i = this.f26009b;
        int i2 = this.f26010c;
        long j2 = this.f26011d;
        long j3 = this.f26012e;
        return ((((((((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f26013f) * 1000003) ^ this.f26014g) * 1000003) ^ this.f26015h.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: i */
    public final long mo11520i() {
        return this.f26012e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: j */
    public final int mo11521j() {
        return this.f26013f;
    }

    public final String toString() {
        String str = this.f26008a;
        int i = this.f26009b;
        int i2 = this.f26010c;
        long j2 = this.f26011d;
        long j3 = this.f26012e;
        int i3 = this.f26013f;
        int i4 = this.f26014g;
        String str2 = this.f26015h;
        StringBuilder sb = new StringBuilder(str.length() + 230 + str2.length());
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        outline.m1570U(sb, ", totalBytesToDownload=", j3, ", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append(", versionTag=");
        return outline.m1550A(sb, str2, "}");
    }
}
