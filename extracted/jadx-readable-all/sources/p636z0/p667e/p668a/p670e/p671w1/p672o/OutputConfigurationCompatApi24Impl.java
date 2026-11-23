package p636z0.p667e.p668a.p670e.p671w1.p672o;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.a.e.w1.o.c, reason: use source file name */
/* JADX INFO: compiled from: OutputConfigurationCompatApi24Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class OutputConfigurationCompatApi24Impl extends OutputConfigurationCompatBaseImpl {

    /* JADX INFO: renamed from: z0.e.a.e.w1.o.c$a */
    /* JADX INFO: compiled from: OutputConfigurationCompatApi24Impl.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final OutputConfiguration f35804a;

        public a(OutputConfiguration outputConfiguration) {
            this.f35804a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Objects.equals(this.f35804a, ((a) obj).f35804a) && Objects.equals(null, null);
        }

        public int hashCode() {
            int iHashCode = this.f35804a.hashCode() ^ 31;
            int i = ((iHashCode << 5) - iHashCode) ^ 0;
            return ((i << 5) - i) ^ 0;
        }
    }

    public OutputConfigurationCompatApi24Impl(Surface surface) {
        super(new a(new OutputConfiguration(surface)));
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompat.a
    /* JADX INFO: renamed from: a */
    public Surface mo15222a() {
        return ((OutputConfiguration) mo15224c()).getSurface();
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompat.a
    /* JADX INFO: renamed from: b */
    public String mo15223b() {
        Objects.requireNonNull((a) this.f35806a);
        return null;
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompatBaseImpl, p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompat.a
    /* JADX INFO: renamed from: c */
    public Object mo15224c() {
        C8162a.m16060e(this.f35806a instanceof a);
        return ((a) this.f35806a).f35804a;
    }

    public OutputConfigurationCompatApi24Impl(Object obj) {
        super(obj);
    }
}
