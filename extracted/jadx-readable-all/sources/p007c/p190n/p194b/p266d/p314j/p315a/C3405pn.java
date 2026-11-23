package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.a.pn */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3405pn implements InterfaceC3516sn {

    /* JADX INFO: renamed from: a */
    public final int f18033a;

    /* JADX INFO: renamed from: b */
    public final Map f18034b;

    public C3405pn(int i, Map map) {
        this.f18033a = i;
        this.f18034b = map;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3516sn
    /* JADX INFO: renamed from: a */
    public final void mo8044a(JsonWriter jsonWriter) throws IOException {
        int i = this.f18033a;
        Map map = this.f18034b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        C3553tn.m8432e(jsonWriter, map);
        jsonWriter.endObject();
    }
}
