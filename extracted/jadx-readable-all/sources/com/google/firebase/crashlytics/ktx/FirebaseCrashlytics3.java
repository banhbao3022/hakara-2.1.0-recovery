package com.google.firebase.crashlytics.ktx;

import androidx.annotation.Keep;
import java.util.List;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p385d.p390k.Component3;
import p007c.p190n.p385d.p390k.ComponentRegistrar;
import p477d1.p483s.CollectionsJVM;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKtxRegistrar, reason: use source file name */
/* JADX INFO: compiled from: FirebaseCrashlytics.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCrashlytics3 implements ComponentRegistrar {
    @Override // p007c.p190n.p385d.p390k.ComponentRegistrar
    public List<Component3<?>> getComponents() {
        return CollectionsJVM.m13036a(C4799a.m11010r("fire-cls-ktx", "17.3.0"));
    }
}
