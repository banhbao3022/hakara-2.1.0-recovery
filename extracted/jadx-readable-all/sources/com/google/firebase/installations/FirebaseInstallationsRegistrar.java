package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p390k.Component3;
import p007c.p190n.p385d.p390k.ComponentContainer;
import p007c.p190n.p385d.p390k.ComponentFactory;
import p007c.p190n.p385d.p390k.ComponentRegistrar;
import p007c.p190n.p385d.p390k.Dependency;
import p007c.p190n.p385d.p417q.HeartBeatInfo;
import p007c.p190n.p385d.p421t.FirebaseInstallations4;
import p007c.p190n.p385d.p421t.FirebaseInstallationsApi;
import p007c.p190n.p385d.p429x.UserAgentPublisher;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseInstallationsApi lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseInstallations4((FirebaseApp2) componentContainer.mo11684a(FirebaseApp2.class), componentContainer.mo11693b(UserAgentPublisher.class), componentContainer.mo11693b(HeartBeatInfo.class));
    }

    @Override // p007c.p190n.p385d.p390k.ComponentRegistrar
    public List<Component3<?>> getComponents() {
        Component3.b bVarM11686a = Component3.m11686a(FirebaseInstallationsApi.class);
        bVarM11686a.m11689a(new Dependency(FirebaseApp2.class, 1, 0));
        bVarM11686a.m11689a(new Dependency(HeartBeatInfo.class, 0, 1));
        bVarM11686a.m11689a(new Dependency(UserAgentPublisher.class, 0, 1));
        bVarM11686a.m11691c(new ComponentFactory() { // from class: c.n.d.t.i
            @Override // p007c.p190n.p385d.p390k.ComponentFactory
            /* JADX INFO: renamed from: a */
            public Object mo11679a(ComponentContainer componentContainer) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
            }
        });
        return Arrays.asList(bVarM11686a.m11690b(), C4799a.m11010r("fire-installations", "16.3.5"));
    }
}
