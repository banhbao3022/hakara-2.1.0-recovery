package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p007c.p190n.p194b.p195a.p196i.CctTransportBackend3;
import p007c.p190n.p194b.p195a.p198j.p199s.BackendFactory;
import p007c.p190n.p194b.p195a.p198j.p199s.CreationContext;
import p007c.p190n.p194b.p195a.p198j.p199s.TransportBackend;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory implements BackendFactory {
    @Override // p007c.p190n.p194b.p195a.p198j.p199s.BackendFactory
    public TransportBackend create(CreationContext creationContext) {
        return new CctTransportBackend3(creationContext.mo2827a(), creationContext.mo2830d(), creationContext.mo2829c());
    }
}
