package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.stetho.common.Utf8Charset;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3147io;
import p007c.p190n.p194b.p266d.p314j.p315a.kv1;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.o */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2286o {

    /* JADX INFO: renamed from: a */
    public final Object f10755a = new Object();

    /* JADX INFO: renamed from: b */
    public String f10756b = "";

    /* JADX INFO: renamed from: c */
    public String f10757c = "";

    /* JADX INFO: renamed from: d */
    public boolean f10758d = false;

    /* JADX INFO: renamed from: e */
    public String f10759e = "";

    /* JADX INFO: renamed from: e */
    public static final String m4791e(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", C2330u.f10884a.f10889d.m4766B(context, str2));
        kv1<String> kv1VarM4734a = new C2257e0(context).m4734a(0, str, map, null);
        try {
            return (String) ((C3147io) kv1VarM4734a).get(((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14180E2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String strValueOf = String.valueOf(str);
            C2622l.m5438t3(strValueOf.length() != 0 ? "Interrupted while retrieving a response from: ".concat(strValueOf) : new String("Interrupted while retrieving a response from: "), e);
            ((C3147io) kv1VarM4734a).cancel(true);
            return null;
        } catch (TimeoutException e2) {
            String strValueOf2 = String.valueOf(str);
            C2622l.m5438t3(strValueOf2.length() != 0 ? "Timeout while retrieving a response from: ".concat(strValueOf2) : new String("Timeout while retrieving a response from: "), e2);
            ((C3147io) kv1VarM4734a).cancel(true);
            return null;
        } catch (Exception e3) {
            String strValueOf3 = String.valueOf(str);
            C2622l.m5438t3(strValueOf3.length() != 0 ? "Error retrieving a response from: ".concat(strValueOf3) : new String("Error retrieving a response from: "), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4792a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !C2330u.f10884a.f10899n.m4794c()) {
            return false;
        }
        C2622l.m5318U2("Sending troubleshooting signals to the server.");
        m4793b(context, str, str2, str3);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m4793b(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = m4797g(context, (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14173D2), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        C2267h1.m4751j(context, str, builderBuildUpon.build().toString());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4794c() {
        boolean z;
        synchronized (this.f10755a) {
            z = this.f10758d;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m4795d(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            C2267h1.f10713a.post(new RunnableC2283n(context, str, z, z2));
        } else {
            C2622l.m5458x3("Can not create dialog without Activity Context");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4796f(Context context, String str, String str2) {
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        C2267h1.m4759r(context, m4797g(context, (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14152A2), str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006f A[Catch: all -> 0x0034, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0019, B:12:0x003d, B:14:0x0045, B:16:0x0058, B:19:0x006a, B:11:0x0036, B:20:0x006f, B:21:0x0071), top: B:26:0x000b, inners: #1, #2 }] */
    /* JADX INFO: renamed from: g */
    public final Uri m4797g(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f10755a) {
            if (TextUtils.isEmpty(this.f10756b)) {
                C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C2622l.m5399m(fileInputStreamOpenFileInput, byteArrayOutputStream, true, 1024);
                    str5 = new String(byteArrayOutputStream.toByteArray(), Utf8Charset.NAME);
                } catch (IOException unused) {
                    C2622l.m5318U2("Error reading from internal storage.");
                    str5 = "";
                }
                this.f10756b = str5;
                if (TextUtils.isEmpty(str5)) {
                    C2330u c2330u = C2330u.f10884a;
                    C2267h1 c2267h2 = c2330u.f10889d;
                    String string = UUID.randomUUID().toString();
                    this.f10756b = string;
                    C2267h1 c2267h3 = c2330u.f10889d;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(string.getBytes(Utf8Charset.NAME));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        C2622l.m5438t3("Error writing to file in internal storage.", e);
                    }
                    str4 = this.f10756b;
                } else {
                    str4 = this.f10756b;
                }
            } else {
                str4 = this.f10756b;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }
}
