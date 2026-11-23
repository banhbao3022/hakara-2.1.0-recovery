package p636z0.p765v;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX INFO: renamed from: z0.v.d, reason: use source file name */
/* JADX INFO: compiled from: VolumeProviderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class VolumeProviderCompat {

    /* JADX INFO: renamed from: a */
    public final int f38795a;

    /* JADX INFO: renamed from: b */
    public final int f38796b;

    /* JADX INFO: renamed from: c */
    public final String f38797c;

    /* JADX INFO: renamed from: d */
    public int f38798d;

    /* JADX INFO: renamed from: e */
    public c f38799e;

    /* JADX INFO: renamed from: f */
    public VolumeProvider f38800f;

    /* JADX INFO: renamed from: z0.v.d$a */
    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    public class a extends VolumeProvider {
        public a(int i, int i2, int i3, String str) {
            super(i, i2, i3, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            VolumeProviderCompat.this.mo16767b(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            VolumeProviderCompat.this.mo16768c(i);
        }
    }

    /* JADX INFO: renamed from: z0.v.d$b */
    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    public class b extends VolumeProvider {
        public b(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            VolumeProviderCompat.this.mo16767b(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            VolumeProviderCompat.this.mo16768c(i);
        }
    }

    /* JADX INFO: renamed from: z0.v.d$c */
    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract void m16769a(VolumeProviderCompat volumeProviderCompat);
    }

    public VolumeProviderCompat(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    /* JADX INFO: renamed from: a */
    public Object m16766a() {
        if (this.f38800f == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f38800f = new a(this.f38795a, this.f38796b, this.f38798d, this.f38797c);
            } else {
                this.f38800f = new b(this.f38795a, this.f38796b, this.f38798d);
            }
        }
        return this.f38800f;
    }

    /* JADX INFO: renamed from: b */
    public void mo16767b(int i) {
    }

    /* JADX INFO: renamed from: c */
    public void mo16768c(int i) {
    }

    public VolumeProviderCompat(int i, int i2, int i3, String str) {
        this.f38795a = i;
        this.f38796b = i2;
        this.f38798d = i3;
        this.f38797c = str;
    }
}
