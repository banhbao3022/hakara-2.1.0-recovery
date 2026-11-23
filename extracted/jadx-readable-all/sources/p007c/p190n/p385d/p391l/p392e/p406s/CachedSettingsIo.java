package p007c.p190n.p385d.p391l.p392e.p406s;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONObject;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p395k.CommonUtils;
import p007c.p190n.p385d.p391l.p392e.p400o.FileStoreImpl;

/* JADX INFO: renamed from: c.n.d.l.e.s.a, reason: use source file name */
/* JADX INFO: compiled from: CachedSettingsIo.java */
/* JADX INFO: loaded from: classes.dex */
public class CachedSettingsIo {

    /* JADX INFO: renamed from: a */
    public final Context f26954a;

    public CachedSettingsIo(Context context) {
        this.f26954a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX INFO: renamed from: a */
    public JSONObject m12027a() throws Throwable {
        Exception e;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Logger4 logger4 = Logger4.f26421a;
        logger4.m11713b("Reading cached settings...");
        ?? r2 = 0;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File file = new File(new FileStoreImpl(this.f26954a).m11983a(), "com.crashlytics.settings.json");
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        jSONObject = new JSONObject(CommonUtils.m11758u(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        Logger4 logger5 = Logger4.f26421a;
                        if (logger5.m11712a(6)) {
                            Log.e(logger5.f26422b, "Failed to fetch cached settings", e);
                        }
                        CommonUtils.m11740c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    logger4.m11713b("No cached settings found.");
                    jSONObject = null;
                }
                CommonUtils.m11740c(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th) {
                r2 = logger4;
                th = th;
                CommonUtils.m11740c(r2, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.m11740c(r2, "Error while closing settings cache file.");
            throw th;
        }
    }
}
