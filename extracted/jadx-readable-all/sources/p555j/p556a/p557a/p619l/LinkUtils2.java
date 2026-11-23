package p555j.p556a.p557a.p619l;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.l.l, reason: use source file name */
/* JADX INFO: compiled from: LinkUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LinkUtils2 {
    /* JADX INFO: renamed from: a */
    public static final void m14254a(String str, Context context) {
        Intrinsics2.m13089e(str, "url");
        Intrinsics2.m13089e(context, "context");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).normalizeScheme());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intrinsics2.m13089e("LinkUtils: Actvity was not found for intent " + intent, "message");
        }
    }
}
