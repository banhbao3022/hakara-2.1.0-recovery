package p555j.p556a.p557a.p606h.p609c.p611b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.h.c.b.a, reason: use source file name */
/* JADX INFO: compiled from: KeywordEntity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class KeywordEntity implements Parcelable {
    public static final Parcelable.Creator<KeywordEntity> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final Long f32323f;

    /* JADX INFO: renamed from: g */
    public String f32324g;

    /* JADX INFO: renamed from: h */
    public long f32325h;

    /* JADX INFO: renamed from: i */
    public long f32326i;

    /* JADX INFO: renamed from: j.a.a.h.c.b.a$a */
    public static class a implements Parcelable.Creator<KeywordEntity> {
        @Override // android.os.Parcelable.Creator
        public KeywordEntity createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new KeywordEntity(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public KeywordEntity[] newArray(int i) {
            return new KeywordEntity[i];
        }
    }

    public KeywordEntity(Long l, String str, long j2, long j3) {
        Intrinsics2.m13089e(str, "name");
        this.f32323f = l;
        this.f32324g = str;
        this.f32325h = j2;
        this.f32326i = j3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeywordEntity)) {
            return false;
        }
        KeywordEntity keywordEntity = (KeywordEntity) obj;
        return Intrinsics2.m13085a(this.f32323f, keywordEntity.f32323f) && Intrinsics2.m13085a(this.f32324g, keywordEntity.f32324g) && this.f32325h == keywordEntity.f32325h && this.f32326i == keywordEntity.f32326i;
    }

    public int hashCode() {
        Long l = this.f32323f;
        int iHashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.f32324g;
        return C6913b.m14115a(this.f32326i) + ((C6913b.m14115a(this.f32325h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("KeywordEntity(id=");
        sbM1556G.append(this.f32323f);
        sbM1556G.append(", name=");
        sbM1556G.append(this.f32324g);
        sbM1556G.append(", createdAt=");
        sbM1556G.append(this.f32325h);
        sbM1556G.append(", updatedAt=");
        sbM1556G.append(this.f32326i);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        Long l = this.f32323f;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f32324g);
        parcel.writeLong(this.f32325h);
        parcel.writeLong(this.f32326i);
    }

    public /* synthetic */ KeywordEntity(Long l, String str, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, str, j2, j3);
    }
}
