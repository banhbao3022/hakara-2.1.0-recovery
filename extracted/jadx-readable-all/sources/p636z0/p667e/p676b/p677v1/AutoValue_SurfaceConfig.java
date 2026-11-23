package p636z0.p667e.p676b.p677v1;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.e.b.v1.o, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_SurfaceConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_SurfaceConfig extends SurfaceConfig {

    /* JADX INFO: renamed from: a */
    public final SurfaceConfig.b f36226a;

    /* JADX INFO: renamed from: b */
    public final SurfaceConfig.a f36227b;

    public AutoValue_SurfaceConfig(SurfaceConfig.b bVar, SurfaceConfig.a aVar) {
        Objects.requireNonNull(bVar, "Null configType");
        this.f36226a = bVar;
        Objects.requireNonNull(aVar, "Null configSize");
        this.f36227b = aVar;
    }

    @Override // p636z0.p667e.p676b.p677v1.SurfaceConfig
    /* JADX INFO: renamed from: a */
    public SurfaceConfig.a mo15386a() {
        return this.f36227b;
    }

    @Override // p636z0.p667e.p676b.p677v1.SurfaceConfig
    /* JADX INFO: renamed from: b */
    public SurfaceConfig.b mo15387b() {
        return this.f36226a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        return this.f36226a.equals(surfaceConfig.mo15387b()) && this.f36227b.equals(surfaceConfig.mo15386a());
    }

    public int hashCode() {
        return ((this.f36226a.hashCode() ^ 1000003) * 1000003) ^ this.f36227b.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("SurfaceConfig{configType=");
        sbM1556G.append(this.f36226a);
        sbM1556G.append(", configSize=");
        sbM1556G.append(this.f36227b);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
