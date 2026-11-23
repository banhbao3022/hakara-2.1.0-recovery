package p555j.p556a.p557a.p606h.p609c.p611b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.h.c.b.c, reason: use source file name */
/* JADX INFO: compiled from: RecordingEntity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RecordingEntity implements Parcelable {
    public static final Parcelable.Creator<RecordingEntity> CREATOR = new a();

    /* JADX INFO: renamed from: A */
    public int f32327A;

    /* JADX INFO: renamed from: B */
    public String f32328B;

    /* JADX INFO: renamed from: C */
    public String f32329C;

    /* JADX INFO: renamed from: f */
    public final Long f32330f;

    /* JADX INFO: renamed from: g */
    public String f32331g;

    /* JADX INFO: renamed from: h */
    public int f32332h;

    /* JADX INFO: renamed from: i */
    public int f32333i;

    /* JADX INFO: renamed from: j */
    public int f32334j;

    /* JADX INFO: renamed from: k */
    public String f32335k;

    /* JADX INFO: renamed from: l */
    public String f32336l;

    /* JADX INFO: renamed from: m */
    public String f32337m;

    /* JADX INFO: renamed from: n */
    public int f32338n;

    /* JADX INFO: renamed from: o */
    public String f32339o;

    /* JADX INFO: renamed from: p */
    public String f32340p;

    /* JADX INFO: renamed from: q */
    public Integer f32341q;

    /* JADX INFO: renamed from: r */
    public Integer f32342r;

    /* JADX INFO: renamed from: s */
    public int f32343s;

    /* JADX INFO: renamed from: t */
    public int f32344t;

    /* JADX INFO: renamed from: u */
    public String f32345u;

    /* JADX INFO: renamed from: v */
    public Boolean f32346v;

    /* JADX INFO: renamed from: w */
    public String f32347w;

    /* JADX INFO: renamed from: x */
    public String f32348x;

    /* JADX INFO: renamed from: y */
    public String f32349y;

    /* JADX INFO: renamed from: z */
    public int f32350z;

    /* JADX INFO: renamed from: j.a.a.h.c.b.c$a */
    public static class a implements Parcelable.Creator<RecordingEntity> {
        @Override // android.os.Parcelable.Creator
        public RecordingEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics2.m13089e(parcel, "in");
            Long lValueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i4 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer numValueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                boolValueOf = null;
            }
            return new RecordingEntity(lValueOf, string, i, i2, i3, string2, string3, string4, i4, string5, string6, numValueOf, numValueOf2, i5, i6, string7, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public RecordingEntity[] newArray(int i) {
            return new RecordingEntity[i];
        }
    }

    public RecordingEntity(Long l, String str, int i, int i2, int i3, String str2, String str3, String str4, int i4, String str5, String str6, Integer num, Integer num2, int i5, int i6, String str7, Boolean bool, String str8, String str9, String str10, int i7, int i8, String str11, String str12) {
        Intrinsics2.m13089e(str, "name");
        Intrinsics2.m13089e(str3, "thumbnail");
        Intrinsics2.m13089e(str11, "createdAt");
        Intrinsics2.m13089e(str12, "updatedAt");
        this.f32330f = l;
        this.f32331g = str;
        this.f32332h = i;
        this.f32333i = i2;
        this.f32334j = i3;
        this.f32335k = str2;
        this.f32336l = str3;
        this.f32337m = str4;
        this.f32338n = i4;
        this.f32339o = str5;
        this.f32340p = str6;
        this.f32341q = num;
        this.f32342r = num2;
        this.f32343s = i5;
        this.f32344t = i6;
        this.f32345u = str7;
        this.f32346v = bool;
        this.f32347w = str8;
        this.f32348x = str9;
        this.f32349y = str10;
        this.f32350z = i7;
        this.f32327A = i8;
        this.f32328B = str11;
        this.f32329C = str12;
    }

    /* JADX INFO: renamed from: a */
    public final void m14116a(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.f32336l = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordingEntity)) {
            return false;
        }
        RecordingEntity recordingEntity = (RecordingEntity) obj;
        return Intrinsics2.m13085a(this.f32330f, recordingEntity.f32330f) && Intrinsics2.m13085a(this.f32331g, recordingEntity.f32331g) && this.f32332h == recordingEntity.f32332h && this.f32333i == recordingEntity.f32333i && this.f32334j == recordingEntity.f32334j && Intrinsics2.m13085a(this.f32335k, recordingEntity.f32335k) && Intrinsics2.m13085a(this.f32336l, recordingEntity.f32336l) && Intrinsics2.m13085a(this.f32337m, recordingEntity.f32337m) && this.f32338n == recordingEntity.f32338n && Intrinsics2.m13085a(this.f32339o, recordingEntity.f32339o) && Intrinsics2.m13085a(this.f32340p, recordingEntity.f32340p) && Intrinsics2.m13085a(this.f32341q, recordingEntity.f32341q) && Intrinsics2.m13085a(this.f32342r, recordingEntity.f32342r) && this.f32343s == recordingEntity.f32343s && this.f32344t == recordingEntity.f32344t && Intrinsics2.m13085a(this.f32345u, recordingEntity.f32345u) && Intrinsics2.m13085a(this.f32346v, recordingEntity.f32346v) && Intrinsics2.m13085a(this.f32347w, recordingEntity.f32347w) && Intrinsics2.m13085a(this.f32348x, recordingEntity.f32348x) && Intrinsics2.m13085a(this.f32349y, recordingEntity.f32349y) && this.f32350z == recordingEntity.f32350z && this.f32327A == recordingEntity.f32327A && Intrinsics2.m13085a(this.f32328B, recordingEntity.f32328B) && Intrinsics2.m13085a(this.f32329C, recordingEntity.f32329C);
    }

    public int hashCode() {
        Long l = this.f32330f;
        int iHashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.f32331g;
        int iHashCode2 = (((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f32332h) * 31) + this.f32333i) * 31) + this.f32334j) * 31;
        String str2 = this.f32335k;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32336l;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f32337m;
        int iHashCode5 = (((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f32338n) * 31;
        String str5 = this.f32339o;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f32340p;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num = this.f32341q;
        int iHashCode8 = (iHashCode7 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f32342r;
        int iHashCode9 = (((((iHashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.f32343s) * 31) + this.f32344t) * 31;
        String str7 = this.f32345u;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Boolean bool = this.f32346v;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str8 = this.f32347w;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f32348x;
        int iHashCode13 = (iHashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f32349y;
        int iHashCode14 = (((((iHashCode13 + (str10 != null ? str10.hashCode() : 0)) * 31) + this.f32350z) * 31) + this.f32327A) * 31;
        String str11 = this.f32328B;
        int iHashCode15 = (iHashCode14 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f32329C;
        return iHashCode15 + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("RecordingEntity(id=");
        sbM1556G.append(this.f32330f);
        sbM1556G.append(", name=");
        sbM1556G.append(this.f32331g);
        sbM1556G.append(", userId=");
        sbM1556G.append(this.f32332h);
        sbM1556G.append(", songId=");
        sbM1556G.append(this.f32333i);
        sbM1556G.append(", duetId=");
        sbM1556G.append(this.f32334j);
        sbM1556G.append(", message=");
        sbM1556G.append(this.f32335k);
        sbM1556G.append(", thumbnail=");
        sbM1556G.append(this.f32336l);
        sbM1556G.append(", url=");
        sbM1556G.append(this.f32337m);
        sbM1556G.append(", type=");
        sbM1556G.append(this.f32338n);
        sbM1556G.append(", imageIds=");
        sbM1556G.append(this.f32339o);
        sbM1556G.append(", images=");
        sbM1556G.append(this.f32340p);
        sbM1556G.append(", duration=");
        sbM1556G.append(this.f32341q);
        sbM1556G.append(", effect=");
        sbM1556G.append(this.f32342r);
        sbM1556G.append(", tone=");
        sbM1556G.append(this.f32343s);
        sbM1556G.append(", rhythm=");
        sbM1556G.append(this.f32344t);
        sbM1556G.append(", effectCustom=");
        sbM1556G.append(this.f32345u);
        sbM1556G.append(", useHeadphone=");
        sbM1556G.append(this.f32346v);
        sbM1556G.append(", filename=");
        sbM1556G.append(this.f32347w);
        sbM1556G.append(", folderName=");
        sbM1556G.append(this.f32348x);
        sbM1556G.append(", segments=");
        sbM1556G.append(this.f32349y);
        sbM1556G.append(", format=");
        sbM1556G.append(this.f32350z);
        sbM1556G.append(", videoRatio=");
        sbM1556G.append(this.f32327A);
        sbM1556G.append(", createdAt=");
        sbM1556G.append(this.f32328B);
        sbM1556G.append(", updatedAt=");
        return outline.m1550A(sbM1556G, this.f32329C, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        Long l = this.f32330f;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f32331g);
        parcel.writeInt(this.f32332h);
        parcel.writeInt(this.f32333i);
        parcel.writeInt(this.f32334j);
        parcel.writeString(this.f32335k);
        parcel.writeString(this.f32336l);
        parcel.writeString(this.f32337m);
        parcel.writeInt(this.f32338n);
        parcel.writeString(this.f32339o);
        parcel.writeString(this.f32340p);
        Integer num = this.f32341q;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.f32342r;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f32343s);
        parcel.writeInt(this.f32344t);
        parcel.writeString(this.f32345u);
        Boolean bool = this.f32346v;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f32347w);
        parcel.writeString(this.f32348x);
        parcel.writeString(this.f32349y);
        parcel.writeInt(this.f32350z);
        parcel.writeInt(this.f32327A);
        parcel.writeString(this.f32328B);
        parcel.writeString(this.f32329C);
    }

    public /* synthetic */ RecordingEntity(Long l, String str, int i, int i2, int i3, String str2, String str3, String str4, int i4, String str5, String str6, Integer num, Integer num2, int i5, int i6, String str7, Boolean bool, String str8, String str9, String str10, int i7, int i8, String str11, String str12, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : l, str, i, i2, i3, (i9 & 32) != 0 ? null : str2, str3, (i9 & 128) != 0 ? null : str4, i4, (i9 & 512) != 0 ? null : str5, (i9 & 1024) != 0 ? null : str6, (i9 & 2048) != 0 ? 0 : num, (i9 & 4096) != 0 ? 0 : num2, (i9 & 8192) != 0 ? 0 : i5, (i9 & 16384) != 0 ? 0 : i6, (32768 & i9) != 0 ? null : str7, (65536 & i9) != 0 ? Boolean.FALSE : bool, (131072 & i9) != 0 ? null : str8, (262144 & i9) != 0 ? null : str9, (524288 & i9) != 0 ? null : str10, (1048576 & i9) != 0 ? 0 : i7, (i9 & 2097152) != 0 ? 0 : i8, str11, str12);
    }
}
