package com.google.firebase.ktx;

import androidx.annotation.Keep;
import java.util.List;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p385d.p390k.Component3;
import p007c.p190n.p385d.p390k.ComponentRegistrar;
import p477d1.p483s.CollectionsJVM;

/* JADX INFO: renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar, reason: use source file name */
/* JADX INFO: compiled from: Firebase.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
public final class Firebase2 implements ComponentRegistrar {
    @Override // p007c.p190n.p385d.p390k.ComponentRegistrar
    public List<Component3<?>> getComponents() {
        return CollectionsJVM.m13036a(C4799a.m11010r("fire-core-ktx", "19.5.0"));
    }
}
