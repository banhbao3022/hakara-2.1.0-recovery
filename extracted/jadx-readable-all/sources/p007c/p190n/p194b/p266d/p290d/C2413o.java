package p007c.p190n.p194b.p266d.p290d;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p298f.p307u.C2786f;

/* JADX INFO: renamed from: c.n.b.d.d.o */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2413o extends AbstractC2767a {
    public static final Parcelable.Creator<C2413o> CREATOR = new C2403k1();

    /* JADX INFO: renamed from: f */
    public float f11116f;

    /* JADX INFO: renamed from: g */
    public int f11117g;

    /* JADX INFO: renamed from: h */
    public int f11118h;

    /* JADX INFO: renamed from: i */
    public int f11119i;

    /* JADX INFO: renamed from: j */
    public int f11120j;

    /* JADX INFO: renamed from: k */
    public int f11121k;

    /* JADX INFO: renamed from: l */
    public int f11122l;

    /* JADX INFO: renamed from: m */
    public int f11123m;

    /* JADX INFO: renamed from: n */
    public String f11124n;

    /* JADX INFO: renamed from: o */
    public int f11125o;

    /* JADX INFO: renamed from: p */
    public int f11126p;

    /* JADX INFO: renamed from: q */
    public String f11127q;

    /* JADX INFO: renamed from: r */
    public JSONObject f11128r;

    public C2413o(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.f11116f = f;
        this.f11117g = i;
        this.f11118h = i2;
        this.f11119i = i3;
        this.f11120j = i4;
        this.f11121k = i5;
        this.f11122l = i6;
        this.f11123m = i7;
        this.f11124n = str;
        this.f11125o = i8;
        this.f11126p = i9;
        this.f11127q = str2;
        if (str2 == null) {
            this.f11128r = null;
            return;
        }
        try {
            this.f11128r = new JSONObject(this.f11127q);
        } catch (JSONException unused) {
            this.f11128r = null;
            this.f11127q = null;
        }
    }

    /* JADX INFO: renamed from: H */
    public static int m4989H(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2413o)) {
            return false;
        }
        C2413o c2413o = (C2413o) obj;
        JSONObject jSONObject = this.f11128r;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = c2413o.f11128r;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C2786f.m5628a(jSONObject, jSONObject2)) && this.f11116f == c2413o.f11116f && this.f11117g == c2413o.f11117g && this.f11118h == c2413o.f11118h && this.f11119i == c2413o.f11119i && this.f11120j == c2413o.f11120j && this.f11121k == c2413o.f11121k && this.f11123m == c2413o.f11123m && C2516a.m5114d(this.f11124n, c2413o.f11124n) && this.f11125o == c2413o.f11125o && this.f11126p == c2413o.f11126p;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11116f), Integer.valueOf(this.f11117g), Integer.valueOf(this.f11118h), Integer.valueOf(this.f11119i), Integer.valueOf(this.f11120j), Integer.valueOf(this.f11121k), Integer.valueOf(this.f11122l), Integer.valueOf(this.f11123m), this.f11124n, Integer.valueOf(this.f11125o), Integer.valueOf(this.f11126p), String.valueOf(this.f11128r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f11128r;
        this.f11127q = jSONObject == null ? null : jSONObject.toString();
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        float f = this.f11116f;
        parcel.writeInt(262146);
        parcel.writeFloat(f);
        int i2 = this.f11117g;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        int i3 = this.f11118h;
        parcel.writeInt(262148);
        parcel.writeInt(i3);
        int i4 = this.f11119i;
        parcel.writeInt(262149);
        parcel.writeInt(i4);
        int i5 = this.f11120j;
        parcel.writeInt(262150);
        parcel.writeInt(i5);
        int i6 = this.f11121k;
        parcel.writeInt(262151);
        parcel.writeInt(i6);
        int i7 = this.f11122l;
        parcel.writeInt(262152);
        parcel.writeInt(i7);
        int i8 = this.f11123m;
        parcel.writeInt(262153);
        parcel.writeInt(i8);
        C2622l.m5315U(parcel, 10, this.f11124n, false);
        int i9 = this.f11125o;
        parcel.writeInt(262155);
        parcel.writeInt(i9);
        int i10 = this.f11126p;
        parcel.writeInt(262156);
        parcel.writeInt(i10);
        C2622l.m5315U(parcel, 13, this.f11127q, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2413o() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }
}
