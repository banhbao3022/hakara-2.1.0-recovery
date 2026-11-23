package p007c.p190n.p194b.p209b.p234u1.p241o;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.MetadataInputBuffer;
import p007c.p190n.p194b.p209b.p234u1.SimpleMetadataDecoder;

/* JADX INFO: renamed from: c.n.b.b.u1.o.c, reason: use source file name */
/* JADX INFO: compiled from: SpliceInfoDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class SpliceInfoDecoder extends SimpleMetadataDecoder {

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f8772a = new ParsableByteArray();

    /* JADX INFO: renamed from: b */
    public final ParsableBitArray f8773b = new ParsableBitArray();

    /* JADX INFO: renamed from: c */
    public TimestampAdjuster f8774c;

    @Override // p007c.p190n.p194b.p209b.p234u1.SimpleMetadataDecoder
    /* JADX INFO: renamed from: b */
    public Metadata mo4018b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        int i;
        long j2;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        long j3;
        boolean z3;
        long j4;
        int iM3219x;
        int iM3214s;
        int iM3214s2;
        boolean z4;
        long jM3215t;
        List list;
        long j5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        long j6;
        int i2;
        int i3;
        int iM3214s3;
        boolean z9;
        long jM3215t2;
        TimestampAdjuster timestampAdjuster = this.f8774c;
        if (timestampAdjuster == null || metadataInputBuffer.f8663n != timestampAdjuster.m3087d()) {
            TimestampAdjuster timestampAdjuster2 = new TimestampAdjuster(metadataInputBuffer.f7289j);
            this.f8774c = timestampAdjuster2;
            timestampAdjuster2.m3084a(metadataInputBuffer.f7289j - metadataInputBuffer.f8663n);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f8772a.m3192B(bArrArray, iLimit);
        this.f8773b.m3186j(bArrArray, iLimit);
        this.f8773b.m3189m(39);
        long jM3183g = (((long) this.f8773b.m3183g(1)) << 32) | ((long) this.f8773b.m3183g(32));
        this.f8773b.m3189m(20);
        int iM3183g = this.f8773b.m3183g(12);
        int iM3183g2 = this.f8773b.m3183g(8);
        this.f8772a.m3195E(14);
        Metadata.b spliceNullCommand = null;
        if (iM3183g2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iM3183g2 != 255) {
            long j7 = 128;
            if (iM3183g2 == 4) {
                ParsableByteArray parsableByteArray = this.f8772a;
                int iM3214s4 = parsableByteArray.m3214s();
                ArrayList arrayList2 = new ArrayList(iM3214s4);
                int i4 = 0;
                while (i4 < iM3214s4) {
                    long jM3215t3 = parsableByteArray.m3215t();
                    boolean z10 = (parsableByteArray.m3214s() & 128) != 0;
                    ArrayList arrayList3 = new ArrayList();
                    if (z10) {
                        i = iM3214s4;
                        j2 = j7;
                        arrayList = arrayList3;
                        z = false;
                        z2 = false;
                        j3 = -9223372036854775807L;
                        z3 = false;
                        j4 = -9223372036854775807L;
                        iM3219x = 0;
                        iM3214s = 0;
                        iM3214s2 = 0;
                    } else {
                        int iM3214s5 = parsableByteArray.m3214s();
                        boolean z11 = (iM3214s5 & 128) != 0;
                        boolean z12 = (iM3214s5 & 64) != 0;
                        boolean z13 = (iM3214s5 & 32) != 0;
                        long jM3215t4 = z12 ? parsableByteArray.m3215t() : -9223372036854775807L;
                        if (z12) {
                            i = iM3214s4;
                        } else {
                            int iM3214s6 = parsableByteArray.m3214s();
                            ArrayList arrayList4 = new ArrayList(iM3214s6);
                            int i5 = 0;
                            while (i5 < iM3214s6) {
                                arrayList4.add(new SpliceScheduleCommand.b(parsableByteArray.m3214s(), parsableByteArray.m3215t(), null));
                                i5++;
                                iM3214s6 = iM3214s6;
                                iM3214s4 = iM3214s4;
                            }
                            i = iM3214s4;
                            arrayList3 = arrayList4;
                        }
                        if (z13) {
                            long jM3214s = parsableByteArray.m3214s();
                            j2 = 128;
                            z4 = (jM3214s & 128) != 0;
                            jM3215t = ((((jM3214s & 1) << 32) | parsableByteArray.m3215t()) * 1000) / 90;
                        } else {
                            j2 = 128;
                            z4 = false;
                            jM3215t = -9223372036854775807L;
                        }
                        z3 = z4;
                        j4 = jM3215t;
                        arrayList = arrayList3;
                        iM3219x = parsableByteArray.m3219x();
                        z = z11;
                        z2 = z12;
                        j3 = jM3215t4;
                        iM3214s = parsableByteArray.m3214s();
                        iM3214s2 = parsableByteArray.m3214s();
                    }
                    arrayList2.add(new SpliceScheduleCommand.c(jM3215t3, z10, z, z2, arrayList, j3, z3, j4, iM3219x, iM3214s, iM3214s2));
                    i4++;
                    j7 = j2;
                    iM3214s4 = i;
                }
                spliceNullCommand = new SpliceScheduleCommand(arrayList2);
            } else if (iM3183g2 == 5) {
                ParsableByteArray parsableByteArray2 = this.f8772a;
                TimestampAdjuster timestampAdjuster3 = this.f8774c;
                long jM3215t5 = parsableByteArray2.m3215t();
                boolean z14 = (parsableByteArray2.m3214s() & 128) != 0;
                List listEmptyList = Collections.emptyList();
                if (z14) {
                    list = listEmptyList;
                    j5 = -9223372036854775807L;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    j6 = -9223372036854775807L;
                    i2 = 0;
                    i3 = 0;
                    iM3214s3 = 0;
                } else {
                    int iM3214s7 = parsableByteArray2.m3214s();
                    boolean z15 = (iM3214s7 & 128) != 0;
                    boolean z16 = (iM3214s7 & 64) != 0;
                    boolean z17 = (iM3214s7 & 32) != 0;
                    boolean z18 = (iM3214s7 & 16) != 0;
                    long jM4046a = (!z16 || z18) ? -9223372036854775807L : TimeSignalCommand.m4046a(parsableByteArray2, jM3183g);
                    if (!z16) {
                        int iM3214s8 = parsableByteArray2.m3214s();
                        ArrayList arrayList5 = new ArrayList(iM3214s8);
                        for (int i6 = 0; i6 < iM3214s8; i6++) {
                            int iM3214s9 = parsableByteArray2.m3214s();
                            long jM4046a2 = !z18 ? TimeSignalCommand.m4046a(parsableByteArray2, jM3183g) : -9223372036854775807L;
                            arrayList5.add(new SpliceInsertCommand.b(iM3214s9, jM4046a2, timestampAdjuster3.m3085b(jM4046a2), null));
                        }
                        listEmptyList = arrayList5;
                    }
                    if (z17) {
                        long jM3214s2 = parsableByteArray2.m3214s();
                        z9 = (jM3214s2 & 128) != 0;
                        jM3215t2 = ((((jM3214s2 & 1) << 32) | parsableByteArray2.m3215t()) * 1000) / 90;
                    } else {
                        z9 = false;
                        jM3215t2 = -9223372036854775807L;
                    }
                    int iM3219x2 = parsableByteArray2.m3219x();
                    int iM3214s10 = parsableByteArray2.m3214s();
                    i2 = iM3219x2;
                    z8 = z9;
                    iM3214s3 = parsableByteArray2.m3214s();
                    list = listEmptyList;
                    j6 = jM3215t2;
                    i3 = iM3214s10;
                    z5 = z15;
                    j5 = jM4046a;
                    z7 = z18;
                    z6 = z16;
                }
                spliceNullCommand = new SpliceInsertCommand(jM3215t5, z14, z5, z6, z7, j5, timestampAdjuster3.m3085b(j5), list, z8, j6, i2, i3, iM3214s3);
            } else if (iM3183g2 == 6) {
                ParsableByteArray parsableByteArray3 = this.f8772a;
                TimestampAdjuster timestampAdjuster4 = this.f8774c;
                long jM4046a3 = TimeSignalCommand.m4046a(parsableByteArray3, jM3183g);
                spliceNullCommand = new TimeSignalCommand(jM4046a3, timestampAdjuster4.m3085b(jM4046a3));
            }
        } else {
            ParsableByteArray parsableByteArray4 = this.f8772a;
            long jM3215t6 = parsableByteArray4.m3215t();
            int i7 = iM3183g - 4;
            byte[] bArr = new byte[i7];
            System.arraycopy(parsableByteArray4.f6392a, parsableByteArray4.f6393b, bArr, 0, i7);
            parsableByteArray4.f6393b += i7;
            spliceNullCommand = new PrivateCommand(jM3215t6, bArr, jM3183g);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.b[0]) : new Metadata(spliceNullCommand);
    }
}
