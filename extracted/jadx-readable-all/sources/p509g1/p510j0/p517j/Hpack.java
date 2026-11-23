package p509g1.p510j0.p517j;

import com.cgfay.media.CainMediaMetadataRetriever;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p524h1.Buffer3;
import p524h1.BufferedSource;
import p524h1.ByteString3;
import p524h1.RealBufferedSource;
import p524h1.Source;

/* JADX INFO: renamed from: g1.j0.j.d, reason: use source file name */
/* JADX INFO: compiled from: Hpack.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Hpack {

    /* JADX INFO: renamed from: a */
    public static final Header[] f30347a;

    /* JADX INFO: renamed from: b */
    public static final Map<ByteString3, Integer> f30348b;

    /* JADX INFO: renamed from: c */
    public static final Hpack f30349c = new Hpack();

    static {
        Header header = new Header(Header.f30343f, "");
        ByteString3 byteString3 = Header.f30340c;
        ByteString3 byteString4 = Header.f30341d;
        ByteString3 byteString5 = Header.f30342e;
        ByteString3 byteString6 = Header.f30339b;
        Header[] headerArr = {header, new Header(byteString3, "GET"), new Header(byteString3, "POST"), new Header(byteString4, "/"), new Header(byteString4, "/index.html"), new Header(byteString5, "http"), new Header(byteString5, "https"), new Header(byteString6, "200"), new Header(byteString6, "204"), new Header(byteString6, "206"), new Header(byteString6, "304"), new Header(byteString6, "400"), new Header(byteString6, "404"), new Header(byteString6, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header(CainMediaMetadataRetriever.METADATA_KEY_DATE, ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f30347a = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            Header[] headerArr2 = f30347a;
            if (!linkedHashMap.containsKey(headerArr2[i].f30345h)) {
                linkedHashMap.put(headerArr2[i].f30345h, Integer.valueOf(i));
            }
        }
        Map<ByteString3, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics2.m13086b(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        f30348b = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: a */
    public final ByteString3 m13507a(ByteString3 byteString3) throws IOException {
        Intrinsics2.m13090f(byteString3, "name");
        int iMo13765j = byteString3.mo13765j();
        for (int i = 0; i < iMo13765j; i++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte bMo13768q = byteString3.mo13768q(i);
            if (b2 <= bMo13768q && b3 >= bMo13768q) {
                StringBuilder sbM1556G = outline.m1556G("PROTOCOL_ERROR response malformed: mixed case name: ");
                sbM1556G.append(byteString3.m13772w());
                throw new IOException(sbM1556G.toString());
            }
        }
        return byteString3;
    }

    /* JADX INFO: renamed from: g1.j0.j.d$b */
    /* JADX INFO: compiled from: Hpack.kt */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f30358a;

        /* JADX INFO: renamed from: b */
        public boolean f30359b;

        /* JADX INFO: renamed from: c */
        public int f30360c;

        /* JADX INFO: renamed from: d */
        public Header[] f30361d;

        /* JADX INFO: renamed from: e */
        public int f30362e;

        /* JADX INFO: renamed from: f */
        public int f30363f;

        /* JADX INFO: renamed from: g */
        public int f30364g;

        /* JADX INFO: renamed from: h */
        public int f30365h;

        /* JADX INFO: renamed from: i */
        public final boolean f30366i;

        /* JADX INFO: renamed from: j */
        public final Buffer3 f30367j;

        public b(int i, Buffer3 buffer3) {
            this(i, false, buffer3, 2, null);
        }

        public b(int i, boolean z, Buffer3 buffer3) {
            Intrinsics2.m13090f(buffer3, "out");
            this.f30365h = i;
            this.f30366i = z;
            this.f30367j = buffer3;
            this.f30358a = Integer.MAX_VALUE;
            this.f30360c = i;
            Header[] headerArr = new Header[8];
            this.f30361d = headerArr;
            this.f30362e = headerArr.length - 1;
        }

        public b(Buffer3 buffer3) {
            this(0, false, buffer3, 3, null);
        }

        /* JADX INFO: renamed from: a */
        public final void m13515a() {
            Header[] headerArr = this.f30361d;
            int length = headerArr.length;
            Intrinsics2.m13089e(headerArr, "$this$fill");
            Arrays.fill(headerArr, 0, length, (Object) null);
            this.f30362e = this.f30361d.length - 1;
            this.f30363f = 0;
            this.f30364g = 0;
        }

        /* JADX INFO: renamed from: b */
        public final int m13516b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f30361d.length;
                while (true) {
                    length--;
                    i2 = this.f30362e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header[] headerArr = this.f30361d;
                    Header header = headerArr[length];
                    if (header == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    i -= header.f30344g;
                    int i4 = this.f30364g;
                    Header header2 = headerArr[length];
                    if (header2 == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    this.f30364g = i4 - header2.f30344g;
                    this.f30363f--;
                    i3++;
                }
                Header[] headerArr2 = this.f30361d;
                System.arraycopy(headerArr2, i2 + 1, headerArr2, i2 + 1 + i3, this.f30363f);
                Header[] headerArr3 = this.f30361d;
                int i5 = this.f30362e;
                Arrays.fill(headerArr3, i5 + 1, i5 + 1 + i3, (Object) null);
                this.f30362e += i3;
            }
            return i3;
        }

        /* JADX INFO: renamed from: c */
        public final void m13517c(Header header) {
            int i = header.f30344g;
            int i2 = this.f30360c;
            if (i > i2) {
                m13515a();
                return;
            }
            m13516b((this.f30364g + i) - i2);
            int i3 = this.f30363f + 1;
            Header[] headerArr = this.f30361d;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f30362e = this.f30361d.length - 1;
                this.f30361d = headerArr2;
            }
            int i4 = this.f30362e;
            this.f30362e = i4 - 1;
            this.f30361d[i4] = header;
            this.f30363f++;
            this.f30364g += i;
        }

        /* JADX INFO: renamed from: d */
        public final void m13518d(ByteString3 byteString3) throws IOException {
            Intrinsics2.m13090f(byteString3, "data");
            if (this.f30366i) {
                Huffman huffman = Huffman.f30506d;
                Intrinsics2.m13090f(byteString3, "bytes");
                int iMo13765j = byteString3.mo13765j();
                long j2 = 0;
                for (int i = 0; i < iMo13765j; i++) {
                    byte bMo13768q = byteString3.mo13768q(i);
                    byte[] bArr = Util9.f30070a;
                    j2 += (long) Huffman.f30504b[bMo13768q & 255];
                }
                if (((int) ((j2 + ((long) 7)) >> 3)) < byteString3.mo13765j()) {
                    Buffer3 buffer3 = new Buffer3();
                    Huffman huffman2 = Huffman.f30506d;
                    Intrinsics2.m13090f(byteString3, "source");
                    Intrinsics2.m13090f(buffer3, "sink");
                    int iMo13765j2 = byteString3.mo13765j();
                    long j3 = 0;
                    int i2 = 0;
                    for (int i3 = 0; i3 < iMo13765j2; i3++) {
                        byte bMo13768q2 = byteString3.mo13768q(i3);
                        byte[] bArr2 = Util9.f30070a;
                        int i4 = bMo13768q2 & 255;
                        int i5 = Huffman.f30503a[i4];
                        byte b = Huffman.f30504b[i4];
                        j3 = (j3 << b) | ((long) i5);
                        i2 += b;
                        while (i2 >= 8) {
                            i2 -= 8;
                            buffer3.mo13761z((int) (j3 >> i2));
                        }
                    }
                    if (i2 > 0) {
                        buffer3.mo13761z((int) ((255 >>> i2) | (j3 << (8 - i2))));
                    }
                    ByteString3 byteString3Mo13736Y = buffer3.mo13736Y();
                    m13520f(byteString3Mo13736Y.mo13765j(), 127, 128);
                    this.f30367j.m13717G0(byteString3Mo13736Y);
                    return;
                }
            }
            m13520f(byteString3.mo13765j(), 127, 0);
            this.f30367j.m13717G0(byteString3);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0072  */
        /* JADX INFO: renamed from: e */
        public final void m13519e(List<Header> list) throws IOException {
            int length;
            int length2;
            Intrinsics2.m13090f(list, "headerBlock");
            if (this.f30359b) {
                int i = this.f30358a;
                if (i < this.f30360c) {
                    m13520f(i, 31, 32);
                }
                this.f30359b = false;
                this.f30358a = Integer.MAX_VALUE;
                m13520f(this.f30360c, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Header header = list.get(i2);
                ByteString3 byteString3Mo13771v = header.f30345h.mo13771v();
                ByteString3 byteString3 = header.f30346i;
                Hpack hpack = Hpack.f30349c;
                Integer num = Hpack.f30348b.get(byteString3Mo13771v);
                if (num != null) {
                    length = num.intValue() + 1;
                    if (2 <= length && 7 >= length) {
                        Header[] headerArr = Hpack.f30347a;
                        if (Intrinsics2.m13085a(headerArr[length - 1].f30346i, byteString3)) {
                            length2 = length;
                        } else if (Intrinsics2.m13085a(headerArr[length].f30346i, byteString3)) {
                            length2 = length;
                            length++;
                        } else {
                            length2 = length;
                            length = -1;
                        }
                    } else {
                        length2 = length;
                        length = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length == -1) {
                    int length3 = this.f30361d.length;
                    for (int i3 = this.f30362e + 1; i3 < length3; i3++) {
                        Header header2 = this.f30361d[i3];
                        if (header2 == null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        if (Intrinsics2.m13085a(header2.f30345h, byteString3Mo13771v)) {
                            Header header3 = this.f30361d[i3];
                            if (header3 == null) {
                                Intrinsics2.m13095k();
                                throw null;
                            }
                            if (Intrinsics2.m13085a(header3.f30346i, byteString3)) {
                                int i4 = i3 - this.f30362e;
                                Hpack hpack2 = Hpack.f30349c;
                                length = Hpack.f30347a.length + i4;
                                break;
                            } else if (length2 == -1) {
                                int i5 = i3 - this.f30362e;
                                Hpack hpack3 = Hpack.f30349c;
                                length2 = i5 + Hpack.f30347a.length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    m13520f(length, 127, 128);
                } else if (length2 == -1) {
                    this.f30367j.m13721J0(64);
                    m13518d(byteString3Mo13771v);
                    m13518d(byteString3);
                    m13517c(header);
                } else {
                    ByteString3 byteString4 = Header.f30338a;
                    Objects.requireNonNull(byteString3Mo13771v);
                    Intrinsics2.m13090f(byteString4, "prefix");
                    if (byteString3Mo13771v.mo13769s(0, byteString4, 0, byteString4.mo13765j()) && (!Intrinsics2.m13085a(Header.f30343f, byteString3Mo13771v))) {
                        m13520f(length2, 15, 0);
                        m13518d(byteString3);
                    } else {
                        m13520f(length2, 63, 64);
                        m13518d(byteString3);
                        m13517c(header);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m13520f(int i, int i2, int i3) {
            if (i < i2) {
                this.f30367j.m13721J0(i | i3);
                return;
            }
            this.f30367j.m13721J0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f30367j.m13721J0(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f30367j.m13721J0(i4);
        }

        public /* synthetic */ b(int i, boolean z, Buffer3 buffer3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, buffer3);
        }
    }

    /* JADX INFO: renamed from: g1.j0.j.d$a */
    /* JADX INFO: compiled from: Hpack.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<Header> f30350a;

        /* JADX INFO: renamed from: b */
        public final BufferedSource f30351b;

        /* JADX INFO: renamed from: c */
        public Header[] f30352c;

        /* JADX INFO: renamed from: d */
        public int f30353d;

        /* JADX INFO: renamed from: e */
        public int f30354e;

        /* JADX INFO: renamed from: f */
        public int f30355f;

        /* JADX INFO: renamed from: g */
        public final int f30356g;

        /* JADX INFO: renamed from: h */
        public int f30357h;

        public a(Source source, int i) {
            this(source, i, 0, 4, null);
        }

        public a(Source source, int i, int i2) {
            Intrinsics2.m13090f(source, "source");
            this.f30356g = i;
            this.f30357h = i2;
            this.f30350a = new ArrayList();
            Intrinsics2.m13090f(source, "$this$buffer");
            this.f30351b = new RealBufferedSource(source);
            Header[] headerArr = new Header[8];
            this.f30352c = headerArr;
            this.f30353d = headerArr.length - 1;
        }

        /* JADX INFO: renamed from: a */
        public final void m13508a() {
            Header[] headerArr = this.f30352c;
            int length = headerArr.length;
            Intrinsics2.m13089e(headerArr, "$this$fill");
            Arrays.fill(headerArr, 0, length, (Object) null);
            this.f30353d = this.f30352c.length - 1;
            this.f30354e = 0;
            this.f30355f = 0;
        }

        /* JADX INFO: renamed from: b */
        public final int m13509b(int i) {
            return this.f30353d + 1 + i;
        }

        /* JADX INFO: renamed from: c */
        public final int m13510c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f30352c.length;
                while (true) {
                    length--;
                    i2 = this.f30353d;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.f30352c[length];
                    if (header == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    int i4 = header.f30344g;
                    i -= i4;
                    this.f30355f -= i4;
                    this.f30354e--;
                    i3++;
                }
                Header[] headerArr = this.f30352c;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.f30354e);
                this.f30353d += i3;
            }
            return i3;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x000d  */
        /* JADX INFO: renamed from: d */
        public final ByteString3 m13511d(int i) throws IOException {
            boolean z;
            if (i >= 0) {
                Hpack hpack = Hpack.f30349c;
                if (i <= Hpack.f30347a.length - 1) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                Hpack hpack2 = Hpack.f30349c;
                return Hpack.f30347a[i].f30345h;
            }
            Hpack hpack3 = Hpack.f30349c;
            int iM13509b = m13509b(i - Hpack.f30347a.length);
            if (iM13509b >= 0) {
                Header[] headerArr = this.f30352c;
                if (iM13509b < headerArr.length) {
                    Header header = headerArr[iM13509b];
                    if (header != null) {
                        return header.f30345h;
                    }
                    Intrinsics2.m13095k();
                    throw null;
                }
            }
            StringBuilder sbM1556G = outline.m1556G("Header index too large ");
            sbM1556G.append(i + 1);
            throw new IOException(sbM1556G.toString());
        }

        /* JADX INFO: renamed from: e */
        public final void m13512e(int i, Header header) {
            this.f30350a.add(header);
            int i2 = header.f30344g;
            if (i != -1) {
                Header header2 = this.f30352c[this.f30353d + 1 + i];
                if (header2 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                i2 -= header2.f30344g;
            }
            int i3 = this.f30357h;
            if (i2 > i3) {
                m13508a();
                return;
            }
            int iM13510c = m13510c((this.f30355f + i2) - i3);
            if (i == -1) {
                int i4 = this.f30354e + 1;
                Header[] headerArr = this.f30352c;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.f30353d = this.f30352c.length - 1;
                    this.f30352c = headerArr2;
                }
                int i5 = this.f30353d;
                this.f30353d = i5 - 1;
                this.f30352c[i5] = header;
                this.f30354e++;
            } else {
                this.f30352c[this.f30353d + 1 + i + iM13510c + i] = header;
            }
            this.f30355f += i2;
        }

        /* JADX INFO: renamed from: f */
        public final ByteString3 m13513f() throws IOException {
            byte b = this.f30351b.readByte();
            byte[] bArr = Util9.f30070a;
            int i = b & 255;
            int i2 = 0;
            boolean z = (i & 128) == 128;
            long jM13514g = m13514g(i, 127);
            if (!z) {
                return this.f30351b.mo13748m(jM13514g);
            }
            Buffer3 buffer3 = new Buffer3();
            Huffman huffman = Huffman.f30506d;
            BufferedSource bufferedSource = this.f30351b;
            Intrinsics2.m13090f(bufferedSource, "source");
            Intrinsics2.m13090f(buffer3, "sink");
            Huffman.a aVar = Huffman.f30505c;
            int i3 = 0;
            for (long j2 = 0; j2 < jM13514g; j2++) {
                byte b2 = bufferedSource.readByte();
                byte[] bArr2 = Util9.f30070a;
                i2 = (i2 << 8) | (b2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    int i4 = i3 - 8;
                    int i5 = (i2 >>> i4) & 255;
                    Huffman.a[] aVarArr = aVar.f30507a;
                    if (aVarArr == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    aVar = aVarArr[i5];
                    if (aVar == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    if (aVar.f30507a == null) {
                        buffer3.m13721J0(aVar.f30508b);
                        i3 -= aVar.f30509c;
                        aVar = Huffman.f30505c;
                    } else {
                        i3 = i4;
                    }
                }
            }
            while (i3 > 0) {
                int i6 = (i2 << (8 - i3)) & 255;
                Huffman.a[] aVarArr2 = aVar.f30507a;
                if (aVarArr2 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                Huffman.a aVar2 = aVarArr2[i6];
                if (aVar2 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                if (aVar2.f30507a != null || aVar2.f30509c > i3) {
                    break;
                }
                buffer3.m13721J0(aVar2.f30508b);
                i3 -= aVar2.f30509c;
                aVar = Huffman.f30505c;
            }
            return buffer3.mo13736Y();
        }

        /* JADX INFO: renamed from: g */
        public final int m13514g(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.f30351b.readByte();
                byte[] bArr = Util9.f30070a;
                int i5 = b & 255;
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        public /* synthetic */ a(Source source, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i, (i3 & 4) != 0 ? i : i2);
        }
    }
}
