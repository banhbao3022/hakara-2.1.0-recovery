package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2659g;
import p007c.p190n.p194b.p266d.p298f.p304r.C2775a;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2346j {

    /* JADX INFO: renamed from: a */
    public static C2775a f10946a = new C2775a("GoogleSignInCommon", new String[0]);

    /* JADX INFO: renamed from: a */
    public static Intent m4927a(Context context, GoogleSignInOptions googleSignInOptions) {
        f10946a.m5613a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static void m4928b(Context context) {
        C2352p.m4932b(context).m4933a();
        Set<AbstractC2632e> set = AbstractC2632e.f11624a;
        synchronized (set) {
        }
        Iterator<AbstractC2632e> it = set.iterator();
        if (it.hasNext()) {
            Objects.requireNonNull(it.next());
            throw new UnsupportedOperationException();
        }
        synchronized (C2659g.f11660h) {
            C2659g c2659g = C2659g.f11661i;
            if (c2659g != null) {
                c2659g.f11667o.incrementAndGet();
                Handler handler = c2659g.f11672t;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }
}
