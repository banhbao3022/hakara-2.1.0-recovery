package p007c.p190n.p194b.p209b.p221s1.p229l0;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;

/* JADX INFO: renamed from: c.n.b.b.s1.l0.h, reason: use source file name */
/* JADX INFO: compiled from: OpusReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class OpusReader extends StreamReader {

    /* JADX INFO: renamed from: n */
    public static final byte[] f8056n = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: o */
    public boolean f8057o;

    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.StreamReader
    /* JADX INFO: renamed from: c */
    public long mo3847c(ParsableByteArray parsableByteArray) {
        int i;
        byte[] bArr = parsableByteArray.f6392a;
        int i2 = bArr[0] & 255;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = bArr[1] & 63;
        }
        int i5 = i2 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i = 2500 << i6;
        } else if (i5 >= 12) {
            i = 10000 << (i6 & 1);
        } else {
            i = i6 == 3 ? 60000 : 10000 << i6;
        }
        return m3856a(((long) i4) * ((long) i));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.StreamReader
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: d */
    public boolean mo3848d(ParsableByteArray parsableByteArray, long j2, StreamReader.b bVar) {
        if (this.f8057o) {
            Objects.requireNonNull(bVar.f8071a);
            boolean z = parsableByteArray.m3201f() == 1332770163;
            parsableByteArray.m3194D(0);
            return z;
        }
        byte[] bArrCopyOf = Arrays.copyOf(parsableByteArray.f6392a, parsableByteArray.f6394c);
        int i = bArrCopyOf[9] & 255;
        List<byte[]> listM2389e = C1095a.m2389e(bArrCopyOf);
        Format.b bVar2 = new Format.b();
        bVar2.f6958k = "audio/opus";
        bVar2.f6971x = i;
        bVar2.f6972y = 48000;
        bVar2.f6960m = listM2389e;
        bVar.f8071a = bVar2.m3519a();
        this.f8057o = true;
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.StreamReader
    /* JADX INFO: renamed from: e */
    public void mo3849e(boolean z) {
        super.mo3849e(z);
        if (z) {
            this.f8057o = false;
        }
    }
}
