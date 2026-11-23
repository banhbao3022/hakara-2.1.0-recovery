package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2389g extends AbstractC2767a {
    public static final Parcelable.Creator<C2389g> CREATOR = new C2562v0();

    /* JADX INFO: renamed from: f */
    public boolean f11031f;

    /* JADX INFO: renamed from: g */
    public String f11032g;

    /* JADX INFO: renamed from: h */
    public boolean f11033h;

    public C2389g(boolean z, String str, boolean z2) {
        this.f11031f = z;
        this.f11032g = str;
        this.f11033h = z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2389g)) {
            return false;
        }
        C2389g c2389g = (C2389g) obj;
        return this.f11031f == c2389g.f11031f && C2516a.m5114d(this.f11032g, c2389g.f11032g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11031f), this.f11032g});
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.f11031f), this.f11032g, Boolean.valueOf(this.f11033h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        boolean z = this.f11031f;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        C2622l.m5315U(parcel, 3, this.f11032g, false);
        boolean z2 = this.f11033h;
        parcel.writeInt(262148);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2389g() {
        Locale locale = Locale.getDefault();
        Pattern pattern = C2516a.f11372a;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        String string = sb.toString();
        this.f11031f = false;
        this.f11032g = string;
        this.f11033h = false;
    }
}
