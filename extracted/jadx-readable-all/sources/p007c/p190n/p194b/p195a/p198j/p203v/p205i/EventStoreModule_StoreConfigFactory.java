package p007c.p190n.p194b.p195a.p198j.p203v.p205i;

import java.util.Objects;
import p005b1.p006a.Provider;

/* JADX INFO: renamed from: c.n.b.a.j.v.i.g, reason: use source file name */
/* JADX INFO: compiled from: EventStoreModule_StoreConfigFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class EventStoreModule_StoreConfigFactory implements Provider {

    /* JADX INFO: renamed from: c.n.b.a.j.v.i.g$a */
    /* JADX INFO: compiled from: EventStoreModule_StoreConfigFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final EventStoreModule_StoreConfigFactory f5886a = new EventStoreModule_StoreConfigFactory();
    }

    @Override // p005b1.p006a.Provider
    public Object get() {
        EventStoreConfig eventStoreConfig = EventStoreConfig.f5883a;
        Objects.requireNonNull(eventStoreConfig, "Cannot return null from a non-@Nullable @Provides method");
        return eventStoreConfig;
    }
}
