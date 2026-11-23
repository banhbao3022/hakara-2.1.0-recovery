package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.C2394h1;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p298f.p307u.C2786f;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaTrack extends AbstractC2767a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new C2394h1();

    /* JADX INFO: renamed from: f */
    public long f28580f;

    /* JADX INFO: renamed from: g */
    public int f28581g;

    /* JADX INFO: renamed from: h */
    public String f28582h;

    /* JADX INFO: renamed from: i */
    public String f28583i;

    /* JADX INFO: renamed from: j */
    public String f28584j;

    /* JADX INFO: renamed from: k */
    public String f28585k;

    /* JADX INFO: renamed from: l */
    public int f28586l;

    /* JADX INFO: renamed from: m */
    public String f28587m;

    /* JADX INFO: renamed from: n */
    public JSONObject f28588n;

    public MediaTrack(long j2, int i, String str, String str2, String str3, String str4, int i2, String str5) {
        this.f28580f = j2;
        this.f28581g = i;
        this.f28582h = str;
        this.f28583i = str2;
        this.f28584j = str3;
        this.f28585k = str4;
        this.f28586l = i2;
        this.f28587m = str5;
        if (str5 == null) {
            this.f28588n = null;
            return;
        }
        try {
            this.f28588n = new JSONObject(this.f28587m);
        } catch (JSONException unused) {
            this.f28588n = null;
            this.f28587m = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.f28588n;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.f28588n;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C2786f.m5628a(jSONObject, jSONObject2)) && this.f28580f == mediaTrack.f28580f && this.f28581g == mediaTrack.f28581g && C2516a.m5114d(this.f28582h, mediaTrack.f28582h) && C2516a.m5114d(this.f28583i, mediaTrack.f28583i) && C2516a.m5114d(this.f28584j, mediaTrack.f28584j) && C2516a.m5114d(this.f28585k, mediaTrack.f28585k) && this.f28586l == mediaTrack.f28586l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f28580f), Integer.valueOf(this.f28581g), this.f28582h, this.f28583i, this.f28584j, this.f28585k, Integer.valueOf(this.f28586l), String.valueOf(this.f28588n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f28588n;
        this.f28587m = jSONObject == null ? null : jSONObject.toString();
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        long j2 = this.f28580f;
        parcel.writeInt(524290);
        parcel.writeLong(j2);
        int i2 = this.f28581g;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 4, this.f28582h, false);
        C2622l.m5315U(parcel, 5, this.f28583i, false);
        C2622l.m5315U(parcel, 6, this.f28584j, false);
        C2622l.m5315U(parcel, 7, this.f28585k, false);
        int i3 = this.f28586l;
        parcel.writeInt(262152);
        parcel.writeInt(i3);
        C2622l.m5315U(parcel, 9, this.f28587m, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
