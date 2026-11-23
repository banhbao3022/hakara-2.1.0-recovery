package p007c.p165l;

import com.facebook.stetho.common.Utf8Charset;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: c.l.t, reason: use source file name */
/* JADX INFO: compiled from: GraphRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class GraphRequest3 implements GraphRequest2.e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f5395a;

    public GraphRequest3(GraphRequest2 graphRequest2, ArrayList arrayList) {
        this.f5395a = arrayList;
    }

    @Override // p007c.p165l.GraphRequest2.e
    /* JADX INFO: renamed from: a */
    public void mo2693a(String str, String str2) throws IOException {
        this.f5395a.add(String.format(Locale.US, "%s=%s", str, URLEncoder.encode(str2, Utf8Charset.NAME)));
    }
}
