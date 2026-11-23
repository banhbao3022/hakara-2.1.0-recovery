package p007c.p190n.p194b.p209b.p234u1.p238l;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.List;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.Metadata2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.u1.l.b, reason: use source file name */
/* JADX INFO: compiled from: IcyHeaders.java */
/* JADX INFO: loaded from: classes.dex */
public final class IcyHeaders implements Metadata.b {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final int f8701f;

    /* JADX INFO: renamed from: g */
    public final String f8702g;

    /* JADX INFO: renamed from: h */
    public final String f8703h;

    /* JADX INFO: renamed from: i */
    public final String f8704i;

    /* JADX INFO: renamed from: j */
    public final boolean f8705j;

    /* JADX INFO: renamed from: k */
    public final int f8706k;

    /* JADX INFO: renamed from: c.n.b.b.u1.l.b$a */
    /* JADX INFO: compiled from: IcyHeaders.java */
    public class a implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IcyHeaders[] newArray(int i) {
            return new IcyHeaders[i];
        }
    }

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        C2096e.m4566b(i2 == -1 || i2 > 0);
        this.f8701f = i;
        this.f8702g = str;
        this.f8703h = str2;
        this.f8704i = str3;
        this.f8705j = z;
        this.f8706k = i2;
    }

    /* JADX INFO: renamed from: a */
    public static IcyHeaders m4022a(Map<String, List<String>> map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        List<String> list = map.get("icy-br");
        int i3 = -1;
        boolean z2 = true;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i2 = Integer.parseInt(str4) * CloseCodes.NORMAL_CLOSURE;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        Log.w("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        outline.m1567R("Invalid bitrate header: ", str4, "IcyHeaders");
                        z = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z = false;
            i = -1;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i4 = Integer.parseInt(str5);
                if (i4 > 0) {
                    i3 = i4;
                } else {
                    try {
                        Log.w("IcyHeaders", "Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = i4;
                        outline.m1567R("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z) {
            return new IcyHeaders(i, str, str2, str3, zEquals, i3);
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: F */
    public /* synthetic */ byte[] mo4010F() {
        return Metadata2.m4012a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f8701f == icyHeaders.f8701f && Util6.m3113a(this.f8702g, icyHeaders.f8702g) && Util6.m3113a(this.f8703h, icyHeaders.f8703h) && Util6.m3113a(this.f8704i, icyHeaders.f8704i) && this.f8705j == icyHeaders.f8705j && this.f8706k == icyHeaders.f8706k;
    }

    public int hashCode() {
        int i = (527 + this.f8701f) * 31;
        String str = this.f8702g;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8703h;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8704i;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f8705j ? 1 : 0)) * 31) + this.f8706k;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Format mo4011q() {
        return Metadata2.m4013b(this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("IcyHeaders: name=\"");
        sbM1556G.append(this.f8703h);
        sbM1556G.append("\", genre=\"");
        sbM1556G.append(this.f8702g);
        sbM1556G.append("\", bitrate=");
        sbM1556G.append(this.f8701f);
        sbM1556G.append(", metadataInterval=");
        sbM1556G.append(this.f8706k);
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8701f);
        parcel.writeString(this.f8702g);
        parcel.writeString(this.f8703h);
        parcel.writeString(this.f8704i);
        boolean z = this.f8705j;
        int i2 = Util6.f6307a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f8706k);
    }

    public IcyHeaders(Parcel parcel) {
        this.f8701f = parcel.readInt();
        this.f8702g = parcel.readString();
        this.f8703h = parcel.readString();
        this.f8704i = parcel.readString();
        int i = Util6.f6307a;
        this.f8705j = parcel.readInt() != 0;
        this.f8706k = parcel.readInt();
    }
}
