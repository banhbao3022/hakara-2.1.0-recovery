package p007c.p190n.p194b.p209b.p221s1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.p237k.PictureFrame;
import p007c.p190n.p194b.p209b.p234u1.p237k.VorbisComment;

/* JADX INFO: renamed from: c.n.b.b.s1.p, reason: use source file name */
/* JADX INFO: compiled from: FlacStreamMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public final class FlacStreamMetadata {

    /* JADX INFO: renamed from: a */
    public final int f8496a;

    /* JADX INFO: renamed from: b */
    public final int f8497b;

    /* JADX INFO: renamed from: c */
    public final int f8498c;

    /* JADX INFO: renamed from: d */
    public final int f8499d;

    /* JADX INFO: renamed from: e */
    public final int f8500e;

    /* JADX INFO: renamed from: f */
    public final int f8501f;

    /* JADX INFO: renamed from: g */
    public final int f8502g;

    /* JADX INFO: renamed from: h */
    public final int f8503h;

    /* JADX INFO: renamed from: i */
    public final int f8504i;

    /* JADX INFO: renamed from: j */
    public final long f8505j;

    /* JADX INFO: renamed from: k */
    public final a f8506k;

    /* JADX INFO: renamed from: l */
    public final Metadata f8507l;

    /* JADX INFO: renamed from: c.n.b.b.s1.p$a */
    /* JADX INFO: compiled from: FlacStreamMetadata.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final long[] f8508a;

        /* JADX INFO: renamed from: b */
        public final long[] f8509b;

        public a(long[] jArr, long[] jArr2) {
            this.f8508a = jArr;
            this.f8509b = jArr2;
        }
    }

    public FlacStreamMetadata(byte[] bArr, int i) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.m3187k(i * 8);
        this.f8496a = parsableBitArray.m3183g(16);
        this.f8497b = parsableBitArray.m3183g(16);
        this.f8498c = parsableBitArray.m3183g(24);
        this.f8499d = parsableBitArray.m3183g(24);
        int iM3183g = parsableBitArray.m3183g(20);
        this.f8500e = iM3183g;
        this.f8501f = m3917h(iM3183g);
        this.f8502g = parsableBitArray.m3183g(3) + 1;
        int iM3183g2 = parsableBitArray.m3183g(5) + 1;
        this.f8503h = iM3183g2;
        this.f8504i = m3916c(iM3183g2);
        this.f8505j = (Util6.m3112U(parsableBitArray.m3183g(4)) << 32) | Util6.m3112U(parsableBitArray.m3183g(32));
        this.f8506k = null;
        this.f8507l = null;
    }

    /* JADX INFO: renamed from: a */
    public static Metadata m3915a(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArrM3107P = Util6.m3107P(str, "=");
            if (strArrM3107P.length != 2) {
                outline.m1567R("Failed to parse Vorbis comment: ", str, "FlacStreamMetadata");
            } else {
                arrayList.add(new VorbisComment(strArrM3107P[0], strArrM3107P[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static int m3916c(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* JADX INFO: renamed from: h */
    public static int m3917h(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public FlacStreamMetadata m3918b(a aVar) {
        return new FlacStreamMetadata(this.f8496a, this.f8497b, this.f8498c, this.f8499d, this.f8500e, this.f8502g, this.f8503h, this.f8505j, aVar, this.f8507l);
    }

    /* JADX INFO: renamed from: d */
    public long m3919d() {
        long j2 = this.f8505j;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / ((long) this.f8500e);
    }

    /* JADX INFO: renamed from: e */
    public Format m3920e(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i = this.f8499d;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.f8507l;
        if (metadata2 != null) {
            metadata = metadata2.m4009b(metadata);
        }
        Format.b bVar = new Format.b();
        bVar.f6958k = "audio/flac";
        bVar.f6959l = i;
        bVar.f6971x = this.f8502g;
        bVar.f6972y = this.f8500e;
        bVar.f6960m = Collections.singletonList(bArr);
        bVar.f6956i = metadata;
        return bVar.m3519a();
    }

    /* JADX INFO: renamed from: f */
    public Metadata m3921f(Metadata metadata) {
        Metadata metadata2 = this.f8507l;
        return metadata2 == null ? metadata : metadata2.m4009b(metadata);
    }

    /* JADX INFO: renamed from: g */
    public long m3922g(long j2) {
        return Util6.m3122j((j2 * ((long) this.f8500e)) / 1000000, 0L, this.f8505j - 1);
    }

    public FlacStreamMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j2, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        this(i, i2, i3, i4, i5, i6, i7, j2, (a) null, m3915a(arrayList, arrayList2));
    }

    public FlacStreamMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j2, a aVar, Metadata metadata) {
        this.f8496a = i;
        this.f8497b = i2;
        this.f8498c = i3;
        this.f8499d = i4;
        this.f8500e = i5;
        this.f8501f = m3917h(i5);
        this.f8502g = i6;
        this.f8503h = i7;
        this.f8504i = m3916c(i7);
        this.f8505j = j2;
        this.f8506k = aVar;
        this.f8507l = metadata;
    }
}
