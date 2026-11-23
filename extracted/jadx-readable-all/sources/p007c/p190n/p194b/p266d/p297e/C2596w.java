package p007c.p190n.p194b.p266d.p297e;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4767b;

/* JADX INFO: renamed from: c.n.b.d.e.w */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2596w implements InterfaceC4767b {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4767b f11544a = new C2596w();

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4767b
    /* JADX INFO: renamed from: a */
    public final Object mo5191a(AbstractC4781i abstractC4781i) throws IOException {
        int i = C2575c.f11499a;
        if (abstractC4781i.mo10941n()) {
            return (Bundle) abstractC4781i.mo10937j();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(abstractC4781i.mo10936i());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(strValueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", abstractC4781i.mo10936i());
    }
}
