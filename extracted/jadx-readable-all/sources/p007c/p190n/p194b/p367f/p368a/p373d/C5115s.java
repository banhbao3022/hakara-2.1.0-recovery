package p007c.p190n.p194b.p367f.p368a.p373d;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: c.n.b.f.a.d.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5115s {

    /* JADX INFO: renamed from: a */
    public static final C5089f f26068a = new C5089f("PhoneskyVerificationUtils");

    /* JADX INFO: renamed from: a */
    public static boolean m11555a(Context context) {
        String strEncodeToString;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
            if (signatureArr == null || (signatureArr.length) == 0) {
                f26068a.m11533b(5, "Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                return false;
            }
            for (Signature signature : signatureArr) {
                byte[] byteArray = signature.toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(byteArray);
                    strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                } catch (NoSuchAlgorithmException unused) {
                    strEncodeToString = "";
                }
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                    return true;
                }
                if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11556b(Context context) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        return packagesForUid != null && Arrays.asList(packagesForUid).contains("com.android.vending");
    }
}
