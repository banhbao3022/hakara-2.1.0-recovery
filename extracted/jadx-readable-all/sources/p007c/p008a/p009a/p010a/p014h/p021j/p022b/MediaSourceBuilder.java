package p007c.p008a.p009a.p010a.p014h.p021j.p022b;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;
import p007c.p008a.p009a.p010a.ExoMedia;
import p007c.p008a.p009a.p010a.ExoMedia2;
import p007c.p008a.p009a.p010a.p014h.p021j.MediaSourceProvider;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DefaultDataSourceFactory;
import p007c.p190n.p194b.p209b.p210a2.DefaultHttpDataSourceFactory;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.j.b.d, reason: use source file name */
/* JADX INFO: compiled from: MediaSourceBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class MediaSourceBuilder {

    /* JADX INFO: renamed from: c.a.a.a.h.j.b.d$a */
    /* JADX INFO: compiled from: MediaSourceBuilder.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Context f1574a;

        /* JADX INFO: renamed from: b */
        public final Uri f1575b;

        /* JADX INFO: renamed from: c */
        public final Handler f1576c;

        /* JADX INFO: renamed from: d */
        public final TransferListener f1577d;

        /* JADX INFO: renamed from: e */
        public final DrmSessionManager2 f1578e;

        /* JADX INFO: renamed from: f */
        public final String f1579f;

        public a(Context context, Uri uri, Handler handler, TransferListener transferListener, DrmSessionManager2 drmSessionManager2, String str) {
            Intrinsics2.m13089e(context, "context");
            Intrinsics2.m13089e(uri, "uri");
            Intrinsics2.m13089e(handler, "handler");
            Intrinsics2.m13089e(str, "userAgent");
            this.f1574a = context;
            this.f1575b = uri;
            this.f1576c = handler;
            this.f1577d = transferListener;
            this.f1578e = drmSessionManager2;
            this.f1579f = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics2.m13085a(this.f1574a, aVar.f1574a) && Intrinsics2.m13085a(this.f1575b, aVar.f1575b) && Intrinsics2.m13085a(this.f1576c, aVar.f1576c) && Intrinsics2.m13085a(this.f1577d, aVar.f1577d) && Intrinsics2.m13085a(this.f1578e, aVar.f1578e) && Intrinsics2.m13085a(this.f1579f, aVar.f1579f);
        }

        public int hashCode() {
            Context context = this.f1574a;
            int iHashCode = (context != null ? context.hashCode() : 0) * 31;
            Uri uri = this.f1575b;
            int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
            Handler handler = this.f1576c;
            int iHashCode3 = (iHashCode2 + (handler != null ? handler.hashCode() : 0)) * 31;
            TransferListener transferListener = this.f1577d;
            int iHashCode4 = (iHashCode3 + (transferListener != null ? transferListener.hashCode() : 0)) * 31;
            DrmSessionManager2 drmSessionManager2 = this.f1578e;
            int iHashCode5 = (iHashCode4 + (drmSessionManager2 != null ? drmSessionManager2.hashCode() : 0)) * 31;
            String str = this.f1579f;
            return iHashCode5 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("MediaSourceAttributes(context=");
            sbM1556G.append(this.f1574a);
            sbM1556G.append(", uri=");
            sbM1556G.append(this.f1575b);
            sbM1556G.append(", handler=");
            sbM1556G.append(this.f1576c);
            sbM1556G.append(", transferListener=");
            sbM1556G.append(this.f1577d);
            sbM1556G.append(", drmSessionManager=");
            sbM1556G.append(this.f1578e);
            sbM1556G.append(", userAgent=");
            return outline.m1550A(sbM1556G, this.f1579f, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Context context, Uri uri, Handler handler, TransferListener transferListener, DrmSessionManager2 drmSessionManager2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str2;
            TransferListener transferListener2 = (i & 8) != 0 ? null : transferListener;
            DrmSessionManager2 drmSessionManager3 = (i & 16) != 0 ? null : drmSessionManager2;
            if ((i & 32) != 0) {
                Objects.requireNonNull(MediaSourceProvider.f1569b);
                str2 = MediaSourceProvider.f1568a;
            } else {
                str2 = str;
            }
            this(context, uri, handler, transferListener2, drmSessionManager3, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract MediaSource2 mo1161a(a aVar);

    /* JADX INFO: renamed from: b */
    public final DataSource3.a m1162b(Context context, String str, TransferListener transferListener) {
        DataSource3.a defaultHttpDataSourceFactory;
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(str, "userAgent");
        ExoMedia exoMedia = ExoMedia.f1497e;
        ExoMedia2 exoMedia2 = ExoMedia.f1495c;
        if (exoMedia2 == null || (defaultHttpDataSourceFactory = exoMedia2.mo1011a(str, transferListener)) == null) {
            defaultHttpDataSourceFactory = new DefaultHttpDataSourceFactory(str, transferListener);
        }
        return new DefaultDataSourceFactory(context, transferListener, defaultHttpDataSourceFactory);
    }
}
