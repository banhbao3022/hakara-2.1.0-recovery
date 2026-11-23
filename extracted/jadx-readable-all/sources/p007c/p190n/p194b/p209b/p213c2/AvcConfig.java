package p007c.p190n.p194b.p209b.p213c2;

import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.CodecSpecificDataUtil;
import p007c.p190n.p194b.p209b.p212b2.NalUnitUtil;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;

/* JADX INFO: renamed from: c.n.b.b.c2.j, reason: use source file name */
/* JADX INFO: compiled from: AvcConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class AvcConfig {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f6434a;

    /* JADX INFO: renamed from: b */
    public final int f6435b;

    /* JADX INFO: renamed from: c */
    public final int f6436c;

    /* JADX INFO: renamed from: d */
    public final int f6437d;

    /* JADX INFO: renamed from: e */
    public final float f6438e;

    /* JADX INFO: renamed from: f */
    public final String f6439f;

    public AvcConfig(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f6434a = list;
        this.f6435b = i;
        this.f6436c = i2;
        this.f6437d = i3;
        this.f6438e = f;
        this.f6439f = str;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m3256a(ParsableByteArray parsableByteArray) {
        int iM3219x = parsableByteArray.m3219x();
        int i = parsableByteArray.f6393b;
        parsableByteArray.m3195E(iM3219x);
        byte[] bArr = parsableByteArray.f6392a;
        byte[] bArr2 = CodecSpecificDataUtil.f6305a;
        byte[] bArr3 = new byte[bArr2.length + iM3219x];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, iM3219x);
        return bArr3;
    }

    /* JADX INFO: renamed from: b */
    public static AvcConfig m3257b(ParsableByteArray parsableByteArray) throws ParserException {
        String strM3089a;
        int i;
        int i2;
        float f;
        try {
            parsableByteArray.m3195E(4);
            int iM3214s = (parsableByteArray.m3214s() & 3) + 1;
            if (iM3214s == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM3214s2 = parsableByteArray.m3214s() & 31;
            for (int i3 = 0; i3 < iM3214s2; i3++) {
                arrayList.add(m3256a(parsableByteArray));
            }
            int iM3214s3 = parsableByteArray.m3214s();
            for (int i4 = 0; i4 < iM3214s3; i4++) {
                arrayList.add(m3256a(parsableByteArray));
            }
            if (iM3214s2 > 0) {
                NalUnitUtil.b bVarM3175d = NalUnitUtil.m3175d((byte[]) arrayList.get(0), iM3214s, ((byte[]) arrayList.get(0)).length);
                int i5 = bVarM3175d.f6379e;
                int i6 = bVarM3175d.f6380f;
                float f2 = bVarM3175d.f6381g;
                strM3089a = CodecSpecificDataUtil.m3089a(bVarM3175d.f6375a, bVarM3175d.f6376b, bVarM3175d.f6377c);
                i = i5;
                i2 = i6;
                f = f2;
            } else {
                strM3089a = null;
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new AvcConfig(arrayList, iM3214s, i, i2, f, strM3089a);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing AVC config", e);
        }
    }
}
