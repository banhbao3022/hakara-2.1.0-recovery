package p007c.p190n.p385d.p421t.p423q;

import com.facebook.stetho.common.Utf8Charset;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.FirebaseApp2;

/* JADX INFO: renamed from: c.n.d.t.q.c, reason: use source file name */
/* JADX INFO: compiled from: PersistedInstallation.java */
/* JADX INFO: loaded from: classes.dex */
public class PersistedInstallation {

    /* JADX INFO: renamed from: a */
    public final File f27177a;

    /* JADX INFO: renamed from: b */
    public final FirebaseApp2 f27178b;

    /* JADX INFO: renamed from: c.n.d.t.q.c$a */
    /* JADX INFO: compiled from: PersistedInstallation.java */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(FirebaseApp2 firebaseApp2) {
        firebaseApp2.m11668a();
        File filesDir = firebaseApp2.f26303d.getFilesDir();
        StringBuilder sbM1556G = outline.m1556G("PersistedInstallation.");
        sbM1556G.append(firebaseApp2.m11669c());
        sbM1556G.append(".json");
        this.f27177a = new File(filesDir, sbM1556G.toString());
        this.f27178b = firebaseApp2;
    }

    /* JADX INFO: renamed from: a */
    public PersistedInstallationEntry m12136a(PersistedInstallationEntry persistedInstallationEntry) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", persistedInstallationEntry.mo12121c());
            jSONObject.put("Status", persistedInstallationEntry.mo12124f().ordinal());
            jSONObject.put("AuthToken", persistedInstallationEntry.mo12119a());
            jSONObject.put("RefreshToken", persistedInstallationEntry.mo12123e());
            jSONObject.put("TokenCreationEpochInSecs", persistedInstallationEntry.mo12125g());
            jSONObject.put("ExpiresInSecs", persistedInstallationEntry.mo12120b());
            jSONObject.put("FisError", persistedInstallationEntry.mo12122d());
            FirebaseApp2 firebaseApp2 = this.f27178b;
            firebaseApp2.m11668a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", firebaseApp2.f26303d.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Utf8Charset.NAME));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(this.f27177a)) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return persistedInstallationEntry;
    }

    /* JADX INFO: renamed from: b */
    public PersistedInstallationEntry m12137b() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f27177a);
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused2) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        a aVar = a.ATTEMPT_MIGRATION;
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = PersistedInstallationEntry.f27185a;
        AutoValue_PersistedInstallationEntry.b bVar = new AutoValue_PersistedInstallationEntry.b();
        bVar.mo12134h(0L);
        bVar.mo12133g(aVar);
        bVar.mo12129c(0L);
        bVar.f27167a = strOptString;
        bVar.mo12133g(a.values()[iOptInt]);
        bVar.f27169c = strOptString2;
        bVar.f27170d = strOptString3;
        bVar.mo12134h(jOptLong);
        bVar.mo12129c(jOptLong2);
        bVar.f27173g = strOptString4;
        return bVar.mo12127a();
    }
}
