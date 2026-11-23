package p636z0.p667e.p676b;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p667e.p676b.p677v1.TagBundle;

/* JADX INFO: renamed from: z0.e.b.l0, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_ImmutableImageInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_ImmutableImageInfo extends ImmutableImageInfo {

    /* JADX INFO: renamed from: a */
    public final TagBundle f35933a;

    /* JADX INFO: renamed from: b */
    public final long f35934b;

    /* JADX INFO: renamed from: c */
    public final int f35935c;

    public AutoValue_ImmutableImageInfo(TagBundle tagBundle, long j2, int i) {
        Objects.requireNonNull(tagBundle, "Null tagBundle");
        this.f35933a = tagBundle;
        this.f35934b = j2;
        this.f35935c = i;
    }

    @Override // p636z0.p667e.p676b.ImmutableImageInfo, p636z0.p667e.p676b.ImageInfo
    /* JADX INFO: renamed from: a */
    public TagBundle mo15259a() {
        return this.f35933a;
    }

    @Override // p636z0.p667e.p676b.ImmutableImageInfo, p636z0.p667e.p676b.ImageInfo
    /* JADX INFO: renamed from: b */
    public long mo15260b() {
        return this.f35934b;
    }

    @Override // p636z0.p667e.p676b.ImmutableImageInfo
    /* JADX INFO: renamed from: c */
    public int mo15265c() {
        return this.f35935c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableImageInfo)) {
            return false;
        }
        ImmutableImageInfo immutableImageInfo = (ImmutableImageInfo) obj;
        return this.f35933a.equals(immutableImageInfo.mo15259a()) && this.f35934b == immutableImageInfo.mo15260b() && this.f35935c == immutableImageInfo.mo15265c();
    }

    public int hashCode() {
        int iHashCode = (this.f35933a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f35934b;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f35935c;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ImmutableImageInfo{tagBundle=");
        sbM1556G.append(this.f35933a);
        sbM1556G.append(", timestamp=");
        sbM1556G.append(this.f35934b);
        sbM1556G.append(", rotationDegrees=");
        return outline.m1603y(sbM1556G, this.f35935c, "}");
    }
}
