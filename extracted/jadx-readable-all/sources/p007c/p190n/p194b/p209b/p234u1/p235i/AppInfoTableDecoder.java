package p007c.p190n.p194b.p209b.p234u1.p235i;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.MetadataInputBuffer;
import p007c.p190n.p194b.p209b.p234u1.SimpleMetadataDecoder;
import p007c.p190n.p378c.p379a.Charsets;

/* JADX INFO: renamed from: c.n.b.b.u1.i.b, reason: use source file name */
/* JADX INFO: compiled from: AppInfoTableDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppInfoTableDecoder extends SimpleMetadataDecoder {
    @Override // p007c.p190n.p194b.p209b.p234u1.SimpleMetadataDecoder
    /* JADX INFO: renamed from: b */
    public Metadata mo4018b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            ParsableBitArray parsableBitArray = new ParsableBitArray(byteBuffer.array(), byteBuffer.limit());
            parsableBitArray.m3189m(12);
            int iM3180d = (parsableBitArray.m3180d() + parsableBitArray.m3183g(12)) - 4;
            parsableBitArray.m3189m(44);
            parsableBitArray.m3190n(parsableBitArray.m3183g(12));
            parsableBitArray.m3189m(16);
            ArrayList arrayList = new ArrayList();
            while (parsableBitArray.m3180d() < iM3180d) {
                parsableBitArray.m3189m(48);
                int iM3183g = parsableBitArray.m3183g(8);
                parsableBitArray.m3189m(4);
                int iM3180d2 = parsableBitArray.m3180d() + parsableBitArray.m3183g(12);
                String str = null;
                String str2 = null;
                while (parsableBitArray.m3180d() < iM3180d2) {
                    int iM3183g2 = parsableBitArray.m3183g(8);
                    int iM3183g3 = parsableBitArray.m3183g(8);
                    int iM3180d3 = parsableBitArray.m3180d() + iM3183g3;
                    if (iM3183g2 == 2) {
                        int iM3183g4 = parsableBitArray.m3183g(16);
                        parsableBitArray.m3189m(8);
                        if (iM3183g4 == 3) {
                            while (parsableBitArray.m3180d() < iM3180d3) {
                                int iM3183g5 = parsableBitArray.m3183g(8);
                                Charset charset = Charsets.f26129a;
                                byte[] bArr = new byte[iM3183g5];
                                parsableBitArray.m3185i(bArr, 0, iM3183g5);
                                str = new String(bArr, charset);
                                int iM3183g6 = parsableBitArray.m3183g(8);
                                for (int i = 0; i < iM3183g6; i++) {
                                    parsableBitArray.m3190n(parsableBitArray.m3183g(8));
                                }
                            }
                        }
                    } else if (iM3183g2 == 21) {
                        Charset charset2 = Charsets.f26129a;
                        byte[] bArr2 = new byte[iM3183g3];
                        parsableBitArray.m3185i(bArr2, 0, iM3183g3);
                        str2 = new String(bArr2, charset2);
                    }
                    parsableBitArray.m3187k(iM3180d3 * 8);
                }
                parsableBitArray.m3187k(iM3180d2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new AppInfoTable(iM3183g, outline.m1599u(str, str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new Metadata(arrayList);
            }
        }
        return null;
    }
}
