package p007c.p190n.p385d.p421t.p423q;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import p007c.p190n.p385d.FirebaseApp2;

/* JADX INFO: renamed from: c.n.d.t.q.b, reason: use source file name */
/* JADX INFO: compiled from: IidStore.java */
/* JADX INFO: loaded from: classes.dex */
public class IidStore {

    /* JADX INFO: renamed from: a */
    public static final String[] f27174a = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f27175b;

    /* JADX INFO: renamed from: c */
    public final String f27176c;

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public IidStore(FirebaseApp2 firebaseApp2) {
        firebaseApp2.m11668a();
        this.f27175b = firebaseApp2.f26303d.getSharedPreferences("com.google.android.gms.appid", 0);
        firebaseApp2.m11668a();
        String str = firebaseApp2.f26305f.f26323e;
        if (str == null) {
            firebaseApp2.m11668a();
            str = firebaseApp2.f26305f.f26320b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f27176c = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m12135a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f27175b) {
            String strEncodeToString = null;
            String string = this.f27175b.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }

    public IidStore(SharedPreferences sharedPreferences, String str) {
        this.f27175b = sharedPreferences;
        this.f27176c = str;
    }
}
