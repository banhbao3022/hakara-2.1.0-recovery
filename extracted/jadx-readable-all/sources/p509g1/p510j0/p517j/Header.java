package p509g1.p510j0.p517j;

import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p524h1.ByteString3;

/* JADX INFO: renamed from: g1.j0.j.c, reason: use source file name */
/* JADX INFO: compiled from: Header.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Header {

    /* JADX INFO: renamed from: a */
    public static final ByteString3 f30338a;

    /* JADX INFO: renamed from: b */
    public static final ByteString3 f30339b;

    /* JADX INFO: renamed from: c */
    public static final ByteString3 f30340c;

    /* JADX INFO: renamed from: d */
    public static final ByteString3 f30341d;

    /* JADX INFO: renamed from: e */
    public static final ByteString3 f30342e;

    /* JADX INFO: renamed from: f */
    public static final ByteString3 f30343f;

    /* JADX INFO: renamed from: g */
    public final int f30344g;

    /* JADX INFO: renamed from: h */
    public final ByteString3 f30345h;

    /* JADX INFO: renamed from: i */
    public final ByteString3 f30346i;

    /* JADX INFO: renamed from: g1.j0.j.c$a */
    /* JADX INFO: compiled from: Header.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        ByteString3.a aVar = ByteString3.f30712g;
        f30338a = aVar.m13777c(":");
        f30339b = aVar.m13777c(":status");
        f30340c = aVar.m13777c(":method");
        f30341d = aVar.m13777c(":path");
        f30342e = aVar.m13777c(":scheme");
        f30343f = aVar.m13777c(":authority");
    }

    public Header(ByteString3 byteString3, ByteString3 byteString4) {
        Intrinsics2.m13090f(byteString3, "name");
        Intrinsics2.m13090f(byteString4, "value");
        this.f30345h = byteString3;
        this.f30346i = byteString4;
        this.f30344g = byteString3.mo13765j() + 32 + byteString4.mo13765j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics2.m13085a(this.f30345h, header.f30345h) && Intrinsics2.m13085a(this.f30346i, header.f30346i);
    }

    public int hashCode() {
        ByteString3 byteString3 = this.f30345h;
        int iHashCode = (byteString3 != null ? byteString3.hashCode() : 0) * 31;
        ByteString3 byteString4 = this.f30346i;
        return iHashCode + (byteString4 != null ? byteString4.hashCode() : 0);
    }

    public String toString() {
        return this.f30345h.m13772w() + ": " + this.f30346i.m13772w();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(String str, String str2) {
        Intrinsics2.m13090f(str, "name");
        Intrinsics2.m13090f(str2, "value");
        ByteString3.a aVar = ByteString3.f30712g;
        this(aVar.m13777c(str), aVar.m13777c(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(ByteString3 byteString3, String str) {
        this(byteString3, ByteString3.f30712g.m13777c(str));
        Intrinsics2.m13090f(byteString3, "name");
        Intrinsics2.m13090f(str, "value");
    }
}
