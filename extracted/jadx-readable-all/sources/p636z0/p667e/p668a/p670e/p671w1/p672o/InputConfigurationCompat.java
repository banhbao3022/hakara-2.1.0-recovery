package p636z0.p667e.p668a.p670e.p671w1.p672o;

import android.annotation.SuppressLint;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: renamed from: z0.e.a.e.w1.o.a, reason: use source file name */
/* JADX INFO: compiled from: InputConfigurationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class InputConfigurationCompat {

    /* JADX INFO: renamed from: a */
    public final c f35798a;

    /* JADX INFO: renamed from: z0.e.a.e.w1.o.a$b */
    /* JADX INFO: compiled from: InputConfigurationCompat.java */
    public static final class b implements c {

        /* JADX INFO: renamed from: a */
        public final int f35800a;

        /* JADX INFO: renamed from: b */
        public final int f35801b;

        /* JADX INFO: renamed from: c */
        public final int f35802c;

        public b(int i, int i2, int i3) {
            this.f35800a = i;
            this.f35801b = i2;
            this.f35802c = i3;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.InputConfigurationCompat.c
        /* JADX INFO: renamed from: a */
        public Object mo15221a() {
            return null;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f35800a == this.f35800a && bVar.f35801b == this.f35801b && bVar.f35802c == this.f35802c;
        }

        public int hashCode() {
            int i = this.f35800a ^ 31;
            int i2 = this.f35801b ^ ((i << 5) - i);
            return this.f35802c ^ ((i2 << 5) - i2);
        }

        @SuppressLint({"DefaultLocale"})
        public String toString() {
            return String.format("InputConfiguration(w:%d, h:%d, format:%d)", Integer.valueOf(this.f35800a), Integer.valueOf(this.f35801b), Integer.valueOf(this.f35802c));
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.w1.o.a$c */
    /* JADX INFO: compiled from: InputConfigurationCompat.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        Object mo15221a();
    }

    public InputConfigurationCompat(int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f35798a = new a(i, i2, i3);
        } else {
            this.f35798a = new b(i, i2, i3);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof InputConfigurationCompat) {
            return this.f35798a.equals(((InputConfigurationCompat) obj).f35798a);
        }
        return false;
    }

    public int hashCode() {
        return this.f35798a.hashCode();
    }

    public String toString() {
        return this.f35798a.toString();
    }

    /* JADX INFO: renamed from: z0.e.a.e.w1.o.a$a */
    /* JADX INFO: compiled from: InputConfigurationCompat.java */
    public static final class a implements c {

        /* JADX INFO: renamed from: a */
        public final InputConfiguration f35799a;

        public a(Object obj) {
            this.f35799a = (InputConfiguration) obj;
        }

        @Override // p636z0.p667e.p668a.p670e.p671w1.p672o.InputConfigurationCompat.c
        /* JADX INFO: renamed from: a */
        public Object mo15221a() {
            return this.f35799a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f35799a, ((c) obj).mo15221a());
            }
            return false;
        }

        public int hashCode() {
            return this.f35799a.hashCode();
        }

        public String toString() {
            return this.f35799a.toString();
        }

        public a(int i, int i2, int i3) {
            this.f35799a = new InputConfiguration(i, i2, i3);
        }
    }

    public InputConfigurationCompat(c cVar) {
        this.f35798a = cVar;
    }
}
