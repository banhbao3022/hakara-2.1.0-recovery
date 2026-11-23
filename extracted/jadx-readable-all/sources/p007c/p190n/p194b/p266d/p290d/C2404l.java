package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p298f.p307u.C2786f;

/* JADX INFO: renamed from: c.n.b.d.d.l */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2404l extends AbstractC2767a {
    public static final Parcelable.Creator<C2404l> CREATOR = new C2385e1();

    /* JADX INFO: renamed from: f */
    public MediaInfo f11073f;

    /* JADX INFO: renamed from: g */
    public int f11074g;

    /* JADX INFO: renamed from: h */
    public boolean f11075h;

    /* JADX INFO: renamed from: i */
    public double f11076i;

    /* JADX INFO: renamed from: j */
    public double f11077j;

    /* JADX INFO: renamed from: k */
    public double f11078k;

    /* JADX INFO: renamed from: l */
    public long[] f11079l;

    /* JADX INFO: renamed from: m */
    public String f11080m;

    /* JADX INFO: renamed from: n */
    public JSONObject f11081n;

    public C2404l(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.f11076i = Double.NaN;
        this.f11073f = mediaInfo;
        this.f11074g = i;
        this.f11075h = z;
        this.f11076i = d;
        this.f11077j = d2;
        this.f11078k = d3;
        this.f11079l = jArr;
        this.f11080m = str;
        if (str == null) {
            this.f11081n = null;
            return;
        }
        try {
            this.f11081n = new JSONObject(this.f11080m);
        } catch (JSONException unused) {
            this.f11081n = null;
            this.f11080m = null;
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean m4968H(JSONObject jSONObject) throws JSONException {
        boolean z;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.f11073f = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.f11074g != (i = jSONObject.getInt("itemId"))) {
            this.f11074g = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.f11075h != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.f11075h = z2;
            z = true;
        }
        double dOptDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(dOptDouble) != Double.isNaN(this.f11076i) || (!Double.isNaN(dOptDouble) && Math.abs(dOptDouble - this.f11076i) > 1.0E-7d)) {
            this.f11076i = dOptDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f11077j) > 1.0E-7d) {
                this.f11077j = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f11078k) > 1.0E-7d) {
                this.f11078k = d2;
                z = true;
            }
        }
        long[] jArr = null;
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            long[] jArr2 = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr2[i2] = jSONArray.getLong(i2);
            }
            long[] jArr3 = this.f11079l;
            if (jArr3 == null || jArr3.length != length) {
                jArr = jArr2;
                z3 = true;
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    jArr = jArr2;
                    break;
                }
                if (this.f11079l[i3] != jArr2[i3]) {
                    jArr = jArr2;
                    z3 = true;
                    break;
                }
                i3++;
            }
        }
        if (z3) {
            this.f11079l = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.f11081n = jSONObject.getJSONObject("customData");
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2404l)) {
            return false;
        }
        C2404l c2404l = (C2404l) obj;
        JSONObject jSONObject = this.f11081n;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = c2404l.f11081n;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C2786f.m5628a(jSONObject, jSONObject2)) && C2516a.m5114d(this.f11073f, c2404l.f11073f) && this.f11074g == c2404l.f11074g && this.f11075h == c2404l.f11075h && ((Double.isNaN(this.f11076i) && Double.isNaN(c2404l.f11076i)) || this.f11076i == c2404l.f11076i) && this.f11077j == c2404l.f11077j && this.f11078k == c2404l.f11078k && Arrays.equals(this.f11079l, c2404l.f11079l);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11073f, Integer.valueOf(this.f11074g), Boolean.valueOf(this.f11075h), Double.valueOf(this.f11076i), Double.valueOf(this.f11077j), Double.valueOf(this.f11078k), Integer.valueOf(Arrays.hashCode(this.f11079l)), String.valueOf(this.f11081n)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f11081n;
        this.f11080m = jSONObject == null ? null : jSONObject.toString();
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5311T(parcel, 2, this.f11073f, i, false);
        int i2 = this.f11074g;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        boolean z = this.f11075h;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        double d = this.f11076i;
        parcel.writeInt(524293);
        parcel.writeDouble(d);
        double d2 = this.f11077j;
        parcel.writeInt(524294);
        parcel.writeDouble(d2);
        double d3 = this.f11078k;
        parcel.writeInt(524295);
        parcel.writeDouble(d3);
        long[] jArr = this.f11079l;
        if (jArr != null) {
            int iM5239D2 = C2622l.m5239D1(parcel, 8);
            parcel.writeLongArray(jArr);
            C2622l.m5447v2(parcel, iM5239D2);
        }
        C2622l.m5315U(parcel, 9, this.f11080m, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    /* JADX INFO: renamed from: c.n.b.d.d.l$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final C2404l f11082a;

        public a(MediaInfo mediaInfo) throws IllegalArgumentException {
            C2404l c2404l = new C2404l(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
            if (mediaInfo == null) {
                throw new IllegalArgumentException("media cannot be null.");
            }
            this.f11082a = c2404l;
        }

        /* JADX INFO: renamed from: a */
        public C2404l m4969a() {
            C2404l c2404l = this.f11082a;
            if (c2404l.f11073f == null) {
                throw new IllegalArgumentException("media cannot be null.");
            }
            if (!Double.isNaN(c2404l.f11076i) && c2404l.f11076i < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (Double.isNaN(c2404l.f11077j)) {
                throw new IllegalArgumentException("playbackDuration cannot be NaN.");
            }
            if (Double.isNaN(c2404l.f11078k) || c2404l.f11078k < 0.0d) {
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            return this.f11082a;
        }

        public a(JSONObject jSONObject) throws JSONException {
            this.f11082a = new C2404l(jSONObject);
        }

        public a(C2404l c2404l) throws IllegalArgumentException {
            C2404l c2404l2 = new C2404l(c2404l.f11073f, c2404l.f11074g, c2404l.f11075h, c2404l.f11076i, c2404l.f11077j, c2404l.f11078k, c2404l.f11079l, null);
            if (c2404l2.f11073f != null) {
                c2404l2.f11081n = c2404l.f11081n;
                this.f11082a = c2404l2;
                return;
            }
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    public C2404l(JSONObject jSONObject) throws JSONException {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        m4968H(jSONObject);
    }
}
