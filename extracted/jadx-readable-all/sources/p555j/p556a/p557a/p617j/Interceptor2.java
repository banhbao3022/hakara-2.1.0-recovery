package p555j.p556a.p557a.p617j;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.stetho.websocket.CloseCodes;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import mtp.media.karaoke.utils.NativeUtils;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.Charsets2;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.HttpUrl;
import p509g1.Interceptor;
import p509g1.Request3;
import p509g1.Response3;
import p509g1.p510j0.p515h.RealInterceptorChain;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p619l.DeviceUtils;
import p555j.p556a.p557a.p619l.Extensions2;

/* JADX INFO: renamed from: j.a.a.j.c, reason: use source file name */
/* JADX INFO: compiled from: Interceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Interceptor2 implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f33019a;

    public Interceptor2(Context context) {
        this.f33019a = context;
    }

    @Override // p509g1.Interceptor
    public Response3 intercept(Interceptor.a aVar) throws NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics2.m13090f(aVar, "chain");
        DeviceUtils.a aVar2 = DeviceUtils.f33080a;
        Objects.requireNonNull(aVar2);
        Calendar calendar = Calendar.getInstance();
        Intrinsics2.m13088d(calendar, "Calendar.getInstance()");
        String strValueOf = String.valueOf(calendar.getTimeInMillis() / ((long) CloseCodes.NORMAL_CLOSURE));
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) aVar;
        Request3 request3 = realInterceptorChain.f30292f;
        HttpUrl httpUrlM13674b = request3.f29951b.m13669f().m13674b();
        Request3.a aVar3 = new Request3.a(request3);
        aVar3.m13321i(httpUrlM13674b);
        if ("suggestqueries.google.com".equals(httpUrlM13674b.f30647g)) {
            aVar3.m13318f(request3.f29952c, request3.f29954e);
            return realInterceptorChain.mo13492a(aVar3.m13314b());
        }
        aVar3.m13316d("Accept", "application/json");
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.getDefault();
        Intrinsics2.m13088d(locale, "Locale.getDefault()");
        sb.append(locale.getLanguage());
        sb.append("-");
        Locale locale2 = Locale.getDefault();
        Intrinsics2.m13088d(locale2, "Locale.getDefault()");
        sb.append(locale2.getCountry());
        aVar3.m13316d("Accept-Language", sb.toString());
        aVar3.m13316d("Unique-Id", aVar2.m14247a(this.f33019a));
        aVar3.m13316d("App-Version", "2.1.0");
        aVar2.m14250d();
        String str = Build.VERSION.RELEASE;
        aVar3.m13316d("Os", str);
        aVar3.m13316d("Current-Time", strValueOf);
        Context context = this.f33019a;
        Intrinsics2.m13089e(strValueOf, "currentTime");
        Intrinsics2.m13089e(context, "context");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("App-Version=");
        sb2.append("2.1.0");
        sb2.append("&Current-Time=");
        sb2.append(strValueOf);
        sb2.append("&Os=");
        aVar2.m14250d();
        sb2.append(str);
        sb2.append("&Unique-Id=");
        sb2.append(aVar2.m14247a(context));
        String string = sb2.toString();
        String appKey = NativeUtils.getAppKey();
        Intrinsics2.m13088d(appKey, "appKey");
        Intrinsics2.m13089e(string, "data");
        Intrinsics2.m13089e(appKey, "key");
        Charset charset = Charsets2.f29452a;
        byte[] bytes = appKey.getBytes(charset);
        Intrinsics2.m13088d(bytes, "(this as java.lang.String).getBytes(charset)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        byte[] bytes2 = string.getBytes(charset);
        Intrinsics2.m13088d(bytes2, "(this as java.lang.String).getBytes(charset)");
        byte[] bArrDoFinal = mac.doFinal(bytes2);
        Intrinsics2.m13088d(bArrDoFinal, "bytes");
        Intrinsics2.m13089e(bArrDoFinal, "$this$toHex");
        Extensions2 extensions2 = Extensions2.f33087g;
        Intrinsics2.m13089e(bArrDoFinal, "$this$joinToString");
        Intrinsics2.m13089e("", "separator");
        Intrinsics2.m13089e("", "prefix");
        Intrinsics2.m13089e("", "postfix");
        Intrinsics2.m13089e("...", "truncated");
        StringBuilder sb3 = new StringBuilder();
        Intrinsics2.m13089e(bArrDoFinal, "$this$joinTo");
        Intrinsics2.m13089e(sb3, "buffer");
        Intrinsics2.m13089e("", "separator");
        Intrinsics2.m13089e("", "prefix");
        Intrinsics2.m13089e("", "postfix");
        Intrinsics2.m13089e("...", "truncated");
        sb3.append((CharSequence) "");
        int i = 0;
        for (byte b : bArrDoFinal) {
            i++;
            if (i > 1) {
                sb3.append((CharSequence) "");
            }
            if (extensions2 != null) {
                sb3.append((CharSequence) extensions2.mo3b(Byte.valueOf(b)));
            } else {
                sb3.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb3.append((CharSequence) "");
        String string2 = sb3.toString();
        Intrinsics2.m13088d(string2, "joinTo(StringBuilder(), …ed, transform).toString()");
        aVar3.m13316d("Sig", string2);
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        String str2 = (String) outline.m1584f(sharedPreferences.getString("access_token", null), String.class);
        if (str2 != null) {
            aVar3.m13313a("Authorization", "Bearer " + str2);
        }
        aVar3.m13318f(request3.f29952c, request3.f29954e);
        return realInterceptorChain.mo13492a(aVar3.m13314b());
    }
}
