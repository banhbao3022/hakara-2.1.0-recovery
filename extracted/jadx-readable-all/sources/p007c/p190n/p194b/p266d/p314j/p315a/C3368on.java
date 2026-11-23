package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.a.on */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3368on implements InterfaceC3516sn {

    /* JADX INFO: renamed from: a */
    public final String f17685a;

    /* JADX INFO: renamed from: b */
    public final String f17686b;

    /* JADX INFO: renamed from: c */
    public final Map f17687c;

    /* JADX INFO: renamed from: d */
    public final byte[] f17688d;

    public C3368on(String str, String str2, Map map, byte[] bArr) {
        this.f17685a = str;
        this.f17686b = str2;
        this.f17687c = map;
        this.f17688d = bArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3516sn
    /* JADX INFO: renamed from: a */
    public final void mo8044a(JsonWriter jsonWriter) throws IOException {
        String str = this.f17685a;
        String str2 = this.f17686b;
        Map map = this.f17687c;
        byte[] bArr = this.f17688d;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        C3553tn.m8432e(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }
}
