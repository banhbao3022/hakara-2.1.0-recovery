package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sm1 {

    /* JADX INFO: renamed from: a */
    public final String f19617a = C3201k4.f15880b.m6603d();

    /* JADX INFO: renamed from: a */
    public final String m8356a(Map<String, String> map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f19617a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
