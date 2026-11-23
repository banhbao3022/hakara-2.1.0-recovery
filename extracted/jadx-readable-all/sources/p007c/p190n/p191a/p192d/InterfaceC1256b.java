package p007c.p190n.p191a.p192d;

import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p191a.p192d.AbstractC1259e;

/* JADX INFO: renamed from: c.n.a.d.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface InterfaceC1256b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends AbstractC1259e> {
    void destroy();

    @RecentlyNonNull
    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @RecentlyNonNull
    Class<SERVER_PARAMETERS> getServerParametersType();
}
