package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2371a extends AbstractC2767a {
    public static final Parcelable.Creator<C2371a> CREATOR = new C2557t();

    /* JADX INFO: renamed from: f */
    public final String f10955f;

    /* JADX INFO: renamed from: g */
    public final String f10956g;

    /* JADX INFO: renamed from: h */
    public final long f10957h;

    /* JADX INFO: renamed from: i */
    public final String f10958i;

    /* JADX INFO: renamed from: j */
    public final String f10959j;

    /* JADX INFO: renamed from: k */
    public final String f10960k;

    /* JADX INFO: renamed from: l */
    public String f10961l;

    /* JADX INFO: renamed from: m */
    public String f10962m;

    /* JADX INFO: renamed from: n */
    public String f10963n;

    /* JADX INFO: renamed from: o */
    public final long f10964o;

    /* JADX INFO: renamed from: p */
    public final String f10965p;

    /* JADX INFO: renamed from: q */
    public final C2416p f10966q;

    /* JADX INFO: renamed from: r */
    public JSONObject f10967r;

    public C2371a(String str, String str2, long j2, String str3, String str4, String str5, String str6, String str7, String str8, long j3, String str9, C2416p c2416p) {
        this.f10955f = str;
        this.f10956g = str2;
        this.f10957h = j2;
        this.f10958i = str3;
        this.f10959j = str4;
        this.f10960k = str5;
        this.f10961l = str6;
        this.f10962m = str7;
        this.f10963n = str8;
        this.f10964o = j3;
        this.f10965p = str9;
        this.f10966q = c2416p;
        if (TextUtils.isEmpty(str6)) {
            this.f10967r = new JSONObject();
            return;
        }
        try {
            this.f10967r = new JSONObject(str6);
        } catch (JSONException e) {
            Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e.getMessage()));
            this.f10961l = null;
            this.f10967r = new JSONObject();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2371a)) {
            return false;
        }
        C2371a c2371a = (C2371a) obj;
        return C2516a.m5114d(this.f10955f, c2371a.f10955f) && C2516a.m5114d(this.f10956g, c2371a.f10956g) && this.f10957h == c2371a.f10957h && C2516a.m5114d(this.f10958i, c2371a.f10958i) && C2516a.m5114d(this.f10959j, c2371a.f10959j) && C2516a.m5114d(this.f10960k, c2371a.f10960k) && C2516a.m5114d(this.f10961l, c2371a.f10961l) && C2516a.m5114d(this.f10962m, c2371a.f10962m) && C2516a.m5114d(this.f10963n, c2371a.f10963n) && this.f10964o == c2371a.f10964o && C2516a.m5114d(this.f10965p, c2371a.f10965p) && C2516a.m5114d(this.f10966q, c2371a.f10966q);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10955f, this.f10956g, Long.valueOf(this.f10957h), this.f10958i, this.f10959j, this.f10960k, this.f10961l, this.f10962m, this.f10963n, Long.valueOf(this.f10964o), this.f10965p, this.f10966q});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f10955f, false);
        C2622l.m5315U(parcel, 3, this.f10956g, false);
        long j2 = this.f10957h;
        parcel.writeInt(524292);
        parcel.writeLong(j2);
        C2622l.m5315U(parcel, 5, this.f10958i, false);
        C2622l.m5315U(parcel, 6, this.f10959j, false);
        C2622l.m5315U(parcel, 7, this.f10960k, false);
        C2622l.m5315U(parcel, 8, this.f10961l, false);
        C2622l.m5315U(parcel, 9, this.f10962m, false);
        C2622l.m5315U(parcel, 10, this.f10963n, false);
        long j3 = this.f10964o;
        parcel.writeInt(524299);
        parcel.writeLong(j3);
        C2622l.m5315U(parcel, 12, this.f10965p, false);
        C2622l.m5311T(parcel, 13, this.f10966q, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
