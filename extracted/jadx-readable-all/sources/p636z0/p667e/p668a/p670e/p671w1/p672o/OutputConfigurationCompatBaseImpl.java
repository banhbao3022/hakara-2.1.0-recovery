package p636z0.p667e.p668a.p670e.p671w1.p672o;

import android.os.Build;
import android.util.Size;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p636z0.p667e.p676b.Logger8;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.a.e.w1.o.f, reason: use source file name */
/* JADX INFO: compiled from: OutputConfigurationCompatBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class OutputConfigurationCompatBaseImpl implements OutputConfigurationCompat.a {

    /* JADX INFO: renamed from: a */
    public final Object f35806a;

    /* JADX INFO: renamed from: z0.e.a.e.w1.o.f$a */
    /* JADX INFO: compiled from: OutputConfigurationCompatBaseImpl.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<Surface> f35807a;

        /* JADX INFO: renamed from: b */
        public final Size f35808b;

        /* JADX INFO: renamed from: c */
        public final int f35809c;

        /* JADX INFO: renamed from: d */
        public final int f35810d;

        public a(Surface surface) {
            Size size;
            int iIntValue;
            int iIntValue2;
            C8162a.m16063h(surface, "Surface must not be null");
            this.f35807a = Collections.singletonList(surface);
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
                declaredMethod.setAccessible(true);
                size = (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Logger8.m15273b("OutputConfigCompat", "Unable to retrieve surface size.", e);
                size = null;
            }
            this.f35808b = size;
            try {
                Method declaredMethod2 = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class);
                if (Build.VERSION.SDK_INT < 22) {
                    declaredMethod2.setAccessible(true);
                }
                iIntValue = ((Integer) declaredMethod2.invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                Logger8.m15273b("OutputConfigCompat", "Unable to retrieve surface format.", e2);
                iIntValue = 0;
            }
            this.f35809c = iIntValue;
            try {
                iIntValue2 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                Logger8.m15273b("OutputConfigCompat", "Unable to retrieve surface generation id.", e3);
                iIntValue2 = -1;
            }
            this.f35810d = iIntValue2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f35808b.equals(aVar.f35808b) || this.f35809c != aVar.f35809c || this.f35810d != aVar.f35810d || !Objects.equals(null, null)) {
                return false;
            }
            int iMin = Math.min(this.f35807a.size(), aVar.f35807a.size());
            for (int i = 0; i < iMin; i++) {
                if (this.f35807a.get(i) != aVar.f35807a.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int iHashCode = this.f35807a.hashCode() ^ 31;
            int i = this.f35810d ^ ((iHashCode << 5) - iHashCode);
            int iHashCode2 = this.f35808b.hashCode() ^ ((i << 5) - i);
            int i2 = this.f35809c ^ ((iHashCode2 << 5) - iHashCode2);
            int i3 = ((i2 << 5) - i2) ^ 0;
            return ((i3 << 5) - i3) ^ 0;
        }
    }

    public OutputConfigurationCompatBaseImpl(Surface surface) {
        this.f35806a = new a(surface);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompat.a
    /* JADX INFO: renamed from: a */
    public Surface mo15222a() {
        List<Surface> list = ((a) this.f35806a).f35807a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompat.a
    /* JADX INFO: renamed from: b */
    public String mo15223b() {
        Objects.requireNonNull((a) this.f35806a);
        return null;
    }

    @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.OutputConfigurationCompat.a
    /* JADX INFO: renamed from: c */
    public Object mo15224c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof OutputConfigurationCompatBaseImpl) {
            return Objects.equals(this.f35806a, ((OutputConfigurationCompatBaseImpl) obj).f35806a);
        }
        return false;
    }

    public int hashCode() {
        return this.f35806a.hashCode();
    }

    public OutputConfigurationCompatBaseImpl(Object obj) {
        this.f35806a = obj;
    }
}
