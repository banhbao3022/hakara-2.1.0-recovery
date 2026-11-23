package p007c.p190n.p194b.p209b.p243w1.p248w0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.Metadata2;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.s, reason: use source file name */
/* JADX INFO: compiled from: HlsTrackMetadataEntry.java */
/* JADX INFO: loaded from: classes.dex */
public final class HlsTrackMetadataEntry implements Metadata.b {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final String f9502f;

    /* JADX INFO: renamed from: g */
    public final String f9503g;

    /* JADX INFO: renamed from: h */
    public final List<b> f9504h;

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.s$a */
    /* JADX INFO: compiled from: HlsTrackMetadataEntry.java */
    public class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public HlsTrackMetadataEntry[] newArray(int i) {
            return new HlsTrackMetadataEntry[i];
        }
    }

    public HlsTrackMetadataEntry(String str, String str2, List<b> list) {
        this.f9502f = str;
        this.f9503g = str2;
        this.f9504h = Collections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.f9502f, hlsTrackMetadataEntry.f9502f) && TextUtils.equals(this.f9503g, hlsTrackMetadataEntry.f9503g) && this.f9504h.equals(hlsTrackMetadataEntry.f9504h);
    }

    public int hashCode() {
        String str = this.f9502f;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9503g;
        return this.f9504h.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Format mo4011q() {
        return Metadata2.m4013b(this);
    }

    public String toString() {
        String strM1550A;
        StringBuilder sbM1556G = outline.m1556G("HlsTrackMetadataEntry");
        if (this.f9502f != null) {
            StringBuilder sbM1556G2 = outline.m1556G(" [");
            sbM1556G2.append(this.f9502f);
            sbM1556G2.append(", ");
            strM1550A = outline.m1550A(sbM1556G2, this.f9503g, "]");
        } else {
            strM1550A = "";
        }
        sbM1556G.append(strM1550A);
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9502f);
        parcel.writeString(this.f9503g);
        int size = this.f9504h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.f9504h.get(i2), 0);
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f9502f = parcel.readString();
        this.f9503g = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f9504h = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.s$b */
    /* JADX INFO: compiled from: HlsTrackMetadataEntry.java */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public final int f9505f;

        /* JADX INFO: renamed from: g */
        public final int f9506g;

        /* JADX INFO: renamed from: h */
        public final String f9507h;

        /* JADX INFO: renamed from: i */
        public final String f9508i;

        /* JADX INFO: renamed from: j */
        public final String f9509j;

        /* JADX INFO: renamed from: k */
        public final String f9510k;

        /* JADX INFO: renamed from: c.n.b.b.w1.w0.s$b$a */
        /* JADX INFO: compiled from: HlsTrackMetadataEntry.java */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(int i, int i2, String str, String str2, String str3, String str4) {
            this.f9505f = i;
            this.f9506g = i2;
            this.f9507h = str;
            this.f9508i = str2;
            this.f9509j = str3;
            this.f9510k = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9505f == bVar.f9505f && this.f9506g == bVar.f9506g && TextUtils.equals(this.f9507h, bVar.f9507h) && TextUtils.equals(this.f9508i, bVar.f9508i) && TextUtils.equals(this.f9509j, bVar.f9509j) && TextUtils.equals(this.f9510k, bVar.f9510k);
        }

        public int hashCode() {
            int i = ((this.f9505f * 31) + this.f9506g) * 31;
            String str = this.f9507h;
            int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f9508i;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f9509j;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f9510k;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9505f);
            parcel.writeInt(this.f9506g);
            parcel.writeString(this.f9507h);
            parcel.writeString(this.f9508i);
            parcel.writeString(this.f9509j);
            parcel.writeString(this.f9510k);
        }

        public b(Parcel parcel) {
            this.f9505f = parcel.readInt();
            this.f9506g = parcel.readInt();
            this.f9507h = parcel.readString();
            this.f9508i = parcel.readString();
            this.f9509j = parcel.readString();
            this.f9510k = parcel.readString();
        }
    }
}
