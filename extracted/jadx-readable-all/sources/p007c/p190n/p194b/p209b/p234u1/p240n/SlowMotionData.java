package p007c.p190n.p194b.p209b.p234u1.p240n;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.Metadata2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.u1.n.c, reason: use source file name */
/* JADX INFO: compiled from: SlowMotionData.java */
/* JADX INFO: loaded from: classes.dex */
public final class SlowMotionData implements Metadata.b {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final List<b> f8763f;

    /* JADX INFO: renamed from: c.n.b.b.u1.n.c$a */
    /* JADX INFO: compiled from: SlowMotionData.java */
    public class a implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.u1.n.c$b */
    /* JADX INFO: compiled from: SlowMotionData.java */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public final long f8764f;

        /* JADX INFO: renamed from: g */
        public final long f8765g;

        /* JADX INFO: renamed from: h */
        public final int f8766h;

        /* JADX INFO: renamed from: c.n.b.b.u1.n.c$b$a */
        /* JADX INFO: compiled from: SlowMotionData.java */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(long j2, long j3, int i) {
            C2096e.m4566b(j2 < j3);
            this.f8764f = j2;
            this.f8765g = j3;
            this.f8766h = i;
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
            return this.f8764f == bVar.f8764f && this.f8765g == bVar.f8765g && this.f8766h == bVar.f8766h;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f8764f), Long.valueOf(this.f8765g), Integer.valueOf(this.f8766h)});
        }

        public String toString() {
            return Util6.m3126n("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f8764f), Long.valueOf(this.f8765g), Integer.valueOf(this.f8766h));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f8764f);
            parcel.writeLong(this.f8765g);
            parcel.writeInt(this.f8766h);
        }
    }

    public SlowMotionData(List<b> list) {
        this.f8763f = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j2 = list.get(0).f8765g;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).f8764f < j2) {
                    z = true;
                    break;
                }
                j2 = list.get(i).f8765g;
            }
        }
        C2096e.m4566b(!z);
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
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f8763f.equals(((SlowMotionData) obj).f8763f);
    }

    public int hashCode() {
        return this.f8763f.hashCode();
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Format mo4011q() {
        return Metadata2.m4013b(this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("SlowMotion: segments=");
        sbM1556G.append(this.f8763f);
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f8763f);
    }
}
