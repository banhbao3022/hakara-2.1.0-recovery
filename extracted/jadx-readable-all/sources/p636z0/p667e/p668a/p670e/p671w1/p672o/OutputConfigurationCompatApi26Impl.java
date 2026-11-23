package p636z0.p667e.p668a.p670e.p671w1.p672o;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.a.e.w1.o.d, reason: use source file name */
/* JADX INFO: compiled from: OutputConfigurationCompatApi26Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class OutputConfigurationCompatApi26Impl extends OutputConfigurationCompatApi24Impl {

    /* JADX INFO: renamed from: z0.e.a.e.w1.o.d$a */
    /* JADX INFO: compiled from: OutputConfigurationCompatApi26Impl.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final OutputConfiguration f35805a;

        public a(OutputConfiguration outputConfiguration) {
            this.f35805a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Objects.equals(this.f35805a, ((a) obj).f35805a) && Objects.equals(null, null);
        }

        public int hashCode() {
            int iHashCode = this.f35805a.hashCode() ^ 31;
            return ((iHashCode << 5) - iHashCode) ^ 0;
        }
    }

    public OutputConfigurationCompatApi26Impl(Surface surface) {
        super(new a(new OutputConfiguration(surface)));
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompatApi24Impl, p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompat.a
    /* JADX INFO: renamed from: b */
    public String mo15223b() {
        Objects.requireNonNull((a) this.f35806a);
        return null;
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompatApi24Impl, p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompat.a
    /* JADX INFO: renamed from: c */
    public Object mo15224c() {
        C8162a.m16060e(this.f35806a instanceof a);
        return ((a) this.f35806a).f35805a;
    }

    public OutputConfigurationCompatApi26Impl(Object obj) {
        super(obj);
    }
}
