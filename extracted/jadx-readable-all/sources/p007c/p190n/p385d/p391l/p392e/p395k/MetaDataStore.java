package p007c.p190n.p385d.p391l.p392e.p395k;

import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.k.t0, reason: use source file name */
/* JADX INFO: compiled from: MetaDataStore.java */
/* JADX INFO: loaded from: classes.dex */
public class MetaDataStore {

    /* JADX INFO: renamed from: a */
    public final File f26622a;

    static {
        Charset.forName(Utf8Charset.NAME);
    }

    public MetaDataStore(File file) {
        this.f26622a = file;
    }

    /* JADX INFO: renamed from: b */
    public static UserMetadata m11807b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        UserMetadata userMetadata = new UserMetadata();
        String strOptString = jSONObject.isNull("userId") ? null : jSONObject.optString("userId", null);
        if (strOptString != null) {
            strOptString = strOptString.trim();
            if (strOptString.length() > 1024) {
                strOptString = strOptString.substring(0, 1024);
            }
        }
        userMetadata.f26647a = strOptString;
        return userMetadata;
    }

    /* JADX INFO: renamed from: a */
    public File m11808a(String str) {
        return new File(this.f26622a, outline.m1600v(str, "user", ".meta"));
    }
}
