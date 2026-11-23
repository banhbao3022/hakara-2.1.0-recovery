package p007c.p190n.p194b.p266d.p298f.p302q;

import android.net.Uri;

/* JADX INFO: renamed from: c.n.b.d.f.q.e1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2725e1 {

    /* JADX INFO: renamed from: a */
    public static final Uri f11849a;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        f11849a = uri;
        uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
