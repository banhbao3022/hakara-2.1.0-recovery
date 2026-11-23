package p007c.p190n.p385d;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.C2753q;
import p007c.p190n.p194b.p266d.p298f.p302q.C2765w;
import p007c.p190n.p194b.p266d.p298f.p307u.C2788h;

/* JADX INFO: renamed from: c.n.d.i, reason: use source file name */
/* JADX INFO: compiled from: FirebaseOptions.java */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseOptions {

    /* JADX INFO: renamed from: a */
    public final String f26319a;

    /* JADX INFO: renamed from: b */
    public final String f26320b;

    /* JADX INFO: renamed from: c */
    public final String f26321c;

    /* JADX INFO: renamed from: d */
    public final String f26322d;

    /* JADX INFO: renamed from: e */
    public final String f26323e;

    /* JADX INFO: renamed from: f */
    public final String f26324f;

    /* JADX INFO: renamed from: g */
    public final String f26325g;

    public FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2622l.m5389k(!C2788h.m5630a(str), "ApplicationId must be set.");
        this.f26320b = str;
        this.f26319a = str2;
        this.f26321c = str3;
        this.f26322d = str4;
        this.f26323e = str5;
        this.f26324f = str6;
        this.f26325g = str7;
    }

    /* JADX INFO: renamed from: a */
    public static FirebaseOptions m11675a(Context context) {
        C2765w c2765w = new C2765w(context);
        String strM5611a = c2765w.m5611a("google_app_id");
        if (TextUtils.isEmpty(strM5611a)) {
            return null;
        }
        return new FirebaseOptions(strM5611a, c2765w.m5611a("google_api_key"), c2765w.m5611a("firebase_database_url"), c2765w.m5611a("ga_trackingId"), c2765w.m5611a("gcm_defaultSenderId"), c2765w.m5611a("google_storage_bucket"), c2765w.m5611a("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return C2622l.m5459y(this.f26320b, firebaseOptions.f26320b) && C2622l.m5459y(this.f26319a, firebaseOptions.f26319a) && C2622l.m5459y(this.f26321c, firebaseOptions.f26321c) && C2622l.m5459y(this.f26322d, firebaseOptions.f26322d) && C2622l.m5459y(this.f26323e, firebaseOptions.f26323e) && C2622l.m5459y(this.f26324f, firebaseOptions.f26324f) && C2622l.m5459y(this.f26325g, firebaseOptions.f26325g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26320b, this.f26319a, this.f26321c, this.f26322d, this.f26323e, this.f26324f, this.f26325g});
    }

    public String toString() {
        C2753q c2753q = new C2753q(this);
        c2753q.m5608a("applicationId", this.f26320b);
        c2753q.m5608a("apiKey", this.f26319a);
        c2753q.m5608a("databaseUrl", this.f26321c);
        c2753q.m5608a("gcmSenderId", this.f26323e);
        c2753q.m5608a("storageBucket", this.f26324f);
        c2753q.m5608a("projectId", this.f26325g);
        return c2753q.toString();
    }
}
