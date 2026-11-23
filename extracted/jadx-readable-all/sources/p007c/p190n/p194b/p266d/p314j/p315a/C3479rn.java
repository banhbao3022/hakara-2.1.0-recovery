package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.JsonWriter;
import java.io.IOException;

/* JADX INFO: renamed from: c.n.b.d.j.a.rn */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3479rn implements InterfaceC3516sn {

    /* JADX INFO: renamed from: a */
    public final String f18962a;

    public C3479rn(String str) {
        this.f18962a = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3516sn
    /* JADX INFO: renamed from: a */
    public final void mo8044a(JsonWriter jsonWriter) throws IOException {
        String str = this.f18962a;
        Object obj = C3553tn.f19921a;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
