package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class lr2 extends AbstractC2767a {
    public static final Parcelable.Creator<lr2> CREATOR = new mr2();

    /* JADX INFO: renamed from: f */
    public final String f16474f;

    /* JADX INFO: renamed from: g */
    public final long f16475g;

    /* JADX INFO: renamed from: h */
    public final String f16476h;

    /* JADX INFO: renamed from: i */
    public final String f16477i;

    /* JADX INFO: renamed from: j */
    public final String f16478j;

    /* JADX INFO: renamed from: k */
    public final Bundle f16479k;

    /* JADX INFO: renamed from: l */
    public final boolean f16480l;

    /* JADX INFO: renamed from: m */
    public long f16481m;

    /* JADX INFO: renamed from: n */
    public String f16482n;

    /* JADX INFO: renamed from: o */
    public int f16483o;

    public lr2(String str, long j2, String str2, String str3, String str4, Bundle bundle, boolean z, long j3, String str5, int i) {
        this.f16474f = str;
        this.f16475g = j2;
        this.f16476h = str2 == null ? "" : str2;
        this.f16477i = str3 == null ? "" : str3;
        this.f16478j = str4 == null ? "" : str4;
        this.f16479k = bundle == null ? new Bundle() : bundle;
        this.f16480l = z;
        this.f16481m = j3;
        this.f16482n = str5;
        this.f16483o = i;
    }

    /* JADX INFO: renamed from: H */
    public static lr2 m7611H(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                C2622l.m5226A3(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j2 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new lr2(queryParameter, j2, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException | NumberFormatException e) {
            C2622l.m5241D3("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f16474f, false);
        long j2 = this.f16475g;
        parcel.writeInt(524291);
        parcel.writeLong(j2);
        C2622l.m5315U(parcel, 4, this.f16476h, false);
        C2622l.m5315U(parcel, 5, this.f16477i, false);
        C2622l.m5315U(parcel, 6, this.f16478j, false);
        C2622l.m5295P(parcel, 7, this.f16479k, false);
        boolean z = this.f16480l;
        parcel.writeInt(262152);
        parcel.writeInt(z ? 1 : 0);
        long j3 = this.f16481m;
        parcel.writeInt(524297);
        parcel.writeLong(j3);
        C2622l.m5315U(parcel, 10, this.f16482n, false);
        int i2 = this.f16483o;
        parcel.writeInt(262155);
        parcel.writeInt(i2);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
