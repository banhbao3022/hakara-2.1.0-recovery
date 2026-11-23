package p007c.p190n.p194b.p209b.p242v1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.n.b.b.v1.c, reason: use source file name */
/* JADX INFO: compiled from: StreamKey.java */
/* JADX INFO: loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final int f8819f;

    /* JADX INFO: renamed from: g */
    public final int f8820g;

    /* JADX INFO: renamed from: h */
    public final int f8821h;

    /* JADX INFO: renamed from: c.n.b.b.v1.c$a */
    /* JADX INFO: compiled from: StreamKey.java */
    public class a implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    }

    public StreamKey(int i, int i2) {
        this(0, i, i2);
    }

    @Override // java.lang.Comparable
    public int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.f8819f - streamKey2.f8819f;
        if (i != 0) {
            return i;
        }
        int i2 = this.f8820g - streamKey2.f8820g;
        return i2 == 0 ? this.f8821h - streamKey2.f8821h : i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f8819f == streamKey.f8819f && this.f8820g == streamKey.f8820g && this.f8821h == streamKey.f8821h;
    }

    public int hashCode() {
        return (((this.f8819f * 31) + this.f8820g) * 31) + this.f8821h;
    }

    public String toString() {
        return this.f8819f + "." + this.f8820g + "." + this.f8821h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8819f);
        parcel.writeInt(this.f8820g);
        parcel.writeInt(this.f8821h);
    }

    public StreamKey(int i, int i2, int i3) {
        this.f8819f = i;
        this.f8820g = i2;
        this.f8821h = i3;
    }

    public StreamKey(Parcel parcel) {
        this.f8819f = parcel.readInt();
        this.f8820g = parcel.readInt();
        this.f8821h = parcel.readInt();
    }
}
