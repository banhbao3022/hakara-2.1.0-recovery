package p007c.p190n.p194b.p367f.p368a.p375f;

import android.app.PendingIntent;
import com.google.android.play.core.review.ReviewInfo;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.f.a.f.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5127a extends ReviewInfo {

    /* JADX INFO: renamed from: f */
    public final PendingIntent f26083f;

    public C5127a(PendingIntent pendingIntent) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f26083f = pendingIntent;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    /* JADX INFO: renamed from: a */
    public final PendingIntent mo11561a() {
        return this.f26083f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.f26083f.equals(((ReviewInfo) obj).mo11561a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f26083f.hashCode() ^ 1000003;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f26083f);
        return outline.m1552C(new StringBuilder(strValueOf.length() + 26), "ReviewInfo{pendingIntent=", strValueOf, "}");
    }
}
