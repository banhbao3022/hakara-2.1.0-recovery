package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ch2 implements Parcelable {
    public static final Parcelable.Creator<ch2> CREATOR = new bh2();

    /* JADX INFO: renamed from: A */
    public final int f13005A;

    /* JADX INFO: renamed from: B */
    public final long f13006B;

    /* JADX INFO: renamed from: C */
    public final int f13007C;

    /* JADX INFO: renamed from: D */
    public final String f13008D;

    /* JADX INFO: renamed from: E */
    public final int f13009E;

    /* JADX INFO: renamed from: F */
    public int f13010F;

    /* JADX INFO: renamed from: f */
    public final String f13011f;

    /* JADX INFO: renamed from: g */
    public final int f13012g;

    /* JADX INFO: renamed from: h */
    public final String f13013h;

    /* JADX INFO: renamed from: i */
    public final el2 f13014i;

    /* JADX INFO: renamed from: j */
    public final String f13015j;

    /* JADX INFO: renamed from: k */
    public final String f13016k;

    /* JADX INFO: renamed from: l */
    public final int f13017l;

    /* JADX INFO: renamed from: m */
    public final List<byte[]> f13018m;

    /* JADX INFO: renamed from: n */
    public final yi2 f13019n;

    /* JADX INFO: renamed from: o */
    public final int f13020o;

    /* JADX INFO: renamed from: p */
    public final int f13021p;

    /* JADX INFO: renamed from: q */
    public final float f13022q;

    /* JADX INFO: renamed from: r */
    public final int f13023r;

    /* JADX INFO: renamed from: s */
    public final float f13024s;

    /* JADX INFO: renamed from: t */
    public final int f13025t;

    /* JADX INFO: renamed from: u */
    public final byte[] f13026u;

    /* JADX INFO: renamed from: v */
    public final mo2 f13027v;

    /* JADX INFO: renamed from: w */
    public final int f13028w;

    /* JADX INFO: renamed from: x */
    public final int f13029x;

    /* JADX INFO: renamed from: y */
    public final int f13030y;

    /* JADX INFO: renamed from: z */
    public final int f13031z;

    public ch2(Parcel parcel) {
        this.f13011f = parcel.readString();
        this.f13015j = parcel.readString();
        this.f13016k = parcel.readString();
        this.f13013h = parcel.readString();
        this.f13012g = parcel.readInt();
        this.f13017l = parcel.readInt();
        this.f13020o = parcel.readInt();
        this.f13021p = parcel.readInt();
        this.f13022q = parcel.readFloat();
        this.f13023r = parcel.readInt();
        this.f13024s = parcel.readFloat();
        this.f13026u = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f13025t = parcel.readInt();
        this.f13027v = (mo2) parcel.readParcelable(mo2.class.getClassLoader());
        this.f13028w = parcel.readInt();
        this.f13029x = parcel.readInt();
        this.f13030y = parcel.readInt();
        this.f13031z = parcel.readInt();
        this.f13005A = parcel.readInt();
        this.f13007C = parcel.readInt();
        this.f13008D = parcel.readString();
        this.f13009E = parcel.readInt();
        this.f13006B = parcel.readLong();
        int i = parcel.readInt();
        this.f13018m = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f13018m.add(parcel.createByteArray());
        }
        this.f13019n = (yi2) parcel.readParcelable(yi2.class.getClassLoader());
        this.f13014i = (el2) parcel.readParcelable(el2.class.getClassLoader());
    }

    /* JADX INFO: renamed from: a */
    public static ch2 m6181a(String str, String str2, String str3, int i, int i2, int i3, List list, int i4, float f, byte[] bArr, int i5, mo2 mo2Var, yi2 yi2Var) {
        return new ch2(str, null, str2, null, -1, i, i2, i3, -1.0f, i4, f, bArr, i5, mo2Var, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, yi2Var, null);
    }

    /* JADX INFO: renamed from: b */
    public static ch2 m6182b(String str, String str2, int i, int i2, yi2 yi2Var, String str3) {
        return m6183c(str, str2, null, -1, i, i2, -1, null, yi2Var, 0, str3);
    }

    /* JADX INFO: renamed from: c */
    public static ch2 m6183c(String str, String str2, String str3, int i, int i2, int i3, int i4, List list, yi2 yi2Var, int i5, String str4) {
        return new ch2(str, null, str2, null, -1, i, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, i4, -1, -1, i5, str4, -1, Long.MAX_VALUE, list, yi2Var, null);
    }

    /* JADX INFO: renamed from: d */
    public static ch2 m6184d(String str, String str2, String str3, int i, String str4, yi2 yi2Var, long j2, List list) {
        return new ch2(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i, str4, -1, j2, list, yi2Var, null);
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: h */
    public static void m6185h(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final ch2 m6186e(el2 el2Var) {
        return new ch2(this.f13011f, this.f13015j, this.f13016k, this.f13013h, this.f13012g, this.f13017l, this.f13020o, this.f13021p, this.f13022q, this.f13023r, this.f13024s, this.f13026u, this.f13025t, this.f13027v, this.f13028w, this.f13029x, this.f13030y, this.f13031z, this.f13005A, this.f13007C, this.f13008D, this.f13009E, this.f13006B, this.f13018m, this.f13019n, el2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ch2.class == obj.getClass()) {
            ch2 ch2Var = (ch2) obj;
            if (this.f13012g == ch2Var.f13012g && this.f13017l == ch2Var.f13017l && this.f13020o == ch2Var.f13020o && this.f13021p == ch2Var.f13021p && this.f13022q == ch2Var.f13022q && this.f13023r == ch2Var.f13023r && this.f13024s == ch2Var.f13024s && this.f13025t == ch2Var.f13025t && this.f13028w == ch2Var.f13028w && this.f13029x == ch2Var.f13029x && this.f13030y == ch2Var.f13030y && this.f13031z == ch2Var.f13031z && this.f13005A == ch2Var.f13005A && this.f13006B == ch2Var.f13006B && this.f13007C == ch2Var.f13007C && jo2.m7369a(this.f13011f, ch2Var.f13011f) && jo2.m7369a(this.f13008D, ch2Var.f13008D) && this.f13009E == ch2Var.f13009E && jo2.m7369a(this.f13015j, ch2Var.f13015j) && jo2.m7369a(this.f13016k, ch2Var.f13016k) && jo2.m7369a(this.f13013h, ch2Var.f13013h) && jo2.m7369a(this.f13019n, ch2Var.f13019n) && jo2.m7369a(this.f13014i, ch2Var.f13014i) && jo2.m7369a(this.f13027v, ch2Var.f13027v) && Arrays.equals(this.f13026u, ch2Var.f13026u) && this.f13018m.size() == ch2Var.f13018m.size()) {
                for (int i = 0; i < this.f13018m.size(); i++) {
                    if (!Arrays.equals(this.f13018m.get(i), ch2Var.f13018m.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m6187f() {
        int i;
        int i2 = this.f13020o;
        if (i2 == -1 || (i = this.f13021p) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* JADX INFO: renamed from: g */
    public final MediaFormat m6188g() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f13016k);
        String str = this.f13008D;
        if (str != null) {
            mediaFormat.setString(CainMediaMetadataRetriever.METADATA_KEY_LANGUAGE, str);
        }
        m6185h(mediaFormat, "max-input-size", this.f13017l);
        m6185h(mediaFormat, "width", this.f13020o);
        m6185h(mediaFormat, "height", this.f13021p);
        float f = this.f13022q;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m6185h(mediaFormat, "rotation-degrees", this.f13023r);
        m6185h(mediaFormat, "channel-count", this.f13028w);
        m6185h(mediaFormat, "sample-rate", this.f13029x);
        m6185h(mediaFormat, "encoder-delay", this.f13031z);
        m6185h(mediaFormat, "encoder-padding", this.f13005A);
        for (int i = 0; i < this.f13018m.size(); i++) {
            mediaFormat.setByteBuffer(outline.m1585g(15, "csd-", i), ByteBuffer.wrap(this.f13018m.get(i)));
        }
        mo2 mo2Var = this.f13027v;
        if (mo2Var != null) {
            m6185h(mediaFormat, "color-transfer", mo2Var.f16814h);
            m6185h(mediaFormat, "color-standard", mo2Var.f16812f);
            m6185h(mediaFormat, "color-range", mo2Var.f16813g);
            byte[] bArr = mo2Var.f16815i;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final int hashCode() {
        int i = this.f13010F;
        if (i != 0) {
            return i;
        }
        String str = this.f13011f;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.f13015j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13016k;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13013h;
        int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f13012g) * 31) + this.f13020o) * 31) + this.f13021p) * 31) + this.f13028w) * 31) + this.f13029x) * 31;
        String str5 = this.f13008D;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f13009E) * 31;
        yi2 yi2Var = this.f13019n;
        int iHashCode6 = (iHashCode5 + (yi2Var == null ? 0 : yi2Var.hashCode())) * 31;
        el2 el2Var = this.f13014i;
        int iHashCode7 = iHashCode6 + (el2Var != null ? el2Var.hashCode() : 0);
        this.f13010F = iHashCode7;
        return iHashCode7;
    }

    public final String toString() {
        String str = this.f13011f;
        String str2 = this.f13015j;
        String str3 = this.f13016k;
        int i = this.f13012g;
        String str4 = this.f13008D;
        int i2 = this.f13020o;
        int i3 = this.f13021p;
        float f = this.f13022q;
        int i4 = this.f13028w;
        int i5 = this.f13029x;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 100 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        outline.m1572W(sb, "Format(", str, ", ", str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13011f);
        parcel.writeString(this.f13015j);
        parcel.writeString(this.f13016k);
        parcel.writeString(this.f13013h);
        parcel.writeInt(this.f13012g);
        parcel.writeInt(this.f13017l);
        parcel.writeInt(this.f13020o);
        parcel.writeInt(this.f13021p);
        parcel.writeFloat(this.f13022q);
        parcel.writeInt(this.f13023r);
        parcel.writeFloat(this.f13024s);
        parcel.writeInt(this.f13026u != null ? 1 : 0);
        byte[] bArr = this.f13026u;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f13025t);
        parcel.writeParcelable(this.f13027v, i);
        parcel.writeInt(this.f13028w);
        parcel.writeInt(this.f13029x);
        parcel.writeInt(this.f13030y);
        parcel.writeInt(this.f13031z);
        parcel.writeInt(this.f13005A);
        parcel.writeInt(this.f13007C);
        parcel.writeString(this.f13008D);
        parcel.writeInt(this.f13009E);
        parcel.writeLong(this.f13006B);
        int size = this.f13018m.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f13018m.get(i2));
        }
        parcel.writeParcelable(this.f13019n, 0);
        parcel.writeParcelable(this.f13014i, 0);
    }

    public ch2(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, mo2 mo2Var, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j2, List<byte[]> list, yi2 yi2Var, el2 el2Var) {
        this.f13011f = str;
        this.f13015j = str2;
        this.f13016k = str3;
        this.f13013h = str4;
        this.f13012g = i;
        this.f13017l = i2;
        this.f13020o = i3;
        this.f13021p = i4;
        this.f13022q = f;
        this.f13023r = i5;
        this.f13024s = f2;
        this.f13026u = bArr;
        this.f13025t = i6;
        this.f13027v = mo2Var;
        this.f13028w = i7;
        this.f13029x = i8;
        this.f13030y = i9;
        this.f13031z = i10;
        this.f13005A = i11;
        this.f13007C = i12;
        this.f13008D = str5;
        this.f13009E = i13;
        this.f13006B = j2;
        this.f13018m = list == null ? Collections.emptyList() : list;
        this.f13019n = yi2Var;
        this.f13014i = el2Var;
    }
}
