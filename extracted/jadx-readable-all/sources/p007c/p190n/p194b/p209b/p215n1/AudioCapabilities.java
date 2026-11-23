package p007c.p190n.p194b.p209b.p215n1;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.b.n1.o, reason: use source file name */
/* JADX INFO: compiled from: AudioCapabilities.java */
/* JADX INFO: loaded from: classes.dex */
public final class AudioCapabilities {

    /* JADX INFO: renamed from: a */
    public static final AudioCapabilities f7105a = new AudioCapabilities(new int[]{2}, 8);

    /* JADX INFO: renamed from: b */
    public static final AudioCapabilities f7106b = new AudioCapabilities(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: c */
    public final int[] f7107c;

    /* JADX INFO: renamed from: d */
    public final int f7108d;

    public AudioCapabilities(int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f7107c = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f7107c = new int[0];
        }
        this.f7108d = i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3559a(int i) {
        return Arrays.binarySearch(this.f7107c, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Arrays.equals(this.f7107c, audioCapabilities.f7107c) && this.f7108d == audioCapabilities.f7108d;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f7107c) * 31) + this.f7108d;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("AudioCapabilities[maxChannelCount=");
        sbM1556G.append(this.f7108d);
        sbM1556G.append(", supportedEncodings=");
        sbM1556G.append(Arrays.toString(this.f7107c));
        sbM1556G.append("]");
        return sbM1556G.toString();
    }
}
