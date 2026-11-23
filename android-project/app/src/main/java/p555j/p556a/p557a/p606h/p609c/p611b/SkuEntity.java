package p555j.p556a.p557a.p606h.p609c.p611b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.h.c.b.d, reason: use source file name */
/* JADX INFO: compiled from: SkuEntity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SkuEntity implements Parcelable {
    public static final Parcelable.Creator<SkuEntity> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final String f32351f;

    /* JADX INFO: renamed from: g */
    public final String f32352g;

    /* JADX INFO: renamed from: h */
    public final String f32353h;

    /* JADX INFO: renamed from: i */
    public final String f32354i;

    /* JADX INFO: renamed from: j */
    public final String f32355j;

    /* JADX INFO: renamed from: k */
    public final String f32356k;

    /* JADX INFO: renamed from: l */
    public final boolean f32357l;

    /* JADX INFO: renamed from: j.a.a.h.c.b.d$a */
    public static class a implements Parcelable.Creator<SkuEntity> {
        @Override // android.os.Parcelable.Creator
        public SkuEntity createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new SkuEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public SkuEntity[] newArray(int i) {
            return new SkuEntity[i];
        }
    }

    public SkuEntity(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        Intrinsics2.m13089e(str, "sku");
        this.f32351f = str;
        this.f32352g = str2;
        this.f32353h = str3;
        this.f32354i = str4;
        this.f32355j = str5;
        this.f32356k = str6;
        this.f32357l = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuEntity)) {
            return false;
        }
        SkuEntity skuEntity = (SkuEntity) obj;
        return Intrinsics2.m13085a(this.f32351f, skuEntity.f32351f) && Intrinsics2.m13085a(this.f32352g, skuEntity.f32352g) && Intrinsics2.m13085a(this.f32353h, skuEntity.f32353h) && Intrinsics2.m13085a(this.f32354i, skuEntity.f32354i) && Intrinsics2.m13085a(this.f32355j, skuEntity.f32355j) && Intrinsics2.m13085a(this.f32356k, skuEntity.f32356k) && this.f32357l == skuEntity.f32357l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.f32351f;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32352g;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32353h;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f32354i;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f32355j;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f32356k;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.f32357l;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode6 + r1;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("SkuEntity(sku=");
        sbM1556G.append(this.f32351f);
        sbM1556G.append(", type=");
        sbM1556G.append(this.f32352g);
        sbM1556G.append(", price=");
        sbM1556G.append(this.f32353h);
        sbM1556G.append(", title=");
        sbM1556G.append(this.f32354i);
        sbM1556G.append(", description=");
        sbM1556G.append(this.f32355j);
        sbM1556G.append(", originalJson=");
        sbM1556G.append(this.f32356k);
        sbM1556G.append(", canPurchase=");
        sbM1556G.append(this.f32357l);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeString(this.f32351f);
        parcel.writeString(this.f32352g);
        parcel.writeString(this.f32353h);
        parcel.writeString(this.f32354i);
        parcel.writeString(this.f32355j);
        parcel.writeString(this.f32356k);
        parcel.writeInt(this.f32357l ? 1 : 0);
    }
}
