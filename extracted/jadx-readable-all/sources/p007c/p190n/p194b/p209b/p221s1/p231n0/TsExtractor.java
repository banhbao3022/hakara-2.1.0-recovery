package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.h0, reason: use source file name */
/* JADX INFO: compiled from: TsExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class TsExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public final int f8163a;

    /* JADX INFO: renamed from: b */
    public final int f8164b;

    /* JADX INFO: renamed from: c */
    public final List<TimestampAdjuster> f8165c;

    /* JADX INFO: renamed from: d */
    public final ParsableByteArray f8166d;

    /* JADX INFO: renamed from: e */
    public final SparseIntArray f8167e;

    /* JADX INFO: renamed from: f */
    public final TsPayloadReader.c f8168f;

    /* JADX INFO: renamed from: g */
    public final SparseArray<TsPayloadReader> f8169g;

    /* JADX INFO: renamed from: h */
    public final SparseBooleanArray f8170h;

    /* JADX INFO: renamed from: i */
    public final SparseBooleanArray f8171i;

    /* JADX INFO: renamed from: j */
    public final TsDurationReader f8172j;

    /* JADX INFO: renamed from: k */
    public TsBinarySearchSeeker f8173k;

    /* JADX INFO: renamed from: l */
    public ExtractorOutput f8174l;

    /* JADX INFO: renamed from: m */
    public int f8175m;

    /* JADX INFO: renamed from: n */
    public boolean f8176n;

    /* JADX INFO: renamed from: o */
    public boolean f8177o;

    /* JADX INFO: renamed from: p */
    public boolean f8178p;

    /* JADX INFO: renamed from: q */
    public TsPayloadReader f8179q;

    /* JADX INFO: renamed from: r */
    public int f8180r;

    /* JADX INFO: renamed from: s */
    public int f8181s;

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.h0$a */
    /* JADX INFO: compiled from: TsExtractor.java */
    public class a implements SectionPayloadReader {

        /* JADX INFO: renamed from: a */
        public final ParsableBitArray f8182a = new ParsableBitArray(new byte[4]);

        public a() {
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.SectionPayloadReader
        /* JADX INFO: renamed from: a */
        public void mo3864a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.SectionPayloadReader
        /* JADX INFO: renamed from: b */
        public void mo3865b(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.m3214s() == 0 && (parsableByteArray.m3214s() & 128) != 0) {
                parsableByteArray.m3195E(6);
                int iM3196a = parsableByteArray.m3196a() / 4;
                for (int i = 0; i < iM3196a; i++) {
                    parsableByteArray.m3199d(this.f8182a, 4);
                    int iM3183g = this.f8182a.m3183g(16);
                    this.f8182a.m3189m(3);
                    if (iM3183g == 0) {
                        this.f8182a.m3189m(13);
                    } else {
                        int iM3183g2 = this.f8182a.m3183g(13);
                        if (TsExtractor.this.f8169g.get(iM3183g2) == null) {
                            TsExtractor tsExtractor = TsExtractor.this;
                            tsExtractor.f8169g.put(iM3183g2, new SectionReader(tsExtractor.new b(iM3183g2)));
                            TsExtractor.this.f8175m++;
                        }
                    }
                }
                TsExtractor tsExtractor2 = TsExtractor.this;
                if (tsExtractor2.f8163a != 2) {
                    tsExtractor2.f8169g.remove(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.h0$b */
    /* JADX INFO: compiled from: TsExtractor.java */
    public class b implements SectionPayloadReader {

        /* JADX INFO: renamed from: a */
        public final ParsableBitArray f8184a = new ParsableBitArray(new byte[5]);

        /* JADX INFO: renamed from: b */
        public final SparseArray<TsPayloadReader> f8185b = new SparseArray<>();

        /* JADX INFO: renamed from: c */
        public final SparseIntArray f8186c = new SparseIntArray();

        /* JADX INFO: renamed from: d */
        public final int f8187d;

        public b(int i) {
            this.f8187d = i;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.SectionPayloadReader
        /* JADX INFO: renamed from: a */
        public void mo3864a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        }

        /* JADX WARN: Code duplicated, block: B:45:0x012a  */
        /* JADX WARN: Code duplicated, block: B:49:0x0132  */
        /* JADX WARN: Code duplicated, block: B:54:0x013f  */
        @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.SectionPayloadReader
        /* JADX INFO: renamed from: b */
        public void mo3865b(ParsableByteArray parsableByteArray) {
            TimestampAdjuster timestampAdjuster;
            TimestampAdjuster timestampAdjuster2;
            int i;
            int i2;
            int i3;
            TimestampAdjuster timestampAdjuster3;
            int i4;
            if (parsableByteArray.m3214s() != 2) {
                return;
            }
            TsExtractor tsExtractor = TsExtractor.this;
            int i5 = tsExtractor.f8163a;
            if (i5 == 1 || i5 == 2 || tsExtractor.f8175m == 1) {
                timestampAdjuster = tsExtractor.f8165c.get(0);
            } else {
                timestampAdjuster = new TimestampAdjuster(tsExtractor.f8165c.get(0).m3086c());
                TsExtractor.this.f8165c.add(timestampAdjuster);
            }
            if ((parsableByteArray.m3214s() & 128) == 0) {
                return;
            }
            parsableByteArray.m3195E(1);
            int iM3219x = parsableByteArray.m3219x();
            int i6 = 3;
            parsableByteArray.m3195E(3);
            parsableByteArray.m3199d(this.f8184a, 2);
            this.f8184a.m3189m(3);
            int i7 = 13;
            TsExtractor.this.f8181s = this.f8184a.m3183g(13);
            parsableByteArray.m3199d(this.f8184a, 2);
            int i8 = 4;
            this.f8184a.m3189m(4);
            int i9 = 12;
            parsableByteArray.m3195E(this.f8184a.m3183g(12));
            TsExtractor tsExtractor2 = TsExtractor.this;
            int i10 = 21;
            if (tsExtractor2.f8163a == 2 && tsExtractor2.f8179q == null) {
                TsPayloadReader.b bVar = new TsPayloadReader.b(21, null, null, Util6.f6312f);
                TsExtractor tsExtractor3 = TsExtractor.this;
                tsExtractor3.f8179q = tsExtractor3.f8168f.mo3876a(21, bVar);
                TsExtractor tsExtractor4 = TsExtractor.this;
                tsExtractor4.f8179q.mo3866a(timestampAdjuster, tsExtractor4.f8174l, new TsPayloadReader.d(iM3219x, 21, 8192));
            }
            this.f8185b.clear();
            this.f8186c.clear();
            int iM3196a = parsableByteArray.m3196a();
            while (iM3196a > 0) {
                int i11 = 5;
                parsableByteArray.m3199d(this.f8184a, 5);
                int iM3183g = this.f8184a.m3183g(8);
                this.f8184a.m3189m(i6);
                int iM3183g2 = this.f8184a.m3183g(i7);
                this.f8184a.m3189m(i8);
                int iM3183g3 = this.f8184a.m3183g(i9);
                int i12 = parsableByteArray.f6393b;
                int i13 = iM3183g3 + i12;
                int i14 = -1;
                String strTrim = null;
                ArrayList arrayList = null;
                while (parsableByteArray.f6393b < i13) {
                    int iM3214s = parsableByteArray.m3214s();
                    int iM3214s2 = parsableByteArray.f6393b + parsableByteArray.m3214s();
                    if (iM3214s2 > i13) {
                        break;
                    }
                    if (iM3214s == i11) {
                        long jM3215t = parsableByteArray.m3215t();
                        if (jM3215t == 1094921523) {
                            i14 = 129;
                        } else if (jM3215t == 1161904947) {
                            i14 = 135;
                        } else if (jM3215t == 1094921524) {
                            i14 = 172;
                        } else if (jM3215t == 1212503619) {
                            i14 = 36;
                        }
                        i3 = iM3219x;
                        timestampAdjuster3 = timestampAdjuster;
                        i4 = iM3183g2;
                    } else {
                        if (iM3214s == 106) {
                            i14 = 129;
                        } else if (iM3214s == 122) {
                            i14 = 135;
                        } else if (iM3214s == 127) {
                            if (parsableByteArray.m3214s() == i10) {
                                i14 = 172;
                            }
                        } else if (iM3214s == 123) {
                            i14 = 138;
                        } else if (iM3214s == 10) {
                            strTrim = parsableByteArray.m3211p(3).trim();
                            i3 = iM3219x;
                            timestampAdjuster3 = timestampAdjuster;
                            i4 = iM3183g2;
                        } else {
                            int i15 = 3;
                            if (iM3214s == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (parsableByteArray.f6393b < iM3214s2) {
                                    String strTrim2 = parsableByteArray.m3211p(i15).trim();
                                    int iM3214s3 = parsableByteArray.m3214s();
                                    byte[] bArr = new byte[4];
                                    System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, 4);
                                    parsableByteArray.f6393b += 4;
                                    arrayList2.add(new TsPayloadReader.a(strTrim2, iM3214s3, bArr));
                                    timestampAdjuster = timestampAdjuster;
                                    iM3219x = iM3219x;
                                    iM3183g2 = iM3183g2;
                                    i15 = 3;
                                }
                                i3 = iM3219x;
                                timestampAdjuster3 = timestampAdjuster;
                                i4 = iM3183g2;
                                arrayList = arrayList2;
                                i14 = 89;
                            } else {
                                i3 = iM3219x;
                                timestampAdjuster3 = timestampAdjuster;
                                i4 = iM3183g2;
                                if (iM3214s == 111) {
                                    i14 = 257;
                                }
                            }
                        }
                        i3 = iM3219x;
                        timestampAdjuster3 = timestampAdjuster;
                        i4 = iM3183g2;
                    }
                    parsableByteArray.m3195E(iM3214s2 - parsableByteArray.f6393b);
                    timestampAdjuster = timestampAdjuster3;
                    iM3219x = i3;
                    iM3183g2 = i4;
                    i11 = 5;
                    i10 = 21;
                }
                int i16 = iM3219x;
                TimestampAdjuster timestampAdjuster4 = timestampAdjuster;
                int i17 = iM3183g2;
                parsableByteArray.m3194D(i13);
                TsPayloadReader.b bVar2 = new TsPayloadReader.b(i14, strTrim, arrayList, Arrays.copyOfRange(parsableByteArray.f6392a, i12, i13));
                if (iM3183g == 6 || iM3183g == 5) {
                    iM3183g = bVar2.f8204a;
                }
                iM3196a -= iM3183g3 + 5;
                TsExtractor tsExtractor5 = TsExtractor.this;
                int i18 = tsExtractor5.f8163a == 2 ? iM3183g : i17;
                if (!tsExtractor5.f8170h.get(i18)) {
                    TsExtractor tsExtractor6 = TsExtractor.this;
                    TsPayloadReader tsPayloadReaderMo3876a = (tsExtractor6.f8163a == 2 && iM3183g == 21) ? tsExtractor6.f8179q : tsExtractor6.f8168f.mo3876a(iM3183g, bVar2);
                    if (TsExtractor.this.f8163a == 2) {
                        i2 = i17;
                        if (i2 < this.f8186c.get(i18, 8192)) {
                        }
                    } else {
                        i2 = i17;
                    }
                    this.f8186c.put(i18, i2);
                    this.f8185b.put(i18, tsPayloadReaderMo3876a);
                }
                timestampAdjuster = timestampAdjuster4;
                iM3219x = i16;
                i6 = 3;
                i8 = 4;
                i7 = 13;
                i9 = 12;
                i10 = 21;
            }
            int i19 = iM3219x;
            TimestampAdjuster timestampAdjuster5 = timestampAdjuster;
            int size = this.f8186c.size();
            int i20 = 0;
            while (i20 < size) {
                int iKeyAt = this.f8186c.keyAt(i20);
                int iValueAt = this.f8186c.valueAt(i20);
                TsExtractor.this.f8170h.put(iKeyAt, true);
                TsExtractor.this.f8171i.put(iValueAt, true);
                TsPayloadReader tsPayloadReaderValueAt = this.f8185b.valueAt(i20);
                if (tsPayloadReaderValueAt != null) {
                    TsExtractor tsExtractor7 = TsExtractor.this;
                    if (tsPayloadReaderValueAt != tsExtractor7.f8179q) {
                        ExtractorOutput extractorOutput = tsExtractor7.f8174l;
                        i = i19;
                        TsPayloadReader.d dVar = new TsPayloadReader.d(i, iKeyAt, 8192);
                        timestampAdjuster2 = timestampAdjuster5;
                        tsPayloadReaderValueAt.mo3866a(timestampAdjuster2, extractorOutput, dVar);
                    } else {
                        timestampAdjuster2 = timestampAdjuster5;
                        i = i19;
                    }
                    TsExtractor.this.f8169g.put(iValueAt, tsPayloadReaderValueAt);
                } else {
                    timestampAdjuster2 = timestampAdjuster5;
                    i = i19;
                }
                i20++;
                timestampAdjuster5 = timestampAdjuster2;
                i19 = i;
            }
            TsExtractor tsExtractor8 = TsExtractor.this;
            if (tsExtractor8.f8163a == 2) {
                if (tsExtractor8.f8176n) {
                    return;
                }
                tsExtractor8.f8174l.mo3773j();
                TsExtractor tsExtractor9 = TsExtractor.this;
                tsExtractor9.f8175m = 0;
                tsExtractor9.f8176n = true;
                return;
            }
            tsExtractor8.f8169g.remove(this.f8187d);
            TsExtractor tsExtractor10 = TsExtractor.this;
            int i21 = tsExtractor10.f8163a == 1 ? 0 : tsExtractor10.f8175m - 1;
            tsExtractor10.f8175m = i21;
            if (i21 == 0) {
                tsExtractor10.f8174l.mo3773j();
                TsExtractor.this.f8176n = true;
            }
        }
    }

    static {
        C1778e c1778e = new ExtractorsFactory2() { // from class: c.n.b.b.s1.n0.e
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new TsExtractor()};
            }

            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: b */
            public /* synthetic */ Extractor[] mo3746b(Uri uri, Map map) {
                return ExtractorsFactory.m3807a(this, uri, map);
            }
        };
    }

    public TsExtractor() {
        this(0);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        boolean z;
        byte[] bArr = this.f8166d.f6392a;
        extractorInput.mo3739o(bArr, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                extractorInput.mo3737l(i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        ?? r3;
        ?? r13;
        int i;
        boolean z;
        int i2;
        boolean z2;
        long jMo3729a = extractorInput.mo3729a();
        if (this.f8176n) {
            long j2 = -9223372036854775807L;
            if ((jMo3729a == -1 || this.f8163a == 2) ? false : true) {
                TsDurationReader tsDurationReader = this.f8172j;
                if (!tsDurationReader.f8154d) {
                    int i3 = this.f8181s;
                    if (i3 <= 0) {
                        tsDurationReader.m3875a(extractorInput);
                        return 0;
                    }
                    if (!tsDurationReader.f8156f) {
                        long jMo3729a2 = extractorInput.mo3729a();
                        int iMin = (int) Math.min(tsDurationReader.f8151a, jMo3729a2);
                        long j3 = jMo3729a2 - ((long) iMin);
                        if (extractorInput.mo3740p() == j3) {
                            tsDurationReader.f8153c.m3221z(iMin);
                            extractorInput.mo3736k();
                            extractorInput.mo3739o(tsDurationReader.f8153c.f6392a, 0, iMin);
                            ParsableByteArray parsableByteArray = tsDurationReader.f8153c;
                            int i4 = parsableByteArray.f6393b;
                            int i5 = parsableByteArray.f6394c;
                            while (true) {
                                i5--;
                                if (i5 < i4) {
                                    break;
                                }
                                if (parsableByteArray.f6392a[i5] == 71) {
                                    long jM2374A = C1095a.m2374A(parsableByteArray, i5, i3);
                                    if (jM2374A != -9223372036854775807L) {
                                        j2 = jM2374A;
                                        break;
                                    }
                                }
                            }
                            tsDurationReader.f8158h = j2;
                            tsDurationReader.f8156f = true;
                            return 0;
                        }
                        positionHolder.f8519a = j3;
                    } else {
                        if (tsDurationReader.f8158h == -9223372036854775807L) {
                            tsDurationReader.m3875a(extractorInput);
                            return 0;
                        }
                        if (tsDurationReader.f8155e) {
                            long j4 = tsDurationReader.f8157g;
                            if (j4 == -9223372036854775807L) {
                                tsDurationReader.m3875a(extractorInput);
                                return 0;
                            }
                            tsDurationReader.f8159i = tsDurationReader.f8152b.m3085b(tsDurationReader.f8158h) - tsDurationReader.f8152b.m3085b(j4);
                            tsDurationReader.m3875a(extractorInput);
                            return 0;
                        }
                        int iMin2 = (int) Math.min(tsDurationReader.f8151a, extractorInput.mo3729a());
                        long j5 = 0;
                        if (extractorInput.mo3740p() == j5) {
                            tsDurationReader.f8153c.m3221z(iMin2);
                            extractorInput.mo3736k();
                            extractorInput.mo3739o(tsDurationReader.f8153c.f6392a, 0, iMin2);
                            ParsableByteArray parsableByteArray2 = tsDurationReader.f8153c;
                            int i6 = parsableByteArray2.f6394c;
                            for (int i7 = parsableByteArray2.f6393b; i7 < i6; i7++) {
                                if (parsableByteArray2.f6392a[i7] == 71) {
                                    long jM2374A2 = C1095a.m2374A(parsableByteArray2, i7, i3);
                                    if (jM2374A2 != -9223372036854775807L) {
                                        j2 = jM2374A2;
                                        break;
                                    }
                                }
                            }
                            tsDurationReader.f8157g = j2;
                            tsDurationReader.f8155e = true;
                            return 0;
                        }
                        positionHolder.f8519a = j5;
                    }
                    return 1;
                }
            }
            if (this.f8177o) {
                z2 = false;
                i = -1;
            } else {
                this.f8177o = true;
                TsDurationReader tsDurationReader2 = this.f8172j;
                long j6 = tsDurationReader2.f8159i;
                if (j6 != -9223372036854775807L) {
                    z2 = false;
                    i = -1;
                    TsBinarySearchSeeker tsBinarySearchSeeker = new TsBinarySearchSeeker(tsDurationReader2.f8152b, j6, jMo3729a, this.f8181s, this.f8164b);
                    this.f8173k = tsBinarySearchSeeker;
                    this.f8174l.mo3772a(tsBinarySearchSeeker.f7526a);
                } else {
                    z2 = false;
                    i = -1;
                    this.f8174l.mo3772a(new SeekMap.b(j6));
                }
            }
            if (this.f8178p) {
                this.f8178p = z2;
                mo3752g(0L, 0L);
                if (extractorInput.mo3740p() != 0) {
                    positionHolder.f8519a = 0L;
                    return 1;
                }
            }
            r3 = 1;
            r3 = 1;
            TsBinarySearchSeeker tsBinarySearchSeeker2 = this.f8173k;
            r13 = z2;
            if (tsBinarySearchSeeker2 != null && tsBinarySearchSeeker2.m3711b()) {
                r13 = z2;
                return this.f8173k.m3710a(extractorInput, positionHolder);
            }
        } else {
            r3 = 1;
            r13 = 0;
            i = -1;
        }
        r13 = z2;
        ParsableByteArray parsableByteArray3 = this.f8166d;
        byte[] bArr = parsableByteArray3.f6392a;
        if (9400 - parsableByteArray3.f6393b < 188) {
            int iM3196a = parsableByteArray3.m3196a();
            if (iM3196a > 0) {
                System.arraycopy(bArr, this.f8166d.f6393b, bArr, r13, iM3196a);
            }
            this.f8166d.m3192B(bArr, iM3196a);
        }
        while (true) {
            if (this.f8166d.m3196a() >= 188) {
                z = true;
                break;
            }
            int i8 = this.f8166d.f6394c;
            int i9 = extractorInput.read(bArr, i8, 9400 - i8);
            if (i9 == i) {
                z = false;
                break;
            }
            this.f8166d.m3193C(i8 + i9);
        }
        if (!z) {
            return i;
        }
        ParsableByteArray parsableByteArray4 = this.f8166d;
        int i10 = parsableByteArray4.f6393b;
        int i11 = parsableByteArray4.f6394c;
        byte[] bArr2 = parsableByteArray4.f6392a;
        int i12 = i10;
        while (i12 < i11 && bArr2[i12] != 71) {
            i12++;
        }
        this.f8166d.m3194D(i12);
        int i13 = i12 + 188;
        if (i13 > i11) {
            int i14 = (i12 - i10) + this.f8180r;
            this.f8180r = i14;
            i2 = 2;
            if (this.f8163a == 2 && i14 > 376) {
                throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i2 = 2;
            this.f8180r = r13;
        }
        ParsableByteArray parsableByteArray5 = this.f8166d;
        int i15 = parsableByteArray5.f6394c;
        if (i13 > i15) {
            return r13;
        }
        int iM3201f = parsableByteArray5.m3201f();
        if ((8388608 & iM3201f) != 0) {
            this.f8166d.m3194D(i13);
            return r13;
        }
        int i16 = ((4194304 & iM3201f) != 0 ? 1 : 0) | 0;
        int i17 = (2096896 & iM3201f) >> 8;
        boolean z3 = (iM3201f & 32) != 0;
        TsPayloadReader tsPayloadReader = (iM3201f & 16) != 0 ? this.f8169g.get(i17) : null;
        if (tsPayloadReader == null) {
            this.f8166d.m3194D(i13);
            return r13;
        }
        if (this.f8163a != i2) {
            int i18 = iM3201f & 15;
            int i19 = this.f8167e.get(i17, i18 - 1);
            this.f8167e.put(i17, i18);
            if (i19 == i18) {
                this.f8166d.m3194D(i13);
                return r13;
            }
            if (i18 != ((i19 + r3) & 15)) {
                tsPayloadReader.mo3868c();
            }
        }
        if (z3) {
            int iM3214s = this.f8166d.m3214s();
            i16 |= (this.f8166d.m3214s() & 64) != 0 ? 2 : 0;
            this.f8166d.m3195E(iM3214s - r3);
        }
        boolean z4 = this.f8176n;
        if (this.f8163a == i2 || z4 || !this.f8171i.get(i17, r13)) {
            this.f8166d.m3193C(i13);
            tsPayloadReader.mo3867b(this.f8166d, i16);
            this.f8166d.m3193C(i15);
        }
        if (this.f8163a != i2 && !z4 && this.f8176n && jMo3729a != -1) {
            this.f8178p = r3;
        }
        this.f8166d.m3194D(i13);
        return r13;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f8174l = extractorOutput;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        TsBinarySearchSeeker tsBinarySearchSeeker;
        C2096e.m4570f(this.f8163a != 2);
        int size = this.f8165c.size();
        for (int i = 0; i < size; i++) {
            TimestampAdjuster timestampAdjuster = this.f8165c.get(i);
            if ((timestampAdjuster.m3087d() == -9223372036854775807L) || (timestampAdjuster.m3087d() != 0 && timestampAdjuster.m3086c() != j3)) {
                timestampAdjuster.m3088e(j3);
            }
        }
        if (j3 != 0 && (tsBinarySearchSeeker = this.f8173k) != null) {
            tsBinarySearchSeeker.m3714e(j3);
        }
        this.f8166d.m3221z(0);
        this.f8167e.clear();
        for (int i2 = 0; i2 < this.f8169g.size(); i2++) {
            this.f8169g.valueAt(i2).mo3868c();
        }
        this.f8180r = 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }

    public TsExtractor(int i) {
        this(1, i, 112800);
    }

    public TsExtractor(int i, int i2, int i3) {
        this(i, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(i2), i3);
    }

    public TsExtractor(int i, TimestampAdjuster timestampAdjuster, TsPayloadReader.c cVar) {
        this(i, timestampAdjuster, cVar, 112800);
    }

    public TsExtractor(int i, TimestampAdjuster timestampAdjuster, TsPayloadReader.c cVar, int i2) {
        Objects.requireNonNull(cVar);
        this.f8168f = cVar;
        this.f8164b = i2;
        this.f8163a = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.f8165c = arrayList;
            arrayList.add(timestampAdjuster);
        } else {
            this.f8165c = Collections.singletonList(timestampAdjuster);
        }
        this.f8166d = new ParsableByteArray(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f8170h = sparseBooleanArray;
        this.f8171i = new SparseBooleanArray();
        SparseArray<TsPayloadReader> sparseArray = new SparseArray<>();
        this.f8169g = sparseArray;
        this.f8167e = new SparseIntArray();
        this.f8172j = new TsDurationReader(i2);
        this.f8181s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray<TsPayloadReader> sparseArrayMo3877b = cVar.mo3877b();
        int size = sparseArrayMo3877b.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f8169g.put(sparseArrayMo3877b.keyAt(i3), sparseArrayMo3877b.valueAt(i3));
        }
        this.f8169g.put(0, new SectionReader(new a()));
        this.f8179q = null;
    }
}
