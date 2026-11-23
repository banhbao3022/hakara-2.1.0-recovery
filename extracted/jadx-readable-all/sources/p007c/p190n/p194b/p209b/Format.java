package p007c.p190n.p194b.p209b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p213c2.ColorInfo;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p209b.p218q1.ExoMediaCrypto;
import p007c.p190n.p194b.p209b.p218q1.UnsupportedMediaCrypto;
import p007c.p190n.p194b.p209b.p234u1.Metadata;

/* JADX INFO: renamed from: c.n.b.b.n0, reason: use source file name */
/* JADX INFO: compiled from: Format.java */
/* JADX INFO: loaded from: classes.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new a();

    /* JADX INFO: renamed from: A */
    public final byte[] f6912A;

    /* JADX INFO: renamed from: B */
    public final int f6913B;

    /* JADX INFO: renamed from: C */
    public final ColorInfo f6914C;

    /* JADX INFO: renamed from: D */
    public final int f6915D;

    /* JADX INFO: renamed from: E */
    public final int f6916E;

    /* JADX INFO: renamed from: F */
    public final int f6917F;

    /* JADX INFO: renamed from: G */
    public final int f6918G;

    /* JADX INFO: renamed from: H */
    public final int f6919H;

    /* JADX INFO: renamed from: I */
    public final int f6920I;

    /* JADX INFO: renamed from: J */
    public final Class<? extends ExoMediaCrypto> f6921J;

    /* JADX INFO: renamed from: K */
    public int f6922K;

    /* JADX INFO: renamed from: f */
    public final String f6923f;

    /* JADX INFO: renamed from: g */
    public final String f6924g;

    /* JADX INFO: renamed from: h */
    public final String f6925h;

    /* JADX INFO: renamed from: i */
    public final int f6926i;

    /* JADX INFO: renamed from: j */
    public final int f6927j;

    /* JADX INFO: renamed from: k */
    public final int f6928k;

    /* JADX INFO: renamed from: l */
    public final int f6929l;

    /* JADX INFO: renamed from: m */
    public final int f6930m;

    /* JADX INFO: renamed from: n */
    public final String f6931n;

    /* JADX INFO: renamed from: o */
    public final Metadata f6932o;

    /* JADX INFO: renamed from: p */
    public final String f6933p;

    /* JADX INFO: renamed from: q */
    public final String f6934q;

    /* JADX INFO: renamed from: r */
    public final int f6935r;

    /* JADX INFO: renamed from: s */
    public final List<byte[]> f6936s;

    /* JADX INFO: renamed from: t */
    public final DrmInitData f6937t;

    /* JADX INFO: renamed from: u */
    public final long f6938u;

    /* JADX INFO: renamed from: v */
    public final int f6939v;

    /* JADX INFO: renamed from: w */
    public final int f6940w;

    /* JADX INFO: renamed from: x */
    public final float f6941x;

    /* JADX INFO: renamed from: y */
    public final int f6942y;

    /* JADX INFO: renamed from: z */
    public final float f6943z;

    /* JADX INFO: renamed from: c.n.b.b.n0$a */
    /* JADX INFO: compiled from: Format.java */
    public class a implements Parcelable.Creator<Format> {
        @Override // android.os.Parcelable.Creator
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Format[] newArray(int i) {
            return new Format[i];
        }
    }

    public Format(b bVar, a aVar) {
        this.f6923f = bVar.f6948a;
        this.f6924g = bVar.f6949b;
        this.f6925h = Util6.m3099H(bVar.f6950c);
        this.f6926i = bVar.f6951d;
        this.f6927j = bVar.f6952e;
        int i = bVar.f6953f;
        this.f6928k = i;
        int i2 = bVar.f6954g;
        this.f6929l = i2;
        this.f6930m = i2 != -1 ? i2 : i;
        this.f6931n = bVar.f6955h;
        this.f6932o = bVar.f6956i;
        this.f6933p = bVar.f6957j;
        this.f6934q = bVar.f6958k;
        this.f6935r = bVar.f6959l;
        List<byte[]> list = bVar.f6960m;
        this.f6936s = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = bVar.f6961n;
        this.f6937t = drmInitData;
        this.f6938u = bVar.f6962o;
        this.f6939v = bVar.f6963p;
        this.f6940w = bVar.f6964q;
        this.f6941x = bVar.f6965r;
        int i3 = bVar.f6966s;
        this.f6942y = i3 == -1 ? 0 : i3;
        float f = bVar.f6967t;
        this.f6943z = f == -1.0f ? 1.0f : f;
        this.f6912A = bVar.f6968u;
        this.f6913B = bVar.f6969v;
        this.f6914C = bVar.f6970w;
        this.f6915D = bVar.f6971x;
        this.f6916E = bVar.f6972y;
        this.f6917F = bVar.f6973z;
        int i4 = bVar.f6944A;
        this.f6918G = i4 == -1 ? 0 : i4;
        int i5 = bVar.f6945B;
        this.f6919H = i5 != -1 ? i5 : 0;
        this.f6920I = bVar.f6946C;
        Class<? extends ExoMediaCrypto> cls = bVar.f6947D;
        if (cls != null || drmInitData == null) {
            this.f6921J = cls;
        } else {
            this.f6921J = UnsupportedMediaCrypto.class;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m3514d(Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sbM1556G = outline.m1556G("id=");
        sbM1556G.append(format.f6923f);
        sbM1556G.append(", mimeType=");
        sbM1556G.append(format.f6934q);
        if (format.f6930m != -1) {
            sbM1556G.append(", bitrate=");
            sbM1556G.append(format.f6930m);
        }
        if (format.f6931n != null) {
            sbM1556G.append(", codecs=");
            sbM1556G.append(format.f6931n);
        }
        if (format.f6939v != -1 && format.f6940w != -1) {
            sbM1556G.append(", res=");
            sbM1556G.append(format.f6939v);
            sbM1556G.append("x");
            sbM1556G.append(format.f6940w);
        }
        if (format.f6941x != -1.0f) {
            sbM1556G.append(", fps=");
            sbM1556G.append(format.f6941x);
        }
        if (format.f6915D != -1) {
            sbM1556G.append(", channels=");
            sbM1556G.append(format.f6915D);
        }
        if (format.f6916E != -1) {
            sbM1556G.append(", sample_rate=");
            sbM1556G.append(format.f6916E);
        }
        if (format.f6925h != null) {
            sbM1556G.append(", language=");
            sbM1556G.append(format.f6925h);
        }
        if (format.f6924g != null) {
            sbM1556G.append(", label=");
            sbM1556G.append(format.f6924g);
        }
        return sbM1556G.toString();
    }

    /* JADX INFO: renamed from: a */
    public b m3515a() {
        return new b(this, null);
    }

    /* JADX INFO: renamed from: b */
    public Format m3516b(Class<? extends ExoMediaCrypto> cls) {
        b bVarM3515a = m3515a();
        bVarM3515a.f6947D = cls;
        return bVarM3515a.m3519a();
    }

    /* JADX INFO: renamed from: c */
    public boolean m3517c(Format format) {
        if (this.f6936s.size() != format.f6936s.size()) {
            return false;
        }
        for (int i = 0; i < this.f6936s.size(); i++) {
            if (!Arrays.equals(this.f6936s.get(i), format.f6936s.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public Format m3518e(Format format) {
        String str;
        String str2;
        int i;
        DrmInitData.b[] bVarArr;
        int i2;
        boolean z;
        if (this == format) {
            return this;
        }
        int iM3167i = MimeTypes.m3167i(this.f6934q);
        String str3 = format.f6923f;
        String str4 = format.f6924g;
        if (str4 == null) {
            str4 = this.f6924g;
        }
        String str5 = this.f6925h;
        if ((iM3167i == 3 || iM3167i == 1) && (str = format.f6925h) != null) {
            str5 = str;
        }
        int i3 = this.f6928k;
        if (i3 == -1) {
            i3 = format.f6928k;
        }
        int i4 = this.f6929l;
        if (i4 == -1) {
            i4 = format.f6929l;
        }
        String str6 = this.f6931n;
        if (str6 == null) {
            String strM3131s = Util6.m3131s(format.f6931n, iM3167i);
            if (Util6.m3108Q(strM3131s).length == 1) {
                str6 = strM3131s;
            }
        }
        Metadata metadata = this.f6932o;
        Metadata metadataM4009b = metadata == null ? format.f6932o : metadata.m4009b(format.f6932o);
        float f = this.f6941x;
        if (f == -1.0f && iM3167i == 2) {
            f = format.f6941x;
        }
        int i5 = this.f6926i | format.f6926i;
        int i6 = this.f6927j | format.f6927j;
        DrmInitData drmInitData = format.f6937t;
        DrmInitData drmInitData2 = this.f6937t;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str2 = drmInitData.f7430h;
            DrmInitData.b[] bVarArr2 = drmInitData.f7428f;
            int length = bVarArr2.length;
            int i7 = 0;
            while (true) {
                String str7 = str2;
                if (i7 >= length) {
                    break;
                }
                DrmInitData.b bVar = bVarArr2[i7];
                if (bVar.m3688a()) {
                    arrayList.add(bVar);
                }
                i7++;
                str2 = str7;
            }
        } else {
            str2 = null;
        }
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.f7430h;
            }
            int size = arrayList.size();
            DrmInitData.b[] bVarArr3 = drmInitData2.f7428f;
            int length2 = bVarArr3.length;
            int i8 = 0;
            while (true) {
                String str8 = str2;
                if (i8 >= length2) {
                    break;
                }
                DrmInitData.b bVar2 = bVarArr3[i8];
                if (bVar2.m3688a()) {
                    bVarArr = bVarArr3;
                    UUID uuid = bVar2.f7433g;
                    i2 = length2;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size) {
                            i = size;
                            z = false;
                            break;
                        }
                        i = size;
                        if (((DrmInitData.b) arrayList.get(i9)).f7433g.equals(uuid)) {
                            z = true;
                            break;
                        }
                        i9++;
                        size = i;
                    }
                    if (!z) {
                        arrayList.add(bVar2);
                    }
                } else {
                    i = size;
                    bVarArr = bVarArr3;
                    i2 = length2;
                }
                i8++;
                str2 = str8;
                bVarArr3 = bVarArr;
                length2 = i2;
                size = i;
            }
        }
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, arrayList);
        b bVarM3515a = m3515a();
        bVarM3515a.f6948a = str3;
        bVarM3515a.f6949b = str4;
        bVarM3515a.f6950c = str5;
        bVarM3515a.f6951d = i5;
        bVarM3515a.f6952e = i6;
        bVarM3515a.f6953f = i3;
        bVarM3515a.f6954g = i4;
        bVarM3515a.f6955h = str6;
        bVarM3515a.f6956i = metadataM4009b;
        bVarM3515a.f6961n = drmInitData3;
        bVarM3515a.f6965r = f;
        return bVarM3515a.m3519a();
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.f6922K;
        return (i2 == 0 || (i = format.f6922K) == 0 || i2 == i) && this.f6926i == format.f6926i && this.f6927j == format.f6927j && this.f6928k == format.f6928k && this.f6929l == format.f6929l && this.f6935r == format.f6935r && this.f6938u == format.f6938u && this.f6939v == format.f6939v && this.f6940w == format.f6940w && this.f6942y == format.f6942y && this.f6913B == format.f6913B && this.f6915D == format.f6915D && this.f6916E == format.f6916E && this.f6917F == format.f6917F && this.f6918G == format.f6918G && this.f6919H == format.f6919H && this.f6920I == format.f6920I && Float.compare(this.f6941x, format.f6941x) == 0 && Float.compare(this.f6943z, format.f6943z) == 0 && Util6.m3113a(this.f6921J, format.f6921J) && Util6.m3113a(this.f6923f, format.f6923f) && Util6.m3113a(this.f6924g, format.f6924g) && Util6.m3113a(this.f6931n, format.f6931n) && Util6.m3113a(this.f6933p, format.f6933p) && Util6.m3113a(this.f6934q, format.f6934q) && Util6.m3113a(this.f6925h, format.f6925h) && Arrays.equals(this.f6912A, format.f6912A) && Util6.m3113a(this.f6932o, format.f6932o) && Util6.m3113a(this.f6914C, format.f6914C) && Util6.m3113a(this.f6937t, format.f6937t) && m3517c(format);
    }

    public int hashCode() {
        if (this.f6922K == 0) {
            String str = this.f6923f;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f6924g;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f6925h;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f6926i) * 31) + this.f6927j) * 31) + this.f6928k) * 31) + this.f6929l) * 31;
            String str4 = this.f6931n;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f6932o;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f6933p;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f6934q;
            int iFloatToIntBits = (((((((((((((((Float.floatToIntBits(this.f6943z) + ((((Float.floatToIntBits(this.f6941x) + ((((((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f6935r) * 31) + ((int) this.f6938u)) * 31) + this.f6939v) * 31) + this.f6940w) * 31)) * 31) + this.f6942y) * 31)) * 31) + this.f6913B) * 31) + this.f6915D) * 31) + this.f6916E) * 31) + this.f6917F) * 31) + this.f6918G) * 31) + this.f6919H) * 31) + this.f6920I) * 31;
            Class<? extends ExoMediaCrypto> cls = this.f6921J;
            this.f6922K = iFloatToIntBits + (cls != null ? cls.hashCode() : 0);
        }
        return this.f6922K;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Format(");
        sbM1556G.append(this.f6923f);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6924g);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6933p);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6934q);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6931n);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6930m);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6925h);
        sbM1556G.append(", [");
        sbM1556G.append(this.f6939v);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6940w);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6941x);
        sbM1556G.append("], [");
        sbM1556G.append(this.f6915D);
        sbM1556G.append(", ");
        return outline.m1603y(sbM1556G, this.f6916E, "])");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6923f);
        parcel.writeString(this.f6924g);
        parcel.writeString(this.f6925h);
        parcel.writeInt(this.f6926i);
        parcel.writeInt(this.f6927j);
        parcel.writeInt(this.f6928k);
        parcel.writeInt(this.f6929l);
        parcel.writeString(this.f6931n);
        parcel.writeParcelable(this.f6932o, 0);
        parcel.writeString(this.f6933p);
        parcel.writeString(this.f6934q);
        parcel.writeInt(this.f6935r);
        int size = this.f6936s.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f6936s.get(i2));
        }
        parcel.writeParcelable(this.f6937t, 0);
        parcel.writeLong(this.f6938u);
        parcel.writeInt(this.f6939v);
        parcel.writeInt(this.f6940w);
        parcel.writeFloat(this.f6941x);
        parcel.writeInt(this.f6942y);
        parcel.writeFloat(this.f6943z);
        int i3 = this.f6912A != null ? 1 : 0;
        int i4 = Util6.f6307a;
        parcel.writeInt(i3);
        byte[] bArr = this.f6912A;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f6913B);
        parcel.writeParcelable(this.f6914C, i);
        parcel.writeInt(this.f6915D);
        parcel.writeInt(this.f6916E);
        parcel.writeInt(this.f6917F);
        parcel.writeInt(this.f6918G);
        parcel.writeInt(this.f6919H);
        parcel.writeInt(this.f6920I);
    }

    /* JADX INFO: renamed from: c.n.b.b.n0$b */
    /* JADX INFO: compiled from: Format.java */
    public static final class b {

        /* JADX INFO: renamed from: A */
        public int f6944A;

        /* JADX INFO: renamed from: B */
        public int f6945B;

        /* JADX INFO: renamed from: C */
        public int f6946C;

        /* JADX INFO: renamed from: D */
        public Class<? extends ExoMediaCrypto> f6947D;

        /* JADX INFO: renamed from: a */
        public String f6948a;

        /* JADX INFO: renamed from: b */
        public String f6949b;

        /* JADX INFO: renamed from: c */
        public String f6950c;

        /* JADX INFO: renamed from: d */
        public int f6951d;

        /* JADX INFO: renamed from: e */
        public int f6952e;

        /* JADX INFO: renamed from: f */
        public int f6953f;

        /* JADX INFO: renamed from: g */
        public int f6954g;

        /* JADX INFO: renamed from: h */
        public String f6955h;

        /* JADX INFO: renamed from: i */
        public Metadata f6956i;

        /* JADX INFO: renamed from: j */
        public String f6957j;

        /* JADX INFO: renamed from: k */
        public String f6958k;

        /* JADX INFO: renamed from: l */
        public int f6959l;

        /* JADX INFO: renamed from: m */
        public List<byte[]> f6960m;

        /* JADX INFO: renamed from: n */
        public DrmInitData f6961n;

        /* JADX INFO: renamed from: o */
        public long f6962o;

        /* JADX INFO: renamed from: p */
        public int f6963p;

        /* JADX INFO: renamed from: q */
        public int f6964q;

        /* JADX INFO: renamed from: r */
        public float f6965r;

        /* JADX INFO: renamed from: s */
        public int f6966s;

        /* JADX INFO: renamed from: t */
        public float f6967t;

        /* JADX INFO: renamed from: u */
        public byte[] f6968u;

        /* JADX INFO: renamed from: v */
        public int f6969v;

        /* JADX INFO: renamed from: w */
        public ColorInfo f6970w;

        /* JADX INFO: renamed from: x */
        public int f6971x;

        /* JADX INFO: renamed from: y */
        public int f6972y;

        /* JADX INFO: renamed from: z */
        public int f6973z;

        public b() {
            this.f6953f = -1;
            this.f6954g = -1;
            this.f6959l = -1;
            this.f6962o = Long.MAX_VALUE;
            this.f6963p = -1;
            this.f6964q = -1;
            this.f6965r = -1.0f;
            this.f6967t = 1.0f;
            this.f6969v = -1;
            this.f6971x = -1;
            this.f6972y = -1;
            this.f6973z = -1;
            this.f6946C = -1;
        }

        /* JADX INFO: renamed from: a */
        public Format m3519a() {
            return new Format(this, null);
        }

        /* JADX INFO: renamed from: b */
        public b m3520b(int i) {
            this.f6948a = Integer.toString(i);
            return this;
        }

        public b(Format format, a aVar) {
            this.f6948a = format.f6923f;
            this.f6949b = format.f6924g;
            this.f6950c = format.f6925h;
            this.f6951d = format.f6926i;
            this.f6952e = format.f6927j;
            this.f6953f = format.f6928k;
            this.f6954g = format.f6929l;
            this.f6955h = format.f6931n;
            this.f6956i = format.f6932o;
            this.f6957j = format.f6933p;
            this.f6958k = format.f6934q;
            this.f6959l = format.f6935r;
            this.f6960m = format.f6936s;
            this.f6961n = format.f6937t;
            this.f6962o = format.f6938u;
            this.f6963p = format.f6939v;
            this.f6964q = format.f6940w;
            this.f6965r = format.f6941x;
            this.f6966s = format.f6942y;
            this.f6967t = format.f6943z;
            this.f6968u = format.f6912A;
            this.f6969v = format.f6913B;
            this.f6970w = format.f6914C;
            this.f6971x = format.f6915D;
            this.f6972y = format.f6916E;
            this.f6973z = format.f6917F;
            this.f6944A = format.f6918G;
            this.f6945B = format.f6919H;
            this.f6946C = format.f6920I;
            this.f6947D = format.f6921J;
        }
    }

    public Format(Parcel parcel) {
        this.f6923f = parcel.readString();
        this.f6924g = parcel.readString();
        this.f6925h = parcel.readString();
        this.f6926i = parcel.readInt();
        this.f6927j = parcel.readInt();
        int i = parcel.readInt();
        this.f6928k = i;
        int i2 = parcel.readInt();
        this.f6929l = i2;
        this.f6930m = i2 != -1 ? i2 : i;
        this.f6931n = parcel.readString();
        this.f6932o = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.f6933p = parcel.readString();
        this.f6934q = parcel.readString();
        this.f6935r = parcel.readInt();
        int i3 = parcel.readInt();
        this.f6936s = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            List<byte[]> list = this.f6936s;
            byte[] bArrCreateByteArray = parcel.createByteArray();
            Objects.requireNonNull(bArrCreateByteArray);
            list.add(bArrCreateByteArray);
        }
        DrmInitData drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f6937t = drmInitData;
        this.f6938u = parcel.readLong();
        this.f6939v = parcel.readInt();
        this.f6940w = parcel.readInt();
        this.f6941x = parcel.readFloat();
        this.f6942y = parcel.readInt();
        this.f6943z = parcel.readFloat();
        int i5 = Util6.f6307a;
        this.f6912A = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f6913B = parcel.readInt();
        this.f6914C = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f6915D = parcel.readInt();
        this.f6916E = parcel.readInt();
        this.f6917F = parcel.readInt();
        this.f6918G = parcel.readInt();
        this.f6919H = parcel.readInt();
        this.f6920I = parcel.readInt();
        this.f6921J = drmInitData != null ? UnsupportedMediaCrypto.class : null;
    }
}
