package p007c.p190n.p194b.p367f.p368a.p375f;

import android.content.Context;
import android.content.Intent;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p373d.C5109p;
import p007c.p190n.p194b.p367f.p368a.p373d.C5115s;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5083c;

/* JADX INFO: renamed from: c.n.b.f.a.f.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5135i {

    /* JADX INFO: renamed from: a */
    public static final C5089f f26093a = new C5089f("ReviewService");

    /* JADX INFO: renamed from: b */
    public C5109p<InterfaceC5083c> f26094b;

    /* JADX INFO: renamed from: c */
    public final String f26095c;

    public C5135i(Context context) {
        this.f26095c = context.getPackageName();
        if (C5115s.m11555a(context)) {
            this.f26094b = new C5109p<>(context, f26093a, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), C5130d.f26087a);
        }
    }
}
