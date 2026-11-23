package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;

/* JADX INFO: renamed from: c.n.b.d.j.a.qn */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3442qn implements InterfaceC3516sn {

    /* JADX INFO: renamed from: a */
    public final byte[] f18383a;

    public C3442qn(byte[] bArr) {
        this.f18383a = bArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3516sn
    /* JADX INFO: renamed from: a */
    public final void mo8044a(JsonWriter jsonWriter) throws IOException {
        byte[] bArr = this.f18383a;
        Object obj = C3553tn.f19921a;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(strEncodeToString);
        } else {
            String strM7884b = C3331nn.m7884b(strEncodeToString);
            if (strM7884b != null) {
                jsonWriter.name("bodydigest").value(strM7884b);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }
}
