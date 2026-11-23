package p007c.p190n.p194b.p266d.p285b.p286a.p287d;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.dynamite.DynamiteModule;
import p007c.p190n.p194b.p266d.p285b.p286a.C2331a;
import p007c.p190n.p194b.p266d.p298f.C2608e;
import p007c.p190n.p194b.p266d.p298f.p299o.C2631d;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2641a;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2683p;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2334a extends C2631d<GoogleSignInOptions> {

    /* JADX INFO: renamed from: j */
    public static int f10928j = 1;

    /* JADX INFO: renamed from: c.n.b.d.b.a.d.a$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final enum a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10929a = {1, 2, 3, 4};
    }

    public C2334a(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C2331a.f10916e, googleSignInOptions, new C2641a());
    }

    /* JADX INFO: renamed from: d */
    public final synchronized int m4906d() {
        if (f10928j == 1) {
            Context context = this.f11610a;
            C2608e c2608e = C2608e.f11563d;
            int iMo5207d = c2608e.mo5207d(context, 12451000);
            if (iMo5207d == 0) {
                f10928j = 4;
            } else if (c2608e.mo5205b(context, iMo5207d, null) != null || DynamiteModule.m12664a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                f10928j = 2;
            } else {
                f10928j = 3;
            }
        }
        return f10928j;
    }

    public C2334a(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C2331a.f10916e, googleSignInOptions, (InterfaceC2683p) new C2641a());
    }
}
