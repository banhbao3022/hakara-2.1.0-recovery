package p007c.p190n.p194b.p209b.p218q1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.q1.s, reason: use source file name */
/* JADX INFO: compiled from: DrmInitData.java */
/* JADX INFO: loaded from: classes.dex */
public final class DrmInitData implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final b[] f7428f;

    /* JADX INFO: renamed from: g */
    public int f7429g;

    /* JADX INFO: renamed from: h */
    public final String f7430h;

    /* JADX INFO: renamed from: i */
    public final int f7431i;

    /* JADX INFO: renamed from: c.n.b.b.q1.s$a */
    /* JADX INFO: compiled from: DrmInitData.java */
    public class a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.s$b */
    /* JADX INFO: compiled from: DrmInitData.java */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public int f7432f;

        /* JADX INFO: renamed from: g */
        public final UUID f7433g;

        /* JADX INFO: renamed from: h */
        public final String f7434h;

        /* JADX INFO: renamed from: i */
        public final String f7435i;

        /* JADX INFO: renamed from: j */
        public final byte[] f7436j;

        /* JADX INFO: renamed from: c.n.b.b.q1.s$b$a */
        /* JADX INFO: compiled from: DrmInitData.java */
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

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        /* JADX INFO: renamed from: a */
        public boolean m3688a() {
            return this.f7436j != null;
        }

        /* JADX INFO: renamed from: b */
        public boolean m3689b(UUID uuid) {
            return C.f6403a.equals(this.f7433g) || uuid.equals(this.f7433g);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Util6.m3113a(this.f7434h, bVar.f7434h) && Util6.m3113a(this.f7435i, bVar.f7435i) && Util6.m3113a(this.f7433g, bVar.f7433g) && Arrays.equals(this.f7436j, bVar.f7436j);
        }

        public int hashCode() {
            if (this.f7432f == 0) {
                int iHashCode = this.f7433g.hashCode() * 31;
                String str = this.f7434h;
                this.f7432f = Arrays.hashCode(this.f7436j) + outline.m1569T(this.f7435i, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f7432f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f7433g.getMostSignificantBits());
            parcel.writeLong(this.f7433g.getLeastSignificantBits());
            parcel.writeString(this.f7434h);
            parcel.writeString(this.f7435i);
            parcel.writeByteArray(this.f7436j);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            Objects.requireNonNull(uuid);
            this.f7433g = uuid;
            this.f7434h = str;
            Objects.requireNonNull(str2);
            this.f7435i = str2;
            this.f7436j = bArr;
        }

        public b(Parcel parcel) {
            this.f7433g = new UUID(parcel.readLong(), parcel.readLong());
            this.f7434h = parcel.readString();
            String string = parcel.readString();
            int i = Util6.f6307a;
            this.f7435i = string;
            this.f7436j = parcel.createByteArray();
        }
    }

    public DrmInitData(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    /* JADX INFO: renamed from: a */
    public DrmInitData m3687a(String str) {
        return Util6.m3113a(this.f7430h, str) ? this : new DrmInitData(str, false, this.f7428f);
    }

    @Override // java.util.Comparator
    public int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        UUID uuid = C.f6403a;
        if (uuid.equals(bVar3.f7433g)) {
            return uuid.equals(bVar4.f7433g) ? 0 : 1;
        }
        return bVar3.f7433g.compareTo(bVar4.f7433g);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return Util6.m3113a(this.f7430h, drmInitData.f7430h) && Arrays.equals(this.f7428f, drmInitData.f7428f);
    }

    public int hashCode() {
        if (this.f7429g == 0) {
            String str = this.f7430h;
            this.f7429g = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f7428f);
        }
        return this.f7429g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7430h);
        parcel.writeTypedArray(this.f7428f, 0);
    }

    public DrmInitData(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public DrmInitData(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public DrmInitData(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public DrmInitData(String str, boolean z, b... bVarArr) {
        this.f7430h = str;
        bVarArr = z ? (b[]) bVarArr.clone() : bVarArr;
        this.f7428f = bVarArr;
        this.f7431i = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public DrmInitData(Parcel parcel) {
        this.f7430h = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        int i = Util6.f6307a;
        this.f7428f = bVarArr;
        this.f7431i = bVarArr.length;
    }
}
