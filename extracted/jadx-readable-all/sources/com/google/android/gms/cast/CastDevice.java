package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p266d.p290d.C2421q1;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p301p.C2708a;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class CastDevice extends AbstractC2767a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new C2421q1();

    /* JADX INFO: renamed from: f */
    public String f28545f;

    /* JADX INFO: renamed from: g */
    public String f28546g;

    /* JADX INFO: renamed from: h */
    public InetAddress f28547h;

    /* JADX INFO: renamed from: i */
    public String f28548i;

    /* JADX INFO: renamed from: j */
    public String f28549j;

    /* JADX INFO: renamed from: k */
    public String f28550k;

    /* JADX INFO: renamed from: l */
    public int f28551l;

    /* JADX INFO: renamed from: m */
    public List<C2708a> f28552m;

    /* JADX INFO: renamed from: n */
    public int f28553n;

    /* JADX INFO: renamed from: o */
    public int f28554o;

    /* JADX INFO: renamed from: p */
    public String f28555p;

    /* JADX INFO: renamed from: q */
    public String f28556q;

    /* JADX INFO: renamed from: r */
    public int f28557r;

    /* JADX INFO: renamed from: s */
    public String f28558s;

    /* JADX INFO: renamed from: t */
    public byte[] f28559t;

    /* JADX INFO: renamed from: u */
    public String f28560u;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, List<C2708a> list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9) {
        this.f28545f = str == null ? "" : str;
        String str10 = str2 == null ? "" : str2;
        this.f28546g = str10;
        if (!TextUtils.isEmpty(str10)) {
            try {
                this.f28547h = InetAddress.getByName(this.f28546g);
            } catch (UnknownHostException e) {
                String str11 = this.f28546g;
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + String.valueOf(str11).length() + 48);
                sb.append("Unable to convert host address (");
                sb.append(str11);
                sb.append(") to ipaddress: ");
                sb.append(message);
                Log.i("CastDevice", sb.toString());
            }
        }
        this.f28548i = str3 == null ? "" : str3;
        this.f28549j = str4 == null ? "" : str4;
        this.f28550k = str5 == null ? "" : str5;
        this.f28551l = i;
        this.f28552m = list != null ? list : new ArrayList<>();
        this.f28553n = i2;
        this.f28554o = i3;
        this.f28555p = str6 != null ? str6 : "";
        this.f28556q = str7;
        this.f28557r = i4;
        this.f28558s = str8;
        this.f28559t = bArr;
        this.f28560u = str9;
    }

    /* JADX INFO: renamed from: H */
    public static CastDevice m12646H(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    /* JADX INFO: renamed from: K */
    public boolean m12647K(int i) {
        return (this.f28553n & i) == i;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.f28545f;
        if (str == null) {
            return castDevice.f28545f == null;
        }
        return C2516a.m5114d(str, castDevice.f28545f) && C2516a.m5114d(this.f28547h, castDevice.f28547h) && C2516a.m5114d(this.f28549j, castDevice.f28549j) && C2516a.m5114d(this.f28548i, castDevice.f28548i) && C2516a.m5114d(this.f28550k, castDevice.f28550k) && this.f28551l == castDevice.f28551l && C2516a.m5114d(this.f28552m, castDevice.f28552m) && this.f28553n == castDevice.f28553n && this.f28554o == castDevice.f28554o && C2516a.m5114d(this.f28555p, castDevice.f28555p) && C2516a.m5114d(Integer.valueOf(this.f28557r), Integer.valueOf(castDevice.f28557r)) && C2516a.m5114d(this.f28558s, castDevice.f28558s) && C2516a.m5114d(this.f28556q, castDevice.f28556q) && C2516a.m5114d(this.f28550k, castDevice.f28550k) && this.f28551l == castDevice.f28551l && (((bArr = this.f28559t) == null && castDevice.f28559t == null) || Arrays.equals(bArr, castDevice.f28559t)) && C2516a.m5114d(this.f28560u, castDevice.f28560u);
    }

    public int hashCode() {
        String str = this.f28545f;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return String.format("\"%s\" (%s)", this.f28548i, this.f28545f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f28545f, false);
        C2622l.m5315U(parcel, 3, this.f28546g, false);
        C2622l.m5315U(parcel, 4, this.f28548i, false);
        C2622l.m5315U(parcel, 5, this.f28549j, false);
        C2622l.m5315U(parcel, 6, this.f28550k, false);
        int i2 = this.f28551l;
        parcel.writeInt(262151);
        parcel.writeInt(i2);
        C2622l.m5331Y(parcel, 8, Collections.unmodifiableList(this.f28552m), false);
        int i3 = this.f28553n;
        parcel.writeInt(262153);
        parcel.writeInt(i3);
        int i4 = this.f28554o;
        parcel.writeInt(262154);
        parcel.writeInt(i4);
        C2622l.m5315U(parcel, 11, this.f28555p, false);
        C2622l.m5315U(parcel, 12, this.f28556q, false);
        int i5 = this.f28557r;
        parcel.writeInt(262157);
        parcel.writeInt(i5);
        C2622l.m5315U(parcel, 14, this.f28558s, false);
        C2622l.m5299Q(parcel, 15, this.f28559t, false);
        C2622l.m5315U(parcel, 16, this.f28560u, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
