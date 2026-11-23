package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p195a.TransportFactory;
import p007c.p190n.p194b.p195a.p196i.CCTDestination;
import p007c.p190n.p194b.p195a.p198j.TransportRuntime;
import p007c.p190n.p385d.p390k.Component3;
import p007c.p190n.p385d.p390k.ComponentContainer;
import p007c.p190n.p385d.p390k.ComponentFactory;
import p007c.p190n.p385d.p390k.ComponentRegistrar;
import p007c.p190n.p385d.p390k.Dependency;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    public static /* synthetic */ TransportFactory lambda$getComponents$0(ComponentContainer componentContainer) {
        TransportRuntime.m2821b((Context) componentContainer.mo11684a(Context.class));
        return TransportRuntime.m2820a().m2822c(CCTDestination.f5525f);
    }

    @Override // p007c.p190n.p385d.p390k.ComponentRegistrar
    public List<Component3<?>> getComponents() {
        Component3.b bVarM11686a = Component3.m11686a(TransportFactory.class);
        bVarM11686a.m11689a(new Dependency(Context.class, 1, 0));
        bVarM11686a.m11691c(new ComponentFactory() { // from class: c.n.d.m.a
            @Override // p007c.p190n.p385d.p390k.ComponentFactory
            /* JADX INFO: renamed from: a */
            public Object mo11679a(ComponentContainer componentContainer) {
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            }
        });
        return Collections.singletonList(bVarM11686a.m11690b());
    }
}
