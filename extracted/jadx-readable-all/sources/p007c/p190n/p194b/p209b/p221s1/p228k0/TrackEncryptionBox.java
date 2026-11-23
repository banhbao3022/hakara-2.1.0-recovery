package p007c.p190n.p194b.p209b.p221s1.p228k0;

import android.util.Log;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.k0.n, reason: use source file name */
/* JADX INFO: compiled from: TrackEncryptionBox.java */
/* JADX INFO: loaded from: classes.dex */
public final class TrackEncryptionBox {

    /* JADX INFO: renamed from: a */
    public final boolean f7989a;

    /* JADX INFO: renamed from: b */
    public final String f7990b;

    /* JADX INFO: renamed from: c */
    public final TrackOutput2.a f7991c;

    /* JADX INFO: renamed from: d */
    public final int f7992d;

    /* JADX INFO: renamed from: e */
    public final byte[] f7993e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    public TrackEncryptionBox(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        byte b = 0;
        int i4 = 1;
        C2096e.m4566b((i == 0) ^ (bArr2 == null));
        this.f7989a = z;
        this.f7990b = str;
        this.f7992d = i;
        this.f7993e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b = -1;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    Log.w("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f7991c = new TrackOutput2.a(i4, bArr, i2, i3);
    }
}
