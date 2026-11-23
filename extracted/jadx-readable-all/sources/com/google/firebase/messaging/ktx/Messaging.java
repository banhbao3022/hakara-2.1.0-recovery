package com.google.firebase.messaging.ktx;

import java.util.List;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p385d.p390k.Component3;
import p007c.p190n.p385d.p390k.ComponentRegistrar;
import p477d1.p483s.CollectionsJVM;

/* JADX INFO: renamed from: com.google.firebase.messaging.ktx.FirebaseMessagingKtxRegistrar, reason: use source file name */
/* JADX INFO: compiled from: Messaging.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Messaging implements ComponentRegistrar {
    @Override // p007c.p190n.p385d.p390k.ComponentRegistrar
    public List<Component3<?>> getComponents() {
        return CollectionsJVM.m13036a(C4799a.m11010r("fire-fcm-ktx", "21.0.1"));
    }
}
