package com.google.android.exoplayer2.ext.cast;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p266d.p290d.p291r.AbstractC2442k;
import p007c.p190n.p194b.p266d.p290d.p291r.C2424b;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2430e;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2444a;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultCastOptionsProvider implements InterfaceC2430e {
    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2430e
    /* JADX INFO: renamed from: a */
    public List<AbstractC2442k> mo5018a(Context context) {
        return Collections.emptyList();
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2430e
    /* JADX INFO: renamed from: b */
    public C2424b mo5019b(Context context) {
        C2424b.a aVar = new C2424b.a();
        aVar.f11161a = "A12D4273";
        aVar.f11163c = true;
        C2444a.a aVar2 = new C2444a.a();
        return new C2424b(aVar.f11161a, aVar.f11162b, aVar.f11163c, aVar.f11164d, aVar.f11165e, new C2444a(aVar2.f11205a, null, null, aVar2.f11206b, false, aVar2.f11207c), aVar.f11166f, aVar.f11167g, false);
    }
}
