package p636z0.p667e.p676b.p677v1;

import android.util.Size;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.e.b.v1.p, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_SurfaceSizeDefinition.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_SurfaceSizeDefinition extends SurfaceSizeDefinition {

    /* JADX INFO: renamed from: a */
    public final Size f36228a;

    /* JADX INFO: renamed from: b */
    public final Size f36229b;

    /* JADX INFO: renamed from: c */
    public final Size f36230c;

    public AutoValue_SurfaceSizeDefinition(Size size, Size size2, Size size3) {
        Objects.requireNonNull(size, "Null analysisSize");
        this.f36228a = size;
        Objects.requireNonNull(size2, "Null previewSize");
        this.f36229b = size2;
        Objects.requireNonNull(size3, "Null recordSize");
        this.f36230c = size3;
    }

    @Override // p636z0.p667e.p676b.p677v1.SurfaceSizeDefinition
    /* JADX INFO: renamed from: a */
    public Size mo15394a() {
        return this.f36228a;
    }

    @Override // p636z0.p667e.p676b.p677v1.SurfaceSizeDefinition
    /* JADX INFO: renamed from: b */
    public Size mo15395b() {
        return this.f36229b;
    }

    @Override // p636z0.p667e.p676b.p677v1.SurfaceSizeDefinition
    /* JADX INFO: renamed from: c */
    public Size mo15396c() {
        return this.f36230c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceSizeDefinition)) {
            return false;
        }
        SurfaceSizeDefinition surfaceSizeDefinition = (SurfaceSizeDefinition) obj;
        return this.f36228a.equals(surfaceSizeDefinition.mo15394a()) && this.f36229b.equals(surfaceSizeDefinition.mo15395b()) && this.f36230c.equals(surfaceSizeDefinition.mo15396c());
    }

    public int hashCode() {
        return ((((this.f36228a.hashCode() ^ 1000003) * 1000003) ^ this.f36229b.hashCode()) * 1000003) ^ this.f36230c.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("SurfaceSizeDefinition{analysisSize=");
        sbM1556G.append(this.f36228a);
        sbM1556G.append(", previewSize=");
        sbM1556G.append(this.f36229b);
        sbM1556G.append(", recordSize=");
        sbM1556G.append(this.f36230c);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
