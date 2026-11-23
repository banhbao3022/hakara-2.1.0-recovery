package p636z0.p667e.p668a.p670e.p671w1.p672o;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;

/* JADX INFO: renamed from: z0.e.a.e.w1.o.b, reason: use source file name */
/* JADX INFO: compiled from: OutputConfigurationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class OutputConfigurationCompat {

    /* JADX INFO: renamed from: a */
    public final a f35803a;

    /* JADX INFO: renamed from: z0.e.a.e.w1.o.b$a */
    /* JADX INFO: compiled from: OutputConfigurationCompat.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        Surface mo15222a();

        /* JADX INFO: renamed from: b */
        String mo15223b();

        /* JADX INFO: renamed from: c */
        Object mo15224c();
    }

    public OutputConfigurationCompat(Surface surface) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f35803a = new OutputConfigurationCompatApi28Impl(surface);
            return;
        }
        if (i >= 26) {
            this.f35803a = new OutputConfigurationCompatApi26Impl(surface);
        } else if (i >= 24) {
            this.f35803a = new OutputConfigurationCompatApi24Impl(surface);
        } else {
            this.f35803a = new OutputConfigurationCompatBaseImpl(surface);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof OutputConfigurationCompat) {
            return this.f35803a.equals(((OutputConfigurationCompat) obj).f35803a);
        }
        return false;
    }

    public int hashCode() {
        return this.f35803a.hashCode();
    }

    public <T> OutputConfigurationCompat(Size size, Class<T> cls) {
        OutputConfiguration outputConfiguration = new OutputConfiguration(size, cls);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f35803a = new OutputConfigurationCompatApi28Impl(outputConfiguration);
        } else {
            this.f35803a = new OutputConfigurationCompatApi26Impl(new OutputConfigurationCompatApi26Impl.a(outputConfiguration));
        }
    }

    public OutputConfigurationCompat(a aVar) {
        this.f35803a = aVar;
    }
}
