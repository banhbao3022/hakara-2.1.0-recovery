package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.rj */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3475rj extends AbstractC2767a {
    public static final Parcelable.Creator<C3475rj> CREATOR = new C3512sj();

    /* JADX INFO: renamed from: f */
    public final String f18847f;

    /* JADX INFO: renamed from: g */
    public final int f18848g;

    public C3475rj(String str, int i) {
        this.f18847f = str;
        this.f18848g = i;
    }

    /* JADX INFO: renamed from: H */
    public static C3475rj m8279H(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C3475rj(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3475rj)) {
            C3475rj c3475rj = (C3475rj) obj;
            if (C2622l.m5459y(this.f18847f, c3475rj.f18847f) && C2622l.m5459y(Integer.valueOf(this.f18848g), Integer.valueOf(c3475rj.f18848g))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18847f, Integer.valueOf(this.f18848g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f18847f, false);
        int i2 = this.f18848g;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
