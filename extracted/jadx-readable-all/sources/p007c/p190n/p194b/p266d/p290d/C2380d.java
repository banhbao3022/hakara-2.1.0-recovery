package p007c.p190n.p194b.p266d.p290d;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2380d extends AbstractC2767a {
    public static final Parcelable.Creator<C2380d> CREATOR = new C2400j1();

    /* JADX INFO: renamed from: f */
    public String f11009f;

    /* JADX INFO: renamed from: g */
    public String f11010g;

    /* JADX INFO: renamed from: h */
    public List<String> f11011h;

    /* JADX INFO: renamed from: i */
    public String f11012i;

    /* JADX INFO: renamed from: j */
    public Uri f11013j;

    /* JADX INFO: renamed from: k */
    public String f11014k;

    /* JADX INFO: renamed from: l */
    public String f11015l;

    public C2380d(String str, String str2, List list, String str3, Uri uri, String str4, String str5) {
        this.f11009f = str;
        this.f11010g = str2;
        this.f11011h = list;
        this.f11012i = str3;
        this.f11013j = uri;
        this.f11014k = str4;
        this.f11015l = str5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2380d)) {
            return false;
        }
        C2380d c2380d = (C2380d) obj;
        return C2516a.m5114d(this.f11009f, c2380d.f11009f) && C2516a.m5114d(this.f11010g, c2380d.f11010g) && C2516a.m5114d(this.f11011h, c2380d.f11011h) && C2516a.m5114d(this.f11012i, c2380d.f11012i) && C2516a.m5114d(this.f11013j, c2380d.f11013j) && C2516a.m5114d(this.f11014k, c2380d.f11014k) && C2516a.m5114d(this.f11015l, c2380d.f11015l);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11009f, this.f11010g, this.f11011h, this.f11012i, this.f11013j, this.f11014k});
    }

    public String toString() {
        String str = this.f11009f;
        String str2 = this.f11010g;
        List<String> list = this.f11011h;
        int size = list == null ? 0 : list.size();
        String str3 = this.f11012i;
        String strValueOf = String.valueOf(this.f11013j);
        String str4 = this.f11014k;
        String str5 = this.f11015l;
        StringBuilder sb = new StringBuilder(outline.m1558I(str5, outline.m1558I(str4, strValueOf.length() + outline.m1558I(str3, outline.m1558I(str2, outline.m1558I(str, 118))))));
        sb.append("applicationId: ");
        sb.append(str);
        sb.append(", name: ");
        sb.append(str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        outline.m1572W(sb, ", senderAppLaunchUrl: ", strValueOf, ", iconUrl: ", str4);
        return outline.m1550A(sb, ", type: ", str5);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f11009f, false);
        C2622l.m5315U(parcel, 3, this.f11010g, false);
        C2622l.m5331Y(parcel, 4, null, false);
        C2622l.m5323W(parcel, 5, Collections.unmodifiableList(this.f11011h), false);
        C2622l.m5315U(parcel, 6, this.f11012i, false);
        C2622l.m5311T(parcel, 7, this.f11013j, i, false);
        C2622l.m5315U(parcel, 8, this.f11014k, false);
        C2622l.m5315U(parcel, 9, this.f11015l, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2380d() {
        this.f11011h = new ArrayList();
    }
}
