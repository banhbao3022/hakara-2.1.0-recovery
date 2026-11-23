package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.RegularImmutableList;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.l, reason: use source file name */
/* JADX INFO: compiled from: DefaultTsPayloadReaderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.c {

    /* JADX INFO: renamed from: a */
    public final int f8249a;

    /* JADX INFO: renamed from: b */
    public final List<Format> f8250b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultTsPayloadReaderFactory(int i) {
        this(i, RegularImmutableList.f26218h);
        AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.TsPayloadReader.c
    /* JADX INFO: renamed from: a */
    public TsPayloadReader mo3876a(int i, TsPayloadReader.b bVar) {
        if (i == 2) {
            return new PesReader(new H262Reader(new UserDataReader(m3888c(bVar))));
        }
        if (i == 3 || i == 4) {
            return new PesReader(new MpegAudioReader(bVar.f8205b));
        }
        if (i == 21) {
            return new PesReader(new Id3Reader());
        }
        if (i == 27) {
            if (m3889d(4)) {
                return null;
            }
            return new PesReader(new H264Reader(new SeiReader(m3888c(bVar)), m3889d(1), m3889d(8)));
        }
        if (i == 36) {
            return new PesReader(new H265Reader(new SeiReader(m3888c(bVar))));
        }
        if (i == 89) {
            return new PesReader(new DvbSubtitleReader(bVar.f8206c));
        }
        if (i != 138) {
            if (i == 172) {
                return new PesReader(new Ac4Reader(bVar.f8205b));
            }
            if (i == 257) {
                return new SectionReader(new PassthroughSectionPayloadReader("application/vnd.dvb.ait"));
            }
            if (i != 129) {
                if (i != 130) {
                    if (i == 134) {
                        if (m3889d(16)) {
                            return null;
                        }
                        return new SectionReader(new PassthroughSectionPayloadReader("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                if (m3889d(2)) {
                                    return null;
                                }
                                return new PesReader(new AdtsReader(false, bVar.f8205b));
                            case 16:
                                return new PesReader(new H263Reader(new UserDataReader(m3888c(bVar))));
                            case 17:
                                if (m3889d(2)) {
                                    return null;
                                }
                                return new PesReader(new LatmReader(bVar.f8205b));
                            default:
                                return null;
                        }
                    }
                } else if (!m3889d(64)) {
                    return null;
                }
            }
            return new PesReader(new Ac3Reader(bVar.f8205b));
        }
        return new PesReader(new DtsReader(bVar.f8205b));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.TsPayloadReader.c
    /* JADX INFO: renamed from: b */
    public SparseArray<TsPayloadReader> mo3877b() {
        return new SparseArray<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX INFO: renamed from: c */
    public final List<Format> m3888c(TsPayloadReader.b bVar) {
        String str;
        int i;
        if (m3889d(32)) {
            return this.f8250b;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(bVar.f8207d);
        ArrayList arrayList = this.f8250b;
        while (parsableByteArray.m3196a() > 0) {
            int iM3214s = parsableByteArray.m3214s();
            int iM3214s2 = parsableByteArray.f6393b + parsableByteArray.m3214s();
            if (iM3214s == 134) {
                arrayList = new ArrayList();
                int iM3214s3 = parsableByteArray.m3214s() & 31;
                for (int i2 = 0; i2 < iM3214s3; i2++) {
                    String strM3211p = parsableByteArray.m3211p(3);
                    int iM3214s4 = parsableByteArray.m3214s();
                    boolean z = (iM3214s4 & 128) != 0;
                    if (z) {
                        i = iM3214s4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM3214s = (byte) parsableByteArray.m3214s();
                    parsableByteArray.m3195E(1);
                    List<byte[]> listSingletonList = null;
                    if (z) {
                        listSingletonList = Collections.singletonList((bM3214s & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    }
                    Format.b bVar2 = new Format.b();
                    bVar2.f6958k = str;
                    bVar2.f6950c = strM3211p;
                    bVar2.f6946C = i;
                    bVar2.f6960m = listSingletonList;
                    arrayList.add(bVar2.m3519a());
                }
            }
            parsableByteArray.m3194D(iM3214s2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3889d(int i) {
        return (i & this.f8249a) != 0;
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    public DefaultTsPayloadReaderFactory(int i, List<Format> list) {
        this.f8249a = i;
        this.f8250b = list;
    }
}
