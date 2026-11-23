package p555j.p556a.p557a.p606h.p607a;

import android.net.Uri;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.h.a.f, reason: use source file name */
/* JADX INFO: compiled from: NowPlayingMetadata.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NowPlayingMetadata {

    /* JADX INFO: renamed from: a */
    public static final a f32263a = new a(null);

    /* JADX INFO: renamed from: b */
    public final String f32264b;

    /* JADX INFO: renamed from: c */
    public final Uri f32265c;

    /* JADX INFO: renamed from: d */
    public final String f32266d;

    /* JADX INFO: renamed from: e */
    public final String f32267e;

    /* JADX INFO: renamed from: f */
    public final String f32268f;

    /* JADX INFO: renamed from: j.a.a.h.a.f$a */
    /* JADX INFO: compiled from: NowPlayingMetadata.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final String m14034a(float f) {
            float f2 = 60;
            String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (f / f2)), Integer.valueOf((int) (f % f2))}, 2));
            Intrinsics2.m13088d(str, "java.lang.String.format(format, *args)");
            return str;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public NowPlayingMetadata(String str, Uri uri, String str2, String str3, String str4) {
        Intrinsics2.m13089e(str, "id");
        Intrinsics2.m13089e(uri, "albumArtUri");
        Intrinsics2.m13089e(str4, CainMediaMetadataRetriever.METADATA_KEY_DURATION);
        this.f32264b = str;
        this.f32265c = uri;
        this.f32266d = str2;
        this.f32267e = str3;
        this.f32268f = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowPlayingMetadata)) {
            return false;
        }
        NowPlayingMetadata nowPlayingMetadata = (NowPlayingMetadata) obj;
        return Intrinsics2.m13085a(this.f32264b, nowPlayingMetadata.f32264b) && Intrinsics2.m13085a(this.f32265c, nowPlayingMetadata.f32265c) && Intrinsics2.m13085a(this.f32266d, nowPlayingMetadata.f32266d) && Intrinsics2.m13085a(this.f32267e, nowPlayingMetadata.f32267e) && Intrinsics2.m13085a(this.f32268f, nowPlayingMetadata.f32268f);
    }

    public int hashCode() {
        String str = this.f32264b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Uri uri = this.f32265c;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str2 = this.f32266d;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32267e;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f32268f;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("NowPlayingMetadata(id=");
        sbM1556G.append(this.f32264b);
        sbM1556G.append(", albumArtUri=");
        sbM1556G.append(this.f32265c);
        sbM1556G.append(", title=");
        sbM1556G.append(this.f32266d);
        sbM1556G.append(", subtitle=");
        sbM1556G.append(this.f32267e);
        sbM1556G.append(", duration=");
        return outline.m1550A(sbM1556G, this.f32268f, ")");
    }
}
