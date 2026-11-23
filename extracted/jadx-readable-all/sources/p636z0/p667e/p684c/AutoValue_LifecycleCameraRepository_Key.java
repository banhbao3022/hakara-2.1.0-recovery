package p636z0.p667e.p684c;

import androidx.camera.lifecycle.LifecycleCameraRepository;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p667e.p676b.p681w1.CameraUseCaseAdapter;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: renamed from: z0.e.c.b, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_LifecycleCameraRepository_Key.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_LifecycleCameraRepository_Key extends LifecycleCameraRepository.AbstractC0092a {

    /* JADX INFO: renamed from: a */
    public final LifecycleOwner f36370a;

    /* JADX INFO: renamed from: b */
    public final CameraUseCaseAdapter.b f36371b;

    public AutoValue_LifecycleCameraRepository_Key(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.b bVar) {
        Objects.requireNonNull(lifecycleOwner, "Null lifecycleOwner");
        this.f36370a = lifecycleOwner;
        Objects.requireNonNull(bVar, "Null cameraId");
        this.f36371b = bVar;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.AbstractC0092a
    /* JADX INFO: renamed from: a */
    public CameraUseCaseAdapter.b mo268a() {
        return this.f36371b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.AbstractC0092a
    /* JADX INFO: renamed from: b */
    public LifecycleOwner mo269b() {
        return this.f36370a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.AbstractC0092a)) {
            return false;
        }
        LifecycleCameraRepository.AbstractC0092a abstractC0092a = (LifecycleCameraRepository.AbstractC0092a) obj;
        return this.f36370a.equals(abstractC0092a.mo269b()) && this.f36371b.equals(abstractC0092a.mo268a());
    }

    public int hashCode() {
        return ((this.f36370a.hashCode() ^ 1000003) * 1000003) ^ this.f36371b.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Key{lifecycleOwner=");
        sbM1556G.append(this.f36370a);
        sbM1556G.append(", cameraId=");
        sbM1556G.append(this.f36371b);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
