package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.p */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2416p extends AbstractC2767a {
    public static final Parcelable.Creator<C2416p> CREATOR = new C2406l1();

    /* JADX INFO: renamed from: f */
    public final String f11131f;

    /* JADX INFO: renamed from: g */
    public final String f11132g;

    public C2416p(String str, String str2) {
        this.f11131f = str;
        this.f11132g = str2;
    }

    /* JADX INFO: renamed from: H */
    public static C2416p m4990H(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C2416p(jSONObject.optString("adTagUrl", null), jSONObject.optString("adsResponse", null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2416p)) {
            return false;
        }
        C2416p c2416p = (C2416p) obj;
        return C2516a.m5114d(this.f11131f, c2416p.f11131f) && C2516a.m5114d(this.f11132g, c2416p.f11132g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11131f, this.f11132g});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f11131f, false);
        C2622l.m5315U(parcel, 3, this.f11132g, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
