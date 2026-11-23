package p636z0.p667e.p676b;

import android.view.Surface;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.e.b.m0, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_SurfaceRequest_Result.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_SurfaceRequest_Result extends SurfaceRequest.e {

    /* JADX INFO: renamed from: a */
    public final int f35949a;

    /* JADX INFO: renamed from: b */
    public final Surface f35950b;

    public AutoValue_SurfaceRequest_Result(int i, Surface surface) {
        this.f35949a = i;
        Objects.requireNonNull(surface, "Null surface");
        this.f35950b = surface;
    }

    @Override // p636z0.p667e.p676b.SurfaceRequest.e
    /* JADX INFO: renamed from: a */
    public int mo15286a() {
        return this.f35949a;
    }

    @Override // p636z0.p667e.p676b.SurfaceRequest.e
    /* JADX INFO: renamed from: b */
    public Surface mo15287b() {
        return this.f35950b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.e)) {
            return false;
        }
        SurfaceRequest.e eVar = (SurfaceRequest.e) obj;
        return this.f35949a == eVar.mo15286a() && this.f35950b.equals(eVar.mo15287b());
    }

    public int hashCode() {
        return ((this.f35949a ^ 1000003) * 1000003) ^ this.f35950b.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Result{resultCode=");
        sbM1556G.append(this.f35949a);
        sbM1556G.append(", surface=");
        sbM1556G.append(this.f35950b);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
