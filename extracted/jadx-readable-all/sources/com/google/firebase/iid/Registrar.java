package com.google.firebase.iid;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p390k.Component3;
import p007c.p190n.p385d.p390k.ComponentContainer;
import p007c.p190n.p385d.p390k.ComponentRegistrar;
import p007c.p190n.p385d.p390k.Dependency;
import p007c.p190n.p385d.p417q.HeartBeatInfo;
import p007c.p190n.p385d.p418r.C5492r;
import p007c.p190n.p385d.p418r.C5493s;
import p007c.p190n.p385d.p418r.p419e0.InterfaceC5479a;
import p007c.p190n.p385d.p421t.FirebaseInstallationsApi;
import p007c.p190n.p385d.p429x.UserAgentPublisher;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public final class Registrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: com.google.firebase.iid.Registrar$a */
    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
    public static class C5995a implements InterfaceC5479a {
        public C5995a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(ComponentContainer componentContainer) {
        return new FirebaseInstanceId((FirebaseApp2) componentContainer.mo11684a(FirebaseApp2.class), componentContainer.mo11693b(UserAgentPublisher.class), componentContainer.mo11693b(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.mo11684a(FirebaseInstallationsApi.class));
    }

    public static final /* synthetic */ InterfaceC5479a lambda$getComponents$1$Registrar(ComponentContainer componentContainer) {
        return new C5995a((FirebaseInstanceId) componentContainer.mo11684a(FirebaseInstanceId.class));
    }

    @Override // p007c.p190n.p385d.p390k.ComponentRegistrar
    @Keep
    public List<Component3<?>> getComponents() {
        Component3.b bVarM11686a = Component3.m11686a(FirebaseInstanceId.class);
        bVarM11686a.m11689a(new Dependency(FirebaseApp2.class, 1, 0));
        bVarM11686a.m11689a(new Dependency(UserAgentPublisher.class, 0, 1));
        bVarM11686a.m11689a(new Dependency(HeartBeatInfo.class, 0, 1));
        bVarM11686a.m11689a(new Dependency(FirebaseInstallationsApi.class, 1, 0));
        bVarM11686a.m11691c(C5492r.f27090a);
        bVarM11686a.m11692d(1);
        Component3 component3M11690b = bVarM11686a.m11690b();
        Component3.b bVarM11686a2 = Component3.m11686a(InterfaceC5479a.class);
        bVarM11686a2.m11689a(new Dependency(FirebaseInstanceId.class, 1, 0));
        bVarM11686a2.m11691c(C5493s.f27091a);
        return Arrays.asList(component3M11690b, bVarM11686a2.m11690b(), C4799a.m11010r("fire-iid", "21.0.1"));
    }
}
