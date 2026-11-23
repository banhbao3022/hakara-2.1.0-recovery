package p636z0.p667e.p676b.p677v1;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.e.b.v1.m, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CameraThreadConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CameraThreadConfig extends CameraThreadConfig {

    /* JADX INFO: renamed from: a */
    public final Executor f36207a;

    /* JADX INFO: renamed from: b */
    public final Handler f36208b;

    public AutoValue_CameraThreadConfig(Executor executor, Handler handler) {
        Objects.requireNonNull(executor, "Null cameraExecutor");
        this.f36207a = executor;
        Objects.requireNonNull(handler, "Null schedulerHandler");
        this.f36208b = handler;
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraThreadConfig
    /* JADX INFO: renamed from: a */
    public Executor mo15351a() {
        return this.f36207a;
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraThreadConfig
    /* JADX INFO: renamed from: b */
    public Handler mo15352b() {
        return this.f36208b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraThreadConfig)) {
            return false;
        }
        CameraThreadConfig cameraThreadConfig = (CameraThreadConfig) obj;
        return this.f36207a.equals(cameraThreadConfig.mo15351a()) && this.f36208b.equals(cameraThreadConfig.mo15352b());
    }

    public int hashCode() {
        return ((this.f36207a.hashCode() ^ 1000003) * 1000003) ^ this.f36208b.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("CameraThreadConfig{cameraExecutor=");
        sbM1556G.append(this.f36207a);
        sbM1556G.append(", schedulerHandler=");
        sbM1556G.append(this.f36208b);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
