package p636z0.p667e.p668a.p670e.p671w1.p672o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.e.a.e.w1.o.g, reason: use source file name */
/* JADX INFO: compiled from: SessionConfigurationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class SessionConfigurationCompat {

    /* JADX INFO: renamed from: a */
    public final c f35811a;

    /* JADX INFO: renamed from: z0.e.a.e.w1.o.g$a */
    /* JADX INFO: compiled from: SessionConfigurationCompat.java */
    public static final class a implements c {

        /* JADX INFO: renamed from: a */
        public final SessionConfiguration f35812a;

        /* JADX INFO: renamed from: b */
        public final List<OutputConfigurationCompat> f35813b;

        public a(int i, List<OutputConfigurationCompat> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            SessionConfiguration sessionConfiguration = new SessionConfiguration(i, SessionConfigurationCompat.m15225f(list), executor, stateCallback);
            this.f35812a = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList = new ArrayList(outputConfigurations.size());
            for (OutputConfiguration outputConfiguration : outputConfigurations) {
                OutputConfigurationCompat outputConfigurationCompat = null;
                if (outputConfiguration != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    OutputConfigurationCompat.a outputConfigurationCompatApi28Impl = i2 >= 28 ? new OutputConfigurationCompatApi28Impl(outputConfiguration) : i2 >= 26 ? new OutputConfigurationCompatApi26Impl(new OutputConfigurationCompatApi26Impl.a(outputConfiguration)) : i2 >= 24 ? new OutputConfigurationCompatApi24Impl(new OutputConfigurationCompatApi24Impl.a(outputConfiguration)) : null;
                    if (outputConfigurationCompatApi28Impl != null) {
                        outputConfigurationCompat = new OutputConfigurationCompat(outputConfigurationCompatApi28Impl);
                    }
                }
                arrayList.add(outputConfigurationCompat);
            }
            this.f35813b = Collections.unmodifiableList(arrayList);
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: a */
        public InputConfigurationCompat mo15231a() {
            InputConfiguration inputConfiguration = this.f35812a.getInputConfiguration();
            if (inputConfiguration != null && Build.VERSION.SDK_INT >= 23) {
                return new InputConfigurationCompat(new InputConfigurationCompat.a(inputConfiguration));
            }
            return null;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: b */
        public CameraCaptureSession.StateCallback mo15232b() {
            return this.f35812a.getStateCallback();
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: c */
        public Object mo15233c() {
            return this.f35812a;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: d */
        public Executor mo15234d() {
            return this.f35812a.getExecutor();
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: e */
        public int mo15235e() {
            return this.f35812a.getSessionType();
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f35812a, ((a) obj).f35812a);
            }
            return false;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: f */
        public List<OutputConfigurationCompat> mo15236f() {
            return this.f35813b;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: g */
        public void mo15237g(CaptureRequest captureRequest) {
            this.f35812a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f35812a.hashCode();
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.w1.o.g$b */
    /* JADX INFO: compiled from: SessionConfigurationCompat.java */
    public static final class b implements c {

        /* JADX INFO: renamed from: a */
        public final List<OutputConfigurationCompat> f35814a;

        /* JADX INFO: renamed from: b */
        public final CameraCaptureSession.StateCallback f35815b;

        /* JADX INFO: renamed from: c */
        public final Executor f35816c;

        /* JADX INFO: renamed from: d */
        public int f35817d;

        public b(int i, List<OutputConfigurationCompat> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f35817d = i;
            this.f35814a = Collections.unmodifiableList(new ArrayList(list));
            this.f35815b = stateCallback;
            this.f35816c = executor;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: a */
        public InputConfigurationCompat mo15231a() {
            return null;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: b */
        public CameraCaptureSession.StateCallback mo15232b() {
            return this.f35815b;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: c */
        public Object mo15233c() {
            return null;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: d */
        public Executor mo15234d() {
            return this.f35816c;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: e */
        public int mo15235e() {
            return this.f35817d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                Objects.requireNonNull(bVar);
                if (Objects.equals(null, null) && this.f35817d == bVar.f35817d && this.f35814a.size() == bVar.f35814a.size()) {
                    for (int i = 0; i < this.f35814a.size(); i++) {
                        if (!this.f35814a.get(i).equals(bVar.f35814a.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: f */
        public List<OutputConfigurationCompat> mo15236f() {
            return this.f35814a;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.SessionConfigurationCompat.c
        /* JADX INFO: renamed from: g */
        public void mo15237g(CaptureRequest captureRequest) {
        }

        public int hashCode() {
            int iHashCode = this.f35814a.hashCode() ^ 31;
            int i = ((iHashCode << 5) - iHashCode) ^ 0;
            return this.f35817d ^ ((i << 5) - i);
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.w1.o.g$c */
    /* JADX INFO: compiled from: SessionConfigurationCompat.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        InputConfigurationCompat mo15231a();

        /* JADX INFO: renamed from: b */
        CameraCaptureSession.StateCallback mo15232b();

        /* JADX INFO: renamed from: c */
        Object mo15233c();

        /* JADX INFO: renamed from: d */
        Executor mo15234d();

        /* JADX INFO: renamed from: e */
        int mo15235e();

        /* JADX INFO: renamed from: f */
        List<OutputConfigurationCompat> mo15236f();

        /* JADX INFO: renamed from: g */
        void mo15237g(CaptureRequest captureRequest);
    }

    public SessionConfigurationCompat(int i, List<OutputConfigurationCompat> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f35811a = new b(i, list, executor, stateCallback);
        } else {
            this.f35811a = new a(i, list, executor, stateCallback);
        }
    }

    /* JADX INFO: renamed from: f */
    public static List<OutputConfiguration> m15225f(List<OutputConfigurationCompat> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OutputConfigurationCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) it.next().f35803a.mo15224c());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public Executor m15226a() {
        return this.f35811a.mo15234d();
    }

    /* JADX INFO: renamed from: b */
    public InputConfigurationCompat m15227b() {
        return this.f35811a.mo15231a();
    }

    /* JADX INFO: renamed from: c */
    public List<OutputConfigurationCompat> m15228c() {
        return this.f35811a.mo15236f();
    }

    /* JADX INFO: renamed from: d */
    public int m15229d() {
        return this.f35811a.mo15235e();
    }

    /* JADX INFO: renamed from: e */
    public CameraCaptureSession.StateCallback m15230e() {
        return this.f35811a.mo15232b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof SessionConfigurationCompat) {
            return this.f35811a.equals(((SessionConfigurationCompat) obj).f35811a);
        }
        return false;
    }

    public int hashCode() {
        return this.f35811a.hashCode();
    }
}
