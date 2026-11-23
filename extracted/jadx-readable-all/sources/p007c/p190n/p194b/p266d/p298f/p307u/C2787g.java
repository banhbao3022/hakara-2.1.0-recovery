package p007c.p190n.p194b.p266d.p298f.p307u;

import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.RecentlyNullable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.f.u.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2787g {

    /* JADX INFO: renamed from: a */
    public static String f11947a;

    /* JADX INFO: renamed from: b */
    public static int f11948b;

    @RecentlyNullable
    /* JADX INFO: renamed from: a */
    public static String m5629a() throws Throwable {
        BufferedReader bufferedReader;
        if (f11947a == null) {
            if (f11948b == 0) {
                f11948b = Process.myPid();
            }
            int i = f11948b;
            String strTrim = null;
            strTrim = null;
            strTrim = null;
            BufferedReader bufferedReader2 = null;
            strTrim = null;
            try {
                if (i > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(25);
                        sb.append("/proc/");
                        sb.append(i);
                        sb.append("/cmdline");
                        String string = sb.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader.readLine();
                                Objects.requireNonNull(line, "null reference");
                                strTrim = line.trim();
                                bufferedReader.close();
                            } catch (IOException unused) {
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                f11947a = strTrim;
                                return f11947a;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (IOException unused4) {
            }
            f11947a = strTrim;
        }
        return f11947a;
    }
}
