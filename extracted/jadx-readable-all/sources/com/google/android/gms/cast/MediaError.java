package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p007c.p190n.p194b.p266d.p290d.C2564w0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class MediaError extends AbstractC2767a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new C2564w0();

    /* JADX INFO: renamed from: f */
    public final long f28561f;

    /* JADX INFO: renamed from: g */
    public final Integer f28562g;

    /* JADX INFO: renamed from: h */
    public final String f28563h;

    public MediaError(long j2, Integer num, String str) {
        this.f28561f = j2;
        this.f28562g = num;
        this.f28563h = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        long j2 = this.f28561f;
        parcel.writeInt(524290);
        parcel.writeLong(j2);
        Integer num = this.f28562g;
        if (num != null) {
            parcel.writeInt(262147);
            parcel.writeInt(num.intValue());
        }
        C2622l.m5315U(parcel, 4, this.f28563h, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
