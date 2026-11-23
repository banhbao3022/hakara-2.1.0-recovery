package androidx.media;

import android.os.Build;
import android.util.SparseIntArray;
import p636z0.p692g0.VersionedParcelable;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements VersionedParcelable {

    /* JADX INFO: renamed from: a */
    public static final SparseIntArray f799a;

    /* JADX INFO: renamed from: b */
    public AudioAttributesImpl f800b;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f799a = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f800b;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f800b == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f800b);
    }

    public int hashCode() {
        return this.f800b.hashCode();
    }

    public String toString() {
        return this.f800b.toString();
    }

    /* JADX INFO: renamed from: androidx.media.AudioAttributesCompat$a */
    public static class C0127a {

        /* JADX INFO: renamed from: a */
        public final AudioAttributesImpl.InterfaceC0128a f801a;

        public C0127a() {
            SparseIntArray sparseIntArray = AudioAttributesCompat.f799a;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f801a = new AudioAttributesImplApi26.C0130a();
            } else {
                this.f801a = new AudioAttributesImplApi21.C0129a();
            }
        }

        public C0127a(AudioAttributesCompat audioAttributesCompat) {
            SparseIntArray sparseIntArray = AudioAttributesCompat.f799a;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f801a = new AudioAttributesImplApi26.C0130a(audioAttributesCompat.f800b.mo440a());
            } else {
                this.f801a = new AudioAttributesImplApi21.C0129a(audioAttributesCompat.f800b.mo440a());
            }
        }
    }
}
