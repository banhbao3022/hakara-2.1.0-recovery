package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p386j.p387a.InterfaceC5229a;
import p007c.p190n.p385d.p386j.p387a.p388c.C5231a;
import p007c.p190n.p385d.p390k.Component3;
import p007c.p190n.p385d.p390k.ComponentRegistrar;
import p007c.p190n.p385d.p390k.Dependency;
import p007c.p190n.p385d.p416p.Subscriber;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // p007c.p190n.p385d.p390k.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<Component3<?>> getComponents() {
        Component3.b bVarM11686a = Component3.m11686a(InterfaceC5229a.class);
        bVarM11686a.m11689a(new Dependency(FirebaseApp2.class, 1, 0));
        bVarM11686a.m11689a(new Dependency(Context.class, 1, 0));
        bVarM11686a.m11689a(new Dependency(Subscriber.class, 1, 0));
        bVarM11686a.m11691c(C5231a.f26329a);
        bVarM11686a.m11692d(2);
        return Arrays.asList(bVarM11686a.m11690b(), C4799a.m11010r("fire-analytics", "18.0.0"));
    }
}
