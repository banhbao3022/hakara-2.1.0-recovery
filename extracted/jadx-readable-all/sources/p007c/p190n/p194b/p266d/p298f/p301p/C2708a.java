package p007c.p190n.p194b.p266d.p298f.p301p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.f.p.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2708a extends AbstractC2767a {
    public static final Parcelable.Creator<C2708a> CREATOR = new C2709b();

    /* JADX INFO: renamed from: f */
    public final int f11775f;

    /* JADX INFO: renamed from: g */
    public final Uri f11776g;

    /* JADX INFO: renamed from: h */
    public final int f11777h;

    /* JADX INFO: renamed from: i */
    public final int f11778i;

    public C2708a(int i, Uri uri, int i2, int i3) {
        this.f11775f = i;
        this.f11776g = uri;
        this.f11777h = i2;
        this.f11778i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2708a)) {
            C2708a c2708a = (C2708a) obj;
            if (C2622l.m5459y(this.f11776g, c2708a.f11776g) && this.f11777h == c2708a.f11777h && this.f11778i == c2708a.f11778i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11776g, Integer.valueOf(this.f11777h), Integer.valueOf(this.f11778i)});
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f11777h), Integer.valueOf(this.f11778i), this.f11776g.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f11775f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5311T(parcel, 2, this.f11776g, i, false);
        int i3 = this.f11777h;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        int i4 = this.f11778i;
        parcel.writeInt(262148);
        parcel.writeInt(i4);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2708a(Uri uri, int i, int i2) throws IllegalArgumentException {
        this.f11775f = 1;
        this.f11776g = uri;
        this.f11777h = i;
        this.f11778i = i2;
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public C2708a(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2708a(JSONObject jSONObject) throws IllegalArgumentException {
        Uri uri;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
                uri = null;
            }
        } else {
            uri = null;
        }
        this(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }
}
